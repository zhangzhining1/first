package main;

public class Hero {
private long id;
private String nikname;
private int level;
private long exp;
public long getId() {
	return id;
}
public void setId(long id) {
		this.id = id;
}
public String getNikname() {
	return nikname;
}
public void setNikname(String nikname) {
	this.nikname = nikname;
}
public int getLevel() {
	return level;
}
public Hero() {
	super();
	// TODO Auto-generated constructor stub
}
public void setLevel(int level) {
	this.level = level;
}
public long getExp() {
	return exp;
}
public void setExp(long exp) {
	this.exp = exp;
}
}
