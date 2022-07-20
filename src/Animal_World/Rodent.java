package Animal_World;

public class Rodent extends Trechnotheria {
public Rodent(String name, String kind, String coatColor, double tailLength, double bodyLength, double weight, String typeOfFood, String habitat, String sound) {
    super(name, kind, coatColor, "волосы", true, tailLength, bodyLength, weight, typeOfFood, habitat, sound);
}

@Override
public void print() {
    super.print();
    System.out.println("Относится к отряду грызунов, самому многочисленному среди млекопитающих");
}
}
