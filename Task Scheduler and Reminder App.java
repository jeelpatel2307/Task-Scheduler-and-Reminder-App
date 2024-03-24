import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String title;
    private String description;
    private String date;

    public Task(String title, String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nDate: " + date + "\n";
    }
}

class TaskScheduler {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}

public class TaskSchedulerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskScheduler taskScheduler = new TaskScheduler();

        while (true) {
            System.out.println("\nTask Scheduler Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("\nAdd Task:");
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter date (e.g., January 1, 2024): ");
                    String date = scanner.nextLine();

                    Task task = new Task(title, description, date);
                    taskScheduler.addTask(task);
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    System.out.println("\nView Tasks:");
                    taskScheduler.viewTasks();
                    break;
                case 3:
                    System.out.println("Exiting application...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
