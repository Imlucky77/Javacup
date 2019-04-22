package designpatterns.behavioral.observer;

public class OctalString extends Observer {

    public OctalString(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(" " + Integer.toOctalString(subject.getState()));
    }
}
