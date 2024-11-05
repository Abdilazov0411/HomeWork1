public class Main {
    public static void main(String[] args) {

        Address addressA = new Address("Bishkek", "Aaly Tokombaev", 10);
        Pet objectA = new Pet("Buddy", 8, addressA, Breed.HASKI);

        Address addressB = new Address("Osh", "Togolok Moldo", 25);
        Dog objectB = new Dog("Ak-tosh", 3, addressB, Breed.LABRADOR);

        Address addressC = new Address("Batken", "Iskhak Razzakov", 50);
        Dog objectC = new Dog("Ala-bai", 4, addressC, Breed.GERMAN_DOG);

        System.out.println("ObjectA: " + objectA.getName() + ", Age: " + objectA.getAge() +
                ", Address: " + objectA.getAddress() + ", Breed: " + objectA.getBreed());
        objectA.eat();
        objectA.eat("meat");
        objectA.sleep();
        objectA.voice();

        System.out.println("---------------");
        System.out.println("\nObjectB: " + objectB.getName() + ", Age: " + objectB.getAge() +
                ", Address: " + objectB.getAddress() + ", Breed: " + objectB.getBreed());
        objectB.eat();
        objectB.eat("chicken");
        objectB.sleep();
        objectB.voice();

        System.out.println("---------------");
        System.out.println("\nObjectC: " + objectC.getName() + ", Age: " + objectC.getAge() +
                ", Address: " + objectC.getAddress() + ", Breed: " + objectC.getBreed());
        objectC.eat();
        objectC.eat("bones");
        objectC.sleep();
        objectC.voice();
    }
}