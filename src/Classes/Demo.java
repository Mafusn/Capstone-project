package Classes;

public class Demo {
    public static void main(String[] args) {
        Referee preben = new Referee("Preben", 26452, 5);
        Referee egon = new Referee("Egon", 26451, 4);
        Official susanne = new Official("Susanne", 23561, 34);
        Coach Henning = new Coach("Henning", 15345, 12);
        TeamLeader Bente = new TeamLeader("Bente", 15344, 0, 0 ,88888888);
        Coach Lars = new Coach("Lars", 71849, 8);
        TeamLeader Yvonne = new TeamLeader("Yvonne", 71850, 0, 0 ,34343434);
        Team ajax = new Team("Ajax", Henning, Bente, 0, 0, 0);
        Team ringsted = new Team("Ringsted", Lars, Yvonne, 0, 0, 0);

        Match match1 = new Match(1, ajax, ringsted, preben, egon, susanne);
        match1.playMatch(ajax, 31, ringsted, 32, preben, egon, susanne);

        System.out.println(ajax.getWins() + ", " + ajax.getLosses() + ", " + ajax.getDraws());
        System.out.println(ringsted.getWins() + ", " + ringsted.getLosses() + ", " + ringsted.getDraws());
    }
}
