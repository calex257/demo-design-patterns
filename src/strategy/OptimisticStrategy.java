package strategy;

public class OptimisticStrategy implements MatchStrategy{
    @Override
    public void printTeamOpinion(String team) {
        System.out.println("uneori pierzi, alteori nu castigi");
    }
}
