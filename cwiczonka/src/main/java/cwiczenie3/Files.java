package cwiczenie3;
import java.io.File;

public class Files {
    public static void File(){
        File x = new File("C:\\Users\\olani\\Desktop\\f.txt");
        if(x.exists()){
            System.out.println(x.getName() + " existst!");
        }
        else{
            System.out.println("File doesn't exists");
        }
    }
}
