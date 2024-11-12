package cwiczenie3;
import java.util.HashMap;
import java.util.Scanner;

//Osoby muszą miec wiecej lat niz wpiszemy w terminalu
public class HashMap1 {
    public static void HashMap1(){
        Scanner scanner = new Scanner(System.in);
        //klucz-wartość
        HashMap<String, Integer>ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("John", 28);
        ages.put("Sophie", 19);
        ages.put("Robert", 32);
        ages.put("Tom", 23);

        //Tablica długości tablicy ages
        String[] nameArr = new String[ages.size()];
        //wypełnanie tablicy kluczami z mapy ages, zwracając zbiór kluczy
        //konwertuje zbiór do tablicy

        nameArr = ages.keySet().toArray(nameArr);
        System.out.println("Min age: ");

        int ageLimit = scanner.nextInt();

        //emp - kolejne elementy tablicy : wykonuje sie do momentu końca tablicy nameArr
        for(String emp : nameArr){
            int age = ages.get(emp);
            if(age<ageLimit){
                ages.remove(emp,age);
            }
        }

        System.out.println(ages);


    }
}
