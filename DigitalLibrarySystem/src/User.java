// Inheritance + Polymorphism Example
public class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public void borrow(Book book) {
        System.out.println(name + " is trying to borrow a book...");
        book.borrowBook();
    }
}

class Student extends User {
    public Student(String name) {
        super(name);
    }

    // Method Overriding (Polymorphism)
    @Override
    public void borrow(Book book) {
        System.out.print("Student " + name + " borrowed: ");
        book.borrowBook();
    }
}

class Teacher extends User {
    public Teacher(String name) {
        super(name);
    }

    // Method Overriding (Polymorphism)
    @Override
    public void borrow(Book book) {
        System.out.print("Teacher " + name + " borrowed: ");
        book.borrowBook();
    }
}
