package dastgarmi.D06;

class Operation extends Thread {
    private int count;

    public Operation(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        try {
            System.out.println(count);
            JT.help.bl();
            System.out.println("end");
        } catch (InterruptedException e) {
            System.out.print("catch");
        }
    }
}
