package demo;

public abstract class Member {
    protected Integer poin = 0;
    String namaPelanggan;
    String kodeBarang;
    String namaBarang;
    Long hargaBarang;
    Long jumlahBeli;
    Long totalBayar;
    String noHp;
    String alamat;
    String namaKasir="Nana";

    
    public Integer getPoin(){
        return poin;
    }

    public Integer redeemPoin(Integer hargaSouvenir){
        return this.poin = this.poin - hargaSouvenir;
    }

    protected Integer getBonusPoin(Integer totalBayar){
        Integer poin = (int) (totalBayar / 10000);
        return poin;
    }
}

