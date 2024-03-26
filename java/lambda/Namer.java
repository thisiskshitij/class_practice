//Inner class - Outer class

// public class Namer {
//     private String name;

//     public Namer(String name) {
//         this.name = name;
//     }

//     class Prefixer {
//         private String prefix;

//         public Prefixer(String prefix) {
//             this.prefix = prefix;
//         }

//         public String getCompleteName() {
//             return prefix + " " + name;
//         }
//     }

//     public static void main(String[] args) {
//         Namer name = new Namer("Doodle");
//         Namer.Prefixer Prefixer = name.new Prefixer("Mr.");
//         System.out.println(Prefixer.getCompleteName());
//     }
// }

public class A{
    public class B{
        public B(){
            System.out.println("In inner class B's constructor");
        }
    }
    public static class C{
        C(){
            System.out.println("In static nested");
        }
    }
}


