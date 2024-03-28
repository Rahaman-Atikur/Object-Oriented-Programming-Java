
 /*Multiple attributes in a class
 We will write code  how we gonna use maultiple attributes of a class*/
public class Human {
    String firstName= "Atikur"; // declaring variable which is an attribute
    String lastName = "Rahaman";// declaring variable which is an attribute

    int age= 26;// declaring variable which is an attribute

     public static void main(String[] args) {
         Human man = new Human();   // Constructor call , creating an object
         System.out.println("Name: " + man.firstName + " " + man.lastName);
         System.out.println("Age: " + man.age);


     }
}
