package Animal_World;

public class Bats extends Trechnotheria {
    private double wingspan;
    public Bats(String name, String kind, String coatColor, double tailLength, double bodyLength, double weight, String typeOfFood, String habitat, String sound, double wingspan) {
        super(name, kind, coatColor, "волосы", true, tailLength, bodyLength, weight, typeOfFood, habitat, sound);
        this.wingspan = wingspan;
    }
    public double getWingspan() {
        return wingspan;
    }
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Относится к отряду рукокрылых");
        System.out.println("Размах крыльев: " + wingspan + " см");
    }
}
