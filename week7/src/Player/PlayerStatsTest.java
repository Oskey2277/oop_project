package Player;

public class PlayerStatsTest {
    public static void main(String[] args) {
        FootballStats nepal= new FootballStats("oskar nepal", 700, 2090);
        CricketStats oskar = new CricketStats("oskar nepal", 500, 200000);

        nepal.showFootballStats();
        oskar.showCricketStats();
    }
}


