# Classes and Objects

## Table of Contents 
- Questions to Consider About Objects
- What makes an Object?
- Making your First Object

## Question to Consider About Objects
1. What are the `things` in this program? ["Who are the key `players`?"]
2. What are the things the object `does`? ["What are the key players `doing`"]
With OO programming you don't have to touch code previously tested and delivered. Flexibility and extensibility. 
3. Are your classes looking more like duplicate code? ["Make a class that they can all inherit from."] This will make your previous classes, subclasses. And then they are now under a superclass. If the class has the same functionality, then the subclasses automatically get the same functionality. You can override a superclass's method for a particular subclass with including its own method. Every new object will have its own behavior.

## What Makes an Object?
When you design a class, think about the objects that will be created from the class type:
- Things the objects KNOW
- Things the objects DOES

### Vocabulary
Instance variables: things an object knows about itself. They represent an object's state and can have unique values for each object of that type.

Methods: things an object can do. When you design a class, you think about the data an object will need to know about itself, and you also design the methods that operate on that data.

### REMEMBER
A CLASS IS NOT AN OBJECT. It's used to construct them. It is the blueprint for the object.

## Making your First Object
1. Write your class
```java
class Dog {
 int size;
 String breed; // instance variable
 String name;

 void bark(){ // method
 System.out.println("Ruff! Ruff!");
 }
}
```
2. Write a tester
```java
class DogTestDrive {
 public static void main (String[] args){
 // step three
 }
}
```
3. In your tester, make an object and access the object's variables and methods
```java
class DogTestDrive {
 public static void main (String[] args){
 Dog d = new Dog(); // makes Dog object
 d.size = 40; // example of a dot operator setting the size of the Dog
 d.bark(); // calls bark method
 }
}
```