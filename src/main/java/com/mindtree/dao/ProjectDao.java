package com.mindtree.dao;

import java.util.List;
import com.mindtree.entity.Project;

public interface ProjectDao 
{
	String addProject(Project p);
	List<Project> displayAll();
}