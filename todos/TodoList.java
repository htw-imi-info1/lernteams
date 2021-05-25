
import java.util.List;
import java.util.ArrayList;
/**
 * represents a TodoList.
 * If you want to test the report and today
 * methods,
 * add a constructor and a method that initializes
 * the TodoList with test data, and/or an add
 * method.
 */
public class TodoList
{
    private List<Todo> todos;

    public TodoList(){
        todos = new ArrayList<>();
        todos.add(new Todo("Info1 Workbook","do it", false));
        // ... add some more
    }

    /**
     * returns a comma seperated
     * String with all done todos.
     */
    public String report(){
        return null;
    }

    /**
     * returns a comma seperated
     * String with all open todos.
     */
    public String today(){
        return null;
    }
}
