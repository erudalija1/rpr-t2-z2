package ba.unsa.etf.rpr.tutorijal02;

public class Interval {

    private double pocetna, krajnja;
    private boolean pripada1, pripada2;

    public Interval (double pocetna, double krajnja, boolean pripada1, boolean pripada2) {

        if (pocetna > krajnja) throw new IllegalArgumentException ("Nesipravne vrijednosti");

        this.pocetna = pocetna;
        this.krajnja = krajnja;
        this.pripada1 = pripada1;
        this.pripada2 = pripada2;

    }
    public Interval() {
        this.pocetna = 0;
        this.krajnja = 0;
        this.pripada1 = false;
        this.pripada2 = false;
    }

    public boolean isNull () {
        if (this.pocetna == 0 && this.krajnja == 0 && !this.pripada1 && !this.pripada2 ) return true;
        return false;
    }

    public boolean isIn (double tacka) {
        if (tacka > pocetna && tacka < krajnja) return true; //dodatni uslov za ova dva boola
        return false;
    }
    public  Interval intersect (Interval i) {
        if (this.pocetna > i.pocetna && this.krajnja > i.krajnja) return
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        if (isNull()) return "( )";
        return
    }

}
