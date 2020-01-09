# Breaking the surface

## Table of Contents
- The Way Java Works
- Java Timeline
- Code Structure in Java
- Anatomy of a Class
- Basic Syntax

## The Way Java Works
You'll type a source code file, compile it using the javac complier, then run the compiled bytecode on a Java virtual machine.

### Java Timeline
1. Create a source document -> 2. Run your document through a source code compiler. -> 3. The complier then creates a new document, coded into Java bytecode. -> 4. Then finally the virtual machine reads and runs the bytecode.

1. This will be the code you write for your Java project.
2. It checks for errors and will not let you compile until it is correct. You can run your file with `javac`. It should then get a second document with a `.class`.
3. This is the nice compiled code portion.
4. You can now run the program through JVM (Java Virtual Machine). It translates the bytecode into something the underlying platform understands, and runs the program.

## Code Structure in Java
The code structure of Java is like a jawbreaker. It has multiple layers that encapsulates one another. Starting from the outer most layer to the deepest is:
1. Source File
2. Class File
3. Methods
4. Statements

### What goes in a Source File?
A source code file holds one class definition. The class represents a piece of the program, although a very tiny application might need just a single class. The class must go within a pair of `{}`.
Put a `class` in a source file.
``` java
public class Dog {

}
```

### What goes in a Class?
A class has one or more `methods`. In the Dog class, the bark method will hold instructions for how the Dog should bark. Your methods must be declared inside a class.
Put `methods` in a class.
```java
public class Dog {
    void bark(){
    }
}
```
### What goes in a Method?
Within the curly braces of a method, write the instructions for how that method should be preformed. Method code is a set of statements.
Put `statements` in a method.
```java
public class Dog {
    void bark(){
        statement1;
    }
}
```
Some Things a Method can Have:
- Statements
- Loops
- Branching

## Anatomy of a Class
```java
public class MyFirstApp{
    public static void main (string[] args){
        System.out.print("Hello World!");
    }
}
```
LINE 1 - Begins with the class name and {}.
LINE 2 - The method with its name and arguments that consist of an array of strings (args). Another {}.
LINE 3 - The statement for the method and end with a ;
END LINE - ensure for every beginning `{` there is a `}`.

### REMEMBER
SAVE -> COMPILE -> RUN

## Basic Syntax
- Each statement should end in a ;
- Single line comment begins with //
- Variable are declared with a name and type
- Classes and methods must be defined with a pair of {}