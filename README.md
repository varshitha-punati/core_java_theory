# core_java_theory
# Interfaces
- Interface can have only abstract methods. Since Java 8, it can have default and static methods also
- Interface supports multiple inheritance.
- Interface has only static and final variables.
- Interface can't provide the implementation of abstract class
- The interface keyword is used to declare interface.
- An interface can extend another Java interface only.
- An interface can be implemented using keyword implements
- Members of a Java interface are public by default.
# Abstract classes
- Abstract class can have abstract and non-abstract methods.
- Abstract class doesn't support multiple inheritance.
- Abstract class can have final, non-final, static and non-static variables.
- Abstract class can provide the implementation of interface.
- The abstract keyword is used to declare abstract class.
- An abstract class can be extended using keyword "extends".
- A Java abstract class can have class members like private, protected, etc
# Polymorphism
- The word polymorphism means having many forms
- polymorphism is considered as one of the important features of Object Oriented Programming.
- polymorphism as the ability of a message to be displayed in more than one form.
## Method signature
- The method signature consists of the method name and the parameter list.
- It's the combination of the method name and the parameter list.
- public void setMapReference(Point position)
 {
 //method code
 }
 ## Method Overloading
 - When there are multiple functions with same name but different parameters then these functions are said to be overloaded
 - Functions can be overloaded by change in number of arguments or/and change in type of arguments.
# Inheritance
* Inheritance is one of the most important feature of Object Oriented Programming.
* Inheritance in the name itself known that inheriting the properties from parent toc child classes
* Here we are inheriting properties and methods of parent classes
* By using 'extends' keyword we are inheriting the properties

### Use of Inheritance
* Inheritance is used for code reusability
- for example:
 - There are four sites abc site,xyz site,book my show,123 site
  - these four sides we want to provide same code for it and the have common methods like book(),cancel()
  - here to reduce the lines of code and reuse the code  we take the common functionality in parent class method
  - so,now we can reuse the code by inheriting the properties of parent to child
  
### Types of Inheritance
1. Single Inheritance
2. Multiple Inheritance
3. Multilevel Inheritance
4. Hybrid Inheritance
5. Hierarichal Inheritance
6. Cyclic Inheritance(not supported in java)

### Single Inheritance
- In single inheritance  a class inherits another class

### Multiple Inheritance
- When one class inherits multiple classes, it is known as multiple inheritance.
- here class does not support the multiple inheritance
- Interfaces are used in multiple inheritance
- we want to inherit the properites of two parent classes to one child.
- By using extends keyword in class it is not possible

### Multilevel Inheritance
- When a class extends a class, which extends another class then this is called multilevel inheritance. 
- For example class C extends class B and class B extends class A then this type of inheritance is known as multilevel inheritance.

### Hybrid Inheritance
- Hybrid Inheritance is a combination of both Single Inheritance and Multiple Inheritance. 
- Since in Java Multiple Inheritance is not supported directly we can achieve Hybrid inheritance also through Interfaces only. 
### Hierarichal Inheritance
- When two or more classes inherits a single class, it is known as hierarchical inheritance. 
- For example, B and C classes inherits the A class 
### Cyclic Inheritance
- It is not supported in java
- a->b,b->a
- It is in a cyclic form
