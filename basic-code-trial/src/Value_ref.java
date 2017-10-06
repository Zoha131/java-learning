public class Value_ref {

    public String aa = "hello";

    public String cc = aa;


    public void change(){
        this.cc = "changed";
    }


    public static void main(String[] args) {

        Value_ref bb = new Value_ref();

        System.out.println(bb.aa);
        bb.change();
        System.out.println(bb.aa);

    }
}
