public abstract class Dipendente {
    protected String nome;
    protected double stipendioBase;

    public Dipendente(String nome, double stipendioBase) {
        this.nome = nome;
        this.stipendioBase = stipendioBase;
    }

    public abstract double CalcolaStipendio(double stipendioBase);

    public String Descrizione(){
        return "Dipendente: " + nome;
    }
    @Override
    public String toString(){
        return Descrizione() + "- stipendio: " + CalcolaStipendio(stipendioBase);
    }


}
