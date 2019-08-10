package free.test.primitiveobsession;

public class withOutPrimitiveObsession {
    public static void main(String[] args) {
        for (City city : City.ALL_CITIES) {
            System.out.println(city.toString());
        }
    }
}
