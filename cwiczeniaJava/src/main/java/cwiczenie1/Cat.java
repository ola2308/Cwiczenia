package cwiczenie1;

//Klasa dziedzicząca po abstrakcyjnej
public class Cat extends Animal2 {
    public void makeSound(){
        System.out.println("Meow");
    }

    //nadpisanie metody eat z interfejsu
    @Override
    public void eat(){
        System.out.println("Cat's eating");
    }
}