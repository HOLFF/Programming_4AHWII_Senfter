package Senfter.animals;

public class schwein extends viech {
    private int speck;

    public schwein(char geschlecht, int alter, int gewicht, String name) {
        super(geschlecht, alter, gewicht, name);
    }

    public void füttern(){
        super.setGewicht(super.getGewicht()+2);
    }

    public void schlachten(){
        if(super.getGewicht()>=100){
            speck+=10;
        }
    }

    public int getSpeck() {
        return speck;
    }

    public void setSpeck(int speck) {
        this.speck = speck;
    }
}
