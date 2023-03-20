package com.codurance.training.tasks.service;

import com.codurance.training.tasks.entity.Project;

import java.util.Date;
import java.util.Map;

public interface DeadlineService {
    void setDeadline(Map<Long, Project> projectList, String taskId, Date deadline);
}
