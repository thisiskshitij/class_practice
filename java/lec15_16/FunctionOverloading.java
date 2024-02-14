public class FunctionOverloading{
    static void function(String str,int...a){
        System.out.println("String is: "+str);
        System.out.println("No. of args are: "+a.length);
        for(int i:a){
            System.out.print("i= "+i);
        }
    }
    public static void main(String[] args) {
        function("ABC",1,2,3,4,5);
        function("XYZ",1,3);
        function("PQR");
    }
}