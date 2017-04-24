package com.dchi.app;

public class Light implements TurnOnLight {

	@Override
	public String turnOnLight() {
		return "Turning On";
	}

	@Override
	public String turnOffLight() {

		return "Turning Off";
	}

}
