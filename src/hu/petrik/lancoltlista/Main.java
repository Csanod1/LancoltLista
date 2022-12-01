package hu.petrik.lancoltlista;

public class Main {
    public static void main(String[] args) {
        LancoltLista<Integer> lancoltlista = new LancoltLista<>();
        int elemekszama = 100;
        int legkisebb = 1;
        int legnagyobb = 60;

        System.out.println(lancoltlista);
        for (int i = 0; i < elemekszama; i++) {
            int ertek = (int) (Math.random() * (legnagyobb - legkisebb) + 1);
            lancoltlista.hozzaAd(ertek);
        }

        System.out.println(lancoltlista);
        System.out.println(lancoltlista.tartalmazE(50));
    }
}
