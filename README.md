# Mastering DSA (Java)

This project is a personal practice repository for mastering Data Structures and Algorithms (DSA) in Java, organized section-wise. Each section is implemented as a separate package, and most programs are standalone Java classes with a `main` method for easy execution and testing.

## Project Structure

- `src/main/java/arrays` — Array-based problems and solutions
- `src/main/java/strings` — String manipulation and algorithms
- `src/main/java/linkedlist` — Linked List implementations and problems
- `src/main/java/stack` — Stack data structure and problems
- `src/main/java/queue` — Queue data structure and problems
- `src/main/java/tree` — Tree data structures and algorithms
- `src/main/java/graph` — Graph algorithms and problems
- `src/main/java/sorting` — Sorting algorithms
- `src/main/java/searching` — Searching algorithms
- `src/main/java/recursion` — Recursion-based problems
- `src/main/java/dynamicprogramming` — Dynamic Programming problems

## How to Use

1. **Clone the repository**
2. **Build the project:**
   ```sh
   mvn clean compile
   ```
3. **Run any standalone Java class:**
   ```sh
   mvn exec:java -Dexec.mainClass="arrays.ArrayExample"
   ```
   Replace `arrays.ArrayExample` with the fully qualified class name you want to run.

## Adding New Problems
- Create a new Java class in the appropriate package.
- Use descriptive class names (e.g., `ReverseArray`, `BinarySearchTree`).
- Each class should have a `main` method for standalone execution.
- Add comments and JavaDoc for clarity.

## Java Best Practices
- Use meaningful class, method, and variable names.
- Keep each class focused on a single problem or concept.
- Add JavaDoc comments for classes and methods.
- Use proper package naming conventions (all lowercase).
- Avoid hardcoding values; use constants where appropriate.
- Write clean, readable, and well-documented code.
- Use exception handling where necessary.

## Contributing
This is a personal practice repository, but feel free to fork and use for your own learning!

## License
This project is for personal educational use.

