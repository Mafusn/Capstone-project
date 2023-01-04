// Magnus Peetz Holt - mph21@student.aau.dk

package Classes;

public abstract class Person {
    private String Name;
    private int ID;

    public Person(String name, int ID) {
        Name = name;
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
    }
}
