public class MyPoli {
    public static void main(String[] args) {
        Bank b = new Axis();
        b.run();
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static double add(double a, double b){
        return a+b;
    }
}

class Bank {
    public void run(){
        System.out.println("Bank");
    }
}

class Axis extends Bank {
    @Override
    public void run() {
        System.out.println("Axis");
    }

    public void intarest(){
        System.out.println("interast");
    }
}
