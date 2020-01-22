# Inheritance and Polymorphism

## Table of Contents
- Understanding Inheritance
- Designing an Inheritance Tree
- Using IS-A and HAS-A
- Using or Abusing Inheritance
- Object Declaration and Assignment

## Understanding Inheritance
When using inheritance, you put common code in a class then tell other more specific classes that the common class is their superclass. 
A class inherits from another = **subclass extends the superclass**
An inheritance relationship means that the subclass inherits the members of the superclass. 
Members of the class = instance variables and methods.
A subclass can add new methods and instance variables of its own, and can override the methods it inherits from the superclass.
```java
public class Doctor {
 boolean worksAtHospital;
 void treatPatient(){
 // preform check up
 }
}

public class Surgeon extends Doctor { // Surgeon is a type of doctor so it inherits from that class
 void treatPatient() {
 // preform surgery
 }
 void makeIncision() {
 // make incision
 }
}
```

## Designing an Inheritance Tree
Step 1: Look for objects that have common attributes and behaviors.
Step 2: Design a class that represents the common state and behavior. You can do this by using instance variables and methods.
Step 3: Decide if a subclass needs behaviors (method implementations) that are all specific to that particular subclass type. If you need to you may need to override the methods.
Step 4: Look for more opportunities to use abstraction, by finding 2 or more subclasses that might need common behavior
Step 5: Finish the class hierarchy

### Calling a Method
When calling a method on an object reference, it calls the most specific version of the method for that object type.
*The lowest one wins*

## Using IS-A and HAS-A
Remember the subclass extends the superclass. If it passes the IS-A test then it should be a subclass if not then it may just be an instance variable because it only references to the class. Double-check by reversing it as well.

## Using or Abusing Inheritance
DO's:
----
- DO use it when one class is a more specific type of superclass.
- DO consider inheritance when you have behavior that should be shared among multiple classes of the same general type.

DO NOT's:
---------
- DO NOT use inheritance just so that you can reuse code from another class.
- DO NOT use inheritance if the subclass and superclass do not pass the IS-A test.

## Object Declaration and Assignment
Dog myDog = new Dog();
```java
Dog myDog // Step 1: Declare a reference variable.
```

```java 
new Dog(); // Step 2: Create an object
```

```java
= // Step 3: Link the object and the reference
```
The important point is that the reference type **AND** the object type is the same.
myDog is a Dog object.

With polymorphism, the reference and the object can be different.
```java
Animal myDog = new Dog(); // not the same type, the reference variable is declared as Animal, but the object is created as a new Dog()
```