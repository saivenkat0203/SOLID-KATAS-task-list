package com.codurance.training.tasks.service;

import com.codurance.training.tasks.entity.Project;

import java.io.PrintWriter;
import java.util.Map;

public interface StatusService {
    void changeStatus(Map<Long, Project> projectList, String idString, boolean done, PrintWriter out);
}
