import java.util.Scanner;

public class Species {

	private String name;
	private int population;
	private double growthRate;
	
	public Species() {
		name = "";
		population = 0;
		growthRate = 0;
	}
	
	public Species(String n, int p, double gr) {
		name = n;
		population = p;
		growthRate = gr;
	}
	
	public void readInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the specie's name? ");
		name = input.next();
		System.out.println("What is the population of the species? ");
		population = input.nextInt();
		while (population < 0) {
			System.out.println("You entered an invalid population, please renter the population of the species again? ");
			population = input.nextInt();
		}
		System.out.println("Enter the growth rate (% increase per year): ");
		growthRate = input.nextDouble();
	}
	
	public void writeOutPut() {
		System.out.println("Specie's name: " + name);
		System.out.println("Specie's population: " + population);
		System.out.println("Specie's growth rate per year: %" + growthRate);
	}
	
	public int predictPopulation(int years) {
		double newPop = population;
		for(int i = 1; i <= years; i++) {
			newPop += newPop*(growthRate/100);
		}
		if(newPop < 0) newPop = 0 ;
		return (int)newPop;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public double getGrowthRate() {
		return growthRate;
	}
	
	public void setSpecies(String newName, int newPopulation, double newGrowthRate) {
		if (newPopulation < 0) {
			System.out.print("Error. Negitave Population! . Exit program.");
			System.exit(0);
	}
		name = newName;
		population = newPopulation;
		growthRate = newGrowthRate;
	}
	
	public boolean equals(Species otherObject) {
		return name.equalsIgnoreCase(otherObject.name);
	}
	
	public boolean isPopulationLargerThan(Species otherObject) {
		return (otherObject.population < population);
	}
	
	public boolean isExtinct() {
		return (population == 0); 
	}
	
}
