public class Namer {
    private String name;

    public Namer(String name) {
        this.name = name;
    }


class Prefixer {
    private String prefix;

    public Prefixer(String prefix) {
        this.prefix = prefix;
    }

    public String getCompleteName() {
        return prefix + " " + name;
    }

    
    

    
}
public static void main(String[] args) {
    Namer name = new Namer("Doodle");
    Namer.Prefixer Prefixer = name.new Prefixer("Mr.");
    System.out.println(Prefixer.getCompleteName());
}}
