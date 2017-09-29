## Notes

* Not all objects can be handlers for an action event. To be a handler of an action event, two requirements must be met:
  1. The object must be an instance of the EventHandler< T extends Event > interface. This interface defines the common behavior for all handlers. <T extends Event> denotes that T is a generic type that is a subtype of Event.

  2. The EventHandler object handler must be registered with the event source object using the method source.setOnAction(handler)

* The component that creates an event and fires it is called the event source object, or simply source object or source component. For example, a button is the source object for a buttonclicking action event.

* If a component can fire an event, any subclass of the component can fire the same type of event. For example, every JavaFX shape, layout pane, and control can fire MouseEvent and KeyEvent since Node is the superclass for shapes, layout panes, and controls.

* An event is an object created from an event source. Firing an event means to create an event and delegate the handler to handle the event.

* A handler is an object that must be registered with an event source object, and it must be an instance of an appropriate event-handling interface.

*  For an object to be a handler for an event on a source object, two things are needed:
  1. The handler object must be an instance of the corresponding event-handler interface to ensure that the handler has the correct method for processing the event.

  2. The handler object must be registered by the source object. Registration methods depend on the event type.

* An inner class, or nested class, is a class defined within the scope of another class. Inner classes are useful for defining handler classes. An inner class has the following features:
  1. An inner class is compiled into a class named OuterClassName$InnerClassName.class

  2. An inner class can reference the data and the methods defined in the outer class in which it nests, so you need not pass the reference of an object of the outer class to the constructor of the inner class.

  3. An inner class can be defined with a visibility modifier subject to the same visibility rules applied to a member of the class.

  4. An inner class can be defined as static. A static inner class can be accessed using the outer class name. A static inner class cannot access nonstatic members of the outer class.

  5. Objects of an inner class are often created in the outer class. But you can also create an object of an inner class from another class.

    If the inner class is nonstatic, you must first create an instance of the outer class, then use the following syntax to create an object for the inner class:
    ```java
    OuterClass.InnerClass innerObject = outerObject.new InnerClass();
    ```
    If the inner class is static, use the following syntax to create an object for it:
    ```java
    OuterClass.InnerClass innerObject = new OuterClass.InnerClass();
    ```
* The syntax for an anonymous inner class is shown below
```java
new SuperClassName/InterfaceName() {
// Implement or override methods in superclass or interface
// Other methods if necessary
}
```

* Since an anonymous inner class is a special kind of inner class, it is treated like an inner class with the following features:
  1. An anonymous inner class must always extend a superclass or implement an interface, but it cannot have an explicit extends or implements clause.

  2. An anonymous inner class must implement all the abstract methods in the superclass or in the interface.

 3. An anonymous inner class always uses the no-arg constructor from its superclass to create an instance. If an anonymous inner class implements an interface, the constructor is Object().

  4. An anonymous inner class is compiled into a class named OuterClassName$n.class

* Lambda expressions can be used to greatly simplify coding for event handling. Lambda expression is a new feature in Java 8. Lambda expressions can be viewed as an anonymous class with a concise syntax.

* The basic syntax for a lambda expression is either
```java
(type1 param1, type2 param2, ...) -> expression
```
or
```java
(type1 param1, type2 param2, ...) -> { statements; }
```

* The statements in the lambda expression are all for that method. If it contains multiple methods, the compiler will not be able to compile the lambda expression. So, for the compiler to understand lambda expressions, the interface must contain exactly one abstract method. Such an interface is known as a functional interface or a Single Abstract Method (SAM) interface.

## Readings

## Problems

1. (Draw lines using the arrow keys) Write a program that draws line segments using the arrow keys. The line starts from the center of the pane and draws toward east, north, west, or south when the right-arrow key, up-arrow key, left-arrow key, or down-arrow key is pressed
