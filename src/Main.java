/**
 * Created by Vasily Danilin on 22.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        Auditorium auditorium = new Auditorium();
        Lecturer lecturer = new Lecturer("Starostin N.V.", 40);
        Student student1 = new Student("Danilin V.", 21);
        Student student2 = new Student("Antonov D.", 21);
        auditorium.setLecturer(lecturer);
        auditorium.addListener(student1);
        auditorium.addListener(student2);
        auditorium.startLecture(new String[]{"Hello, students!", "Bye, students!"});
    }
}
