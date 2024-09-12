import java.io.*;
import java.util.*;

abstract class Doctor {
private String name;
private String specialization;
public Doctor(String name, String specialization) {
this.name = name;
this.specialization = specialization;
}
public String getName() {
return name;
}
public String getSpecialization() {
return specialization;
}

public abstract void displayAvailability();
}

class GeneralPractitioner extends Doctor {
public GeneralPractitioner(String name) {
super(name, "General Practitioner");
}

public void displayAvailability() {
System.out.println(getName() + " (General Practitioner) is available for walk-in patients.");
}
}

class Specialist extends Doctor {
public Specialist(String name) {
super(name, "Specialist");
}

public void displayAvailability() {
System.out.println(getName() + " (Specialist) requires an appointment confirmation.");
}
}

class Patient {
private String name;
private String phoneNumber;
public Patient(String name, String phoneNumber) {
this.name = name;
this.phoneNumber = phoneNumber;
}
public String getName() {
return name;
}
public String getPhoneNumber() {
return phoneNumber;
}
}

class Appointment {
private Doctor doctor;
private Patient patient;
public Appointment(Doctor doctor, Patient patient) {
this.doctor = doctor;
this.patient = patient;
}
public String toString() {
return "Appointment: " + patient.getName() + " with Dr. " + doctor.getName() + " (" +
doctor.getSpecialization() + ")";
}

public void saveToFile() {
try (FileWriter writer = new FileWriter("appointments.txt", true)) {
writer.write(toString() + "\n");
} catch (IOException e) {

System.out.println("Error saving appointment: " + e.getMessage());
}
}
}

public class AppointmentSystem {
private static List<Doctor> doctors = new ArrayList<>();
private static List<Patient> patients = new ArrayList<>();
public static void main(String[] args) {
doctors.add(new GeneralPractitioner("Dr. Shamsul Alam Sabuj"));
doctors.add(new Specialist("Dr. Feroza Akhter"));
Scanner scanner = new Scanner(System.in);
System.out.println("Welcome to the Doctor's Appointment Management System");
while (true) {
System.out.println("\n1. Register Patient\n2. View Doctors\n3. Book Appointment\n4.
Exit");
int choice = scanner.nextInt();
scanner.nextLine();
switch (choice) {
case 1:
registerPatient(scanner);
break;
case 2:
viewDoctors();
break;
case 3:
bookAppointment(scanner);
break;
case 4:
System.out.println("Exiting system...");
return;
default:
System.out.println("Invalid option! Please try again.");
}
}
}
private static void registerPatient(Scanner scanner) {

System.out.print("Enter patient name: ");
String name = scanner.nextLine();
System.out.print("Enter patient phone number: ");
String phoneNumber = scanner.nextLine();
Patient patient = new Patient(name, phoneNumber);
patients.add(patient);
System.out.println("Patient registered successfully.");
}
private static void viewDoctors() {
for (Doctor doctor : doctors) {
doctor.displayAvailability();
}
}
private static void bookAppointment(Scanner scanner) {
if (patients.isEmpty()) {
System.out.println("No patients registered. Please register a patient first.");
return;
}
System.out.println("Select a doctor by entering their name:");
viewDoctors();
String doctorName = scanner.nextLine();
Doctor selectedDoctor = null;
for (Doctor doctor : doctors) {
if (doctor.getName().equalsIgnoreCase(doctorName)) {
selectedDoctor = doctor;
break;
}
}
if (selectedDoctor == null) {
System.out.println("Doctor not found!");
return;
}
System.out.println("Enter patient name for booking:");
String patientName = scanner.nextLine();
Patient selectedPatient = null;

for (Patient patient : patients) {
if (patient.getName().equalsIgnoreCase(patientName)) {
selectedPatient = patient;
break;
}
}
if (selectedPatient == null) {
System.out.println("Patient not found!");
return;
}
Appointment appointment = new Appointment(selectedDoctor, selectedPatient);
appointment.saveToFile();
System.out.println("Appointment booked successfully.");
}
}
