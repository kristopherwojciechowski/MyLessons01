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

    public int getLessonNumber() {
        return lessonNumber;
    }

}
