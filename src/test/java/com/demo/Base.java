package com.demo;

public interface Base {

	public abstract void verifyFutureBottomScreen();

	public static Base getObject(String mode) {

		if (mode.equals("a")) {
			return new TraderBottomScreen();
		} else {
			return new InvestorBottomScreen();
		}

	}

}
