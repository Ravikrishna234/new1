import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */

/**
 * Class for todoist main.
 */
class Task {
    String title;
    String personname;
    int time;
    boolean task_complete;
    boolean task_urgent;
    String task_pending;
    Task(String title, String pname, int time,boolean task_complete,boolean task_urgent,String pending) {
        this.title = title;
        this.personname = pname;
        this.time = time;
        this.task_complete = task_complete;
        this.task_urgent = task_urgent;
        this.task_pending = pending;
     }
     public String gettitle(){
        return this.title;
     }
     public String getpersonname() {
        return this.personname;
     }
     public int gettime() {
        return this.time;
     }
     public boolean gettaskcomplete() {
        return this.task_complete;
     }
     public boolean gettaskurgent() {
        return this.task_urgent;
     }


     public String getcomplete(boolean value) {
        if(value) {
            return "Important";
        }
        else {
            return "Not Important";
        }
    }
        public String getUrgent(boolean value) {
        if(value) {
            return "Urgent";
        }
        else {
            return "Not Urgent";
        }
    }
        public String toString() {
            String s;
        s = this.title  + ", " + this.personname + ", " + this.time + ", " + getcomplete(this.task_complete)
        + ", " + getUrgent(this.task_urgent) + ", " + this.task_pending;
        return s;
    }
    }
public class Todoist {
    Task[] tasks;
    Todoist() {
        tasks = new Task[100];
    }

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
                //Task t = new Task(tokens[1],tokens[2],Integer.parseInt(tokens[3]),tokens[4],tokens[5]);
                    testTask(tokens);
                break;
                case "add-task":
                    //testAddTask(todo, tokens);
                break;
                case "print-todoist":
                    //System.out.println(todo);
                break;
                case "get-next":
                    //System.out.println(todo.getNextTask(tokens[1]));
                break;
                case "get-next-n":
                    // int n = Integer.parseInt(tokens[2]);
                    // Task[] tasks = todo.getNextTask(tokens[1], n);
                    // System.out.println(Arrays.deepToString(tasks));
                break;
                case "total-time":
                    //System.out.println(todo.totalTime4Completion());
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
    // public static void testAddTask(final Todoist todo, final String[] tokens) {
    //     try {
    //         todo.addTask(createTask(tokens));
    //     } catch (Exception e) {
    //         System.out.println(e.getMessage());
    //     }
    // }

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
    public static Task createTask(final String[] tokens) throws Exception
     {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        if(title.equals("")) {
            throw new Exception("Title Not provided");
        }
        else if(timeToComplete < 0) {
            throw new Exception("Invalid timeToComplete" + timeToComplete);

        }
        else if(status.equals("dud")) {
            throw new Exception("Invalid status " + status);
        }
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