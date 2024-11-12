package cwiczenie3;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

//Nie określamy początkowej pojemności, lepsza do manipulacji danymi niż ArrayList (np.dużo dodawań, usuwań elementów), każdy element ma link do sąsiada, 
//ArrayList działa podobnie do tablicy, lepsza do przechowywania i dostępu do danych

public class LinkedList1 {
    public static void List(){
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> words = new LinkedList<String>();

        while(words.size()<5){
            String word = scanner.nextLine();
            words.add(word);
        }
        System.out.println("Enough from you, let's give you longer words back: ");
        for(int i=0;i<words.size();i++){
            if(words.get(i).length()<4){
                words.remove(i);
            }
        }

        //Sortowanie alfabetyczne
        Collections.sort(words);
        System.out.println(words);
    }
}
