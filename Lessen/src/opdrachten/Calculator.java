package opdrachten;

public class Calculator {
	public double tax = 0.05;
	public double tip = 0.15;
	public double originalPrice;
	public double belasting;
	public double tippen;
	public double totaal;
	
	public void FindTotal()
	{
		belasting = originalPrice * (1 + tax);
		
		tippen = originalPrice * (1 + tip);
		
		totaal = originalPrice * (1 + tax + tip);
	}
}
