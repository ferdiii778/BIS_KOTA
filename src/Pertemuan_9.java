import java.util.ArrayList;

public class Pertemuan_9 {

    public static void main(String[] args) {

        /* Arraylst
        *seperti array, tapi tidak ada batas penyimpanan.
        *Deklarasi arrayList
        *Array <Tipe data> variabel= new ArrayList<>();
        *       integer
        *       double
        *       String
        * Mobil
        * besarnya araylist ditulis dengan syntax size();
        * untuk memasukkan value ke dalam arraylist menggunakan syntax;
        */

        System.out.println();

        ArrayList<Integer> Angka = new ArrayList<Integer>();
        Angka.add(0,2);
        Angka.add(1, 2);
        Angka.add(2, 5);
        Angka.remove(0);

        System.out.println(Angka);
        System.out.println(Angka.get(0));
        System.out.println(Angka.size());
        ArrayList<String> Name = new ArrayList<String>();
        Name.add("ferdi");
        Name.add("feri");
        Name.add("fedi");
        Name.add("erdi");

        System.out.println(Name.get(0));
        System.out.println(Name);


    }
}
