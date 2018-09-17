package entities;

public abstract class Verify {
	
	private String name;
	
	public Verify() {
		
	}

	public Verify(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract boolean teste();
	
	
}
