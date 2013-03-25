package com.red1kissi.model;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SpringObject implements PackageObject{
	
	private String name;
	@Inject
	@Qualifier(value="collaborator")
	private Collaborator collaborator;
	
	public SpringObject() {
	
	}
	
	public SpringObject(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Collaborator getCollaborator() {
		return collaborator;
	}

	public void setCollaborator(Collaborator collaborator) {
		this.collaborator = collaborator;
	}
}
