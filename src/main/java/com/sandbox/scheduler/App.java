package com.sandbox.scheduler;

import com.sandbox.scheduler.model.Category;
import com.sandbox.scheduler.model.Task;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pchurchward on 2017-07-20.
 */
public class App {

    public static void main(String[] args) {
        Task task1 = new Task(0, Category.RED);
        Task task2 = new Task(0, Category.BLUE);
        Task task3 = new Task(3, Category.GREEN);
        Task task4 = new Task(4, Category.GREEN);
        Task task5 = new Task(5, Category.RED);
        Task task6 = new Task(0, Category.RED);

        List<Task> unsorted = Arrays.asList(task1, task2, task3, task4, task5, task6);

        unsorted.forEach(t -> Scheduler.scheduleTask(t));

        Scheduler.printSchedule();
    }
}
