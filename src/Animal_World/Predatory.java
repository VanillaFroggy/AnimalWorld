package Animal_World;

public class Predatory extends Trechnotheria {
    private int amountOfCanines;
    private double lengthOfCanines;
    public Predatory(String name, String kind, String coatColor, String typeOfCoat, double tailLength, double bodyLength, double weight, String habitat, String sound, int amountOfCanines, double lengthOfCanines) {
        super(name, kind, coatColor, typeOfCoat, true, tailLength, bodyLength, weight, "Питается мясом", habitat, sound);
        this.amountOfCanines = amountOfCanines;
        this.lengthOfCanines = lengthOfCanines;
    }
    public int getAmountOfCanines() {
        return amountOfCanines;
    }
    public void setAmountOfCanines(int amountOfCanines) {
        this.amountOfCanines = amountOfCanines;
    }
    public double getLengthOfCanines() {
        return lengthOfCanines;
    }
    public void setLengthOfCanines(double lengthOfCanines) {
        this.lengthOfCanines = lengthOfCanines;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Относится к отряду хищных.\nСледовательно, имеет отсрые зубы и выдающиеся клыки\n" +
                "Количество клыков = " + amountOfCanines + "\nА их длина = " + lengthOfCanines);
    }
}
