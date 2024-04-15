public class Avotmobil extends Vozilo {
    int brojNaVrati;

    public Avotmobil() {
        speed = 260;
        fuel_capacity = 60 ;
        brojNaVrati = 5;
    }

    public void Zapali() {
        System.out.println("Kolata e zapalena");
        System.out.println("Kolata so atributi: " + speed + " brzina, " + fuel_capacity + " kapacitet gorivo " + brojNaVrati + " vrati");
    }
}
