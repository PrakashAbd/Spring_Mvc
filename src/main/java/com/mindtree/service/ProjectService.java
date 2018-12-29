package com.mindtree.service;
import java.util.List;
import com.mindtree.entity.Project;

public interface ProjectService 
{
	String addProject(Project p);
	List<Project> displayAll();
}