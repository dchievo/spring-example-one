package com.dchi.app;

public class LGG6 implements Phone {
	private Lightservice lightService;

	public LGG6(Lightservice theLightService) {
		lightService = theLightService;
	}
	
	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return "Ring ring";
	}

	@Override
	public String turnOn() {
		// TODO Auto-generated method stub
		return "Turning on!";
	}

	@Override
	public String turnOff() {
		// TODO Auto-generated method stub
		return "Turning off!";
	}

	@Override
	public String turnOnLight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String turnOffLight() {
		// TODO Auto-generated method stub
		return null;
	}

}
