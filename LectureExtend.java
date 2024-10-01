// Define the parent class
class ExtendExample {
    int i = 2;  // Variable to store integer value

    // Method to print the value of i
    public void printValue() {
        System.out.println(i);  // Prints the value of i
    }
}

// Define the child class that extends the parent class
class ExtendExampleTwo extends ExtendExample {
    float j = 4;  // Variable to store float value

    // Method to print the sum of j and i
    void printValueTwo() {
        System.out.println(j + i);  // Prints the sum of j and i
    }

    // Method that accepts an integer and prints it
    void Two(int k) {
        System.out.println(k);  // Prints the passed integer k
    }

    // Method that accepts an integer and prints it
    void Three(int l) {
        System.out.println(l);  // Prints the passed integer l
    }
}


public class LectureExtend {
    public static void main(String[] args) {
        // Create an instance of the child class
        ExtendExampleTwo obj = new ExtendExampleTwo();

        // Access and print inherited variable i (from ExtendExample)
        System.out.println(obj.i);   // Prints 2

        // Access and print child class variable j
        System.out.println(obj.j);   // Prints 4

        // Call the method to print the value of i (from parent class)
        obj.printValue();  // Prints 2

        // Call the method to print the sum of j and i
        obj.printValueTwo();  // Prints 6.0

        // Call method Two and print the passed value
        obj.Two(4);  // Prints 4

        // Define a variable l and call method Three to print it
        int l = 5;
        obj.Three(l);  // Prints 5
    }
}
