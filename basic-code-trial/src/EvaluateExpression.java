import java.util.Scanner;
import java.util.Stack;

public class EvaluateExpression {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String exp = input.nextLine();

        try {
            System.out.println(eval(exp));
        }catch (Exception e){
            System.out.println("Something is wrong "+e);
        }
    }

    public static int eval(String expression){
        Stack<Character> operatorStack = new Stack<>();
        Stack<Integer> operancStack = new Stack<>();

        expression = insertSpace(expression);
        String[] tokens = expression.split(" ");

        for(String token: tokens){
            if(token.length() == 0){
                continue;
            }
            else if(token.charAt(0)=='+' || token.charAt(0)=='-'){
                while (!operatorStack.isEmpty() &&
                        (operatorStack.peek() == '+' ||
                                operatorStack.peek() == '-' ||
                                operatorStack.peek() == '*' ||
                                operatorStack.peek() == '/'))
                {
                    processAnOperator(operancStack,operatorStack);
                }

                operatorStack.push(token.charAt(0));
            }
            else if(token.charAt(0)=='*' || token.charAt(0)=='/'){
                while (!operatorStack.isEmpty() &&
                        (operatorStack.peek() == '*' ||
                                operatorStack.peek() == '/'))
                {
                    processAnOperator(operancStack,operatorStack);
                }

                operatorStack.push(token.charAt(0));
            }

            else if(token.trim().charAt(0)=='('){
                operatorStack.push(token.charAt(0));
            }
            else if(token.trim().charAt(0)==')'){
                while (operatorStack.peek() != '('){
                    processAnOperator(operancStack,operatorStack);
                }
                operatorStack.pop();
            }
            else {
                operancStack.push((new Integer(token)));
            }
        }

        while (!operatorStack.isEmpty()){
            processAnOperator(operancStack, operatorStack);
        }



        return operancStack.pop();
    }


    public static void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack){
        char op = operatorStack.pop();
        int op1 = operandStack.pop();
        int op2 = operandStack.pop();

        switch (op){
            case '+':
                operandStack.push(op1+op2);
                break;
            case '-':
                operandStack.push(op1-op2);
                break;
            case '*':
                operandStack.push(op1*op2);
                break;
            case '/':
                operandStack.push(op1/op2);
                break;
            case '^':
                operandStack.push(404);
                break;
        }
    }



    private static String insertSpace(String s){
        StringBuilder result = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)==')' ||
                    s.charAt(i)=='+' || s.charAt(i)=='-' ||
                    s.charAt(i)=='*' || s.charAt(i)=='/'){
                result.append(" ");
                result.append(s.charAt(i));
                result.append(" ");
            }
            else {
                result.append( s.charAt(i));
            }
        }

        return result.toString();
    }
}
