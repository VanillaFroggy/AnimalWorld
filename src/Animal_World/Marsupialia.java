package Animal_World;

public class Marsupialia extends  Trechnotheria {
    public Marsupialia(String name, String kind, String coatColor, String typeOfCoat, boolean isCaudate, double tailLength, double bodyLength, double weight, String typeOfFood, String habitat, String sound) {
        super(name, kind, coatColor, typeOfCoat, isCaudate, tailLength, bodyLength, weight, typeOfFood, habitat, sound);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Относится к инфраклассу сумчатых\n" +
                "Это значит, что у данного вида детёныши появляются на свет недоразвитыми, и дальнейшее развитие новорождённого происходит в сумке у матери");
    }
}
