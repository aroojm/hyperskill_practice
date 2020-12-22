class ThreadProcessor {
    public static void findAndStartThread(Thread... threads) throws InterruptedException {
        int j = 0;
        for (int i = 0; i < threads.length; i++) {
            if (threads[i].getState() == Thread.State.NEW) {
                threads[i].start();
                j = i;
                break;
            }
        }
        threads[j].join();
    }
}