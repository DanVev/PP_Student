/**
 * Created by Vasily Danilin on 22.09.2017.
 */
public class Lecturer extends Person{
    public Lecturer(String name, int age, Notebook notebook) {
        super(name, age, notebook);
    }

    public Lecturer(String name, int age) {
        super(name, age);
    }
}
