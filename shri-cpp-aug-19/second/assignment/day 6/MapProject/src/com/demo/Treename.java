package com.demo;

import java.util.ArrayList;

public class Treename {
ArrayList<String> al;





public Treename() {
	super();
	// TODO Auto-generated constructor stub
	al= new ArrayList<>();
}

public Treename(ArrayList<String> al) {
	this.al = al;
}

public ArrayList<String> getAl() {
	return al;
}

public void setAl(ArrayList<String> al) {
	this.al = al;
}

@Override
public String toString() {
	return "Treename [al=" + al + "]";
}


}
