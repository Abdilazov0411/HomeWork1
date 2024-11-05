public class Main {

    public static Parent createObject(String parent){
        switch (parent){
            case "First child":
                return new FirstChild("CommonField1", 42);
            case "second child":
                return new SecondChild("CommonField2", 3.14);
            case "Third child":
                return new ThirdChild("CommonField3", "UniqueValue");
            default:
                System.out.println("Unknown class name");
                return null;
        }
    }

    public static void main(String[] args) {

        Parent child1 = createObject("First child");
        Parent child2 = createObject("Second child");
        Parent child3 = createObject("Third child");

        Printable[] objects = {(Printable) child1, (Printable) child2, (Printable) child3};

        for (Printable object : objects) {
            object.print();
        }
    }
}