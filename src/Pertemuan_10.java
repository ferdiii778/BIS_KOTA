public class Pertemuan_10 {

    public static String S(int[] angka){
        int data = angka.length;
        String Status;
        if(data%8==0){
            Status = "Genap";
        }else{
            Status = "Ganjil";
        }
        return Status;
    }

    public static void main(String[] args) {
        //Deklarasi Arraylist
        String t = S(new int[]{1,2,3,4});
        System.out.println(t);
    }
}
