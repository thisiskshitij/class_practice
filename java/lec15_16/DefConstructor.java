public class DefConstructor {
    class Main {
        int id;
        String name;

        void display() {
            System.out.println(id + " " + name);
        }

        public static void main(String args[]) {
            Main s1 = new Main(01,"Kshitij");
            s1.display();
        }
    }
}
