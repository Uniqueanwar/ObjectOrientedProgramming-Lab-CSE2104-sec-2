import java.util.Scanner;
class Book {
private String title;
private String author;
private int year;
private static String genre;
private static int bookCount = 0;

public Book(String title, String author, int year, String genre) {
this.title = title;
this.author = author;
this.year = year;
Book.genre = genre;
bookCount++;
}

public void displayDetails() {
System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.println("Year: " + year);
System.out.println("Genre: " + genre);
}

public static void displayTotalBooks() {
System.out.println("Total number of books: " + bookCount);
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

Book[] books = new Book[3];

for (int i = 0; i < 3; i++) {
System.out.println("\nEnter details for Book " + (i + 1) + ":");
System.out.print("Title: ");
String title = scanner.nextLine();
System.out.print("Author: ");

String author = scanner.nextLine();
System.out.print("Year: ");
int year = scanner.nextInt();
scanner.nextLine();
System.out.print("Genre: ");
String genre = scanner.nextLine();
books[i] = new Book(title, author, year, genre);
}

for (int i = 0; i < 3; i++) {
System.out.println("\nDetails of Book " + (i + 1) + ":");
books[i].displayDetails();
}

Book.displayTotalBooks();
scanner.close();
}
}

2.
import java.util.Scanner;
class Student {
private int id;
private String name;
private String department;
private double cgpa;
private static String university;
private static int studentCount = 0;

public Student(int id, String name, String department, double cgpa, String university) {
this.id = id;
this.name = name;
this.department = department;
this.cgpa = cgpa;
Student.university = university;
studentCount++;
}

public void displayDetails() {
System.out.println("ID: " + id);
System.out.println("Name: " + name);
System.out.println("Department: " + department);
System.out.println("CGPA: " + cgpa);
System.out.println("University: " + university);
}

public static void displayTotalStudents() {
System.out.println("Total number of students: " + studentCount);
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter details for Student 1:");
System.out.print("ID: ");
int id1 = scanner.nextInt();
scanner.nextLine(); // Consume newline
System.out.print("Name: ");
String name1 = scanner.nextLine();
System.out.print("Department: ");
String dept1 = scanner.nextLine();
System.out.print("CGPA: ");
double cgpa1 = scanner.nextDouble();
scanner.nextLine();
System.out.print("University: ");
String uni1 = scanner.nextLine();
Student student1 = new Student(id1, name1, dept1, cgpa1, uni1);
System.out.println("\nEnter details for Student 2:");
System.out.print("ID: ");
int id2 = scanner.nextInt();
scanner.nextLine();
System.out.print("Name: ");
String name2 = scanner.nextLine();
System.out.print("Department: ");
String dept2 = scanner.nextLine();
System.out.print("CGPA: ");
double cgpa2 = scanner.nextDouble();

scanner.nextLine();
System.out.print("University: ");
String uni2 = scanner.nextLine();
Student student2 = new Student(id2, name2, dept2, cgpa2, uni2);
System.out.println("\nEnter details for Student 3:");
System.out.print("ID: ");
int id3 = scanner.nextInt();
scanner.nextLine();
System.out.print("Name: ");
String name3 = scanner.nextLine();
System.out.print("Department: ");
String dept3 = scanner.nextLine();
System.out.print("CGPA: ");
double cgpa3 = scanner.nextDouble();
scanner.nextLine();
System.out.print("University: ");
String uni3 = scanner.nextLine();
Student student3 = new Student(id3, name3, dept3, cgpa3, uni3);

System.out.println("\nDetails of Student 1:");
student1.displayDetails();
System.out.println("\nDetails of Student 2:");
student2.displayDetails();
System.out.println("\nDetails of Student 3:");
student3.displayDetails();

Student.displayTotalStudents();
}
}