package Animal_World;

public class Cetaceans extends Trechnotheria {
    private double finalLength;
    private String skinColor;
    public Cetaceans(String name, String kind, double tailLength, double bodyLength, double weight, String typeOfFood, String sound, String skinColor) {
        super(name, kind, "отсутствует", "отсутствует", true, tailLength, bodyLength, weight, typeOfFood, "Все моря и океаны", sound);
        finalLength = tailLength + bodyLength;
        this.skinColor = skinColor;
    }
    public double getFinalLength() {
        return finalLength;
    }
    public void setFinalLength(double finalLength) {
        this.finalLength = finalLength;
    }
    public String getSkinColor() {
        return skinColor;
    }
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Относится к отряду китообразных, поэтому длину туловища и хвоста можно считать за одну величину");
        System.out.println("Общая длина всего тела = " + finalLength + " м\nЦвет кожи: " + skinColor);
    }
}
