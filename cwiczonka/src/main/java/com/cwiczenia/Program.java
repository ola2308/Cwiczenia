package com.cwiczenia;
import cwiczenie1.Animal;
import cwiczenie1.Cat;
import cwiczenie1.Dog;
import cwiczenie1.PrzeciazanieMetod;
import cwiczenie2.Machine;
import cwiczenie2.Robot;




class Program{
    public static void main(String[] args){
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal("Cat");
        Animal a4 = new Dog(); //Upcasting, przypisanie obiektowi typu Animal nadpisanych metod z klasy dog
        Animal d2 = new Dog();
        ((Dog)d2).onlyDog(); //rzutowanie w dół, ale potrzebne tylko gdy funkcja, nie istnieje w nadklasie
        a1.setBreed("Border Collie");
        System.out.println("a1: " + a1.getBreed() + " a2: "+ a2.getMammal()+ " a3: " + a3.getMammal());
        Dog d = new Dog();
        d.eat();
        System.out.println("dog: "+ d.getLegs());
        a4.makeSound();
 //       a4.onlyDog(); nie da się tego zrobić bez rzutowania w dół
        a1.makeSound();

        //przeciazenie Metody
        double result1 = PrzeciazanieMetod.max1(3.14, 7.12);
        int result2 = PrzeciazanieMetod.max1(3, 8);
        System.out.println(result2);
        System.out.println(result1);

        Cat c = new Cat();
        c.makeSound();
        c.eat(); //wprowadzenie interfejsów

        //Rzutowanie typów
        double a = 4.56;
        int b= (int) a;
        System.out.println(b);

        int c1=2;
        double d1 = (double)c1;
        System.out.println(d1);

        //Anonimowe klasy - można zmieniać je na bieżąco
        Machine m = new Machine(){
            @Override public void start(){
                System.out.println("Wooo");
            }
        };
        m.start();

        Machine m2 = new Machine(); //Modyfikacja dotyczy tylko obiektu, w którym jest
        m2.start();

        Robot r = new Robot(1);

        Dog d3=new Dog("Bobby");
        Dog d4 = new Dog("Bobby");
        System.out.println(d3==d4);//porównuje referencje obiektów, wskazuje na różne obiekty w pamięci
        System.out.println(d3.name==d4.name); // te same obiekty, z tą samą wartością, wskazują na ten sam obiekt w pamięci 
        System.out.println(d3.equals(d4)); //metoda equals z Dog.java, do testowania równości semantycznej

    }
}