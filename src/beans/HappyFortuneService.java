package beans;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] fortune;
	
	public String getFortune() {
		int randomIndex = new Random().nextInt(this.fortune.length);	
		return fortune[randomIndex];
	}

	public void setFortune(String[] fortune) {
		this.fortune = fortune;
	}

	
}
