package designpatterns.behavioral.observer;

public class HexString extends Observer {

    public HexString(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(" " + Integer.toHexString(subject.getState()));
    }
}
