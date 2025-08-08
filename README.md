# Software Design Patterns 🏗️

```🚧 Work in Progress - This repository is actively being developed. More patterns and examples will be added regularly. Check back often for updates!```

A comprehensive repository containing practical implementations, UML diagrams, and detailed explanations of common software design patterns. This collection serves as both a learning resource and quick reference for developers looking to understand and apply design patterns in their projects.

## 📋 Table of Contents

- [Overview](#overview)
- [Repository Structure](#repository-structure)
- [Design Pattern Categories](#design-pattern-categories)
- [Getting Started](#getting-started)
- [How to Use This Repository](#how-to-use-this-repository)
- [Resources](#resources)
- [License](#license)

## Overview

Design patterns are reusable solutions to commonly occurring problems in software design. They represent best practices evolved over time by experienced developers and provide a shared vocabulary for discussing design solutions.

This repository covers the classic Gang of Four (GoF) design patterns along with additional modern patterns, each including:

- **Code Examples** - Practical implementations in Java programming language
- **UML Diagrams** - Visual representations of pattern structure and relationships
- **Detailed Explanations** - When to use, benefits, drawbacks, and real-world applications

## 📁 Repository Structure

```
├── creational-patterns/
│   ├── singleton/
│   │   ├── README.md
│   │   ├── uml-diagram.png
│   │   ├── java/
│   │   ├── python/
│   │   └── javascript/
│   ├── factory-method/
│   └── ...
├── structural-patterns/
│   ├── adapter/
│   ├── decorator/
│   └── ...
├── behavioral-patterns/
│   ├── observer/
│   ├── strategy/
│   └── ...
├── modern-patterns/
│   ├── mvc/
│   ├── mvp/
└── └── ...
```

Each pattern directory contains:
- `EXPLANATION.md` - Comprehensive explanation and usage guide
- `uml-diagram.png` - Visual representation of the pattern
- Java implementation
- Example usage scenarios

## Design Pattern Categories

### Creational Patterns
Patterns that deal with object creation mechanisms.

- [x] **Singleton** - Ensure only one instance exists
- [x] **Factory Method** - Create objects without specifying exact classes
- [x] **Abstract Factory** - Create families of related objects
- [x] **Builder** - Construct complex objects step by step
- [x] **Prototype** - Clone objects instead of creating new ones

### Structural Patterns
Patterns that deal with object composition and relationships.

- [x] **Adapter** - Make incompatible interfaces work together
- [x] **Bridge** - Separate abstraction from implementation
- [x] **Composite** - Compose objects into tree structures
- [x] **Decorator** - Add behavior to objects dynamically
- [x] **Facade** - Provide simplified interface to complex subsystem
- [x] **Flyweight** - Share objects efficiently to support large numbers
- [x] **Proxy** - Provide placeholder/surrogate for another object

### Behavioral Patterns
Patterns that focus on communication between objects and assignment of responsibilities.

- [x] **Chain of Responsibility** - Pass requests along handler chain
- [x] **Command** - Encapsulate requests as objects
- [x] **Iterator** - Access elements of collection sequentially
- [x] **Mediator** - Define how objects interact with each other
- [x] **Memento** - Capture and restore object state
- [x] **Observer** - Notify multiple objects about state changes
- [x] **State** - Change object behavior when internal state changes
- [x] **Strategy** - Define family of algorithms and make them interchangeable
- [x] **Template Method** - Define skeleton of algorithm in base class
- [x] **Visitor** - Define new operations without changing object structure

### Modern Patterns
Contemporary patterns for modern software development.

- [x] **Model-View-Controller (MVC)** - Separate concerns in user interfaces
- [x] **Model-View-Presenter (MVP)** - Variation of MVC with different responsibilities
- [x] **Dependency Injection** - Provide dependencies from external source
- [x] **Repository** - Encapsulate data access logic

## Getting Started

### Prerequisites
- Basic understanding of object-oriented programming
- Familiarity with at least one programming language (Java, Python, JavaScript, C#, etc.)
- Basic knowledge of UML diagrams (helpful but not required)

### Quick Start
1. Clone the repository
   ```bash
   git clone https://github.com/manas-aggrawal/software-design-patterns.git
   cd software-design-patterns
   ```

2. Choose a pattern category that interests you
3. Navigate to a specific pattern directory
4. Read the README.md for explanation and theory
5. Examine the UML diagram to understand structure
6. Explore code examples in your preferred language
7. Try the practice problems to test your understanding

## How to Use This Repository

### For Learning
- Start with creational patterns if you're new to design patterns
- Read the explanation before looking at code
- Study the UML diagram to understand relationships
- Implement the pattern yourself before checking the solution

### For Reference
- Use the search functionality to find specific patterns
- Each pattern includes a "When to Use" section
- Code examples show practical implementations
- UML diagrams provide quick visual reference

### For Teaching
- Each pattern has consistent structure for easy presentation
- UML diagrams are classroom-ready


## Resources

### Books
- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gang of Four
- "Head First Design Patterns" by Freeman & Robson
- "Clean Code" by Robert Martin

### Online Resources
- [Refactoring.Guru - Design Patterns](https://refactoring.guru/design-patterns)
- [Design Patterns Game](http://designpatternsgame.com/)
- [Source Making - Design Patterns](https://sourcemaking.com/design_patterns)

### Tools Used
- **UML Diagrams**: Created with [MermaidChart](https://www.mermaidchart.com)
- **Code Examples**: Tested and verified implementations
- **Documentation**: Written in Markdown for GitHub compatibility

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Gang of Four for establishing the foundation of design patterns
- The software engineering community for continued evolution of patterns

---

⭐ **Star this repository if you find it helpful!**

📢 **Share with fellow developers who are learning design patterns**

🐛 **Found an issue?** Please open an issue or submit a pull request

---

*Happy coding and pattern learning! 🚀*