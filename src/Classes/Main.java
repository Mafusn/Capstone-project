package Classes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Referees & officials
        Referee preben = new Referee("Preben", 26452, 5);
        Referee egon = new Referee("Egon", 26451, 4);
        Official susanne = new Official("Susanne", 23561, 34);

        // Coaches
        Coach henning = new Coach("Henning", 15345, 12);
        Coach lars = new Coach("Lars", 71849, 8);
        Coach hans = new Coach("Hans", 51345, 8);
        Coach jens = new Coach("Jens", 58375, 8);

        // Team leaders
        TeamLeader bente = new TeamLeader("Bente", 15344, 0, 0 ,88888888);
        TeamLeader yvonne = new TeamLeader("Yvonne", 71850, 0, 0 ,34343434);
        TeamLeader erik = new TeamLeader("Erik", 51346, 0, 0 ,67385749);
        TeamLeader susan = new TeamLeader("Susan", 58376, 0, 0 ,58374957);

        // Teams
        Team ajax = new Team("Ajax", henning, bente, 0, 0, 0);
        Team ringsted = new Team("Ringsted", lars, yvonne, 0, 0, 0);
        Team slagelse = new Team("Slagelse", hans, erik, 0, 0, 0);
        Team maribo = new Team("Maribo", jens, susan, 0, 0, 0);

        // Matches
        Match match1 = new Match(1, ajax, ringsted, preben, egon, susanne);
        Match match2 = new Match(2, slagelse, maribo, preben, egon, susanne);

        // Matches played
        match1.playMatch(31,32);
        match2.playMatch(34, 32);

        // Groups
        Group groupA = new Group('A', new ArrayList<>());
        groupA.addTeam(slagelse);
        groupA.addTeam(ajax);
        groupA.addTeam(ringsted);
        groupA.addTeam(maribo);

        groupA.sortTeamsInGroup(groupA.getTeams());
    }
}