package basicjava;

public interface StaticFunction {

    static String getAwesomeWebsite() {
        return "CodersTea.com";
    }

    void overrideThis();
}

class ImplementStaticFunc implements StaticFunction {
    //there is no option of overriding static function
    //this is not the overridden function
    static String getAwesomeWebsite() {
        return "https://coderstea.com";
    }

    @Override
    public void overrideThis() {
        //do something
    }

    public static void main(String[] args) {
        System.out.println("The best website is :" + StaticFunction.getAwesomeWebsite());
    }
}
