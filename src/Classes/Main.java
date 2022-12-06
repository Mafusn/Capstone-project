package Classes;

import Classes.Constructors.GroupConstructor;

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