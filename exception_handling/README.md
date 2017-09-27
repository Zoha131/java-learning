## Notes

The execution of a throw statement is called throwing an exception.
The exception is an object created from an exception class.

The throw statement is analogous to a method call, but instead of calling a method, it calls
a catch block. In this sense, a catch block is like a method definition with a parameter that
matches the type of the value being thrown. Unlike a method, however, after the catch block
is executed, the program control does not return to the throw statement; instead, it executes
the next statement after the catch block.

The class names Error, Exception, and RuntimeException are somewhat confusing. All three of these classes are exceptions, and all of the errors occur at runtime.

The Throwable class is the root of exception classes. All Java exception classes inherit
directly or indirectly from Throwable.You can create your own exception classes by extending Exception or a subclass of Exception.

The exception classes can be classified into three major types: system errors, exceptions,
and runtime exceptions.

A handler for an exception is found by propagating the exception backward through a
chain of method calls, starting from the current method.

Every method must state the types of
checked exceptions it might throw. This is known as declaring exceptions.

To declare an exception in a method, use the throws keyword in the method header, as in
this example:
```java
public void myMethod() throws IOException
```

If a method does not declare exceptions in the superclass, you cannot override it to
declare exceptions in the subclass.

In general,
each exception class in the Java API has at least two constructors:
1. a no-arg constructor, and
2. a constructor with a String argument that describes the exception.
This argument is called the exception message, which can be obtained using
getMessage().

The keyword to declare an exception is throws, and the keyword to throw an exception
is throw.

The code that handles the exception is called the exception handler; it is found
by propagating the exception backward through a chain of method calls, starting from the
current method.

Various exception classes can be derived from a common superclass. If a catch block
catches exception objects of a superclass, it can catch all the exception objects of the
subclasses of that superclass.

The order in which exceptions are specified in catch blocks is important. A compile
error will result if a catch block for a superclass type appears before a catch block for a
subclass type. For example, the ordering in (a) on the next page is erroneous, because
RuntimeException is a subclass of Exception. The correct ordering should be as
shown in (b).

Java forces you to deal with checked exceptions. If a method declares a checked exception
(i.e., an exception other than Error or RuntimeException), you must invoke it in a
try-catch block or declare to throw the exception in the calling method. For example,
suppose that method p1 invokes method p2, and p2 may throw a checked exception
(e.g., IOException); you have to write the code as shown in (a) or (b) below.

```Java
void p1() {
  try {
      p2();
    }
  catch (IOException ex) {
      ...
    }
}
```
```Java
void p1() throws IOException {
  p2();
}
```

You can use the new JDK 7 multi-catch feature to simplify coding for the exceptions
with the same handling code. The syntax is:
```java
catch (Exception1 | Exception2 | ... | Exceptionk ex) {
// Same code for handling these exceptions
}
```

Occasionally, you may want some code to be executed regardless of whether an exception
occurs or is caught. Java has a finally clause that can be used to accomplish this objective.
The syntax for the finally clause might look like this:
```java
try {
  statements;
}
catch (TheException ex) {
  handling ex;
}
finally {
  finalStatements;
}
```

The finally block is a key tool for preventing resource leaks. When closing a file or otherwise recovering resources, place the code in a finally block to ensure that resource is always recovered.

When should you use a try-catch block in the code? Use it when you have to deal with
unexpected error conditions. Do not use a try-catch block to deal with simple, expected
situations.

Java allows an exception handler to rethrow the exception if the handler cannot
process the exception or simply wants to let its caller be notified of the exception.
The syntax for rethrowing an exception may look like this:
```java
try {
  statements;
}
catch (TheException ex) {
  perform operations before exits;
  throw ex;
}
```

Throwing an exception along with another exception forms a chained exception

## Readings
1. [oracle doc for Finally](https://docs.oracle.com/javase/tutorial/essential/exceptions/finally.html)
2. [checked vs unchecked exceptions](http://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/)

## Problems

1.  Calculator.java, is a simple commandline calculator. Note that the program terminates if any operand is nonnumeric. Write a program with an exception handler that deals with nonnumeric operands. Your program should display a message that informs the user of the wrong operand type before exiting.
