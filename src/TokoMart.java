import input.Inventory2;

public class TokoMart {
    public static void main(String[] args) {
        Inventory2 spidol = new Inventory2("spdl","spidol snowman",2,7000,12, 50, 90);
        spidol.Jualitem();

        Inventory2 Bukutulis = new Inventory2( "bktl", "buku tulis", 20, 13000, 50, 50, 90);
        Bukutulis.Jualitem();
    }
}
