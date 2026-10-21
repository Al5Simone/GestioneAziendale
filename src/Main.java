void main(){

    Impiegato i = new Impiegato("Nicolò", 1500.0);
    Manager m = new Manager("Giacomo", 2500.0, 500);
    Venditore v = new Venditore("Riccardo",2000.0, 25.5,18);
    Stagista s = new Stagista("Simone",1500.0);

    Azienda a = new Azienda("Tech mecha");

    a.Aggiungi(i);
    a.Aggiungi(m);
    a.Aggiungi(v);
    a.Aggiungi(s);
    a.StampaTutti();
    double costoTotale = a.CostoTotale();
    System.out.println("\nCosto totale stipendi per " + a.getNomeAzienda() + ": " + costoTotale + "€");

}
