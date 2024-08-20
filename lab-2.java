class Book {
String title;

String author;
int year;

static String genre = "Fiction";
static int bookCount = 0;

public Book(String title, String author, int year) {
this.title = title;
this.author = author;
this.year = year;
bookCount++;
}

public void displayBookDetails() {
System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.println("Year: " + year);
System.out.println("Genre: " + genre);
}

public static void displayTotalBooks() {
System.out.println("Total Books: " + bookCount);
}
}

3.
class Student {
int id;
String name;
String department;
double cgpa;

static String university = "ULAB University";
static int studentCount = 0;

public Student(int id, String name, String department, double cgpa) {

this.id = id;
this.name = name;
this.department = department;
this.cgpa = cgpa;
studentCount++;
}

public void displayStudentDetails() {
System.out.println("ID: " + id);
System.out.println("Name: " + name);
System.out.println("Department: " + department);
System.out.println("CGPA: " + cgpa);
System.out.println("University: " + university);
}

public static void displayTotalStudents() {
System.out.println("Total Students: " + studentCount);
}
}

public class Main {
public static void main(String[] args) {
Employee emp1 = new Employee("Abdul", 30, "Developer", 50000);
Employee emp2 = new Employee("Rayed", 40, "Manager", 70000);
Employee emp3 = new Employee("Mahbuba", 25, "Accounter", 35000);

emp1.displayEmployeeDetails();
emp2.displayEmployeeDetails();
emp3.displayEmployeeDetails();

Employee.displayTotalEmployees();

Book book1 = new Book("Book One", "Author One", 1995);
Book book2 = new Book("Book Two", "Author Two", 2000);
Book book3 = new Book("Book Three", "Author Three", 2005);

book1.displayBookDetails();
book2.displayBookDetails();
book3.displayBookDetails();

Book.displayTotalBooks();

Student student1 = new Student(1, "Anwar", "CSE", 3.5);
Student student2 = new Student(2, "Nayon", "EEE", 3.8);
Student student3 = new Student(3, "Ariful", "MSJ", 3.2);

student1.displayStudentDetails();
student2.displayStudentDetails();
student3.displayStudentDetails();

Student.displayTotalStudents();
}
}