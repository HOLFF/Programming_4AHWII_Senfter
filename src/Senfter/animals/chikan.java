package Senfter.animals;

public class chikan extends viech {
    private int eier;
    private long timepassed = System.currentTimeMillis();

    public chikan(char geschlecht, int alter, int gewicht, String name) {
        super(geschlecht, alter, gewicht, name);
    }

    public void Eier(){
        if((super.getGeschlecht()=='w')&&System.currentTimeMillis()>=timepassed+1000*60*60){
            this.setEier(this.getEier()+1);
            timepassed=System.currentTimeMillis();
        }
    }

    public int getEier() {
        return eier;
    }

    public void setEier(int eier) {
        this.eier = eier;
    }
}
