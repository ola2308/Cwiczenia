package cwiczenie1;

//Klasa abstrakcyjna
abstract class Animal2 implements Eat {
    int legs=0;
    abstract void makeSound(); //Metoda abstrakcyjna
    public abstract void eat();
}
//stworzenie interfejsu, używany w Cat.java
interface Eat{
    void eat();
}