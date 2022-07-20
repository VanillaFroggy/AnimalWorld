package Animal_World;

public class Insectivores extends Trechnotheria {
    public Insectivores(String name, String kind, String coatColor, String typeOfCoat, double tailLength, double bodyLength, double weight, String habitat, String sound) {
        super(name, kind, coatColor, typeOfCoat, true, tailLength, bodyLength, weight, "Питается насекомыми", habitat, sound);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Относится к отряду насекомоядных");
    }
}
