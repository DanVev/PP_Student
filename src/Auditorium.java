import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vasily Danilin on 22.09.2017.
 */
public class Auditorium {
    private Lecturer lecturer;
    private List<Person> listeners;

    public Auditorium() {
        listeners = new ArrayList<>();
    }

    public Auditorium(Lecturer lecturer, List<Person> listeners) {
        this.lecturer = lecturer;
        this.listeners = listeners;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<Person> getListeners() {
        return listeners;
    }

    public void addListener(Person listener) {
        listeners.add(listener);
    }

    public void startLecture(String[] texts) {
        System.out.println("Start a lecture");
        for (String text : texts) {
            lecturer.say(text);
            for (Person listener : listeners) {
                listener.listenAndWrite(text);
            }
        }
        System.out.println("Finish a lecture");
    }
}
