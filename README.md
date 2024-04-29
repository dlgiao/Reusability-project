# Reusability by Inheritance and Composition

Code reuse is a crucial aspect of software development, and in the object-oriented paradigm, two main approaches are used: inheritance and composition. These two methods offer distinct ways to share code between different parts of your application.

## Inheritance

Inheritance allows a class (called a derived class or subclass) to inherit attributes and methods from another class (called a base class or superclass). This creates an "is a" relationship between the two classes, where the subclass is a specific version of the superclass. Inheritance is often used when the new class shares a strong and specialized relationship with the existing class.

For example, if you have a class Animal with common methods such as eat() and sleep(), you can create a class Dog that inherits from Animal and add specific dog behaviors like bark().

## Composition

Composition, on the other hand, involves building complex objects from multiple simpler objects. Instead of inheriting features from a class, another class uses them by including them as members. This creates a "has a" relationship between classes, where one class contains a reference to another class.

For example, if a car has an engine, wheels, and seats, instead of creating a Car class inheriting these characteristics, you can include them as separate objects within the Car class.

## Comparison

Inheritance creates a strong relationship between classes, meaning that any modification to the base class can impact all its subclasses. Conversely, composition offers looser coupling, as objects can be replaced or modified independently of each other.

### Tip

In general, composition is preferred over inheritance when possible, as it promotes a more modular, flexible, and maintainable code structure. Inheritance is often more suitable for clearly defined "is a" relationships, while composition is more suitable for flexible and modular "has a" relationships.

By choosing wisely between inheritance and composition, you can optimize code reuse in your application while promoting robust and scalable software design.

# Managing Coupling

In the realm of object-oriented programming, code reuse through inheritance and composition is essential. These two approaches have a significant impact on the degree of coupling between different parts of your software system.

## Strong Coupling and Inheritance

When using inheritance to share code between classes, you often create strong coupling between the base class and its subclasses. This means that any modification made to the base class can have repercussions on all its subclasses. For example, if you modify a method in the base class, all subclasses inheriting that method will also be affected.

## Strong Coupling and Composition

Conversely, composition tends to reduce coupling by favoring looser relationships between objects. Rather than inheriting features from a base class, a class uses objects from other classes by including them as members. Thus, changes made to one class will not necessarily impact other classes, unless those changes directly affect the included objects.

## Weak Coupling and Interfaces

One approach to reduce coupling is to use interfaces. Instead of directly depending on concrete implementations, a class can depend on an interface. This allows for more flexible object substitution and promotes weak coupling. For example, a class can depend on a sorting interface rather than a specific sorting implementation, making it easy to change the sorting algorithm without modifying the client class.

### Tip

In general, it's recommended to aim for weak coupling as much as possible, as it makes your code more flexible, modular, and easier to maintain. Use inheritance when you have a clearly defined "is a" relationship and use composition when you have a more flexible and modular "has a" relationship. By judiciously combining these approaches and using interfaces, you can optimize code reuse while minimizing undesirable side effects when modifying your software system.
