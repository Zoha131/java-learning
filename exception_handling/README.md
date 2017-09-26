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

## Readings

## Problems
