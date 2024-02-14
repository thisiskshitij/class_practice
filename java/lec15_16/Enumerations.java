// enum is the class type collection of constant data that are final and static implicitly.
// enum can't be inherited.
public class Enumerations {
    public enum season {
        WINTER, SUMMER, SPRING
    }

    public static void main(String a[]) {
       for(season s:season.values()){
        System.out.println(s);
       }

    }
}
