package Animal_World;

public class Platypus extends Prototheria {
    private String typeOfTale = "похож на хвост бобра";
    public Platypus(String name, double tailLength, double bodyLength, double weight, String sound) {
        super(name, "Утконос", "коричневый", "волосы", tailLength, bodyLength, weight, "Поедает он ракообразных, червей, личинок насекомых; реже головастиков, моллюсков и водную растительность", "Австралия", sound, "похож на нос утки");
    }
    public String getTypeOfTale() {
        return typeOfTale;
    }
    public void setTypeOfTale(String typeOfTale) {
        this.typeOfTale = typeOfTale;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Хвост " + typeOfTale +
                "\nИмеет лапы, как у утки, на концах которых расположены ядовитые когти");
    }
}
