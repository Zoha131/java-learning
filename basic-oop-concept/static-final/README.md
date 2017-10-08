## Notes

#### Static Keyword

* Methods declared as static have several restrictions:
    1. They can only directly call other static methods.
    2. They can only directly access static data.
    3. They cannot refer to this or super in any way.

* If you need to do computation in order to initialize your static variables, you can declare a static block that gets executed exactly once, when the class is first loaded. The following example shows a class that has a static method, some static variables, and a static initialization block:
  ```java
  // Demonstrate static variables, methods, and blocks.
  class UseStatic {
    static int a = 3;
    static int b;
    static void meth(int x) {
      System.out.println("x = " + x);
      System.out.println("a = " + a);
      System.out.println("b = " + b);
    }
    static {
      System.out.println("Static block initialized.");
      b = a * 4;
    }
    public static void main(String args[]) {
      meth(42);
    }
  }
  ```

## Readings


## Problems
