// Magnus Peetz Holt - mph21@student.aau.dk

package Classes;

import Classes.Constructors.FinalsMatchConstructor;
import Classes.Constructors.GroupConstructor;
import Classes.Constructors.MatchConstructor;

public class Main {
    public static void main(String[] args) {
        GroupConstructor groupConstructor = new GroupConstructor();
        FinalsMatchConstructor finalsMatchConstructor = new FinalsMatchConstructor();

        Group groupA = groupConstructor.createAndPlayGroup('A');
        Group groupB = groupConstructor.createAndPlayGroup('B');
        Group groupC = groupConstructor.createAndPlayGroup('C');
        Group groupD = groupConstructor.createAndPlayGroup('D');

        groupA.printTeams();
        groupB.printTeams();
        groupC.printTeams();
        groupD.printTeams();

        finalsMatchConstructor.printTableOverview(groupA, groupB, groupC, groupD);
    }
}