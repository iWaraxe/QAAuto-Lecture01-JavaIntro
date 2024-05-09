Here's the English translation of the lecture and task condition files in Markdown format.

**Lecture 1: Introduction to Java and "Hello, World!" Program**

### History of Java
The history of the Java programming language began in 1991 when engineers at Sun Microsystems created a programming language for household electronic devices. Java was initially named Oak until 1995, then renamed Green, and eventually became Java.

The official release date of Java is considered to be May 23, 1995, after Sun Microsystems released the first implementation of Java 1.0. It guaranteed the principle of "Write Once, Run Anywhere," providing low-cost deployment on popular platforms.

- **November 13, 2006**: Sun Microsystems released most of its software as free and open-source under the GNU General Public License (GPL).
- **May 8, 2007**: Sun Microsystems completed the process to make the source code free and open, except for a small part of the code for which the company did not own copyrights.
- **2009**: Sun Microsystems was acquired by Oracle, making Oracle the current owner of Java.

### Advantages of Java: A Brief Overview
- **Object-Oriented**: Everything in Java is an object. Extensions can easily be added as Java is based on the object model.
- **Platform-Independent**: Unlike other programming languages, including C and C++, Java compiles to platform-independent bytecode, which is interpreted by the Java Virtual Machine (JVM).
- **Simple**: Learning and starting with Java remains simple if you understand the basic concepts of object-oriented programming.
- **Secure**.
- **Multithreaded**: You can write programs that can perform multiple tasks simultaneously.
- **High Performance**: The introduction of the Just-In-Time (JIT) compiler provided high performance.

### Java Syntax for Beginners
A Java program can be defined as a collection of objects interacting by calling each other's methods. Let's quickly explore the syntax of the Java language.

**Common Terminology:**
- **Object**: An object has states and behaviors, e.g., a dog can have a state (color, name) and behavior (running, barking, eating). An object is an instance of a class.
- **Class**: A blueprint that defines objects.
- **Method**: Primarily defines behavior. A class can contain multiple methods. Methods logically manipulate data and perform actions.

### The First Program and Getting to Know Java Syntax
Let's write a simple program to display "Hello, World!" on the screen, and get familiar with the Java syntax.

1. **Create a Project in IntelliJ IDEA**
    - **IDE Information**:  
      IntelliJ IDEA is a software development environment for many programming languages, particularly Java, JavaScript, and Python. It is developed by JetBrains and features an intuitive interface, autocompletions, suggestions, and many more tools.

2. **Write the First Program**
    ```java
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }
    ```

3. **Compile and Run the Program in IntelliJ IDEA**

4. **Explanation of the Code Compilation Process**
   - `Main.java` is a simple text file that can be opened with a text editor.
   - Compile the code via the command line:
     ```
     javac Main.java
     ```
   - After compilation, the code is translated into bytecode, which the Java Virtual Machine (JVM) interprets into machine instructions.

### Extend the Program
Add a few more lines to our program and analyze the difference:
```java
System.out.println("Hello, World!");
System.out.print("My name is");
System.out.print(" Igor");
```

### Java Syntax Essentials
- **Case Sensitivity**: Java is case-sensitive, meaning `Main` and `main` are different.
- **Class Naming**: Each class name should start with a capital letter.
- **Camel Case**: If multiple words are used to form the class name, each internal word's first letter should be uppercase, e.g., `MyJavaClass`.
- **Method Naming**: All method names should start with a lowercase letter.
- **File Name**: The file name should match the class name exactly.
- **`public static void main(String args[])`**: Program execution starts from the `main()` method, which is required in every program.

### Identifiers in Java
Identifiers are names used for classes, variables, and methods. All components in Java require names. Here are some rules to remember about identifiers:
- Each identifier must start with a letter (A-Z, a-z), `$`, or `_`.
- After the first character, it can have any combination of characters.
- Keywords cannot be used as identifiers.
- Identifiers in Java are case-sensitive.

**Examples of Correct Identifiers:**
- `age`, `$salary`, `_value`, `__1_value`

**Examples of Incorrect Identifiers:**
- `123abc`, `-salary`

### Reserved Keywords in Java
Java has 50 reserved words that cannot be used as identifiers.

```plaintext
abstract    assert      boolean     break
byte        case        catch       char
class       const       continue    default
do          double      else        enum
extends     final       finally     float
for         goto        if          implements
import      instanceof  int         interface
long        native      new         package
private     protected   public      return
short       static      strictfp    super
switch      synchronized this       throw
throws      transient   try         void
volatile    while
```

### Blank Line
Blank lines in Java only contain spaces and possibly comments. Java completely ignores lines that contain spaces and comments.

### Variables: Declaration and Initialization
A variable is a named memory location where data of a certain type can be stored.

**Examples:**
```java
int a, b, c;          // Declaration of three integers a, b, and c.
int a = 10, b = 10;   // Example of initialization.
byte b = 22;          // Initialization of a byte variable `b`.
double pi = 3.14159;  // Declaration and assignment of pi.
char a = 'a';         // Assigning a value of 'a' to a char variable `a`.
```

