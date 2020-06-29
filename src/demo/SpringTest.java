package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Main Class for Spring Test
public class SpringTest 
{
	public static void main(String[] args) 
	{
		//load the spring configuration file or create and add file into a spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call the methods for fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}
