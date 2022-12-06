package Classes;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        GroupConstructor groupConstructor = new GroupConstructor();

        Group groupA = groupConstructor.createAndPlayGroup('A');
        Group groupB = groupConstructor.createAndPlayGroup('B');
        Group groupC = groupConstructor.createAndPlayGroup('C');
        Group groupD = groupConstructor.createAndPlayGroup('D');

        groupA.printTeams();
        groupB.printTeams();
        groupC.printTeams();
        groupD.printTeams();
    }
}