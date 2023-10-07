/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pos.to_do_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TO_DO_LIST {
 private static ArrayList<Task> taskList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
     
      displayMenu();
    }

private static void displayMenu() {
        while (true) {
            System.out.println("\nTo-Do List Application Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Complete");
            System.out.println("3. View Tasks");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    markTaskComplete();
                    break;
                case 3:
                    viewTasks();
                    break;
                case 4:
                    removeTask();
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
private static void addTask() {
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        System.out.print("Enter due date: ");
        String dueDate = scanner.nextLine();

        Task task = new Task(title, description, dueDate);
        taskList.add(task);
        System.out.println("Task added successfully!");
    }

    private static void markTaskComplete() {
        viewTasks();
        System.out.print("Enter the index of the task to mark as complete: ");
        int index = scanner.nextInt();

       
             if (index >= 0 && index < taskList.size()) {
            Task task = taskList.get(index);
            task.markComplete();
            System.out.println("Task marked as complete!");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

   private static void viewTasks() {
    if (taskList.isEmpty()) {
        System.out.println("No tasks to display.");
    } else {
        System.out.println("\nTask List:");
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println("Task #" + i + "\n" + taskList.get(i) + "\n");
        }
    }
    // Add a break statement to exit the viewTasks() method
    // and return to the main menu.
    System.out.println("Press Enter to continue...");
    scanner.nextLine(); // Consume the newline character
    scanner.nextLine(); // Wait for Enter key press
}


    private static void removeTask() {
        viewTasks();
        System.out.print("Enter the index of the task to remove: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < taskList.size()) {
            Task removedTask = taskList.remove(index);
            System.out.println("Task removed:\n" + removedTask);
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }
}