# Using the Java Library

## Table of Contents
- Java API
- Using ArrayList
- ArrayList vs. regular array
- Using the API
- Bullet Points

## Java API
Java ships with 100s of pre-built classes. The Java library is also known as the Java API. The Java API is the core Java library that contains a giant mass of classes so you can make your programs with pre-built code and save time. An example of a class in the Java library is ArrayList.
```java
ArrayList instance variables
add(Object elem) // adds the object parameter to the list
remove(int index) // removes the object at the index parameter
remove(Object elem) // removes the object (if it's in the ArrayList)
contains(Object elem) // returns true if there's a match for the object parameter
isEmpty() // returns true if the list has no elements
indexOf(Object elem) // returns either the index of the object parameter, or -1
size() // returns the number of elements currently in the list
get(int index) // returns the object currently at the index parameter
```

## Using ArrayList
step 1: make one
```java
ArrayList<egg> myList = new ArrayList<egg>(); // ArrayList<egg> == make a list of Egg objects
```

step 2: put something in it
```java
Egg s = new Egg(); // now it can hold the new Egg object
```

step 3: put another thing in ti
```java
Egg b = new Egg();
myList.add(b); // the ArrayList grows to hold 2 Egg objects
```

step 4: remove something from it
```java
myList.remove(s) // now it only contains 1 Egg object
```

## ArrayList vs. regular array
- A plain array has to know its size at the time it is created.
```java
new String[2] // size
new ArrayList <String>() // no size
```

- To put an object in a plain array, you must assign it to a specific location.
```java
myList[1] = b; // needs an index
myList.add(b); // no index
```

- Arrays use array syntax that is not used anywhere else in Java.
```java
myList[1] // the [] are special syntax only for arrays
```

- ArrayLists are parameterized.
```java
ArrayList<String> // this is a type parameter, this means this is a list of strings
```

## Using the API
In the Java API, classes are grouped into packages. To use a class in the API, you have to know which `package` the class is in. Every class in the Java library belongs to a package. The package has a name that holds some classes.

### You have to know the FULL name of the class
`ArrayList` is short for `java.util.ArrayList`
You can use this short version by importing at the top of your source code file:
```java
import java.util.ArrayList;
```

## Bullet Points
- ArrayList is a class in the Java API
- An ArrayList resizes dynamically to whatever size is needed. It grows when objects are added, and it shrinks when objects are removed.
- You declare the type of the array using a type parameter within the angle brackets. This means the array will hold objects of that type.
- Classes are grouped into packages.
