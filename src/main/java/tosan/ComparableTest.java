package tosan;

public class ComparableTest implements Comparable<ComparableTest> {

    private int number;
    private String name;
    private String color;

    public ComparableTest(int number, String name, String color) {
        this.number = number;
        this.name = name;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(ComparableTest o) {
        int result = o.getNumber();
        return this.number - result;
    }


}
