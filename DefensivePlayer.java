//Travonna Wilson
//7/29/17
//CST-105
//this is my own work

/**
 *
 * @author Travonna
 */
public class DefensivePlayer extends NFLPlayer {
	
	private double tackles;
	private double ast;
	private double comb;
	private double sacks;
	private double inter;
	private String position;
	
	DefensivePlayer(String name, int age, int number, String team, float height, float weight, String category, double tackles,
	double ast, double comb, double sacks, double inter, String position) {
		super(name, age, number, team, height, weight, "def");
		this.setTackles(tackles);
		this.setAst(ast);
		this.setComb(comb);
		this.setSacks(sacks);
		this.setInter(inter);
		this.setPosition(position);
        }

	//Get tackles
	public double getTackles() {
		return tackles;
	}

	//Set tackles
	public void setTackles(double tackles) {
		this.tackles = tackles;
	}

	//Get Ast
	public double getAst() {
		return ast;
	}

	//Set Ast
	public void setAst(double ast) {
		this.ast = ast;
	}

	//Get comb
	public double getComb() {
		return comb;
	}

	//Set comb
	public void setComb(double comb) {
		this.comb = comb;
	}

	//Get sacks
	public double getSacks() {
		return sacks;
	}

	//Set sacks
	public void setSacks(double sacks) {
		this.sacks = sacks;
	}

	//Get inter
	public double getInter() {
		return inter;
	}

	//Set inter
	public void setInter(double inter) {
		this.inter = inter;
	}

	//Get Position
	public String getPosition() {
		return position;
	}

	//Set Position
	public void setPosition(String position) {
		this.position = position;
	}

}
