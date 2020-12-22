import java.util.concurrent.*;

class Message {
    final String text;
    final String from;
    final String to;

    Message(String from, String to, String text) {
        this.text = text;
        this.from = from;
        this.to = to;
    }
}

interface AsyncMessageSender {
    void sendMessages(Message[] messages);
    void stop();
}

class AsyncMessageSenderImpl implements AsyncMessageSender {
    private ExecutorService executor = Executors.newCachedThreadPool();
    private final int repeatFactor;

    public AsyncMessageSenderImpl(int repeatFactor) {
        this.repeatFactor = repeatFactor;
    }

    @Override
    public void sendMessages(Message[] messages) {
        for (Message msg : messages) {
            for (int i = 0; i < repeatFactor; i++) {
                executor.submit(() -> {
                    System.out.printf("(%s>%s): %s\n", msg.from, msg.to, msg.text);
                });
            }
        }
    }

    @Override
    public void stop() {
        executor.shutdown();
    }
}