/**
 * Created by Vasily Danilin on 22.09.2017.
 */
public class Student extends Person {
    public Student(String name, int age, Notebook notebook) {
        super(name, age, notebook);
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
