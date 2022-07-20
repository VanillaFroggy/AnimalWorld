package Animal_World;

public abstract class Prototheria extends Mammals {
    private String typeOfNose;
    public Prototheria(String name, String kind, String coatColor, String typeOfCoat, double tailLength, double bodyLength, double weight, String typeOfFood, String habitat, String sound , String typeOfNose) {
        super(name, kind, coatColor, "Откладывание яиц", typeOfCoat, true, tailLength, bodyLength, weight, typeOfFood, habitat, sound);
        this.typeOfNose = typeOfNose;
    }
    public String getTypeOfNose() {
        return typeOfNose;
    }
    public void setTypeOfNose(String typeOfNose) {
        this.typeOfNose = typeOfNose;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Относится к подклассу первозверей" +
                "\nНос " + typeOfNose);
    }
}
