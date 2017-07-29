//Travonna Wilson
//7/29/17
//CST-105
//this is my own work

/**
 *
 * @author Travaonna
 */
import java.util.*;

public class draftpick {
    
    @SuppressWarnings("NonPublicExported")
    public static Team[] teams = new Team[8];

    
    public static List<Player> players = new ArrayList<Player>();

    
    public static String[] teamNames = {"Dallas Cowboys", "New England Patriots",
        "Seattle Seahawks", "Oakland Raiders", "Greenbay Packers",
        "Pittsburgh Steelers", "San Francisco 49ers", "Denver Broncos"}; 

    
    public static String[] playerNames = {"J.J. Watt", "Aaron Rodgers", 
        "Tom Brady", "DeMarco Murray", "Peyton Manning", "Calvin Johnson",
        "Andrew Luck", "Antonio Brown", "Marshawn Lynch", "Rob Gronkowski",
        "Richard Sherman", "Jamaal Charles", "Julio Jones", "Luke Kuechly", 
        "Dez Bryant", "Le'Veon Bell", "Darrelle Revis", "Jordy Nelson",
        "Patrick Peterson", "Demaryius Thomas", "Earl Thomas", 
        "Russell Wilson", "Joe Haden", "Joe Thomas", "Justin Houston",
        "Gerald McCoy", "LeSean McCoy", "Drew Brees", "Jimmy Graham", 
        "Von Miller", "Tony Romo", "Tyron Smith"};
    
    public static void main(String[] args) {
        
        createTeams();

        
        rankTeams();

      
        rankPlayers();
		
        
        draftPick();
    }
	
    
    public static int generateRandomNumber(int upperLimit) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(upperLimit) + 1;
		
        return randomInt;
    }

    // Creates an Array of 8 Team Objects and gives them each a name
    public static int createTeams() {
        // Populate Team[] teams with Team Objects using teamNames Array
        for (int i = 0; i < teams.length; i++) {
            teams[i] = new Team(teamNames[i]);
        }

        return 0;
    }

    private static void rankTeams() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void rankPlayers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void draftPick() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Team {

        public Team() {
        }

        private Team(String teamName) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Player {

        public Player() {
        }
    }
    
}
