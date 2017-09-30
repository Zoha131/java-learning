import java.util.ArrayList;

public class MyGenerics {
    public static void main(String[] args) {
        Gen_1<Number, String> tri_1 = new Gen_1<>();
        Gen_2 tri_2 = new Gen_2();
        Gen_3 tri_3 = new Gen_3();

        tri_1.greet(12);
        tri_1.say("Zoha");
        MyGenerics.<String>myMethod("hallo");

        tri_2.call("hello");
        ArrayList<Integer> int_list = new ArrayList<>();
        int_list.add(23);
        int_list.add(99);

        ArrayList<Double> dbl_lis = new ArrayList<>();
        dbl_lis.add(34.33);
        dbl_lis.add(18.99);

        ArrayList<String> str_list = new ArrayList<>();
        str_list.add("hi");
        str_list.add("hello");

        ArrayList<Number> nmbr_list = new ArrayList<>();
        nmbr_list.add(12);
        nmbr_list.add(54.00);

        ArrayList<Object> obj_list = new ArrayList<>();
        obj_list.add("Str");
        obj_list.add(123);

        wildCard(obj_list);
    }

    public static <E> void myMethod(E e){
        System.out.println(e);
    }

    public static void wildCard(ArrayList<? super Integer> num){
        System.out.println(num);
    }
}


 class Gen_1<T extends Number ,T1> {
    public void greet(T mesg){
        System.out.println(mesg);
    }

    public void say(T1 msg){
        System.out.println(msg);
    }

 }

 class Gen_2 {
    public <E> void call(E e){
        System.out.println(e);
    }
 }

 class Gen_3 extends Gen_2 {
    public void call2(){
        System.out.println("hello from gen 3");
    }
 }
