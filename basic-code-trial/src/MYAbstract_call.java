import java.util.Scanner;

public class MYAbstract_call {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        MyAbstract bb = new MyAbstract_concrete();
        MyAbstract_concrete cc;

        if(bb instanceof MyAbstract_concrete){
            cc = (MyAbstract_concrete)bb;
        }else {
            cc = new MyAbstract_concrete("Blue",23.0,45);
        }

        cc.getColor_pallate("Blue");


    }
}
