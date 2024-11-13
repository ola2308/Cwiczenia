package cwiczenie3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
    public static void File(){
       try {
        File x = new File("C:\\Users\\olani\\Desktop\\test.txt");
        Scanner sc = new Scanner(x);
        while(sc.hasNext()){
            System.out.println(sc.next()+"\r\n");
        }
        sc.close();
       } catch (FileNotFoundException e) {
        System.out.println("Error");
       }
    }
}
