public class Pet extends Animal{

    private final Breed breed;
    public Pet(String name, int age, Address address, Breed breed) {
        super(name, age, address);
        this.breed = breed;
    }

    public Breed getBreed() {
        return breed;
    }

    public void eat() {
        System.out.println(getName() + " is eating");
    }

    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }

    public final void sleep() {
        System.out.println(getName() + " is sleeping");
    }


    @Override
    public void voice() {
        System.out.println("Pets sound");
    }
}