### Data Types in Java
There are two data types in Java:
- **Primitive Data Types**
- **Reference Data Types (Reference/Object)**

### Primitive Data Types
Java supports eight primitive data types. Here is a detailed look at these eight basic data types.

**Type `byte`**
- 8-bit signed integer.
- Minimum value: -128 (`-2^7`).
- Maximum value: 127 (`2^7 - 1`).
- Mainly used for saving space in large arrays as it is four times smaller than `int`.
```java
byte a = 100;
byte b = -50;
```
```java
System.out.println(Integer.toBinaryString(127)); // Binary representation
System.out.println(0b1111111);
```

**Type `short`**
- 16-bit signed integer.
- Minimum value: -32768 (`-2^15`).
- Maximum value: 32767 (`2^15 - 1`).
- Primarily used for saving memory like `byte`, and is two times smaller than `int`.
```java
short s = 10000;
short r = -20000;
```

**Type `int`**
- 32-bit signed integer.
- Minimum value: -2147483648 (`-2^31`).
- Maximum value: 2147483647 (`2^31 - 1`).
- Typically used for integers if memory isn't a concern.
```java
int a = 100000;
int b = -200000;
```

**Type `long`**
- 64-bit signed integer.
- Minimum value: -9223372036854775808 (`-2^63`).
- Maximum value: 9223372036854775807 (`2^63 - 1`).
- Used when a wider range than `int` is needed.
```java
long a = 100000L;
long b = -200000L;
```

**Type `float`**
- Single-precision 32-bit IEEE 754 floating-point number.
- Mainly used to save memory in large arrays of floating-point numbers.
- Should not be used for precise values, e.g., currency.
```java
float f1 = 234.5f;
```

**Type `double`**
- Double-precision 64-bit IEEE 754 floating-point number.
- Usually used for decimal values.
- Should not be used for precise values, e.g., currency.
```java
double d1 = 123.4;
```

**Type `boolean`**
- Represents a single bit of information.
- Has only two possible values: `true` and `false`.
```java
boolean one = true;
```

**Type `char`**
- 16-bit Unicode character.
- Minimum value: `'\u0000'` (or 0).
- Maximum value: `'\uffff'` (or 65535 inclusive).
- Used for storing any character.
```java
char letterA = 'A';
```

**String Class**
The `java.lang` package includes a class called `String`, which encapsulates data structures corresponding to a string. This class is an object representation of an immutable character array. It contains methods that allow string comparison, searching within strings, and extracting certain characters and substrings.
```java
String greeting = "Hello, World!";
```

**Homework:** [Task_1_Hello_World_Variables](./Task_1_Hello_World_Variables.md)

---

**Task 1:

 "Hello, World!" Program**

### First App "Hello, World!"
1. **Create a New Project in IntelliJ IDEA**
   - Project Name: `my-first-app`
   - Write an application that outputs the phrase "Hello, World!" to the console.
   - [Example](https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.html#write-code)
2. **Screenshot the Code and Console Output**

### Differences Between `System.out.println()` and `System.out.print()`
1. Add TWO more lines to the same application. The first line should output "My name is", and the second line should output your name. The result should display two lines as one.
```java
Hello, World!
My name is Igor
```
2. **Screenshot the Code and Console Output**

### Variables. Data Types: `String`
1. In the same application, declare a `String` variable named `plan` and assign it the value "I am going to learn Java." Remember to enclose the string in double quotes and end each line with a semicolon.
2. Output the data to the console.

**Expected Output:**
```java
Hello, World!
My name is Igor
I am going to learn Java
```

[Example of Variable Declaration](https://comaqa.gitbook.io/java-automation/yazyk-java.-osnovy/peremennye)

**Screenshot the Code and Console Output**

### Variables. Data Types: `boolean`, `byte`, `short`, `char`, `int`, `long`, `float`, `double`
1. Declare a `boolean` variable and assign it the value `true`.
2. Declare a `byte` variable and assign it the smallest allowed value.
3. Declare a `char` variable and assign it the value `'a'` (within single quotes).
4. Declare a `short` variable and assign it the maximum allowed value.
5. Declare an `int` variable and assign it any valid value.
6. Declare a `long` variable and assign it any valid value.
7. Declare a `float` variable and assign it any valid value.
8. Declare a `double` variable and assign it any valid value.

**Table of Allowed Values**: [Primitive Data Types](https://comaqa.gitbook.io/java-automation/yazyk-java.-osnovy/tipy-dannykh)

**Screenshot the Code (ONLY)**

**Useful Article on Primitives:**
[Primitive Data Types](https://javarush.ru/groups/posts/1382-primitivnihe-tipih-java)

### Difference Between `print` and `println`
- `print`: Prints text on the same line.
- `println`: Prints text and moves the cursor to the next line.

### Practice Code Comments
- Comment out one of the lines using `//` at the beginning of the line.

### Practice the Following Shortcuts:
- `psvm`: Shortcut for `public static void main(String[] args)`
- `sout`: Shortcut for `System.out.println();`
