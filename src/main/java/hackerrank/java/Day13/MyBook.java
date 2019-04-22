package hackerrank.java.Day13;

public class MyBook extends Book {
    int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + "\n"
                + "Author: " + author + "\n"
                + "Price: " + price);
    }
}
