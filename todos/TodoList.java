
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
        todos.add(new Todo("Lab 1","http://bkleinen.github.io/classes/ss2021/info1/labs/", true));
        todos.add(new Todo("Lab 2","http://bkleinen.github.io/classes/ss2021/info1/labs/", true));
        todos.add(new Todo("Lab 3","http://bkleinen.github.io/classes/ss2021/info1/labs/", true));
        todos.add(new Todo("Lab 4","http://bkleinen.github.io/classes/ss2021/info1/labs/", false));
        todos.add(new Todo("Lab 5","http://bkleinen.github.io/classes/ss2021/info1/labs/", false));
        todos.add(new Todo("Lab 6","http://bkleinen.github.io/classes/ss2021/info1/labs/", false));

        // ... add some more
    }

    /**
     * returns a comma seperated
     * String with all done todos.
     */
    public String report(){
        return todos.stream()
        .filter(todo -> todo.isDone())
        .map(todo -> todo.getTitle() + ", ")
        .reduce("",String::concat);
        
    }

    /**
     * returns a comma seperated
     * String with all open todos.
     */
    public String today(){
        String result = "";
        for (Todo todo: todos){
            if (!todo.isDone()){
                result += todo.getTitle() + ", ";
            }
        }
        return result;
    }
}
