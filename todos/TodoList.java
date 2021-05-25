
import java.util.List;
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
    /**
     * returns a comma seperated
     * String with all done todos.
     */
    public String report(){
        String result = "";
        for(Todo todo : todos){
            if(todo.isDone()){
                result = result + todo.getTitle() + ", ";
            }
        }
        return result; 
    }

    /**
     * returns a comma seperated
     * String with all open todos.
     */
    public String today(){
        todos.stream()
        .filter(todo -> !todo.isDone())
        .reduce("", ())
        return null;
    }
}
