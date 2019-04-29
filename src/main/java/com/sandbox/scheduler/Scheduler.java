package com.sandbox.scheduler;

import com.sandbox.scheduler.model.Task;

import java.util.*;

/**
 * Created by Lucian Giurgiuculesei
 */
public class Scheduler {
    private static List<Task> tasks = new ArrayList<>();

    public static void scheduleTask(Task task){
        tasks.add(task);
    }

    public static void printSchedule(){
        tasks
                .stream()
                .sorted(
                        Comparator
                                .comparing(Task::getUrgency)
                                .thenComparing(Task::getCategoryValue)
                                .thenComparing(Task::getTimestamp)
                                .thenComparing(Task::getUuid)
                )
                .forEach(System.out::println);
    }
}