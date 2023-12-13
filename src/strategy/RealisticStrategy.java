package strategy;

public class RealisticStrategy implements MatchStrategy{
    @Override
    public void printTeamOpinion(String team) {
        if (team.equals("Manchester United")) {
            System.out.println("vai de mama lor");
            return;
        }
        System.out.println("joaca bine");
    }
}
