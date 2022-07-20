package Animal_World;

public abstract class Mammals {
    private String name;
    private String kind;
    private String coatColor;
    private final String typeOfFeeding = "Вскармливает детёнышей молоком";
    private String decelerationMethod;
    private String typeOfCoat;
    private boolean isCaudate;
    private double tailLength;
    private double bodyLength;
    private double weight;
    private String typeOfFood;
    private String habitat;
    private String sound;
    public Mammals(String name, String kind, String coatColor, String decelerationMethod, String typeOfCoat, boolean isCaudate, double tailLength, double bodyLength, double weight, String typeOfFood, String habitat, String sound) {
        this.name = name;
        this.kind = kind;
        this.coatColor = coatColor;
        this.decelerationMethod = decelerationMethod;
        this.typeOfCoat = typeOfCoat;
        this.isCaudate = isCaudate;
        if (isCaudate)
            this.tailLength = tailLength;
        else
            this.tailLength = 0;
        this.bodyLength = bodyLength;
        this.weight = weight;
        this.typeOfFood = typeOfFood;
        this.habitat = habitat;
        this.sound = sound;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public void setCoatColor(String coatColor) { this.coatColor = coatColor; }
    public void setDecelerationMethod(String decelerationMethod) { this.decelerationMethod = decelerationMethod; }
    public void setTypeOfCoat(String typeOfCoat) {
        this.typeOfCoat = typeOfCoat;
    }
    public void setIsCaudate(boolean caudate) {
        isCaudate = caudate;
    }
    public double getTailLength() {
        return tailLength;
    }
    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }
    public double getBodyLength() {
        return bodyLength;
    }
    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getCoatColor() { return coatColor; }
    public String getTypeOfFeeding() { return typeOfFeeding; }
    public String getDecelerationMethod() { return decelerationMethod; }
    public String getTypeOfCoat() {
        return typeOfCoat;
    }
    public String getTypeOfFood() {
        return typeOfFood;
    }
    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public boolean getIsCaudate() {
        return isCaudate;
    }

    public void print() {
        System.out.println("Имя: " + name + "\nТип: " + kind + "\nЦвет шерсти: " +
                coatColor + "\n" + typeOfFeeding +
                "\nСпособ размножения: " + decelerationMethod +
                "\nТип шерсти: " + typeOfCoat);
        if (isCaudate)
            System.out.println("Длина хвоста = " + tailLength + " см");
        else
            System.out.println("Хвоста нет");
        System.out.println("Длина тела = " + bodyLength +
                " см\nВес = " + weight + " кг\n" + typeOfFood +
                "\nСреда обитания: " + habitat);
        makeASound();
    }
    public void makeASound() {
        System.out.println(name + " издаёт звук: " + sound);
    }
}
