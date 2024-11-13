package cwiczenie1;

public class Animal {
    private String breed;
    private String mammal;
    protected int legs; //widoczne tylko dla podklas


    //Konstruktory
    public Animal(){
        this.setMammal("Dog");
    }

    public Animal(String m){
        this.setMammal(m);
    }

    //Getter
    public String getMammal(){
        return mammal;
    }

    //Setter
    public void setMammal(String m){
        this.mammal = m;
    }

    //Getter
    public String getBreed(){
        return breed;
    }

    //Setter
    public void setBreed(String b){
        this.breed = b;
    }

    public void eat(){
        System.out.println("Animal eats");
    }
    public int getLegs(){
        return legs;
    }

    //polimorfizm
    public void makeSound(){
        System.out.println("Grrr...");
    }

    public enum Mammal1{
        DOG,
        CAT,
        MONKEY,
        RABBIT
    }
}
