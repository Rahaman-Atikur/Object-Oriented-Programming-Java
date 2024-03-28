
      // Concepts of Class and Objects
public class Car {     // declaring class
    int x = 10;         // variable

    public static void main(String[] args) {
        // Creating an object( multiple )
        Car wheel = new Car(); // Object one
        Car seat = new Car(); // Object two
        Car headlight = new Car(); // Object three
        Car accelarator = new Car(); // Object four

        System.out.println(wheel.x); // accessing variable via object which was declared under class
        System.out.println(seat.x);  // accessing variable via object which was declared under class
        System.out.println(headlight.x); // accessing variable via object which was declared under class
        System.out.println(accelarator.x); // accessing variable via object which was declared under class

    }
}
