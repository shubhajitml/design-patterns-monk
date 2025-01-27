# \#design-patterns-monk

---
# Software Design Principles and Patterns

---

## 1. [SOLID Principles](./src/main/java/com/design/patterns/SOLIDPrinciples)
SOLID principles are foundational guidelines for creating robust, maintainable, and scalable object-oriented software. They help developers design systems that are easy to understand and modify.

### 1.1 [Single Responsibility Principle (SRP)](./src/main/java/com/design/patterns/SOLIDPrinciples/src/main/java/SingleResponsibility)
A class should have only one reason to change.

### 1.2 [Open/Closed Principle (OCP)](./src/main/java/com/design/patterns/SOLIDPrinciples/src/main/java/OpenClosed)
Software entities should be open for extension but closed for modification.

### 1.3 [Liskov Substitution Principle (LSP)](./src/main/java/com/design/patterns/SOLIDPrinciples/src/main/java/LiskovSubstitutionPrinciple)
Subtypes must be substitutable for their base types without altering the behavior of the program.

### 1.4 [Interface Segregation Principle (ISP)](./src/main/java/com/design/patterns/SOLIDPrinciples/src/main/java/InterfaceSegregationPrinciple)
Clients should not be forced to depend on interfaces they do not use.

### 1.5 [Dependency Inversion Principle (DIP)](./src/main/java/com/design/patterns/SOLIDPrinciples/src/main/java/DependencyInversionPrinciple)
Depend on abstractions, not on concrete implementations.

---

## 2. [Design Patterns](./src/main/java/com/design/patterns)
Design patterns are proven solutions to recurring problems in software design. They are higher-level implementations that often reflect the underlying principles (like SOLID) to ensure software flexibility and maintainability.

### Relation Between Design Principles and Design Patterns:
- **Design Principles** provide general guidelines and a theoretical framework for creating robust software systems.
- **Design Patterns** are practical implementations of these principles to solve specific design challenges.

For example:
- The **Single Responsibility Principle** is reflected in patterns like the [Factory Method](./DesignPatterns/Creational/FactoryMethod) and [Decorator](./DesignPatterns/Structural/Decorator).
- The **Open/Closed Principle** is embodied in patterns such as [Strategy](./DesignPatterns/Behavioral/Strategy) and [Observer](./DesignPatterns/Behavioral/Observer).

---

### 2.1 [Creational Design Patterns](./src/main/java/com/design/patterns/CreationalPatterns)
Creational patterns focus on object creation mechanisms to ensure flexibility and reuse.

### 2.1.1 [Abstract Factory - (creational)](./DesignPatterns/Creational/AbstractFactory)
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

### 2.1.2 [Builder - (creational)](./src/main/java/com/design/patterns/CreationalPatterns/BuilderPatternCreational)
Separate the construction of a complex object from its representation.

### 2.1.3 [Factory Method - (creational)](./src/main/java/com/design/patterns/CreationalPatterns/1-Factory)
Define an interface for creating an object but let subclasses alter the type of objects that will be created.

### 2.1.4 [Prototype - (creational)](./DesignPatterns/Creational/Prototype)
Create new objects by copying an existing object (prototype).

### 2.1.5 [Singleton - (creational)](./DesignPatterns/Creational/Singleton)
Ensure that a class has only one instance and provide a global point of access to it.

---

### 2.2 Structural Design Patterns
Structural patterns deal with object composition and relationships to simplify the structure.

### 2.2.1 [Adapter](./DesignPatterns/Structural/Adapter)
Convert the interface of a class into another interface that clients expect.

### 2.2.2 [Bridge](./DesignPatterns/Structural/Bridge)
Decouple an abstraction from its implementation so that the two can vary independently.

### 2.2.3 [Composite](./DesignPatterns/Structural/Composite)
Compose objects into tree structures to represent part-whole hierarchies.

### 2.2.4 [Decorator](./DesignPatterns/Structural/Decorator)
Attach additional responsibilities to an object dynamically.

### 2.2.5 [Facade](./DesignPatterns/Structural/Facade)
Provide a unified interface to a set of interfaces in a subsystem.

### 2.2.6 [Flyweight](./DesignPatterns/Structural/Flyweight)
Use sharing to support a large number of fine-grained objects efficiently.

### 2.2.7 [Proxy](./DesignPatterns/Structural/Proxy)
Provide a surrogate or placeholder for another object to control access.

---

### 2.3 [Behavioral Design Patterns](./src/main/java/com/design/patterns/BehaviouralPatterns)
Behavioral patterns are concerned with the interaction and responsibility of objects.

### 2.3.1 [Chain of Responsibility - (behavioral)](./DesignPatterns/Behavioral/ChainOfResponsibility)
Pass requests along a chain of handlers until one of them handles the request.

### 2.3.2 [Command - (behavioral)](./DesignPatterns/Behavioral/Command)
Encapsulate a request as an object, allowing for parameterization and queuing of requests.

### 2.3.3 [Interpreter - (behavioral)](./DesignPatterns/Behavioral/Interpreter)
Define a grammar for a language and use an interpreter to evaluate sentences.

### 2.3.4 [Iterator - (behavioral)](./src/main/java/com/design/patterns/BehaviouralPatterns/IteratorPatternBehavioural)
Provide a way to access the elements of an aggregate object sequentially.

### 2.3.5 [Mediator - (behavioral)](./DesignPatterns/Behavioral/Mediator)
Define an object that encapsulates how a set of objects interact.

### 2.3.6 [Memento - (behavioral)](./src/main/java/com/design/patterns/BehaviouralPatterns/MementoPatternBehavioural)
Capture and restore an object's internal state.

### 2.3.7 [Observer - (behavioral)](./DesignPatterns/Behavioral/Observer)
Define a dependency between objects so that when one changes state, all dependents are notified.

### 2.3.8 [State - (behavioral)](./DesignPatterns/Behavioral/State)
Allow an object to alter its behavior when its internal state changes.

### 2.3.9 [Strategy - (behavioral)](./src/main/java/com/design/patterns/BehaviouralPatterns/StrategyPatternBehavioural)
Define a family of algorithms and make them interchangeable.

### 2.3.10 [Template Method - (behavioral)](./DesignPatterns/Behavioral/TemplateMethod)
Define the skeleton of an algorithm, letting subclasses override specific steps.

### 2.3.11 [Visitor - (behavioral)](./DesignPatterns/Behavioral/Visitor)
Represent an operation to be performed on elements of an object structure.


### compilation
```
mvn clean install -s ~/<path>/.m2/settings.xml -DskipTests
```

```
git config --local commit.gpgSign false
```