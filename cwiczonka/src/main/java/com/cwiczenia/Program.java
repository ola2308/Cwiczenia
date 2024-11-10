package com.cwiczenia;
import cwiczenie1.Animal;
import cwiczenie1.Dog;
import cwiczenie1.PrzeciazanieMetod;

class Program{
    public static void main(String[] args){
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal("Cat");
        a1.setBreed("Border Collie");
        System.out.println("a1: " + a1.getBreed() + " a2: "+ a2.getMammal()+ " a3: " + a3.getMammal());
        Dog d = new Dog();
        d.eat();
        System.out.println("dog: "+ d.getLegs());
        d.makeSound();
        a1.makeSound();

        //przeciazenie Metody
        double result1 = PrzeciazanieMetod.max1(3.14, 7.12);
        int result2 = PrzeciazanieMetod.max1(3, 8);
        System.out.println(result2);
        System.out.println(result1);
    }
}