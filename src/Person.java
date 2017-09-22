/**
 * Created by Vasily Danilin on 22.09.2017.
 */
// a skeleton class for a person entity
abstract class Person {
    private String name;
    private int age;
    private Notebook notebook;

    Person(String name, int age, Notebook notebook) {
        this.name = name;
        this.age = age;
        this.notebook = notebook;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        notebook = new Notebook();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void say(String text) {
        System.out.println(name+" is saying: "+text);
    }

    public void listenAndWrite(String text) {
        System.out.println(name + " is listening this text: " + text);
    }

    public void write(String text) {
        notebook.write(text);
        System.out.println("text has written to "+name+"'s notebook");
    }

}
