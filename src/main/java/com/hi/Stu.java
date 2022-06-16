package com.hi;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Stu {

@Id
int id;
String name;
public Stu(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Stu() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Stu [id=" + id + ", name=" + name + "]";
}


}
