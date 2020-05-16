package Senfter.animals;

public class viech {
    private char geschlecht;
    private int alter;
    private int gewicht;
    private String name;

    public viech(char geschlecht, int alter, int gewicht, String name) {
        this.geschlecht = geschlecht;
        this.alter = alter;
        this.gewicht = gewicht;
        this.name = name;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
