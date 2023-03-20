package com.codurance.training.tasks.controller;

import com.codurance.training.tasks.entity.Project;
import com.codurance.training.tasks.entity.Task;
import com.codurance.training.tasks.service.DeadlineService;

import java.util.Date;
import java.util.Map;

public class Deadline implements DeadlineService {

    @Override
    public void setDeadline(Map<Long, Project> projectList, String taskId, Date deadline) {
        for (Map.Entry<Long, Project> e : projectList.entrySet()) {
            for(Task task: e.getValue().getTasks()) {
                if(task.getUniqueId().equals(taskId)) {
                    task.setDeadline(deadline);
                    return;
                }
            }
        }
    }
}
