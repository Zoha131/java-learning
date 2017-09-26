import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double firt_num;
        double scnd_num;
        double res=0;
        String cmd_input,cur_input,operator;

        cur_input = input.next();


        try{
            firt_num = Double.parseDouble(cur_input);
            operator = input.next();
            cur_input = input.next();
            scnd_num = Double.parseDouble(cur_input);
            switch (operator){
                case "+":
                    res=firt_num+scnd_num;
                    break;
                case "*":
                    res=firt_num*scnd_num;
                    break;
                case "/":
                    res=firt_num/scnd_num; //it works even when scnc_num is 0 because the type is double.
                    break;
                case "-":
                    res=firt_num-scnd_num;
                    break;
                default:
                    System.out.println("You have shoosed wrong operation");

            }

            if(res != 0){
                System.out.printf("%f %s %f = %f\n",firt_num,operator,scnd_num,res);
            }
        }
        catch (NumberFormatException e){
            System.out.printf("Your have typed %s. Which is wrong.\n",cur_input);
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }

    }

}
