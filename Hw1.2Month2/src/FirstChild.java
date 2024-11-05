public class FirstChild extends Parent implements Printable {

    int uniqueField1;

    public FirstChild(String allField, int uniqueField1) {
        super(allField);
        this.uniqueField1 = uniqueField1;
    }

    @Override
    public void print() {
        System.out.println("First child: Общее поле = " + allField + ", Уникальное поле = " + uniqueField1);
    }
}
