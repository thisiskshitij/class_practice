class parent{
    void property(){
        System.out.println("car + land + home");
    }

    void marriage(){
        System.out.println("abc");
    }
}

class son extends parent{
    void marriage(){
        System.out.println("XYZ");
    }

   
}

public class overriding_methods {
    public static void main(String[] args) {
        son s = new son();
        s.property();
        s.marriage();
    }
}
