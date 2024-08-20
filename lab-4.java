public class StringOperations {
public static void main(String[] args) {
String str1 = "HelloWorld";
String str2 = "JavaProgramming";
String concatenated1 = str1 + str2;
String concatenated2 = str1.concat(str2);
int length = str1.length();
String substring = str1.substring(2);
String uppercase = str1.toUpperCase();
String lowercase = str2.toLowerCase();
boolean areEqual = str1.equals(str2);
int comparison = str1.compareTo(str2);
System.out.println("Original Strings:\nstr1: " + str1 + "\nstr2: " + str2);
System.out.println("\nConcatenation using + operator: " + concatenated1);
System.out.println("Concatenation using concat() method: " + concatenated2);
System.out.println("\nLength of str1: " + length);
System.out.println("\nSubstring of str1 from index 2: " + substring);
System.out.println("\nstr1 in uppercase: " + uppercase);
System.out.println("str2 in lowercase: " + lowercase);
System.out.println("\nAre str1 and str2 equal? " + areEqual);
System.out.println("\nLexicographical