import java.util.ArrayList;

public class Azienda {
    private String nomeAzienda;

    public String getNomeAzienda() {
        return nomeAzienda;
    }

   private ArrayList<Dipendente> listaDipendenti;

    public Azienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
        this.listaDipendenti = new ArrayList<>();
    }

    public void Aggiungi(Dipendente d){
        listaDipendenti.add(d);
    }

    public double CostoTotale(){
        double costo = 0.0;
        for(Dipendente d : listaDipendenti){
            costo += d.CalcolaStipendio(d.stipendioBase);
        }
        return costo;
    }
    public void StampaTutti() {
        for (Dipendente d : listaDipendenti) {
            System.out.println(d.Descrizione());
        }
    }
}
