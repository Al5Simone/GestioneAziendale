public class Venditore extends Dipendente{
    private int vendite;
    private double percentualeCommissione;

    public double getPercentualeCommissione() {
        return percentualeCommissione;
    }

    public void setPercentualeCommissione(double percentualeCommissione) {
        percentualeCommissione = percentualeCommissione;
    }

    public int getVendite() {
        return vendite;
    }

    public void setVendite(int vendite) {
        this.vendite = vendite;
    }

    public Venditore(String nome, double stipendioBase, double percentualeCommissione, int vendite) {
        super(nome, stipendioBase);
        this.percentualeCommissione = percentualeCommissione;
        this.vendite = vendite;
    }

    @Override
    public double CalcolaStipendio(double stipendioBase) {
        double commissioni = vendite * (percentualeCommissione / 100.0);
        return stipendioBase + commissioni;
    }
    @Override
    public String Descrizione() {
        return super.Descrizione() + "(venditore)";
    }
}
