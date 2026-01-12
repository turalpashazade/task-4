//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Clean Code", "Robert C. Martin", "1234567890");

        b1.printInfo();
        b1.borrowBook();
        b1.returnBook();
        Book.libraryRules();
        b1.bookType();


    }
}