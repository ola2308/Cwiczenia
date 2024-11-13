package cwiczenie2;
//Zagnieżdżanie klas
public class Robot {
    int id;
    public Robot(int i){
        id=i;
        Brain b= new Brain();
        b.think();
    }

    private class Brain{
        public void think(){
            System.out.println("Robot " + id +" is thinking");
        }
    }
}
