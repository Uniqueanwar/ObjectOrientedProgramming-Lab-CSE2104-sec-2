class Person {
private String name;
private int age;
private String gender;
private String address;

public Person() {
this("Unknown", 0, "Unknown", "Unknown");
}

public Person(String name, int age) {
this(name, age, "Unknown", "Unknown");
}

public Person(String name, int age, String gender, String address) {
this.name = name;
this.age = age;
this.gender = gender;
this.address = address;
}

public void displayDetails() {
System.out.println("Name: " + this.name);
System.out.println("Age: " + this.age);
System.out.println("Gender: " + this.gender);
System.out.println("Address: " + this.address);
}

public void setDetails(String name, int age) {
this.name = name;
this.age = age;
}

public void setDetails(String name, int age, String gender, String address) {
this.name = name;
this.age = age;
this.gender = gender;

this.address = address;
}
public static void main(String[] args) {
Person person1 = new Person();
person1.displayDetails();

Person person2 = new Person("Anwar", 25);
person2.displayDetails();

Person person3 = new Person("Ariful", 27, "Male", "12/1 Madertak,Basabo");
person3.displayDetails();

person3.setDetails("Nayon", 30, "Male", "15A Elephant Road");
person3.displayDetails();
}
}
2.
class Employee {
private String name;
private int id;
private double salary;
private String designation;

public Employee() {
this("Unknown", 0, 0.0, "Unknown");
}

public Employee(String name, int id) {
this(name, id, 0.0, "Unknown");
}

public Employee(String name, int id, double salary, String designation) {
this.name = name;
this.id = id;
this.salary = salary;
this.designation = designation;

}

public void displayDetails() {
System.out.println("Name: " + this.name);
System.out.println("ID: " + this.id);
System.out.println("Salary: " + this.salary);
System.out.println("Designation: " + this.designation);
}

public void setDetails(String name, int id) {
this.name = name;
this.id = id;
}

public void setDetails(String name, int id, double salary, String designation) {
this.name = name;
this.id = id;
this.salary = salary;
this.designation = designation;
}
public static void main(String[] args) {
// Using default constructor
Employee emp1 = new Employee();
emp1.displayDetails();

Employee emp2 = new Employee("Anwar", 101);
emp2.displayDetails();

Employee emp3 = new Employee("Ariful", 102, 55000.0, "Manager");
emp3.displayDetails();

emp3.setDetails("Nayon", 103, 60000.0, "Senior Manager");
emp3.displayDetails();
}
}