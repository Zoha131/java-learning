public class OuterClass {

    public void greet()
    {
        System.out.print(" Hello from the outer class ");
    }

    public static void greet_static(){
        System.out.print(" Greet form static method from outer class ");
    }

    class InnerClass_1 {
        public void hoo(){
            greet();
            System.out.println("and also from inner class");
        }
    }

    static class InnerClass_2 {
        public void zaidul() {
            greet_static();
            System.out.print("and also from static inner class");
        }
    }
}
