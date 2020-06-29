package demo;

// Main Program
public class Test 
{
	public static void main(String[] args) 
	{
		//Create the object
		Coach theCoach = new BadmintonCoach(); //HardCoded
		
		//use the object and print the message
		System.out.println(theCoach.getDailyWorkout());
	}
}
