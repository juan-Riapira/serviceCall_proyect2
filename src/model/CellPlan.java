package model;

public class CellPlan {
	private String description;
	private int minutes;
	
	
	public CellPlan(String description, int minutes) {
		super();
		this.description = description;
		this.minutes = minutes;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}


	public String getDescription() {
		return description;
	}


	public int getMinutes() {
		return minutes;
	}


	@Override
	public String toString() {
		return "CellPlan [description=" + description + ", minutes=" + minutes + "]";
	}
	
}
