# Life and Death of an Object

## Table of Contents
- The Stack and Heap
- Two Kinds of Variables
- Methods are Stacked
- Local Variables that are Objects
- Bullet Points
- Where do Instance Variables Live?
- Object Creation
- Constructing a Constructor
- Superclass Constructors with Arguments
- Invoking one Overload Constructor from Another
- Object Lifecycle
- Reference Variables Lifecycle
---

## The Stack and Heap
Stack : where method invocations and local variables live.
Heap : where objects live. *(Garbage Collector)*

When the JVM starts up, it gets a chunk of memory from the OS and uses it to run the program.

---
## Two Kinds of Variables 

Instance Variables | Local Variables 
--- | --- 
Instance variables are declared inside a class but not inside a method. They represent the fields that each object has. Instance variables live inside the object they belong to. | Local variables are declared inside a method, including method parameters. They only live as long as the method is on the stack. 
`public class Duck { int size;}` | `public void foo(int x) { int i = x + 3; boolean b = true; }`

---
## Methods are Stacked
When calling a method is goes to the top of the stack. The new things that are pushed to the stack, is the stack **frame**. It holds the state of the method including which line of code is executing and the values of the local variables. The method on the top of the stack is the one that is currently running. It will finish running after the last curly bracket.

----
## Local Variables that are Objects
Remember, a non-primitive variable holds a reference to an object, not the object. If the local variable is a reference to an object, only the variable goes on the stack.

```java
public class StackRef {
 public void foof(){ 
 barf();
 }
 public void barf(){ // barf() declares and creates a new Duck reference variable 'd'
 Duck d = new Duck(24);
 }
}
```

---
## Bullet Points
- The 2 areas of Java are the Stack and the Heap.
- Instance variables are variables declared inside a class but outside any method.
- Local variables are variables declared inside a method or a method parameter.
- All local variables live on the stack, in the frame corresponding to the method where the variables are declared.
- Object reference variables work just like primitive variables-if the reference is declared as a local variable, it goes on the stack.
- All objects live in the heap, regardless of whether the reference is a local or instance variable.

---
## Where do Instance Variables Live?
Java makes space on the Heap for the object and all its instance variables. 
```java
int x;
long y;
```
Object with 2 primitive instance variables. Space for the variables lives in the object

```java
public class CellPhone {
 private Antenna ant;
}
```
Object with one non-primitive instance variable-a reference to an Antenna object, but no actual Antenna object.
```java
public class CellPhone {
 private Antenna ant = new Antenna() ;
}
```
Object with one non-primitave instance variable, and the Antenna variable is assigned a new Antenna object.

---
## Object Creation
### The 3 Steps of Object Declaration, Creation, and Assignment:
`Duck myDuck = new Duck();`

Step 1 : Declare a reference variable.
```java
Duck myDuck // Make a new reference variable of a class or interface type
```
Step 2: Create an Object.
```java
new Duck(); // Calling the Duck constructor
```
Step 3 : Link the Object and the Reference.
```java
= // Assign the new object to the reference.
```

---
## Constructing a Constructor
a ***Constructor*** has the code that runs when you instantiate an object. (The code that runs when you say new on a class type.) Every class you create has a constructor, even if don't write it yourself. The key feature of a constructor is that it runs before the object can be assigned to a reference. The constructor gives you a chance to step into the middle of new.

### Default Constructor Structure :
```java
public Duck(){ // Class name is mandatory.

}
```

### Constructing :
```java
public class Duck {
 public Duck() {
 System.out.println("Quack"); // Constructor code
 }
}

public class UseADuck {
 public static void main (String[] args) {
 Duck d = new Duck(); // Calls the Duck constructor
 }
}
```

If you write a constructor that takes arguments, and you still want a no-argument constructor, you'll have to build the no-argument constructor yourself.

If you have more than one constructor in a class, the constructors MUST have different argument lists.

Overloaded constructors mean you have more than one constructor in your class. To compile, each constructor must have a different argument list. Different constructors mean different ways to make a new object.

An object gets creates space for all the instance variables from up from the inheritance tree.
An object has instance variables encapsulated by access methods. Those instance variables are created when any subclass is instantiated.

---
## Superclass Constructors with Arguments
```java
public abstract class Animal {
 private String name; // All animals (including subclasses) have a name

 public String getName() { // A getter method that Hippo inherits
 return name;
 }
 public Animal(String theName) {
 name = theName; // The constructor that takes the name and assigns it the name instance variable.
 }
}
```
```java
public class Hippo extends Animal {
 public Hippo(String name) { // Hippo constructor takes a name
 super(name); // It sends the name up the stack to the Animal constructor
 }
}
```
```java
public class MakeHippo {
 public static void main(String[] args) {
 Hippo h = new Hippo("Buffy"); // Make a Hippo passing the name Buffy to the Hippo constructor
 System.out.println(h.getName()); // Call the Hippo's inherited getName()
 }
}
```
---
## Invoking one Overload Constructor from Another
Use `this()` to call a constructor from another overloaded constructor in the same class. The call to `this()` can be used only in a constructor, and must be the first in a constructor. A constructor can have a call to `super()` OR `this()` but never both

---
## Object Lifecycle
1. A local variable lives only within the method that declared the variable.
```java
public void read() {
 int s = 42; // s can only be used within this method. When the method ends so does s.
}
```
The variable is in scope only within its method. No other code in the class can see s.

2. An instance variable lives as long as the object does. If the object is still alive, so are its instance variables.
```java
public class Life {
 int size;
 public void setSize(int s) {
 size = s; // s disappears at the end of this method, but size can be used anywhere in the class.
 }
}
```
instance variable size is scoped to the life of the object as opposed to the life of the method.

### The Difference between life and scope for local variables:
Life | Scope
--- | --- 
a local variable is *alive* as long as its Stack frame is on the Stack. *(Until the method completes)* | A local variable is in scope only within the method in which the variable was declared. When its method calls another, the variable is alive, but not in scope until its method resumes. *(You can use a variable only when it is in scope)*
---
## Reference Variables Lifecycle
The rules are the same for primitives and references. An object's life has no value unless referenced. An object becomes eligible for GC when its last live reference disappears. 
### 3 Ways to get rid of an object's reference :
1. The reference goes out of the scope, permanently
2. The reference is assigned another object
3. The reference is explicitly set to null
