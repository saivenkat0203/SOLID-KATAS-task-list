package com.codurance.training.tasks.service;

import com.codurance.training.tasks.entity.Project;

import java.io.PrintWriter;
import java.util.Map;

public interface ViewService {
    void viewTasksByProject(Map<Long, Project> projectList, PrintWriter out);
    void viewTasksDueToday(Map<Long, Project> projectList, PrintWriter out);
    void viewTasksByDate(Map<Long, Project> projectList, PrintWriter out);
    void viewTasksByDeadline(Map<Long, Project> projectList, PrintWriter out);
}
