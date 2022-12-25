package input;

public class Inventory {

    String NamaBarang;
    String KodeBarang;
    String JumlahBarang;
    int diskon;

    public static void NamaBarang(){
        System.out.println("kacang ireng");
    }
    public static void main(String[] args) {
        new Inventory();
        Inventory.NamaBarang();

        Inventory Untitle1= new Inventory();
        Untitle1.NamaBarang();
    }
}
