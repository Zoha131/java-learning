public class Interface implements Edible {
    @Override
    public String howtoEat() {
        return name;
    }
}

interface Edible {
    public static final String name="hello";
    public abstract String howtoEat();

}
