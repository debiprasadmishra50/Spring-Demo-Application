package demo;

public class BaseballCoach implements Coach
{
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() 
	{
		return "Spent 30 Minutes on BaseBall";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "In BaseballCoach Just Do It : "+fortuneService.getFortune();
	}
}
