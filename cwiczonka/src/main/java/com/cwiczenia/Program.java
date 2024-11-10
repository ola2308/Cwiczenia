package com.cwiczenia;

class Program{
    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.setBreed("Border Collie");
        System.out.println(a1.getBreed());
        a1.bark();
    }
}