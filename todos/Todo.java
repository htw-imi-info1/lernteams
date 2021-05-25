
/**
 * Todo represents one Todo Item.
 * If you want to test your code,
 * add getters for the fields and
 * a constructor that initializes
 * the fields.
 */
public class Todo
{
    String title;
    boolean done;
    String description;

    public Todo(String title, String description){
        this.title = title;
        this.description = description;
        this.done = false;
    }

    public Todo(String title, String description, boolean done)
    { 
        this(title,description);
        this.done = done;
    }
    public String getTitle(){return title;}
    public boolean isDone(){return done;}
    public String getDescription(){return description;}
}
