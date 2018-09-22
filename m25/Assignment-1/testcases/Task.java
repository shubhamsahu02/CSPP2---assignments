import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for task.
 */
class Task {
	String title;
	String assignedTo;
	int timeToComplete;
	boolean important;
	boolean urgent;
	String status;


	Task(String title, String assignedTo, int timeToComplete, boolean important,
	     boolean urgent, String status) throws Exception {
		if (title == null || title.equals("")) throw new Exception("Title not provided");
		if (!status.equals("todo") && !status.equals("done")) throw new Exception("Invalid status " + status);
		if (timeToComplete < 0) throw new Exception("Invalid timeToComplete " + timeToComplete);
		this.title = title;
		this.assignedTo = assignedTo;
		this.timeToComplete = timeToComplete;
		this.important = important;
		this.urgent = urgent;
		this.status = status;
	}
	public String toString() {
		String a = "Not Important";
		String b = "Not Urgent";
		if(important) a = "Important";
		if(urgent) b = "Urgent";
		String display = title + ", " + assignedTo+ ", "+ timeToComplete+", "+ a+", "+ b+", "+ status;
		return display;
	}
}