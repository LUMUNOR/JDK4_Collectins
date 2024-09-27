package Employ;

public class Employ {
    private int tabNumber;
    private int phoneNumber;
    private final String name;
    private int experience;

    public Employ(int tabNumber, int phoneNumber, String name, int experience){
        this.tabNumber=tabNumber;
        this.phoneNumber=phoneNumber;
        this.name=name;
        this.experience=experience;
    }

    public int getTabNumber() {
        return tabNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "\n--------------------------\n" +
                "Имя: " + this.name +
                "\nТаб.: " + this.tabNumber +
                "\nТелефон: " + this.phoneNumber +
                "\nСтаж: " + this.experience + "г."+
                "\n--------------------------\n";
    }
}
