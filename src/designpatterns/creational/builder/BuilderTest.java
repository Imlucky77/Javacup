package designpatterns.creational.builder;

public class BuilderTest {

    public CDType buildSonyCD() {
        CDType cdType = new CDType();
        cdType.addItem(new Sony());
        return cdType;
    }

    public CDType buildSamsungCD() {
        CDType cdType = new CDType();
        cdType.addItem(new Samsung());
        return cdType;
    }


    public static void main(String[] args) {
        BuilderTest builderTest = new BuilderTest();

        CDType cdType = builderTest.buildSonyCD();
        cdType.showItems();

        CDType cdType1 = builderTest.buildSamsungCD();
        cdType1.showItems();
    }
}
