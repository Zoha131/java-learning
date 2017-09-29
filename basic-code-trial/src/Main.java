import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        OuterClass a = new OuterClass();
        OuterClass.InnerClass_1 a_inner = a.new InnerClass_1();

        OuterClass.InnerClass_2 a_static_inner = new OuterClass.InnerClass_2();

        a.greet();
        OuterClass.greet_static();
        a_inner.hoo();
        a_static_inner.zaidul();
    }

}
