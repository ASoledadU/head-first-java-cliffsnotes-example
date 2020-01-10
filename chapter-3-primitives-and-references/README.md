# Primitives and References

## Table of Contents
- Variables Review
- Declaring a Variable
- Spillage
- Do's and Dont's of Variable Naming
- Declaring Objects
- The 3 Steps of Object Declaration, Creation, and Assignment
- Arrays are Objects too

## Variable Review
The 2 different types of variables that have been reviewed are primitive and reference.
Primitive variables hold fundamental values. This variable can be either a boolean or a numeric.
```java
byte b = 89;
```
Reference variables hold references of objects. This variable can be a class, interface, enum, or an array.
```java
Dog myDog;
```

## Declaring a Variable
Java cares about the type. It will not compile if the code in question is something like a Giraffe referencing a Rabbit variable.
Java must have a TYPE
Java must have a NAME
```java
int count;
```
Variables are containers that are meant to hold something.

## Spillage
Java will try to prevent `spillage`. If the value is larger than the container then it will cause spillage. But you can put a smaller value into a larger container of course.
```java
int x = 24;
byte b = x;
// won't work buddy
```

## Do's and Dont's of Variable Naming
- It must start with a letter, underscore, or a dollar sign. 
You CAN'T start a name with a number.
- After the first character, you can use numbers as well.
Just DON'T start it with a number
- It can be anything you like, subject to those two rules.
It CAN'T be one of Java's reserved words.

Reserved words are keywords that the compiler recognizes.
EX. `boolean`

## Declaring Objects
There are no object variables. There is an object `reference` variable. This reference variable holds the bits that represent a way to access an object. It represents only one object. The JVM understands how to use this reference to get to the object. You CAN NOT put an object into a variable.

The dot operator (.) is used on the reference variable. The thing `before` the dot is used to say "use this" to get me "this thing", the thing `after` the dot.
```java
myDog.bark() // use this object referenced by the variable to invoke this method.
```

## The 3 Steps of Object Declaration, Creation, and Assignment
Think of a Dog reference variable as a Dog remote control. You use it to get the object to do something through methods.
```java
Dog myDog = new Dog();
```
### 1. Declare a reference variable [`Dog myDog`]
Tells the JVM to allocate space for a reference variable, and names that variable. The reference variable can only mess with stuff with that type.

### 2. Create an Object [`new Dog();`]
Tells the JVM to allocate space for a new object on the heap.

### 3. Link the Object and the Reference [`=`]
Assigns the new Dog to the reference variable.

## Arrays are Objects too
Arrays are always objects, whether they're declared to hold primitives or object references. But you can have an array object that's declared to hold primitive values. It can hold primitive values but it is not primitive itself.
1. Declare an int array variable. An array variable is a remote control to an array object.
```java
int[] nums;
```

2. Create a new int array with a length, and assign it to the previously declared `int[]` variable.
```java
nums = new int[3];
```

3. Give each element in the array an int value. Remember, elements in an int array are just int variables.
```java
nums[0] = 2;
nums[1] = 19;
nums[2] = 21;
nums[3] = 4;
```

JAVA CARES ABOUT TYPE.
Once you've declared an array, you can't put anything in it except things that are of the declared array type.