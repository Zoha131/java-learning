public class MyAbstract_concrete extends MyAbstract {

    public MyAbstract_concrete(String color, Double thickness, int id) {
        super(color, thickness, id);
    }

    public MyAbstract_concrete() {
    }

    @Override
    public void getColor_pallate(String color) {
        System.out.println("This is new implementation from concrete class "+ color+ super.color);
    }

    @Override
    public double getIdea(int id) {

        return 404;
    }
}
