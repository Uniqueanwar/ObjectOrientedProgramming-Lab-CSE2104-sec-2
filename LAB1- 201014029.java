package student;

public class Student {
    int id;
    String name;
    String email;
    double cgpa;
    String hometown;

        void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Home Town: " + hometown);
    }

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Sakib";
        s1.email = "sakib@gmail.com";
        s1.cgpa = 3.55;
        s1.hometown = "Dhaka";

        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Tamim";
        s2.email = "tamim@gmail.com";
        s2.cgpa = 3.45;
        s2.hometown = "Khulna";

        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Email: " + s1.email);
        System.out.println("CGPA: " + s1.cgpa);
        System.out.println("Home Town: " + s1.hometown);

                s2.display();
    }
}

1.
package bank;

public class BankAccount {
    int accountNumber;
    double balance;

    
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

        void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal");
        }
    }

        void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount(12345, 1000.0);

        
        BankAccount account2 = new BankAccount(67890, 500.0);

        account1.deposit(200.0);
        account1.withdraw(150.0);
        account1.display();

        account2.deposit(300.0);
        account2.withdraw(100.0);
        account2.display();
    }
}

2.
package geometry;

public class Rectangle {
    double length;
    double width;

        public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

        double calculatePerimeter() {
        return 2 * (length + width);
    }

    
    double calculateArea() {
        return length * width;
    }

    
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
    }

    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle(5.0, 3.0);

                Rectangle rect2 = new Rectangle(7.5, 4.5);

        rect1.display();
        rect2.display();
    }
}

3.

package entertainment;

public class Movie {
    String title;
    String genre;
    String leadActor;
    String director;
    int releaseYear;
    double rating;
    String review;

public Movie(String title, String genre, String leadActor, String director, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.review = rating < 5 ? "Not Good" : "Good";
    }

    
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Lead Actor: " + leadActor);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("Review: " + review);
    }

    public static void main(String[] args) {
       
       Movie movie1 = new Movie("Srabon Megher Din", "Fiction", "Zahid Hasan", "Humayan Ahmed ", 1999, 8.6);

        
        Movie movie2 = new Movie("Jinn ", "Horror story", "Ziaul Roshan", "Nader Chowdhury", 2023, 4.1);

        movie1.display();

        
        movie2.display();
    }
}