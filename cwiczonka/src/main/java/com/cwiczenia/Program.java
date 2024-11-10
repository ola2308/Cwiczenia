package com.cwiczenia;
import cwiczenie1.Animal;
import cwiczenie1.Dog;


class Program{
    public static void main(String[] args){
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal("Cat");
        a1.setBreed("Border Collie");
        System.out.println("a1: " + a1.getBreed() + " a2: "+ a2.getMammal()+ " a3: " + a3.getMammal());
        a1.bark();
        Dog d = new Dog();
        d.eat();
        System.out.println("dog: "+ d.getLegs());
    }
}