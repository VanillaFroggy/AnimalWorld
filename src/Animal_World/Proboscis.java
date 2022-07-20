package Animal_World;

public class Proboscis extends Trechnotheria{
    private double trunkLength;
    public Proboscis(String name, String kind, String coatColor, double tailLength, double bodyLength, double weight, String typeOfFood, String habitat, String sound, double trunkLength) {
        super(name, kind, coatColor, "волосы", true, tailLength, bodyLength, weight, typeOfFood, habitat, sound);
        this.trunkLength = trunkLength;
    }
    public double getTrunkLength() {
        return trunkLength;
    }
    public void setTrunkLength(double trunkLength) {
        this.trunkLength = trunkLength;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Относится к отряду хоботных");
        System.out.println("Длина хобота = " + trunkLength);
    }
}
