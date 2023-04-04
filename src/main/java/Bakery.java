import java.util.ArrayList;

public class Bakery {
    private String name;
    private ArrayList<Cake> cakes;
    private double till;

    //    NAME
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    //   AMOUNT OF CAKES
    public Bakery() {
        this.cakes = new ArrayList<Cake>();
    }

    public int countCakes() {
        return this.cakes.size();
    }

    // TILL
    public double getTill() {
        return till;
    }

    public void setTill(double newTill) {
        this.till = newTill;
    }

}
