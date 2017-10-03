import java.util.Timer;

public class MultiThread {
    public static void main(String[] args) {
        PrintChar task_1 = new PrintChar('p', 150);
        PrintChar task_2 = new PrintChar('9', 150);
        PrintChar task_3 = new PrintChar('1', 150);

        Thread thread_1 = new Thread(task_1);
        Thread thread_2 = new Thread(task_2);
        Thread thread_3 = new Thread(task_3);
        

        thread_1.start();
        thread_2.start();
        thread_3.start();
    }
}

class PrintChar implements Runnable {
    private char myChar;
    private int time;

    public PrintChar(char myChar, int time) {
        this.myChar = myChar;
        this.time = time;
    }


    @Override
    public void run() {
        for (int i =0; i < time;i++){
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread());
            }
            catch (Exception e){

            }
            System.out.print(myChar+"  ");
            if(i%50==0){
                System.out.println(" ");
            }
        }
    }
}
