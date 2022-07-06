package B1_Model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WahRadar
 */
public class Bank {
    private String nama;
    private final List<Rekening> listRekening = new ArrayList<>();
    private final List<Nasabah> listNasabah = new ArrayList<>();

    public Bank(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public List<Rekening> getListRekening() {
        return listRekening;
    }

    public List<Nasabah> getListNasabah() {
        return listNasabah;
    }
    
    public void addRekening (Rekening rekening){
        listRekening.add(rekening);
    }
    
    public void addNasabah (Nasabah nasabah){
        listNasabah.add(nasabah);
    }
    
    public Rekening findRekeningByPin(String pin){
        for(Rekening rekening : listRekening){
            if (rekening.getPin().equals(pin)){
                return rekening;
            }
        }
        return null;
    }
    
    public Rekening findRekeningById(String id){
        for(Rekening rekening : listRekening){
            if (rekening.getRekeningID().equals(id)){
                return rekening;
            }
        }
        return null;
    }
    
    public Nasabah findNasabahById(String id){
        for(Nasabah nasabah : listNasabah){
            if (nasabah.getId().equals(id)){
                return nasabah;
            }
        }
        return null;
    }
    
    public void registrasiRekening (Nasabah nasabah, Rekening rekening){
        addNasabah(nasabah);
        rekening.setNasabahID(nasabah.getId());
        rekening.setNasabahNama(nasabah.getNama());
        addRekening(rekening);
    }
    
    public void printAllRekening(){
        for (Rekening rekening : listRekening){
            System.out.println(rekening);
        }
    }
}
