public class Concessionaria {
    public static void main(String[] args) {
        Montadora montadora1 = new Ford(new SUV());
        Montadora montadora2 = new Chevrolet(new Hatch());
        Montadora montadora3 = new Volkswagen(new Sedan());

        montadora1.montar();
        montadora2.montar();
        montadora3.montar();
    }
}