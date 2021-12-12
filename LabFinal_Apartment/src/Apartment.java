
public class Apartment {
	private int id;
	private int rooms;
	private double rent;
	private String status;
	
	public Apartment() {
		
	}
	public Apartment(int id, int rooms, double rent, String status) {
		setId(id);
		setRooms(rooms);
		setRent(rent);
		setStatus(status);
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
