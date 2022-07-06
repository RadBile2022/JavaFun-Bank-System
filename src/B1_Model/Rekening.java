package B1_Model;

import java.util.ArrayList;
import java.util.List;

public class Rekening {
    private String rekeningID;
    private String pin;
    private double saldo;
    private String nasabahID;
    private String nasabahNama;
    private List<String> logTransaction = new ArrayList<>();

    public Rekening(String rekeningID, String pin, double saldo) {
        this.rekeningID = rekeningID;
        this.pin = pin;
        this.saldo = saldo;
    }

    public void setNasabahID(String nasabahID) {
        this.nasabahID = nasabahID;
    }

    public void setNasabahNama(String nasabahNama) {
        this.nasabahNama = nasabahNama;
    }

    public String getRekeningID() {
        return rekeningID;
    }

    public String getPin() {
        return pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNasabahID() {
        return nasabahID;
    }

    public String getNasabahNama() {
        return nasabahNama;
    }

    public List<String> getLogTransaction() {
        return logTransaction;
    }
    
    public void addLogTransaction(String message){
        logTransaction.add(message);
    }
    
    public void setor (double jumlah){
        saldo+=jumlah;
    }
    
    public void tarik (double jumlah){
        saldo-=jumlah;
    }
    
    public void transfer (double jumlah, Rekening rekTujuan){
        tarik(jumlah);
        rekTujuan.setor(jumlah);
    }

    @Override
    public String toString() {
        return "Rekening{" + "rekeningID=" + rekeningID + ", pin=" + pin 
                + ", saldo=" + saldo + ", nasabahID=" + nasabahID 
                + ", nasabahNama=" + nasabahNama + ", logTransaction=" 
                + logTransaction + '}';
    }
}
