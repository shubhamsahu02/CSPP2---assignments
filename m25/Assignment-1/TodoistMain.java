import java.util.Scanner;
import java.util.Arrays;

/**.
  * write your code below this comment
  */
class Task {
/**.
  * Task class
  */
    private String title;
    private String assignedTo;
    private int timeToComplete;
    private boolean important;
    private boolean urgent;
    private String status;
    Task() {

    }
    Task( final String tit, final String assign, final int time, final boolean imp,
     final boolean urg, final String sta) throws Exception {
        this.assignedTo = assign;
        this.important = imp;
        this.urgent = urg;
        if (tit != null && !tit.isEmpty()) {
            this.title = tit;
        } else {
            throw new Exception("Title not provided ");
        }
        if (time > 0) {
            this.timeToComplete = time;
        } else {
            throw new Exception("Invalid timeToComplete " + time);
        }
        if (sta.equals("done") || sta.equals("todo")) {
                    this.status = sta;
        } else {
            throw new Exception("Invalid status " + sta);
            }
}
    public String getTitle() {
        return title;
    }
    public String getAssigned() {
        return assignedTo;
    }
    public int getTime() {
        return timeToComplete;
    }
    public boolean getImportance() {
        return important;
    }
    public boolean getUrgency() {
        return urgent;
    }
    public String getStatus() {
        return status;
    }
}
class Todoist {
    private Task[] tit;
    final int ten = 10;
    int size;

    Todoist() {
        size = 0;
        tit = new Task[ten];
    }

    private void resize() {
        tit = Arrays.copyOf(tit, 2 * size);
    }
     public void addTask(Task things) {
        if (size == tit.length) {
            resize();
            tit[size++] = things;
        }

     }

     public void toString1() {
        for (int i = 0; i < size; i++) {
            System.out.println(tit[i].getTitle() + ", " + tit[i].getAssigned()
             + ", " + tit[i].getTime() + ", " + tit[i].getImportance() + ", " + tit[i].getUrgency());
        }
     }
}

/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
                case "task":
                    testTask(tokens);
                break;
                case "add-task":
                    testAddTask(todo, tokens);
                break;
                case "print-todoist":
                    System.out.println(todo);
                break;
                default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(
            title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
