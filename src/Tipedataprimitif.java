public class Tipedataprimitif {
    //perbedaan tipe data primitif dan bukan primitif yaitu:
    //hanya berbeda di awal huruf saja contoh byte - Byte, short - Short.

    public static void main(String[] args) {
        Integer iniInteger = 100;
        long iniLong = 10000;

        Byte iniByte = null;
        System.out.println(iniByte);

        //jika menggunakan tipe data byte harus di dahulukan dengan = null;

        iniByte = 100;
        System.out.println(iniByte);

        int iniInt = 100;
        Integer iniInteger2 = iniInt;
    }
}
