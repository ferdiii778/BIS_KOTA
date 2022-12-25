package input;

public class Inventory2 {

    String NamaBarang;
    int JumlahBarangJual;
    String KodeBarang;
    int Harga;

    int diskon;

    int StokMulaMula;

    int StokAkhir;

    int StokPertengahan;

    public Inventory2(){// constructor

    }
    public Inventory2(String KdBrg, String namabrg, int jumjual,int hrg,int Mula, int diskon, int StokPertengahan){
        this.KodeBarang = KdBrg;
        this.StokPertengahan = StokPertengahan;
        this.diskon = diskon;
        this.NamaBarang = namabrg;
        this.JumlahBarangJual = jumjual;
        this.StokMulaMula = Mula;
        this.Harga = hrg;
        this.StokAkhir = 0;
    }

    public void Jualitem(){
        StokAkhir = StokMulaMula - JumlahBarangJual + diskon;
        System.out.println("StokAkhir=" + StokAkhir);
    }
}
