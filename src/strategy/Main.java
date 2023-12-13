package strategy;

public class Main {
    public static void main(String[] args) {
        Fan f1 = new Fan(new OptimisticStrategy());
        Fan f2 = new Fan(new RealisticStrategy());
        if(2%1==0) {
            f2.setStrategy(new OptimisticStrategy());
        }

        f1.sayOpinion("Manchester United");
        f1.sayOpinion("Dinamo Bucuresti");

        f2.sayOpinion("Dacia Unirea Braila");
        f2.sayOpinion("Manchester United");

        f1.setStrategy(new RealisticStrategy());
        f1.sayOpinion("Dinamo Bucuresti");
        f1.sayOpinion("Manchester United");
    }
}
