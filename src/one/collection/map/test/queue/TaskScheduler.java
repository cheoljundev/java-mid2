package one.collection.map.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    Queue<Task> schedule = new ArrayDeque<>();

    public void addTask(Task task) {
        schedule.offer(task);
    }

    public int getRemainingTasks() {
        return schedule.size();
    }

    public void processNextTask() {
        Task task = schedule.poll();
        if (task != null) {
            task.execute();
        }
    }
}
