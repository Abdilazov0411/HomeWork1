public class SecondChild extends Parent implements Printable {

    double unique2;

    public SecondChild(String allField, double unique2) {
        super(allField);
        this.unique2 = unique2;
    }

    @Override
    public void print() {
        System.out.println("Second child: Общее поле = " + allField + " Уникальное поле = " + unique2);
    }
}
