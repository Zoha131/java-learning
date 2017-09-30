## Notes

* The motivation for using Java generics is to detect errors at compile time
```Java
package java.lang;
public interface Comparable<T> {
    public int compareTo(T o)
}
```

* A generic type can be defined for a class or interface. A concrete type must be specified when using the class to create an object or using the class or interface to declare a reference variable.

* To create a stack of strings, you use ```new GenericStack<String>()``` or ```new GenericStack<>()```. This could mislead you into thinking that the constructor of
GenericStack should be defined as
```java
public GenericStack<E>()
```
This is wrong. It should be defined as
```java
public GenericStack()
```

* Occasionally, a generic class may have more than one parameter. In this case, place the parameters together inside the brackets, separated by commas—for example,```<E1, E2, E3>```.

* You can define same class or an interface as a subtype of a generic class or interface. For example, the ```java.lang.String``` class is defined to implement the ```Comparable``` interface in the Java API as follows:
```java
public class String implements Comparable<String>
```

* A generic type can be defined for a static method. To declare a generic method, you place the generic type ```<E>``` immediately after the keyword ```static``` in the method header. For example,
```java
public static <E> void print(E[] list)
```
To invoke a generic method, prefix the method name with the actual type in angle brackets. For example,
```java
GenericMethodDemo.<Integer>print(integers);
GenericMethodDemo.<String>print(strings);
```
or simply invoke it as follows:
```java
print(integers);
print(strings);
```

* A generic type can be specified as a subtype of another type. Such a generic type is called bounded. The bounded generic type ```<E extends String>``` specifies that E is a generic subtype of String.
You can do this too ```<E extends Class & interface & interface>```

  An unbounded generic type <E> is the same as ```<E extends Object>```

* To define a generic type for a class, place it after the class name, such as ```GenericStack<E>```. To define a generic type for a method, place the generic type before the method return type, such as ```<E> void max(E o1, E o2)```.

* In method signature, You can use unbounded wildcards, bounded wildcards, or lower-bound wildcards to
specify a range for a generic type.
  1. unbounded wildcard:
  ```java
  public double max(ArrayList<?> stack){...}
  ```
  2. upper bounded wildcard:
  ```java
  public double max(ArrayList<? extends Number> stack){...}
  ```
  3. lower bounded wildcard:
  ```java
  public double max(ArrayList<? super Number> stack){...}
  ```

* The information on generics is used by the compiler but is not available at runtime. This is called type erasure.

* Because generic types are erased at runtime, there are certain restrictions on how generic types can be used. Here are some of the restrictions:

  * Restriction 1: Cannot Use ```new E()```
  * Restriction 2: Cannot Use ```new E[]```
  * Restriction 3: A Generic Type Parameter of a Class Is Not Allowed in a Static Context
  * Restriction 4: Exception Classes Cannot Be Generic

# Readings
  1. [Wild Card in Generics](https://www.youtube.com/watch?v=1Omf1Vba44Y)

# Problems
