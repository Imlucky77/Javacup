package free.interfaces;

public interface DefaultInterface extends MyInterface, YourInterface {


    @Override
    default void myInterface() {
        
    }

    @Override
    default void yourInterface() {

    }

    @Override
    default void sameMethod() {

    }
}
