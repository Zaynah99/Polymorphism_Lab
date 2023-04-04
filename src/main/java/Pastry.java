public class Pastry implements IFill {
    private String name;

    public Pastry(String name) {
        this.name = name;
    }

    public String fill(String filling) {
        return this.name;
    }
}

