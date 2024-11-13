package cwiczenie3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class It {
    
    public static void It(){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer>nums=new LinkedList<Integer>();

        while (nums.size()<5){
            System.out.println("Number to add: ");
            int num = scanner.nextInt();
            nums.add(num);
        }
        int sum=0;

        Iterator<Integer>it=nums.iterator();


        while(it.hasNext()){
            sum+=it.next();
        };

        System.out.println("Sum:" + sum);
    }
}
