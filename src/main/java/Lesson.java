import java.io.Console;
import java.util.List;


public class Lesson {
    public static int lessonNumber;
    public String nazwaLekcji;
//    public List<String>

    // constructor
    public Lesson(String nazwaLekcji) {
        lessonNumber++;
    }

    public Lesson() {
        lessonNumber++;
    }

    public static void main(String []args) {
//        String nazwalekci = System.console().readLine();

        Console co = System.console();
        String asd = co.readLine( );
        System.out.println(asd);

    }
}
