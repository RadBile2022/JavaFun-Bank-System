package B2_Controller;

import B1_Model.*;

public class ATMasClient {
    public static void main(String[] args) {
        // A. REGISTRASI NASABAH BARU
        Bank bank = new Bank("Bank Jatim");
        bank.registrasiRekening(new Nasabah("Wahyu Wiradarma", "350511"), 
                new Rekening("014685", "1234", 500000));
        bank.registrasiRekening(new Nasabah("Rizky Sholihin", "350512"), 
                new Rekening("014686", "4321", 600000));
        
        // B.  CETAK NASABAH BARU
        ATMasController atmBLK = new ATMasController(bank, "Bank Jatim cbg Bekasi");
        Rekening rekening = bank.findRekeningByPin("1234");
        Nasabah nasabah = bank.findNasabahById("350512");
        System.out.println(rekening);
        System.out.println(nasabah);
        atmBLK.loginPin("1234");
        
        // C. CETAK SEMUA REKENING
        System.out.println();
        bank.printAllRekening();
        
        // LOGIN ATM LAGI
        Rekening rekeningAktif = bank.findRekeningByPin("1234");
        
        // TRANSFER DANA   
        Rekening rekTujuan = bank.findRekeningById("014686");
        rekeningAktif.transfer(25000, rekTujuan);
        rekeningAktif.addLogTransaction(Log.getTime()+TransactionType.DEBET 
                + rekeningAktif.getSaldo());
        System.out.println("\ntransfer \t= dua lima ribu");
                
        //cek saldo
        System.out.println("saldo        \t= " + rekeningAktif.getSaldo());
    }
}
