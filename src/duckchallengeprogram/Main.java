package duckchallengeprogram;

public class Main {

	public static void main(String[] args) {
		
		Duck sallyDuck = new Duck();
		Duck tomDuck = new Duck();
		Duck derrickDuck = new Duck();
		
		DuckManager d = new DuckManager();
		
		sallyDuck.setName("Sally");
		sallyDuck.setAMallard(true);
		sallyDuck.setColour("White, brown, black, green");
		
		tomDuck.setName("Tom");
		tomDuck.setAMallard(false);
		tomDuck.setColour("Yellow");
		
		derrickDuck.setName("Derrick");
		derrickDuck.setAMallard(true);
		derrickDuck.setColour("White, brown, black, green");
		
		 
		d.getDuckList().add(sallyDuck);
		d.getDuckList().add(tomDuck);
		d.getDuckList().add(derrickDuck);
		
		d.SortAndDisplayDuckNames();
		//d.SearchForDucksThatAreMallardsAndPrint();
		
		

	}

}
