package howtoprogram.Chapter08.examples;

/**
 * @author imlucky
 * @Created: 2019/03/02
 * @Examples: Fig. 8.15: PackageDataTest.java
 */
public class PackageDataTest {
    public static void main(String[] args) {
        PackageData packageData = new PackageData();
        System.out.printf("After instantiation:%n%s%n", packageData);

        packageData.number = 77;
        packageData.string = "GoodBye";

        System.out.printf("%nAfter changing values:%n%s%n", packageData);
    }
}

class PackageData {
    int number;
    String string;

    public PackageData() {
        this.number = 0;
        this.string = "Hello";
    }

    public String toString() {
        return String.format("number: %d; string: %s", number, string);
    }
}
