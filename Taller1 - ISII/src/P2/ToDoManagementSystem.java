package P2;

import java.util.Scanner;

public class ToDoManagementSystem {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== To-Do Management System =====");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. View All Tasks");
            System.out.println("4. View Completed Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    toDoList.addTask(taskName);
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    System.out.print("Enter task (number) to mark as completed: ");
                    int index = scanner.nextInt();
                    toDoList.markTaskAsCompleted(index);
                    break;
                case 3:
                    System.out.println("\nAll Tasks:");
                    toDoList.displayTasks();
                    break;
                case 4:
                    System.out.println("\nCompleted Tasks:");
                    toDoList.filterTasks(Task::isCompleted).forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
