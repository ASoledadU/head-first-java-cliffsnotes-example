# Writing a Program

## Table of Contents
- Developing a Class
- Explaining a for Loop
- The Enhanced for Loop
- Bullet Points

## Developing a Class 
When creating a Java class, it is normally done as follows:
- [ ] Understand what the class is supposed to do
- [ ] Organize what are the instance variables and methods
- [ ] Write the *precode* for the methods
- [ ] Write the *test code* for the methods
- [ ] *Implement* the class
- [ ] Test the methods
- [ ] Debug and reimplement as needed

### The 3 things that need to be written for each class
1. Prep Code: a form of pseudocode, to help you focus on the logic without stressing about syntax.
2. Test Code: a class or method that will test the real code and validate that it's doing the right thing.
3. Real Code: The actual implementation of the class. This is where we write real Java code.

#### Prep Code
The 3 parts in prep code are:
- Instance variable declarations
- Method declarations
- Method logic **THIS IS THE MOST IMPORTANT** -> *it defines what has to happen which is then translated into how*

## Explaining a for Loop
```java
for (int i = 0; i < 100; i++){
 // the body
}
```
```java
int i = 0; // create a variable i and set it to 0
i < 100; // repeat while i is less than 100
i ++ // at the end of each loop iteration, add 1 to i
```
## The Enhanced for Loop
```java
for (String name : nameArray){

}
```
```java
String name // create a string variable called name and set it to null. Assign the first value in nameArray to name.
: // repeat while there are elements in the array.
nameArray // name of array.
```

## Bullet Points
- The Java program should start with a high-level design.
- When you create a new class write: precode -> test code -> real code.
- Precode should describe what to do, not how to do it.
- Use precode to design the test code.
- Write test code before implementing methods.
- Use `Integer.parseInt()` to get the int value from a string. It only works if the string represents a digit.
