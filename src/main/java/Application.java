public class Application {
    public static void main(String []args) {
//        String nazwalekci = System.console().readLine();

//        Console co = System.console();
//        String asd = co.readLine( );
//        System.out.println(asd);

        Subject ang = new Subject("angielski");
//        Lesson  = new Lesson();
        Lesson osoby = new Lesson();

        ang.addLesson(osoby);

    }
}
