public abstract class MyAbstract {
    protected String color;
    private Double thickness;
    private int id;

    protected MyAbstract(String color, Double thickness, int id) {
        this.color = color;
        this.thickness = thickness;
        this.id = id;
    }

    protected MyAbstract(){
        this("RED",1.00,8482);
    }

    public abstract void getColor_pallate(String color);

    public abstract double getIdea(int id);
}


