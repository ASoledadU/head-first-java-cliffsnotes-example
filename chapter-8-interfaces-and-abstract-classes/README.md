# Interfaces and Abstract Classes

## Table of Contents
- The Concrete and Abstract Class
- Abstract Methods
- Casting an Object Reference
- Java Interface
- When to Use
- Bullet Points

## The Concrete and Abstract Class
Some classes just should NOT be instantiated! A superclass is an example of this. By marking the class as abstract, the compiler will stop any code, anywhere, from creating an instance of that type. You can still use an abstract type as a reference type. This is so you can use it as a polymorphic argument, return type, or array.
Concrete classes are those that are specific enough to be instantiated. This just means that you can safely make objects of that type.
```java
abstract class Canine extends Animal {
 public void roam() {
 // roaming stuff
 }
}
```

- An *abstract class* has virtually no use, value, purpose, unless it is extended.
- With an abstract class, the things doing the work on at runtime are *instances of a subclass* of your abstract class.

If a class is not abstract it is concrete.
Abstract:
---------
- Animal class
- Feline class
- Canine class

Concrete:
---------
- Lion class
- Hippo class
- Wolf class

## Abstract Methods
An abstract class = a class that must be extended
An abstract method = a method that must be overridden
Abstract methods have no body. End the declaration with a semicolon.
```java
public abstract void eat();
```
To declare an abstract method you must have an abstract class. You can put a non-abstract method in an abstract class. You do have to use the abstract methods. This can be done by using the methods name and arguments. Also, ensure to use the return type that is declared in the abstract method for your concrete subclass.

## Casting an Object Reference
To call a specific class method you need a reference declared as the class type. You can do this by:
```java
Object o = al.get(index);
Dog d = (Dog) o; // casts the Object back to a Dog we know is there
d.roam();
```

> You can call a method on an object only if the class of the reference variable has that method.
> Public methods are contracts, promising the things they can do.

## Java Interface
A Java interface gives you the polymorphic benefits of multiple inheritances. To prevent errors is to make all the methods abstract. This makes the subclass implement the methods so the JVM knows which of the two inherited versions it is supposed to call.
A Java interface is like a 100% pure abstract class.

To DEFINE an interface:
```java
public interface Pet{ // use keyword interface instead of class
 // pet stuff
}
```
To IMPLEMENT an interface:
```java
public class Dog extends Canine implements Pet ( // when implementing an interface you get to extend the class.
 // more pet stuff but dog version
)
```

## When to use
- Class: make a class that doesn't extend anything when your new class doesn't pass the IS-A test for any other type.
- Subclass: make a subclass only when you need to make a more specific version of a class and need to override or add behaviors.
- Abstract: use an abstract class when you want to define a template for a group of subclasses, and you have at least some implementation code that all subclasses could use or when you want to guarantee that you can not make an object out of that type.
- Interface: use an interface when you want to define a tole that other classes can play, regardless of where those classes are in the inheritance tree.

## Bullet Points
- All abstract methods must be implemented in the first concrete subclass in the inheritance tree.
- Every class in Java is either a direct or indirect subclass of class Object.
- Methods can be declared with Object arguments and/or return types.
- You can call methods on an object only if the methods are in the class used as the reference variable type, regardless of the actual object type. So, a reference variable of type Object can be used only to call methods defined in class Object, regardless of the type of Object to which the reference refers.
- All objects come out of an ArrayList<Object> as type Object.
- Multiple inheritances are not allowed. You can only be extended to one class.
- An inheritance is a 100% abstract class.
- Your class can implement multiple interfaces.
- A class that implements an interface must implement all the methods of the interface.
