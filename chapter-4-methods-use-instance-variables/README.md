# Methods use Instance Variables

## Table of Contents
- States and Objects
- Different Method Behavior
- Sending Things to a Method
- Pass-by-Value
- Bullet Points

## States and Objects
State affects behavior, behavior affects state. Instance variables and methods are used to represent state and behavior. Each instance of a class can have its own unique values for its instance variables. The main thing about objects are that they have a `behavior` that acts on its `state`. This is done by methods using instance variables.

## Different Method Behavior
Every object of that same type will all have the same methods. The only difference is that they may behave different.
For example, A song object may have the instance variable `title` and `artist` with the methods setTitle(), setArtist(), and play().
```java
    Song t2 = new Song();
    t2.setArtist("Travis");
    t2.setTitle("Astroworld");

    Song c2 = new Song();
    c2.setArtist("Coldplay");
    c2.setTitle("The Scientist")
```
If you play `t2.play()` it will not be the same song as `c2.play()`. This is because of the 2 instance variables. the `play()` method will play the song represented by the value of the `title` instance. The behavior is the difference but the code stays the same.

## Sending Things to a Method
You have the ability to give values to your methods.
```java
d.bark(3); // tells this dog to bark 3 times
```

### Vocabulary 
Arguments: the things you pass to the methods.
Parameters: a local variable that can be used inside the body of the method.

A caller `passes` arguments. A method `uses` parameters. If a method takes a parameter , you HAVE to pass it an argument. It must also be of the apporiate type.

### Using Arguments and Parameters
1. Call the bark method on the Dog reference, and pass in the value 3.
```java
Dog d = new Dog();
d.bark(3);
```
2. The bits represents the int value `3` are delivered into the bark method.
3. The bits land in the numOfBarks parameter.
```java
void bark(int numOfBarks) {
    while (numOfBarks > 0) {
        System.out.println("Ruff!");
        numOfBarks = numOfBarks - 1;
    }
}
```
4. Use the numOfBarks parameter as a variable in the method code.

### Getting Things Back From a Method
Before this chapter we just wrote void which means there is no return.
```java
void go(){

}
```
Methods have the ability to return values. Every method is declared with a return type. 
```java
int giveSecret(){
    return 19;
}
```

### REMEMBER
 Whatever you say you'll give back, you better give back!

## Pass-by-Value
Java is pass-by-value. This means pass-by-copy.

1. Declare an int variable and assign it the value 7. The bit pattern for 7 goes into the variable named x.
```java
int x = 7;
```
2. Declare a method with an int parameter named z.
```java
void go(int z){

}
```
3. Call the go() method, passing the variable x as the argument. The bits in x are copied, and the copy lands in z.
```java
foo.go(x); -> void go(int z){  // copy of x

                            }
```
4. Change the value of z inside the method. The value of x doesn't change! The argument passed to the z parameter was only a copy of x. The method can't change the bits that were in the calling variable x.
```java
void go(int z){
    z = 0; // x doesn't change, even if z does. They are not connected
}
```

## Bullet Points
- Classes define what an object knows and what an object does.
- Things an object knows are the `instance variables`.
- Things an object knows does are its `methods`.
- Methods can be use instance variables so that objects of the same type can behave differently.
- A method can have parameters, which means you can pass one or more values in to the method.
- The number and type of values you pass in must match the order and type of the parameters declared by the method.
- Values passed in and out of the methods can be implicity promoted to a larger type or cast to a smaller type.
- A method must declare a return type or a void type.

### Encapsulation
This happens when you leave your instance variables exposed and let others see and possibly alter them! This means reachable with the dot operator.
```java
theCat.height = 0; // OH NO!
```
To prevent this we need to build setter methods for all the instance variables, and find a way to force other code to call the setters rather than access the data directly. How? With the `public` and `private` access modifiers.
- Mark instance variables private and provide public getters and setters for access control.