public class ThirdChild extends Parent implements Printable{

    String unique3;

    public ThirdChild(String allField, String unique3) {
        super(allField);
        this.unique3 = unique3;
    }

    @Override
    public void print() {
        System.out.println("Third child: Общее поле = " + allField + "Уникальное поле = " + unique3);
    }
}
