package com.dchi.app;

public class GalaxyNote implements Phone {

	private Lightservice theLightService;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GalaxyNote(Lightservice lightService) {
		this.theLightService = lightService;
	}
	
	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return "ring ring";
	}

	@Override
	public String turnOn() {
		// TODO Auto-generated method stub
		return "On!";
	}

	@Override
	public String turnOff() {
		// TODO Auto-generated method stub
		return "Off!";
	}

	@Override
	public String turnOnLight() {
		// TODO Auto-generated method stub
		return "Light on!";
	}

	@Override
	public String turnOffLight() {
		// TODO Auto-generated method stub
		return "Light off!";
	}

}
