package beans;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public BaseballCoach() {
		System.out.println("Calling no args constructure");
	}
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkOut() {
		return "Walk or smth";
	}

	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setting fortuneService");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Setting emailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Setting team");
		this.team = team;
	}
	
	

}
