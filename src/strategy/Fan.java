package strategy;

public class Fan {
    MatchStrategy strategy;

    public Fan(MatchStrategy strategy) {
        this.strategy = strategy;
    }

    public MatchStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(MatchStrategy strategy) {
        this.strategy = strategy;
    }

    public void sayOpinion(String team) {
        strategy.printTeamOpinion(team);
    }
}
