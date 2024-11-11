package cwiczenie1;

public class Dog extends Animal{
    public Dog(){
        legs=4;
    }

    //polimorfizm
    public void makeSound(){
        System.out.println("Woof");
    }
    public void onlyDog(){
        System.out.println("Only here");
    }
}
