package com.cwiczenia;

public class Animal {
    private String breed;

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
