public final class Dog extends Pet{

    public Dog(String name, int age, Address address, Breed breed) {
        super(name, age, address, breed);
    }

    @Override
    public void voice() {
        System.out.println("Woof woof woof");
    }
}
