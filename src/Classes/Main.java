package Classes;

import Classes.Exceptions.SameIDException;
import Classes.Exceptions.SameNumberException;

import java.util.ArrayList;
import java.util.Random;

public class Main implements CreatePlayers{
    public static void main(String[] args) {
        Random rand = new Random();

        // Referees & officials
        Referee preben = new Referee("Preben", 26452, 5);
        Referee egon = new Referee("Egon", 26451, 4);
        Official susanne = new Official("Susanne", 23561, 34);
        Official beathe = new Official("Beathe", 23461, 19);

        // Coaches
        Coach henning = new Coach("Henning", 15345, 12);
        Coach lars = new Coach("Lars", 71849, 8);
        Coach hans = new Coach("Hans", 51345, 8);
        Coach jens = new Coach("Jens", 58375, 8);

        // Team leaders
        TeamLeader bente = new TeamLeader("Bente", 15344, 0, 0);
        TeamLeader yvonne = new TeamLeader("Yvonne", 71850, 0, 0);
        TeamLeader erik = new TeamLeader("Erik", 51346, 0, 0);
        TeamLeader susan = new TeamLeader("Susan", 58376, 0, 0);

        // Teams
        Team ajax = new Team("Ajax", henning, bente, 0, 0, 0);
        Team ringsted = new Team("Ringsted", lars, yvonne, 0, 0, 0);
        Team slagelse = new Team("Slagelse", hans, erik, 0, 0, 0);
        Team maribo = new Team("Maribo", jens, susan, 0, 0, 0);

        // Players
        ArrayList<Player> ajaxPlayers = CreatePlayers.createPlayers();
        ArrayList<Player> ringstedPlayers = CreatePlayers.createPlayers();
        ArrayList<Player> slagelsePlayers = CreatePlayers.createPlayers();
        ArrayList<Player> maribolayers = CreatePlayers.createPlayers();

        try {
            ajax.addPlayers(ajaxPlayers);
            ringsted.addPlayers(ringstedPlayers);
            slagelse.addPlayers(slagelsePlayers);
            maribo.addPlayers(maribolayers);
        } catch (SameNumberException e) {
            System.out.println(e.getErrorMessage());
        } catch (SameIDException e) {
            System.out.println(e.getErrorMessage());
        }

        // Matches
        Match match1 = new Match(rand.nextInt(10000, 99999), ajax, ringsted, preben, egon, susanne, beathe);
        Match match2 = new Match(rand.nextInt(10000, 99999), slagelse, maribo, preben, egon, susanne, beathe);
        Match match3 = new Match(rand.nextInt(10000, 99999), ajax, slagelse, preben, egon, susanne, beathe);
        Match match4 = new Match(rand.nextInt(10000, 99999), maribo, ringsted, preben, egon, susanne, beathe);

        // Matches played
        match1.playMatch(rand.nextInt(15, 40), rand.nextInt(15, 40));
        match2.playMatch(rand.nextInt(15, 40), rand.nextInt(15, 40));
        match3.playMatch(rand.nextInt(15, 40), rand.nextInt(15, 40));
        match4.playMatch(rand.nextInt(15, 40), rand.nextInt(15, 40));

        // Groups
        Group groupA = new Group('A', new ArrayList<>());
        groupA.addTeam(ringsted);
        groupA.addTeam(maribo);
        groupA.addTeam(slagelse);
        groupA.addTeam(ajax);

        groupA.sortTeamsInGroup(groupA.getTeams());

        groupA.printTeams();
    }
}