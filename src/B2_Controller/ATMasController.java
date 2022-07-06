package B2_Controller;

import B1_Model.*;

public class ATMasController {
    private Bank bank;
    private String lokasi;
    private Nasabah nasabahAktiasModel;
    private Rekening rekeningAktifasModel;

    public ATMasController(Bank bank, String lokasi) {
        this.bank = bank;
        this.lokasi = lokasi;
    }

    public Bank getBank() {
        return bank;
    }

    public String getLokasi() {
        return lokasi;
    }

    public Nasabah getNasabahAktiasModel() {
        return nasabahAktiasModel;
    }

    public Rekening getRekeningAktifasModel() {
        return rekeningAktifasModel;
    }
    
    // pemeteaan fungsi transaksi yang disediakan oleh ATM
    public boolean loginPin(String pin){
        if (bank.findRekeningByPin(pin)==null){
            return false;
        }else {
            rekeningAktifasModel = bank.findRekeningByPin(pin);
            nasabahAktiasModel = bank.findNasabahById
                (rekeningAktifasModel.getNasabahID());
            return true;
        }
    }
    
    public void logOut(){
        rekeningAktifasModel = null;
        nasabahAktiasModel = null;
    }
    
    public void Setor(double jumlah){
        rekeningAktifasModel.setor(jumlah);
    }
    
    public void Tarik (double jumlah){
        rekeningAktifasModel.tarik(jumlah);
    }
    
    public void Transfer(double jumlah, String noRekening){
        rekeningAktifasModel.setor(jumlah);
        bank.findRekeningById(noRekening).setor(jumlah);
    }
    
    public void cekSaldo(){
        System.out.println("Saldo Anda : " + rekeningAktifasModel.getSaldo());
    }
}
