public class Manager extends Dipendente {

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String nome, double stipendioBase, double bonus) {
        super(nome, stipendioBase);
        this.bonus = bonus;
    }

    @Override
    public double CalcolaStipendio(double stipendioBase) {
        return stipendioBase + bonus;
    }

    @Override
    public String Descrizione() {
        return super.Descrizione() + "(manager)";
    }
}
