import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Object o = new Object();
        Circle c1 = new Circle();
        try {
            method();
            System.out.println("After the method call");
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in main");
        }
        catch (Exception ex) {
            System.out.println("Exception in main");
        }
    }
    static void method() throws Exception {
        try {
            String s = "abc";
            System.out.println(s.charAt(3));
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in method() "+ ex.getStackTrace());
            throw ex;
        }
        catch (Exception ex) {
            System.out.println("Exception in method()");
        }
        finally {
            System.out.println("finally got executed");
        }
        System.out.println("code out of try catch finally block");
    }
}

class Circle {
    private int radius;
    Circle(int radius){
        this.radius=radius;
    }

    Circle(){
        this(1);
    }

    void setRadius(int radius) throws IllegalArgumentException{
        if(radius>=0){
            this.radius = radius;
        }else {
            throw new IllegalArgumentException("We dont accept negative value");
        }
    }

    void getRadius(){
        System.out.println("Radius: "+this.radius);
    }
}
