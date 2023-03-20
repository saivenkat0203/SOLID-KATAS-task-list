package com.codurance.training.tasks.service;

import com.codurance.training.tasks.entity.Project;

import java.io.PrintWriter;
import java.util.Map;

public interface AddService {
    boolean add(Map<Long, Project> projectList, String commandLine, PrintWriter out);
}
