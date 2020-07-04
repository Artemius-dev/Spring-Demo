package com.luv2code.springdemo;
import java.util.Random;
public class RandomFortune implements FortuneService {
	String[] fortune = {
		"Today is your lucky day!",
		"Today your love!",
		"Today is your day man!"
	};
	@Override
	public String getFortune() {
		Random random = new Random();
		int index = random.nextInt(fortune.length);
		return fortune[index];
	}

}
