public class Array {
    //array adalah tipe data dengan berisikan tipe data dengan tipe kumpulan yang sama.
    //jumlah data di array tidak bisa berubah setelah pertama kali di buat.

    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[5];

        stringArray[0] = "mohammad";
        stringArray[1] = "ferdi";
        stringArray[2] = "darmawan";
        stringArray[3] = "jean";
        stringArray[4] = "cantik";

        System.out.print(stringArray[0]);
        System.out.print(stringArray[1]);
        System.out.print( stringArray[2]);
        System.out.println(stringArray[3]);
        System.out.println(stringArray[4]);

    }
}
