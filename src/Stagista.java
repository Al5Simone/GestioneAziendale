public class Stagista extends Dipendente{

    public Stagista(String nome, double stipendioBase) {
        super(nome, stipendioBase);
    }

    @Override
    public double CalcolaStipendio(double stipendioBase) {
        return stipendioBase/2;
    }
    public String Descrizione() {
        return super.Descrizione() + "(stagista)";
    }
}
