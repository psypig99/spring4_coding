package com.apress.isf.spring.test.profile;

import org.springframework.test.annotation.ProfileValueSource;

/**
 * Created by Sejun on 2015. 12. 29..
 */
public class CustomProfile implements ProfileValueSource {
	@Override
	public String get(String key) {

		if (key.equals("environment")) {
			return "dev";
		} else if (key.equals("os.name")) {
			return "Unix";
		}
		return null;
	}
}
