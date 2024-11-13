package cwiczenie1;

public class Dog extends Animal{
    public String name;
    public Dog(String n){
        legs=4;
       
        name=n;
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result+((name==null)?0:name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        Dog other = (Dog) obj;
        if(name==null){
            if(other.name!=null){
                return false;
            }else if(!name.equals(other.name)){
                return false;
            }
        }return true;

    }

    public Dog(){
        legs=4;
    }

    //polimorfizm
    public void makeSound(){
        System.out.println("Woof");
    }
    public void onlyDog(){
        System.out.println("Only here");
    }
}
