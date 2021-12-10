
public class testSpecies {

	public static void main(String[] args) {

		Species ArabianOryx = new Species("Arabian Oryx", 1000, 0.25);

		Species X = new Species();
		X.readInput();
		while (X.equals(ArabianOryx)) {
			System.out.println("Enter a diffrent specie.");
			X.readInput();
		}
		while (X.isExtinct()) {
			System.out.println("Specie is extinct. Enter a diffrent population.");
			X.readInput();
		}
		if (X.isPopulationLargerThan(ArabianOryx)) {
			System.out.println(X.getName() + " population is already larger than " + ArabianOryx.getName());
			System.exit(0);
		} else {
			if (X.getGrowthRate() <= ArabianOryx.getGrowthRate()) {
				System.out.println(X.getName() + " will never surpass " + ArabianOryx.getName() + " population.");
				System.exit(0);
			} else {
				int years = 1;
				while (X.predictPopulation(years) < ArabianOryx.predictPopulation(years))
					years++;

				System.out.println("After " + years + " years, population of " + X.getName() + " will surpass that of "
						+ ArabianOryx.getName() + ".");
			}

		}
	}
}
