package dastgarmi.D06;

class Help {
    private final Integer PIVOT = 3;
    private int counter = 0;

    public void bl() throws InterruptedException {
        synchronized (PIVOT) {
            if (++counter == PIVOT) {
                PIVOT.notifyAll();
                return;
            }
        }
        synchronized (PIVOT) {
            PIVOT.wait();
        }
    }
}