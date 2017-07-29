//Travonna Wilson
//7/29/17
//CST-105
//this is my own work

/**
 *
 * @author Travonna
 */
public abstract class NFLPlayer {
	
	private String name;
	private int age;
	private int number;
	private String team;
	private float height;
	private float weight;
	private String status = "available";
	private String category;

	
	// Create Default Player
	NFLPlayer() {
		setName("");
		setAge(0);
		setNumber(0);
		setTeam("");
		setHeight(0); 
		setWeight(0);
		setCategory("");
	}
	
	NFLPlayer(String name, int age, int number, String team, float height, float weight, String category) {
		this.setName(name);
		this.setAge(age);
		this.setNumber(number);
		this.setTeam(team);
		this.setHeight(height); 
		this.setWeight(weight);
		this.setCategory(category);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	//Get Status
	public String getStatus() {
		return status;
	}

	//Set Status
	public void setStatus(String status) {
		this.status = status;
	}
	
	//Get Category
	public String getCategory() {
		return category;
	}

	//Set Category
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
