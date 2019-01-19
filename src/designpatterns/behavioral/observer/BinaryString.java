package designpatterns.behavioral.observer;

public class BinaryString extends Observer {

    public BinaryString(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(" " + Integer.toBinaryString(subject.getState()));
    }
}
