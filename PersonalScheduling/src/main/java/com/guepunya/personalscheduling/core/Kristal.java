package com.guepunya.personalscheduling.core;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Hello Willy Sianturi!
 */
public class Kristal {
    public Object [][] data = null;
//    int jumlahKristal;
    
    ArrayList makul;
    ArrayList dosen;
    ArrayList ruang;
    
    String [][] dataKristal2;
    
    public Kristal(ArrayList makul, ArrayList dosen,ArrayList ruang) {
        this.makul = makul;
        this.dosen = dosen;
        this.ruang = ruang;
        initKristal();
    }

    public Kristal(String[][] dataKristal2) {
        this.dataKristal2 = dataKristal2;
        initKristal2();
    }

        
    public void resetKristal(){
        data = null;
    }
    public int looperkul=0;
    public void initKristal(){
        data = new Object[4][6];
        
        ArrayList dataDos = new ArrayList();
        ArrayList dataRua = new ArrayList();
        ArrayList dataKul = new ArrayList();        
                    
        for(int a=0; a<4; a++){
            for(int b=0; b<6; b++){
                if(b == 0){                  
                    data[0][0] = (Object) "07.00 - 09.30";
                    data[1][0] = (Object) "09.30 - 12.00";
                    data[2][0] = (Object) "13.00 - 14.30";
                    data[3][0] = (Object) "14.30 - 16.00";
                }
                else{                    
                    String dos = getRandomDosen();                   
                    String rua = getRandomRuang();
                    String kul = getRandomMakul();
                    
                    removeListDosen(tempDosen);
                    removeListMakul(tempMakul);
                    removeListRuang(tempRuang);                                     
                    
                    String tempDos = null;
                    String tempKul = null;
                    String tempRua = null;                    
                    
                    if(dos!=null){
                        tempDos = dos;
                        dos = null;
                        dataDos.add(tempDos);
                        //System.out.println("tempdos = "+tempDos);
                    }
                    if(rua!=null){
                        tempRua = rua;
                        rua = null;
                        dataRua.add(tempRua);
                        //System.out.println("temprua = "+tempRua);
                    }
                    if(kul!=null){
                        tempKul = kul;
                        kul = null;
                        dataKul.add(tempKul);
                        //System.out.println("tempkul = "+tempKul);
                    }
                    int looper=0;
                    int sizeKul = dataKul.size()-1;
                    int sizeRua = dataRua.size()-1;
                    int sizeDos = dataDos.size()-1;
                    if(dataKul.isEmpty()==false && dataDos.isEmpty()==false && dataRua.isEmpty()==false){
                    if(dataKul.get(sizeKul) !=null && dataRua.get(sizeRua) !=null && dataDos.get(sizeDos) !=null){
                        //System.out.println("looperkul = "+looperkul);
                        /*System.out.println("terpenuhi syarat");
                        System.out.print("datakul = "+dataKul);
                        System.out.print("datarua = "+dataRua);
                        System.out.print("datados= "+dataDos);
                        System.out.println("----------------");
                        System.out.println("isi kristal = "+dataKul.get(sizeKul)+dataDos.get(sizeDos)+dataRua.get(sizeRua));*/
                        data[a][b] = (Object) dataKul.get(sizeKul)+" "+dataDos.get(sizeDos) +" "+dataRua.get(sizeRua);
                        dataKul.remove(sizeKul);
                        //dataDos.remove(sizeDos);
                        //dataRua.remove(sizeRua);
                        looperkul++;                        
                    }                                                               
                    }
                    else{
                        kul = "-";
                        dos = "-";
                        rua = "-";
                        data[a][b] = (Object) kul+" "+dos+" "+rua;
                    } 

                }
            }
        }
    }
    
    private String tempMakul, tempDosen, tempRuang;
    public Object [][] getKristal(){
        return data;
    }
    public Random r = new Random();
    
    public void removeListDosen(String isidosen){
        dosen.remove(isidosen);
    }
    
    public void showDatamakul(){        
            System.out.println(makul);        
    }
    public String getRandomDosen(){        
        String hasil = null;
            int index = r.nextInt(dosen.size());
            hasil = (String) dosen.get(index);
            tempDosen = hasil;            
        //String kembali = hasil;
        //removeListDosen(hasil);
        return hasil;
    }
    
    public void removeListMakul(String isiMakul){
        makul.remove(isiMakul);
    }
    
    public String getRandomMakul(){        
        String hasil = null;
            int index = r.nextInt(makul.size());
            hasil = (String) makul.get(index);
            tempMakul = hasil;            
        return hasil;
    }
    
    public void removeListRuang(String isiRuang){
        ruang.remove(isiRuang);
    }
    
    public String getRandomRuang(){
        String hasil = null;
            int index = r.nextInt(ruang.size());
             hasil = (String) ruang.get(index);
            tempRuang = hasil;            
        return hasil;
    }        

    private void initKristal2() {

        data = new Object[4][6];
        
        for(int a=0; a<4; a++){
            for(int b=0; b<6; b++){
                if(b == 0){                  
                    data[0][0] = (Object) "07.00 - 09.30";
                    data[1][0] = (Object) "09.30 - 12.00";
                    data[2][0] = (Object) "13.00 - 14.30";
                    data[3][0] = (Object) "14.30 - 16.00";
                }
                else{
                    data[a][b] = dataKristal2[a][b-1];
                }
            }        
        }
    }
    
}
