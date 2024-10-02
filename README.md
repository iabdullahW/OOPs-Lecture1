# Lecture One: Java Inheritance Example

This repository contains a basic example of inheritance in Java. The parent class `ExtendExample` contains a variable and a method, while the child class `ExtendExampleTwo` extends it by adding more variables and methods. This example demonstrates:

1. **Inheritance**: The child class inherits properties and methods from the parent class.
2. **Method Overloading**: The child class can add its own methods in addition to the inherited ones.
3. **Method Overriding**:

### Classes and Methods:
- **ExtendExample**: The parent class with an integer variable `i` and a method `printValue()`.
- **ExtendExampleTwo**: The child class that extends `ExtendExample` with an additional float variable `j` and methods `printValueTwo()`, `Two()`, and `Three()`.

### Running the Program:
- The program will print the values of the variables and the results of the methods.
- The sum of the inherited integer `i` and the child class float `j` will be printed using `printValueTwo()`.

### Output:
2
4.0
2  
6.0
4  
5  
