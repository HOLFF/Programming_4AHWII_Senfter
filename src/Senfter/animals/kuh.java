package Senfter.animals;

public class kuh extends viech{
        private int milchprostunde;
        private long timepassed = System.currentTimeMillis();
        private int milch;

    public kuh(char geschlecht, int alter, int gewicht, String name, int milchprostunde) {
        super(geschlecht, alter, gewicht, name);
        this.milchprostunde = milchprostunde;
    }

    public void Milch(){
        if(System.currentTimeMillis()>=timepassed+1000*60*60){
             milch+=milchprostunde;
        }
        timepassed=System.currentTimeMillis();
    }

    public int getMilchprostunde() {
        return milchprostunde;
    }

    public void setMilchprostunde(int milchprostunde) {
        this.milchprostunde = milchprostunde;
    }

    public int getMilch() {
        return milch;
    }

    public void setMilch(int milch) {
        this.milch = milch;
    }
}

