public class FiveDice
{
	public static void main(String[] args)
	{
		Die comp1 = new Die();
		Die comp2 = new Die();
		Die comp3 = new Die();
		Die comp4 = new Die();
		Die comp5 = new Die();

		Die player1 = new Die();
		Die player2 = new Die();
		Die player3 = new Die();
		Die player4 = new Die();
		Die player5 = new Die();

		System.out.println("");

		System.out.println("Computer roll was " + comp1.getValue() + ", " + comp2.getValue() + ", " + comp3.getValue() + ", " + comp4.getValue() + ", " + comp5.getValue());

		System.out.println("");


		System.out.println("Player roll was " + player1.getValue() + ", " + player2.getValue() + ", " + player3.getValue() + ", " + player4.getValue() + ", " + player5.getValue());
		
	}
}