public class Impiegato extends Dipendente{

    public Impiegato(String nome, double stipendioBase) {
        super(nome, stipendioBase);
    }

    @Override
    public  double CalcolaStipendio(double stipendioBase){
        return  stipendioBase;
    }

    @Override
    public String Descrizione() {
        return super.Descrizione();
    }
}
