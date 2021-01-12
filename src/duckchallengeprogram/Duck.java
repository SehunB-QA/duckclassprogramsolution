package duckchallengeprogram;




public class Duck {
		
	private String name; 
	private boolean isAMallard;
	private String colour;
	
	
	@Override
	public String toString() {
		return "Duck [name=" + name + ", isAMallard=" + isAMallard + ", colour=" + colour + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAMallard() {
		return isAMallard;
	}
	public void setAMallard(boolean isAMallard) {
		this.isAMallard = isAMallard;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}

}
