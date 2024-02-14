class car{
    public String str;
    public int miles;
    public car(String str,int miles){
        this.str = str;
        this.miles = miles;
    }
    public void display()
    {
        System.out.println("Name of car is: "+str+" miles is: "+miles);
    }
}

public class ArrOfObj{
    public static void main(String [] args){
        car obj[] = new car[4];
        obj[0] = new car("Maruti",20000);
        obj[1] = new car("Toyota",30000);
        obj[2] = new car("Hyundai",40000);
        obj[3] = new car("Honda",150000);
        for(car i:obj){
           i.display();
        }
    }
}