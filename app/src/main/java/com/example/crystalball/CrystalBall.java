package com.example.crystalball;

import java.util.Random;

public class CrystalBall {
	//Member Variables (properties about the object)
	public	String[] mAnswers = {
				"It is certain",
				"It is decidedly so",
				"All signs say YES",
				"The stars are not aligned",
				"My reply is no",
				"It is doubtful",
				"Better not tell you now",
				"Concentrate and ask again",
				"Unable to answer now"
		};
	//Methods (abilities: things the object can do)
	public String getAnAnswer() {
	
		// Update answer
		String answer = "";
		
		//Choose random answer
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
	
		//Pick String from array
		answer = mAnswers[randomNumber];
		
		return answer;
		
	}
}
