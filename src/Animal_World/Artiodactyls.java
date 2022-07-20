package Animal_World;

public class Artiodactyls extends Trechnotheria {
    int amountOfHornes;
    double horneLength;
    public Artiodactyls(String name, String kind, String coatColor, String typeOfCoat, double tailLength, double bodyLength, double weight, String habitat, String sound, int amountOfHornes, double horneLength) {
        super(name, kind, coatColor, typeOfCoat, true, tailLength, bodyLength, weight, "Питается растениями", habitat, sound);
        if (amountOfHornes != 0) {
            this.amountOfHornes = amountOfHornes;
            this.horneLength = horneLength;
        }
        else {
            this.amountOfHornes = 0;
            this.horneLength = 0;
        }
    }
    public int getAmountOfHornes() {
        return amountOfHornes;
    }
    public void setAmountOfHornes(int amountOfHornes) {
        this.amountOfHornes = amountOfHornes;
    }
    public double getHorneLength() {
        return horneLength;
    }
    public void setHorneLength(double horneLength) {
        this.horneLength = horneLength;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Относится к отряду парнокопытных");
        if (amountOfHornes == 0)
            System.out.println("Рога отсутствуют");
        else {
            System.out.println("Количество рогов = " + amountOfHornes);
            if (amountOfHornes == 1)
                System.out.println("Длина рога = " + horneLength + " см");
            else
                System.out.println("Длина рогов = " + horneLength + " см");
        }
    }
}
