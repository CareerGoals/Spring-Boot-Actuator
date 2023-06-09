package com.career.goals.spring.actuator.health;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InternalhealthMatrics implements HealthIndicator {

	@Override
	public Health health() {
		
		return checkInternet() == true ? Health.up().withDetail("success code", "Active internate connection")
				.build() : Health.down().withDetail("error code","Inactive internate connection").build();
	}

	private boolean checkInternet() {
		boolean flag = false;
		try {
			URL url = new URL("https://www.google.com");
			URLConnection con = url.openConnection();
			con.connect();
			flag = true;
		} catch (Exception e) {

		}
		return flag;
	}

}
