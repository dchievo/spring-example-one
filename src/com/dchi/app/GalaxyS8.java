package com.dchi.app;

public class GalaxyS8 implements Phone {

	private Light light;
	
	private Lightservice lightService;
	
/*	public GalaxyS8(Lightservice theLightService) {
		this.lightService = theLightService;
	}*/
	
	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return "Ring Ring";
	}

	@Override
	public String turnOn() {
		// TODO Auto-generated method stub
		return "Turning On";
	}

	@Override
	public String turnOff() {
		// TODO Auto-generated method stub
		return "Turning Off";
	}

	@Override
	public String turnOnLight() {
		// TODO Auto-generated method stub
		return lightService.turnOnLight();
	}

	@Override
	public String turnOffLight() {
		// TODO Auto-generated method stub
		return lightService.turnOffLight();
	}

	public void setLightService(Lightservice lightService) {
		this.lightService = lightService;
	}

	
}
