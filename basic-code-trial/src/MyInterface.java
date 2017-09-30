import java.util.ArrayList;

public class MyInterface implements Z_interface {
    public static void main(String[] args) {

        MyInterface my = new MyInterface();
        my.greet();
        test.add("funn");


    }

    static ArrayList<String> test = new ArrayList<>();



    @Override
    public void greet() {
        System.out.println(name);
    }

    @Override
    public void hell() {

    }
}

interface Z_interface {
    String name = "zoha";

    abstract void greet();

    abstract void hell();

}
