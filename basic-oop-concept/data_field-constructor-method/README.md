## Notes

#### Data Field

* An object’s data and methods can be accessed through the dot (.) operator via the object’s reference variable

* It is illegal in Java to declare two local variables with the same name inside the same or enclosing scopes. Interestingly, you can have local variables, including formal parameters to methods, which overlap with the names of the class’ instance variables. However, when a local variable has the same name as an instance variable, the local variable hides the instance variable.

  ```java
  class Box {
    double width;
    double height;
    double depth;
    // This is the constructor for Box.
    Box(double width, double height, double depth) {
      this.width = width;
      this.height = height;
      this.depth = depth;
      //here this.width is the class' instance variable
      //width is the local variable
    }
    // compute and return volume
    double volume() {
      return width * height * depth;
    }
  }
  ```
* A hidden static variable can be accessed simply by using the ```ClassName.staticVariable``` reference. A hidden instance variable can be accessed by using the keyword ```this```.

* A variable of a primitive type holds a value of the primitive type, and a variable of a reference type holds a reference to where an object is stored in memory (Like pointer in C).

* The data fields can be of reference types. For example, the       following Student class containsa data field name of the String type. String is a predefined Java class.
  ```java
  class Student {
    String name; // name has the default value null
    int age; // age has the default value 0
    boolean isScienceMajor; // isScienceMajor has default value false
    char gender; // gender has default value '\u0000'
  }
  ```
  The default value of a data field is **null** for a reference type, **0** for a numeric type, **false** for a boolean type, and **\u0000** for a char type. However, Java assigns **no default value** to a local variable inside a method

  The following code has a compile error, because the local variables x and y are not initialized:
  ```java
  class Test {
    public static void main(String[] args) {
      int x; // x has no default value
      String y; // y has no default value
      System.out.println("x is " + x);
      System.out.println("y is " + y);
    }
  }
  ```

  When an array of objects is created using the new operator, each element in the array is a reference variable with a default value of **null**.

  *```NullPointerException``` is a common runtime error. It occurs when you invoke a method on a reference variable with a null value. Make sure you assign an object reference to the variable before invoking the method through the reference variable*

* Syntax errors will occur if you compare strings by using relational operators >, >=, <, or <=. Instead, you have to use s1.compareTo(s2).

* If you know that an object is no longer needed, you can explicitly assign null to a reference variable for the object. The JVM will automatically collect the space if the object is not referenced by any reference variable.




---
#### Constructor

* A class contains constructors that are invoked to create objects from the class blueprint. Constructor declarations look like method declarations—except that they use **the name of the class** and have **no return type**, not even void.

  ```java
  public class Puppy {
     public Puppy() {
     }

     public Puppy(String name) {
        // This constructor has one parameter, name.
     }
  }
  ```
* The access modifier of a Constructor must be public if you want to create objects from that class. However, the constructor can also be private if you don't want to have object of that class. Example: **Math** class.

* An anonymous class does not have a constructor.



---
### Method

* When an object reference is passed to a method, the reference itself is passed by use of call-by-value. However, since the value being passed refers to an object, the copy of that value will still refer to the same object that its corresponding argument does.

* Java uses exactly one mode of passing arguments: pass-by-value. When passing an argument of a primitive data type, the value of the argument is passed. When passing an argument of a reference type, the reference of the object is passed. Pass-by-value on references can be best described semantically as pass-by-sharing; that is, the object referenced in the method is the same as the object being passed.


* A method can return any type of data, including class types that you create. For example, in the following program, the **incrByTen( )** method returns an object in which the value of a is ten greater than it is in the invoking object.
  ```java
  // Returning an object.
  class Test {
    int a;
    Test(int i) {
      a = i;
    }
    Test incrByTen() {
      Test temp = new Test(a+10);
      return temp;
    }
  }
  ```
  The preceding program makes another important point: Since all objects are dynamically allocated using new, you don’t need to worry about an object going out-of-scope because the method in which it was created terminates. The object will continue to exist as long as there is a reference to it somewhere in your program. When there are no references to it, the object will be reclaimed the next time garbage collection takes place.

* ```varargs: ```
    * A method that takes a variable number of arguments is called a variable-arity method, or simply a varargs method.

    * A variable-length argument is specified by three periods (…). For example, here is how
    vaTest( ) is written using a vararg:
    ```java
    static void vaTest(int ... v) { }
    ```
    ```java
        // Demonstrate variable-length arguments.
    class VarArgs {
      // vaTest() now uses a vararg.
      static void vaTest(int ... v) {
        System.out.print("Number of args: " + v.length +
        " Contents: ");
        for(int x : v)
        System.out.print(x + " ");
        System.out.println();
      }
      public static void main(String args[])
      {
        // Notice how vaTest() can be called with a
        // variable number of arguments.
        vaTest(10); // 1 arg
        vaTest(1, 2, 3); // 3 args
        vaTest(); // no args
      }
    }
    ```
    * A method can have “normal” parameters along with a variable-length parameter. However, the variable-length parameter must be the last parameter declared by the method.
    ```java
    int doIt(int a, int b, double c, int ... vals) { }
    int doIt(int a, int b, double c, int ... vals, boolean stopFlag) { }// Error!
    ```    
    * There is one more restriction to be aware of: there must be only one varargs parameter. For example, this declaration is invalid:
    ```java
    int doIt(int a, int b, double c, int ... vals, double ... morevals) { // Error!
    ```

* Sometimes an object will need to perform some action when it is destroyed.  To handle such situations, Java provides a mechanism called ```finalization```. By using finalization, you can define specific actions that will occur when an object is just about to be reclaimed by the garbage collector.

  To add a finalizer to a class, you simply define the ```finalize( )``` method. The Java run time calls that method whenever it is about to recycle an object of that class.
  The finalize( ) method has this general form:
  ```java
  protected void finalize( )
  {
  // finalization code here
  }
  ```





## Readings

* [Member variable](https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html)
* [Different ways to create objects in Java](http://www.geeksforgeeks.org/different-ways-create-objects-java/)

## Problems
