# Primitives and Refrences

## Table of Contents
- Variables Review
- Declaring a Variable
- Spillage

## Variable Review
The 2 different types of variables that have been reviewed are primitive and reference.
Primitive variables hold fundamental values. This variable can be either a boolean or a numeric.
```java
byte b = 89;
```
Reference variables hold references of objects. This variable can be a class, interface, enum, or an array.
```java
Person myBFF;
```

## Declaring a Variable
Java cares about the type. It will not compile if the code in question is something like a Giraffe refrencing a Rabbit variable.
Java must have a TYPE
Java must have a NAME
```java
int count;
```
Variables are containers that are ment to hold something.

## Spillage
Java will try to prevent `spillage`. If the value is larger than the container then it will cause spillage. But you can put a smaller value into a larger container of course.
```java
int x = 24;
byte b = x;
// won't work buddy
```