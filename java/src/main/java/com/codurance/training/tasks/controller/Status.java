package com.codurance.training.tasks.controller;

import com.codurance.training.tasks.entity.Project;
import com.codurance.training.tasks.entity.Task;
import com.codurance.training.tasks.service.StatusService;

import java.io.PrintWriter;
import java.util.Map;

public class Status implements StatusService {
    @Override
    public void changeStatus(Map<Long, Project> projectList, String idString, boolean done, PrintWriter out) {
        for (Map.Entry<Long, Project> e : projectList.entrySet()) {
            for(Task task : e.getValue().getTasks()) {
                if (task.getUniqueId().equals(idString)) {
                    task.setDone(done);
                    return;
                }
            }
        }
        out.printf("Could not find a task with an ID of %s.", idString);
        out.println();
    }
}
