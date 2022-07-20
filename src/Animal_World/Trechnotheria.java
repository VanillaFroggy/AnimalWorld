package Animal_World;

public abstract class Trechnotheria extends Mammals {
    public Trechnotheria(String name, String kind, String coatColor, String typeOfCoat, boolean isCaudate, double tailLength, double bodyLength, double weight, String typeOfFood, String habitat, String sound) {
        super(name, kind, coatColor, "Живорождение", typeOfCoat, isCaudate, tailLength, bodyLength, weight, typeOfFood, habitat, sound);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Относится к подклассу живородящих");
    }
}
