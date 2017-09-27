## Notes

An abstract class cannot be used to create objects. An abstract class can contain
abstract methods, which are implemented in concrete subclasses.

The following points about abstract classes are worth noting:
* An abstract method cannot be contained in a nonabstract class. If a subclass of an
abstract superclass does not implement all the abstract methods, the subclass must
be defined as abstract. In other words, in a nonabstract subclass extended from an
abstract class, all the abstract methods must be implemented. Also note that abstract
methods are nonstatic.

* An abstract class cannot be instantiated using the new operator, but you can still
define its constructors, which are invoked in the constructors of its subclasses. For
instance, the constructors of GeometricObject are invoked in the Circle class
and the Rectangle class.

* A class that contains abstract methods must be abstract. However, it is possible to
define an abstract class that doesn’t contain any abstract methods. In this case, you
cannot create instances of the class using the new operator. This class is used as a
base class for defining subclasses.

* A subclass can override a method from its superclass to define it as abstract. This is
very unusual, but it is useful when the implementation of the method in the superclass becomes invalid in the subclass. In this case, the subclass must be defined as
abstract.

* A subclass can be abstract even if its superclass is concrete. For example, the Object
class is concrete, but its subclasses, such as GeometricObject, may be abstract.

* You cannot create an instance from an abstract class using the new operator, but an
abstract class can be used as a data type. Therefore, the following statement, which
creates an array whose elements are of the GeometricObject type, is correct.
```java
GeometricObject[] objects = new GeometricObject[10];
```

## Readigs

## Problems
