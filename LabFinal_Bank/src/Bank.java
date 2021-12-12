
public class Bank {
	private String[] names;
	private double[] balances;
	private int nClients;

	public Bank() {

	}

	public Bank(int size) {
		nClients = 0;
		names = new String[size];
		balances = new double[size];
	}

	public int findIndexByName(String name) {
		for (int i = 0; i < nClients; i++) {
			if (names[i].equalsIgnoreCase(name))
				return i;
		}
		return -1;
	}

	public boolean addClient(String name, double balance) {

		if (names.length == nClients) {
			return false;
		}
		if (findIndexByName(name) != -1) {
			return false;
		}
		names[nClients] = name;
		balances[nClients] = balance;
		nClients++;
		return true;

	}

	public boolean deleteClient(String name) {
		if (findIndexByName(name) == -1)
			return false;
		names[findIndexByName(name)] = names[nClients - 1];
		balances[findIndexByName(name)] = balances[nClients - 1];
		nClients--;
		return true;
	}

	public boolean deposit(String name, double amount) {
		if (findIndexByName(name) == -1)
			return false;
		System.out.print(name + " was " + balances[findIndexByName(name)] + ", ");
		balances[findIndexByName(name)] += amount;
		System.out.print(balances[findIndexByName(name)]);
		return true;

	}

	public boolean withDraw(String name, double amount) {
		if (findIndexByName(name) == -1)
			return false;
		if (balances[findIndexByName(name)] < amount)
			return false;
		System.out.print(name + " was " + balances[findIndexByName(name)] + ", ");
		balances[findIndexByName(name)] -= amount;
		System.out.print(balances[findIndexByName(name)]);
		return true;
	}

	public boolean transfer(String fName, String tName, double amount) {
		if (findIndexByName(fName) == -1 || findIndexByName(tName) == -1)
			return false;
		if (balances[findIndexByName(fName)] < amount)
			return false;
		System.out.println(fName + " was " + balances[findIndexByName(fName)] + ", ");
		balances[findIndexByName(fName)] -= amount;
		System.out.print(balances[findIndexByName(fName)]);
		System.out.println(tName + " was " + balances[findIndexByName(tName)] + ", ");
		balances[findIndexByName(tName)] += amount;
		System.out.print(balances[findIndexByName(tName)]);
		return true;
	}

	public void display(String name) {
		if (findIndexByName(name) == -1)
			System.out.println("Not found.");
		else
			System.out.print(names[findIndexByName(name)] + " " + balances[findIndexByName(name)] + " SR");
	}

	public String findMax() {
		if (nClients == 0)
			return "null";
		double max = 0;
		String maxN = "";
		for (int i = 0; i < nClients; i++) {
			if (balances[i] > max) {
				max = balances[i];
				maxN = names[i];
			}
		}
		return maxN;
	}
	public boolean transferToBank(String fName, Bank tobank, String tName, double amount) {
		if (findIndexByName(fName) == -1 || findIndexByName(tName) == -1)
			return false;
		System.out.println(fName + " was " + balances[findIndexByName(fName)] + ", ");
		balances[findIndexByName(fName)] -= amount;
		System.out.print(balances[findIndexByName(fName)]);
		System.out.println(tName + " was " + tobank.balances[findIndexByName(tName)] + ", ");
		tobank.balances[findIndexByName(tName)] += amount;
		System.out.print(tobank.balances[findIndexByName(tName)]);
		return true;
		
	}
	

}
