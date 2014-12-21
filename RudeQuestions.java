import java.util.Scanner;

public class RudeQuestions
{
	public static void main( String[] args )
	{
		String name;
		int age;
		double weight, income;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? " );
		name = kb.next();
		
		System.out.print( "Hi, " + name + "! How old are you?" );
		age = kb.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not old at all." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = kb.nextDouble();
		
		System.out.print( weight + "! Better keep that quiet. Finally, what's your income, " + name + "? " );
		income = kb.nextDouble();
		
		System.out.println( "Hopefully that is " + income + " per hour and not per year!" );
		System.out.println( "Well, thanks for answering my rude questions, " + name + "." );
	}
}
