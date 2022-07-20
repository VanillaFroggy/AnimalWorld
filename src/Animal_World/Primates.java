package Animal_World;

public class Primates extends Trechnotheria{
    public Primates(String name, String kind, String coatColor, boolean isCaudate, double tailLength, double bodyLength, double weight, String habitat, String sound) {
        super(name, kind, coatColor, "волосы", isCaudate, tailLength, bodyLength, weight, "Питается в основном плодами деревьев", habitat, sound);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Относится к отряду приматов");
        clapHands();
    }
    public void clapHands() {
        System.out.println(getName() + " хлопает в ладоши:\n'Хлоп-хлоп-хлоп'");
    }
}
