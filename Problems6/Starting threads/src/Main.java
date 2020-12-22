public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableWorker());
        Thread t2 = new Thread(new RunnableWorker());
        Thread t3 = new Thread(new RunnableWorker());
        t1.setName("worker-1");
        t2.setName("worker-2");
        t3.setName("worker-3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class RunnableWorker implements Runnable {

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (name.startsWith("worker-")) {
            System.out.println("too hard calculations...");
        } else {
            return;
        }
    }
}