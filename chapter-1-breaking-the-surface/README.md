# Breaking the surface

## Table of Contents
- The Way Java Works
- Code Structure in Java
- Anatomy of a Class
- Basic Syntax

## The Way Java Works
1. Source. Create a source code.
2. Compiler. Compile your source code by running `javac`. If no errors occur you should get a secondary document that is made up of bytecodes.
3. Output. Comes from compiled code.
4. Virtial Machines. Run the program with JVM (Java Virtual Machine). It translates the bytecode into something the underlying platform understands, and runs the program.

## Code Structure in Java
Put a `class` in a source file.
The class represents a piece of your program. Must go within `{}`.
EX. `public class Dog {
}`

Put `methods` in a class.
May have one or more methods. Hold instructions on how the class should behave. Must be declared inside the class `{}`.
EX. `public class Dog {
    void bark(){
    }
}`

Put `statements` in a method.
Within a method, write your instructions for how it should preform. Are set of statements. Kind of like a function.
What a method can have:
- Statements
- Loops
- Branching
EX. `public class Dog {
    void bark(){
        statement1;
    }
}`

## Anatomy of a Class
LINE 1 - Begins with the class name and {}.
LINE 2 - The method with its name and arguments that consist of an array of strings (args). Another {}.
LINE 3 - The statement for the method and end with a ;
END LINE - ensure for every beginning `{` there is a `}`.

## Basic Syntax
- Each statement should end in a ;
- Single line comment begins with //
- Variable are declared with a name and type
- Classes and methods must be defined with a pair of {}