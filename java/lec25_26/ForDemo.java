//Initializer block is used to initialize class instance 
//intializer block will be invoked by jvm before invokation of constructor.
//Two types-
//	1.) Instance intializer
//	2.) Static initializer
//if we define static block with instace initializer static block would be invoked first (once) and after initializer would be invoked before for every constructor calling.

public class ForDemo{
    int x;
        ForDemo(){
            System.out.println("This is default constructor "+x);
        }
        {
            System.out.println("This nother is intializer block ");
        }
        {
            x=10;
            System.out.println("This is intializer block ");
        }
        static {
            System.out.println("This be static block");
        }
       
        ForDemo(int a){
            System.out.println("This is parameterized constructor "+x);
        }

        public static void main(String[]a){
            ForDemo obj = new ForDemo();
            ForDemo obj1 = new ForDemo(11);
        }
}
