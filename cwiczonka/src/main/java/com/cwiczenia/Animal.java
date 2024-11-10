package com.cwiczenia;

public class Animal {
    private String breed;
    private String mammal;

    //Konstruktory
    Animal(){
        this.setMammal("Dog");
    }

    Animal(String m){
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
    public void bark(){
        System.out.println("Woof-Woof");
    }

}
