# Design Patterns and Principles

A comprehensive collection of commonly used design patterns implemented in Java. This project demonstrates best practices for solving recurring design problems in object-oriented programming.

## Overview

This repository contains practical implementations of 6 essential Gang of Four (GoF) design patterns:
- **Creational Patterns**: Singleton, Builder, Factory
- **Structural Patterns**: Adapter, Decorator, Proxy
- **Behavioral Patterns**: (Foundation for advanced patterns)

---

## Project Structure

### 1. **Singleton Pattern** (`SingletonPatternExample/`)

**Purpose**: Ensures a class has only one instance and provides a global point of access to it.

**Files**:
- `Logger.java` - Singleton implementation that controls instance creation with private constructor and static getInstance() method
- `TestLogger.java` - Test class demonstrating singleton behavior

**Use Cases**:
- Logging systems
- Database connections
- Configuration managers
- Thread pools

**Key Concept**: The singleton uses eager initialization through static method to ensure thread safety and single instance across the application.

---

### 2. **Builder Pattern** (`BuilderPatternExample/`)

**Purpose**: Separates the construction of a complex object from its representation, allowing step-by-step construction.

**Files**:
- `Computer.java` - Complex object with multiple properties (name, model, RAM)
- `ComputerBuilder.java` - Builder class with fluent interface for step-by-step construction
- `TestComputer.java` - Test class showing flexible object construction

**Use Cases**:
- Constructing objects with many optional parameters
- Creating immutable objects
- Improving code readability for complex object creation

**Key Concept**: Fluent interface allows chaining method calls (e.g., `builder.setname(...).setmodel(...).setram(...)`) for clean, readable construction.

---

### 3. **Factory Pattern** (`FactoryPatternExample/`)

**Purpose**: Creates objects without specifying exact classes, using factory methods to determine which concrete class to instantiate.

**Files**:
- `Document.java` - Common interface for all document types
- `DocumentFactory.java` - Abstract factory defining the createDocument() template method
- `PDFDocument.java`, `ExcelDocument.java`, `WordDocument.java` - Concrete document implementations
- `PDFDocumentFactory.java`, `ExcelDocumentFactory.java`, `WordDocumentFactory.java` - Concrete factory implementations
- `TestFactory.java` - Test demonstrating factory creation

**Use Cases**:
- Document creation systems
- UI component creation
- Database connection pooling
- Plugin/extension systems

**Key Concept**: Abstract factory pattern delegates object creation to subclasses, promoting loose coupling and easier object creation management.

---

### 4. **Adapter Pattern** (`AdapterPatternExample/`)

**Purpose**: Converts the interface of a class into another interface clients expect, allowing incompatible interfaces to work together.

**Files**:
- `PaymentProcessor.java` - Target interface that clients expect
- `UPIPay.java`, `RazorPay.java`, `CashPay.java` - Incompatible existing payment classes
- `UPIPayAdapter.java`, `RazorPayAdapter.java`, `CashPayAdapter.java` - Adapters that wrap existing classes to implement PaymentProcessor interface
- `TestAdapter.java` - Test showing multiple payment systems working through a common interface

**Use Cases**:
- Payment gateway integration (as shown)
- Legacy system integration
- Third-party library adaptation
- API compatibility layers

**Key Concept**: Adapters allow incompatible payment systems to work uniformly through the PaymentProcessor interface without modifying original code.

---

### 5. **Decorator Pattern** (`DecoratorPatternExample/`)

**Purpose**: Attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.

**Files**:
- `Notifier.java` - Common interface for notification components
- `EmailNotifier.java` - Base concrete notifier implementation
- `NotifierDecorator.java` - Abstract decorator that implements Notifier and wraps a Notifier instance
- `SMSNotifierDecorator.java` - Concrete decorator adding SMS notification capability
- `TestDecorator.java` - Test demonstrating decorator composition

**Use Cases**:
- Adding features to objects at runtime
- GUI component enhancement
- Logging and monitoring decorators
- Stream processing (input/output streams)

**Key Concept**: Decorators wrap notifiers while maintaining the Notifier interface, allowing combination of features (e.g., Email + SMS notifications) through composition rather than inheritance.

---

### 6. **Proxy Pattern** (`ProxyPatternExample/`)

**Purpose**: Provides a surrogate or placeholder for another object to control access to it, typically for lazy loading, caching, or access control.

**Files**:
- `Image.java` - Interface for image objects
- `RealImage.java` - Actual image implementation with resource-intensive display() operation
- `ProxyImage.java` - Proxy that delays RealImage instantiation until display() is called
- `TestProxy.java` - Test demonstrating lazy loading through proxy

**Use Cases**:
- Lazy loading (as shown with images)
- Access control and authentication
- Caching and performance optimization
- Remote object proxies (RPC)

**Key Concept**: ProxyImage delays creating the expensive RealImage until needed, improving performance by deferring resource allocation until the image is actually displayed.

---

## Pattern Comparison

| Pattern | Type | Problem Solved | Complexity |
|---------|------|---------------|----|
| Singleton | Creational | Control instance count | Low |
| Builder | Creational | Complex object construction | Medium |
| Factory | Creational | Object creation abstraction | Medium |
| Adapter | Structural | Interface incompatibility | Low |
| Decorator | Structural | Dynamic feature addition | Medium |
| Proxy | Structural | Object access control | Low |

---

## How to Run

Each example includes a test class that demonstrates the pattern:

```bash
# Example: Running the Adapter Pattern test
javac AdapterPatternExample/*.java
java AdapterPatternExample.TestAdapter

# Example: Running the Singleton Pattern test
javac SingletonPatternExample/*.java
java SingletonPatternExample.TestLogger
```

---

## Learning Path

1. Start with **Singleton** - simplest pattern to understand core concepts
2. Progress to **Builder** - introduces fluent interfaces
3. Learn **Factory** - delegation and polymorphism
4. Study **Adapter** - interface compatibility
5. Explore **Decorator** - composition over inheritance
6. Master **Proxy** - lazy loading and access control

---

## Key Principles Demonstrated

- **Single Responsibility**: Each class has one reason to change
- **Open/Closed**: Classes open for extension, closed for modification
- **Liskov Substitution**: Subtypes can replace their base types
- **Interface Segregation**: Clients depend on specific interfaces
- **Dependency Inversion**: Depend on abstractions, not concrete classes

---

## Notes

- These implementations follow Java conventions and best practices
- Each pattern can be combined with others for more complex solutions
- Understanding these patterns is crucial for writing maintainable, scalable code
- Patterns are tools, not rules - use them where they add value

---

## Resources

- Gang of Four (GoF) Design Patterns book
- Refactoring Guru - Design Patterns explanations
- Official Java documentation
