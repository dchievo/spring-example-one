package com.dchi.app;

import java.util.ArrayList;
import java.util.List;

public class Lightservice implements TurnOnLight {

	private List<String> newArray = new ArrayList<String>();

	@Override
	public String turnOnLight() {
		// TODO Auto-generated method stub
		return "Turning the light on!";
	}

	@Override
	public String turnOffLight() {
		// TODO Auto-generated method stub
		return "Turning the light off!";
	}

	public List<String> getNewArray() {
		return newArray;
	}

	public void setNewArray(List<String> newArray) {
		this.newArray = newArray;
	}


}
