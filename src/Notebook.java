import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vasily Danilin on 22.09.2017.
 */
public class Notebook {
    private List<String> texts = new ArrayList<>();

    public Notebook() {
    }

    public Notebook(List<String> texts) {
        this.texts = texts;
    }

    public List<String> getTexts() {
        return texts;
    }

    public void print() {
        for (String text : texts) {
            System.out.println(text);
        }
    }

    public void write(String text) {
        texts.add(text);
    }

    public int getNotebookSize() {
        return texts.size();
    }
}
