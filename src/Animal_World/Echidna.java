package Animal_World;

public class Echidna extends Prototheria{
    private double lengthOfNeedles;
    public Echidna(String name, double tailLength, double bodyLength, double weight, String sound, double lengthOfNeedles) {
        super(name, "Ехидна", "чёрный", "иглы", tailLength, bodyLength, weight, "Питается муравьями, термитами, реже другими насекомыми, мелкими моллюсками и червями", "Австралия, Новая Гвинея и острова в проливе Басса", sound, "в виде клюва");
        this.lengthOfNeedles = lengthOfNeedles;
    }
    public double getLengthOfNeedles() {
        return lengthOfNeedles;
    }
    public void setLengthOfNeedles(double lengthOfNeedles) {
        this.lengthOfNeedles = lengthOfNeedles;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Длина игл = " + lengthOfNeedles + " см");
    }
}
