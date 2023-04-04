public class Pastry implements IFill {
    private String name;

    public Pastry(String name) {
        this.name = name;
    }

    public String filling() {
        return this.name + " I would like custard";

    }
}

