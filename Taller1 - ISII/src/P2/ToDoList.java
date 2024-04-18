package P2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ToDoList {
    private List<Task> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String name) {
        tasks.add(new Task(name));
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
        } else {
            System.out.println("Invalid task index");
        }
    }

    public List<Task> filterTasks(Predicate<Task> predicate) {
        return tasks.stream().filter(predicate).collect(Collectors.toList());
    }

    public void displayTasks() {
        tasks.forEach(System.out::println);
    }
}
