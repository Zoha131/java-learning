## Notes

The File class contains the methods for obtaining the properties of a file/directory
and for renaming and deleting a file/directory

The directory separator for Windows is a backslash (\). The backslash is a special character in Java and should be written as \\ in a string literal

Constructing a File instance does not create a file on the machine. You can create a
File instance for any file name regardless whether it exists or not. You can invoke the
exists() method on a File instance to check whether the file exists.

Use the Scanner class for reading text data from a file and the PrintWriter class
for writing text data to a file.

The java.io.PrintWriter class can be used to create a file and write data to a text file.
First, you have to create a PrintWriter object for a text file.

Programmers often forget to close the file. JDK 7 provides the followings new try-withresources syntax that automatically closes the files.
```java
try (declare and create resources) {
  Use the resource to process the file;
}
```

A resource is declared and created followed by the keyword try. Note that the resources are
enclosed in the parentheses. The resources must be a subtype of AutoCloseable
such as a PrinterWriter that has the close() method. A resource must be declared and
created in the same statement and multiple resources can be declared and created inside the
parentheses. The statements in the block immediately following the resource
declaration use the resource. After the block is finished, the resource’s close() method
is automatically invoked to close the resource. Using try-with-resources can not only avoid
errors but also make the code simpler.

## Readings

## Problems
