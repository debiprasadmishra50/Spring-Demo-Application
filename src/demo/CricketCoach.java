package demo;

public class CricketCoach implements Coach {

	// Literal injection
	
	// Add new private field and create setter methods
	private String email;
	private String team;
	
	public void setEmail(String email) {
		System.out.println("CricketCoach : Inside Setter method setEmail");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : Inside setter method setTeam");
		this.team = team;
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	// Setter Injection
	private FortuneService fortuneService;
	
	//Create a no-args constructor
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-args constructor");
	}
	
	//Setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Cricket Coach : Practice fast bowling and it is a great sport";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
