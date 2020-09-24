package com.guepunya.personalscheduling.core;

import com.guepunya.personalscheduling.view.InputDataView;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Hello Willy Sianturi!
 */
public class Data {  
    public Data() {
    }
    
    ArrayList makul = new ArrayList();
    ArrayList dosen = new ArrayList();
    ArrayList ruang = new ArrayList();
    
    public String [] tempMakul = new String[20];
    public String [] tempDosen = new String[20];
    public String []  tempRuang = new String[20];
    
    public Integer intMakul, intDosen, intRuang, intKristal;

    public ArrayList getMakul() {
        return makul;
    }

    public ArrayList getDosen() {
        return dosen;
    }

    public ArrayList getRuang() {
        return ruang;
    }

    public String[] getTempMakul() {
        return tempMakul;
    }

    public String[] getTempDosen() {
        return tempDosen;
    }

    public String[] getTempRuang() {
        return tempRuang;
    }

    public Integer getIntMakul() {
        return intMakul;
    }

    public Integer getIntDosen() {
        return intDosen;
    }

    public Integer getIntRuang() {
        return intRuang;
    }

    public Integer getIntKristal() {
        return intKristal;
    }


    
    //input data mata kuliah
    public void setMakul(ArrayList makulData){
        this.makul = makulData;
    }
    
    public void initMakul(){
        ArrayList initLokalMakul = new ArrayList();
        for(int a = 0; a<intMakul; a++){
            String makulLokal = JOptionPane.showInputDialog(null, "Masukkan data Kegiatan ke "+(a+1), "Input Data Kegiatan", JOptionPane.QUESTION_MESSAGE);
            initLokalMakul.add(makulLokal);
            tempMakul[a] = makulLokal;            
        }
        for(int a=0; a<(20 - intMakul); a++){
            initLokalMakul.add(null);
        }
        setMakul(initLokalMakul);
    }    
    
    public String getLabelMakul(){
        String makulLokal = "";
        for(int a=0;a<intMakul; a++){
            makulLokal+=tempMakul[a]+", ";
        }
        return makulLokal;
    }    
    public void insertDataMakul(InputDataView view){
        intMakul = Integer.parseInt(view.getTxtmakul().getText());
        initMakul();        
    }

    //input data dosen
    public void initDosen(){
        ArrayList initDosen = new ArrayList();
        for(int a = 0; a<intDosen; a++){
            String dosenLokal = JOptionPane.showInputDialog(null, "Masukkan data Dosen ke "+(a+1), "Input Data Dosen", JOptionPane.QUESTION_MESSAGE);
            initDosen.add(dosenLokal);
            tempDosen[a] = dosenLokal;
        }
        for(int a=0; a<(20 - intDosen); a++){
            initDosen.add(null);
        }
        setDosen(initDosen);
    }    
    
    public void setDosen(ArrayList dosenData){
        this.dosen = dosenData;
    }
    
    public String getLabelDosen(){
        String dosenLokal = "";
        for(int a=0;a<intDosen; a++){
            dosenLokal += tempDosen[a]+" ,";
        }
        return dosenLokal;
    }        

    public void insertDataDosen(InputDataView view){
        intDosen = Integer.parseInt(view.getTxtdosen().getText());
        initDosen();
    }
    
    //insert Data Ruang
    public void initRuang(){
        ArrayList initRuang = new ArrayList();
        for(int a = 0; a < intRuang; a++){
            String ruangLokal = JOptionPane.showInputDialog(null, "Masukkan data Ruang ke "+(a+1), "Input Data Ruang", JOptionPane.QUESTION_MESSAGE);
            initRuang.add(ruangLokal);
            tempRuang[a] = ruangLokal;            
        }
        for(int a=0; a<(20 - intRuang); a++){
            initRuang.add(null);
        }        
        setRuang(initRuang);
    }        
    public void setRuang(ArrayList ruang){
        this.ruang = ruang;
    }    
    
    public String getLabelRuang(){
        String ruangLokal = "";
        for(int a=0;a<intRuang; a++){
            ruangLokal += tempRuang[a]+" ,";
        }
        return  ruangLokal;
    }            
    
    public void insertDataRuang(InputDataView view){
        intRuang = Integer.parseInt(view.getTxtruang().getText());
        initRuang();         
    }
    
    //set Data Kristal    
    public String getLabelKristal(){
        return String.valueOf(intKristal);
    }
    
    public void insertDataKristal(InputDataView view){
        intKristal = Integer.parseInt(view.getTxtkristal().getText());
        JOptionPane.showMessageDialog(null, "Jumlah Kristal = "+intKristal);            
    }
    
    Kristal satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, sepuluh, sebelas, duabelas, tigabelas, empatbelas, limabelas;
    
    public void buatKristal(){        
        switch(intKristal){
            case 1 :    satu = new Kristal(makul, dosen, ruang);break;                
            case 2 :    dua = new Kristal(makul, dosen, ruang);
                        reInitData();
                        tiga = new Kristal(makul, dosen, ruang);
                        break;
            case 3 :    empat = new Kristal(makul, dosen, ruang);
                        reInitData();
                        lima= new Kristal(makul, dosen, ruang);
                        reInitData();
                        enam = new Kristal(makul, dosen, ruang);
                        break;
            case 4 :    tujuh = new Kristal(makul, dosen, ruang);
                        reInitData();
                        delapan= new Kristal(makul, dosen, ruang);
                        reInitData();
                        sembilan = new Kristal(makul, dosen, ruang);
                        reInitData();
                        sepuluh = new Kristal(makul, dosen, ruang);
                        break;    
            case 5 :    sebelas = new Kristal(makul, dosen, ruang);
                        reInitData();
                        duabelas= new Kristal(makul, dosen, ruang);
                        reInitData();
                        tigabelas = new Kristal(makul, dosen, ruang);
                        reInitData();
                        empatbelas = new Kristal(makul, dosen, ruang);
                        reInitData();
                        limabelas = new Kristal(makul, dosen, ruang);
                        break;
            default: System.out.println("jumlah kristal tidak tersedia");
        }
    }       
    
    public void reInitMakul(){
        ArrayList initLokalMakul = new ArrayList();
        for(int a = 0; a<intMakul; a++){
            initLokalMakul.add(tempMakul[a]);
        }
        for(int a=0; a<(20 - intMakul); a++){
            initLokalMakul.add(null);
        }        
        setMakul(initLokalMakul);        
    }
    public void reInitDosen(){
        ArrayList initLokalDosen = new ArrayList();
        for(int a = 0; a<intDosen; a++){
            initLokalDosen.add(tempDosen[a]);
        }
        for(int a=0; a<(20 - intDosen); a++){
            initLokalDosen.add(null);
        }
        setDosen(initLokalDosen);        
    }    
    public void reInitRuang(){
        ArrayList initLokalRuang = new ArrayList();
        for(int a = 0; a<intRuang; a++){
            initLokalRuang.add(tempRuang[a]);
        }
        for(int a=0; a<(20 - intRuang); a++){
            initLokalRuang.add(null);
        }
        setRuang(initLokalRuang);        
    }        
    
    
    public void reInitData(){
        reInitMakul();
        reInitDosen();
        reInitRuang();
    }        
    
    //buat tabel
    
    String [] namaKolom={"Jam || Hari","Senin", "Selasa", "Rabu", "Kamis", "Jumat"};      
    JTable jtsatu, jtdua, jttiga, jtempat, jtlima, jtenam, jttujuh, jtdelapan, jtsembilan, jtsepuluh, jtsebelas, jtduabelas, jttigabelas, jtempatbelas, jtlimebelas;
    JFrame jfsatu, jfdua, jftiga, jfempat, jflima, jfenam, jftujuh, jfdelapan, jfsembilan, jfsepuluh, jfsebelas, jfduabelas, jftigabelas, jfempatbelas, jflimabelas;    
    
    int looperForm = 0;
    public void createFormTabel(JFrame namaFrame, JTable namaTabel){
        looperForm++;
        namaFrame = new JFrame();
        namaFrame.setLocationRelativeTo(null);
        namaFrame.setTitle("Kristal"+looperForm);
        namaFrame.setVisible(true);
        namaFrame.setSize(600,150);
        namaFrame.setLayout(new java.awt.BorderLayout());        
        namaFrame.getContentPane().add(new JScrollPane(namaTabel),java.awt.BorderLayout.CENTER);        
    }    

    public void buatTabel(){
        switch(intKristal){
            case 1: jtsatu=new JTable(new KristalModTab(satu.getKristal(), namaKolom));
                    jfsatu = new JFrame();
                    createFormTabel(jfsatu, jtsatu);break;
            case 2: jtdua=new JTable(new KristalModTab(dua.getKristal(), namaKolom));
                    jfdua = new JFrame();
                    createFormTabel(jfdua, jtdua);                
                    jttiga=new JTable(new KristalModTab(tiga.getKristal(), namaKolom));
                    jftiga = new JFrame();
                    createFormTabel(jftiga, jttiga);break;
            case 3: jtempat=new JTable(new KristalModTab(empat.getKristal(), namaKolom));
                    jfempat = new JFrame();
                    createFormTabel(jfempat, jtempat);
                    jtlima=new JTable(new KristalModTab(lima.getKristal(), namaKolom));
                    jflima = new JFrame();
                    createFormTabel(jflima, jtlima);
                    jtenam=new JTable(new KristalModTab(enam.getKristal(), namaKolom));
                    jfenam = new JFrame();
                    createFormTabel(jfenam, jtlima);break;
            case 4: jttujuh=new JTable(new KristalModTab(tujuh.getKristal(), namaKolom));
                    jftujuh = new JFrame();
                    createFormTabel(jftujuh, jttujuh);
                    jtdelapan=new JTable(new KristalModTab(delapan.getKristal(), namaKolom));
                    jfdelapan = new JFrame();
                    createFormTabel(jfdelapan, jtdelapan);
                    jtsembilan=new JTable(new KristalModTab(sembilan.getKristal(), namaKolom));
                    jfsembilan = new JFrame();
                    createFormTabel(jfsembilan, jtsembilan);
                    jtsepuluh=new JTable(new KristalModTab(sepuluh.getKristal(), namaKolom));
                    jfsepuluh = new JFrame();
                    createFormTabel(jfsepuluh, jtsepuluh);break;
            case 5: jtsebelas=new JTable(new KristalModTab(sebelas.getKristal(), namaKolom));
                    jfsebelas = new JFrame();
                    createFormTabel(jfsebelas, jtsebelas);
                    jtduabelas=new JTable(new KristalModTab(duabelas.getKristal(), namaKolom));
                    jfduabelas = new JFrame();
                    createFormTabel(jfduabelas, jtduabelas);
                    jttigabelas=new JTable(new KristalModTab(tigabelas.getKristal(), namaKolom));
                    jftigabelas = new JFrame();
                    createFormTabel(jftigabelas, jttigabelas);
                    jtempatbelas=new JTable(new KristalModTab(empatbelas.getKristal(), namaKolom));
                    jfempatbelas = new JFrame();
                    createFormTabel(jfempatbelas, jtempatbelas);
                    jtlimebelas=new JTable(new KristalModTab(limabelas.getKristal(), namaKolom));
                    jflimabelas = new JFrame();
                    createFormTabel(jflimabelas, jtlimebelas);break;                
        }
    }        
    
    
    public double getFitness(int valueA, int valueB, int valueC){
        return 1.0/(valueA+valueB+valueC);
    }
    
    public double getProbabilitas(double value, double totalFitness){
        return value/totalFitness;
    }
    
    public double getProbabilitasKumulatif(double predecessor, double sucessor){
        return predecessor+sucessor;
    }
    
    double [] dataRouletteWheel;
    
    public double getRandom(){
        Random r = new Random();        
        return r.nextDouble();
    }
    
    public void setDataRouletteWheel(int selektor){
        dataRouletteWheel = new double[selektor];
        for(int a=0; a<dataRouletteWheel.length; a++){
            dataRouletteWheel[a] = getRandom();
        }
    }
    
    public void sortingRouletteWheel(String[][] data){
        for(int a=0; a<dataRouletteWheel.length; a++){
            for(int b=0; b<dataRouletteWheel.length; b++){
                if(dataRouletteWheel[a]<dataRouletteWheel[b]){
                    double temp = dataRouletteWheel[a];
                    dataRouletteWheel[a] = dataRouletteWheel[b];
                    dataRouletteWheel[b] = temp;
                    
                    //seleksi probkum
                    double tempProbkum = probKum[a];
                    probKum[a] = probKum[b];
                    probKum[b] = tempProbkum;
                    
                    //perubahan data
                    //String tempData = data[a]
                }
            }
        }
    }
    
    public void setPopulasiBaru(){
        
    }
    
    double [] probKum;
    
    public void optimasi(){
        KristalToArr KristalToArr=new KristalToArr();                
        
        probKum = new double[intKristal];
        switch(intKristal){
            case 1:
                    //Kristal satu
                    KristalToArr.convert(satu.getKristal());
                    int makulSatu = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervalSatu = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangSatu = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    
                    double fitnessSatu = getFitness(makulSatu, intervalSatu, ruangSatu);
                    double probabilitasSatu = getProbabilitas(fitnessSatu, fitnessSatu);
                    probKum[0] = getProbabilitasKumulatif(0, probabilitasSatu);                    
                    break;
            case 2:
                    //Kristal dua
                    KristalToArr.convert(dua.getKristal());
                    int makulDua = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervalDua = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangDua = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    double fitnessDua = getFitness(makulDua, intervalDua, ruangDua);                    
                    //Kristal tiga
                    KristalToArr.convert(tiga.getKristal());
                    int makulTiga = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervalTiga = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangTiga = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    double fitnessTiga = getFitness(makulTiga, intervalTiga, ruangTiga);                                        
                    
                    double totalFitnessDua = fitnessDua + fitnessTiga;
                    double probabilitasDua1 = getProbabilitas(fitnessDua, totalFitnessDua);
                    double probabilitasDua2 = getProbabilitas(fitnessTiga, totalFitnessDua);
                    
                    probKum[0] = getProbabilitasKumulatif(0, probabilitasDua1);
                    probKum[1] = getProbabilitasKumulatif(probKum[0], probabilitasDua2);                    
                    break;
            case 3:
                    //Kristal empat
                    KristalToArr.convert(empat.getKristal());
                    int makulEmpat = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervalEmpat = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangEmpat = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    double fitnessEmpat = getFitness(makulEmpat, intervalEmpat, ruangEmpat);
                    //Kristal lima
                    KristalToArr.convert(lima.getKristal());
                    int makulLima = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervalLima = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangLima = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    double fitnessLima = getFitness(makulLima, intervalLima, ruangLima);                    
                    //Kristal enam
                    KristalToArr.convert(enam.getKristal());
                    int makulEnam = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervalEnam = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangEnam = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    double fitnessEnam = getFitness(makulEnam, intervalEnam, ruangEnam);            
                    
                    double totalFitnessTiga = fitnessEmpat + fitnessLima + fitnessEnam;
                    double probabilitasTiga1 = getProbabilitas(fitnessEmpat, totalFitnessTiga);
                    double probabilitasTiga2 = getProbabilitas(fitnessLima, totalFitnessTiga);                    
                    double probabilitasTiga3 = getProbabilitas(fitnessEnam, totalFitnessTiga);
                    
                    probKum[0] = getProbabilitasKumulatif(0, probabilitasTiga1);
                    probKum[1] = getProbabilitasKumulatif(probKum[0], probabilitasTiga2);
                    probKum[2] = getProbabilitasKumulatif(probKum[1], probabilitasTiga3);
                    break;                
            case 4:
                    //Kristal tujuh
                    KristalToArr.convert(tujuh.getKristal());
                    int makulTujuh = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervalTujuh = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangTujuh = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    double fitnessTujuh = getFitness(makulTujuh, intervalTujuh, ruangTujuh);
                    //Kristal delapan
                    KristalToArr.convert(delapan.getKristal());
                    int makuldelapan = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervaldelapan = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangdelapan = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    double fitnessdelapan = getFitness(makuldelapan, intervaldelapan, ruangdelapan);                    
                    //Kristal sembilan
                    KristalToArr.convert(sembilan.getKristal());
                    int makulsembilan = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervalsembilan = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangsembilan = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    double fitnesssembilan = getFitness(makulsembilan, intervalsembilan, ruangsembilan);            
                    //Kristal Sepuluh
                    KristalToArr.convert(sepuluh.getKristal());
                    int makulSepuluh = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervalSepuluh = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangSepuluh = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    double fitnessSepuluh = getFitness(makulSepuluh, intervalSepuluh, ruangSepuluh);                    
                    
                    double totalFitnessEmpat = fitnessTujuh + fitnessdelapan + fitnesssembilan + fitnessSepuluh;
                    double probabilitasEmpat1 = getProbabilitas(fitnessTujuh, totalFitnessEmpat);
                    double probabilitasEmpat2 = getProbabilitas(fitnessdelapan, totalFitnessEmpat);                    
                    double probabilitasEmpat3 = getProbabilitas(fitnesssembilan, totalFitnessEmpat);                    
                    double probabilitasEmpat4 = getProbabilitas(fitnessSepuluh, totalFitnessEmpat);
                    
                    probKum[0] = getProbabilitasKumulatif(0, probabilitasEmpat1);
                    probKum[1] = getProbabilitasKumulatif(probKum[0], probabilitasEmpat2);
                    probKum[2] = getProbabilitasKumulatif(probKum[1], probabilitasEmpat3);                    
                    probKum[3] = getProbabilitasKumulatif(probKum[2], probabilitasEmpat4);                    
                    break;
            case 5:
                    //Kristal sebelas
                    KristalToArr.convert(sebelas.getKristal());
                    int makulSebelas = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervalSebelas = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangSebelas = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    double fitnessSebelas = getFitness(makulSebelas, intervalSebelas, ruangSebelas);                    
                    //Kristal duaBelas
                    KristalToArr.convert(duabelas.getKristal());
                    int makulDuabelas = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervalDuabelas = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangDuabelas = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    double fitnessDuabelas = getFitness(makulDuabelas, intervalDuabelas, ruangDuabelas);                                       
                    //Kristal tigaBelas
                    KristalToArr.convert(tigabelas.getKristal());
                    int makulTigabelas = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervalTigabelas = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangTigabelas = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    double fitnessTigabelas = getFitness(makulTigabelas, intervalTigabelas, ruangTigabelas);
                    //Kristal empat belas
                    KristalToArr.convert(empatbelas.getKristal());
                    int makulEmpatbelas = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervalEmpatbelas = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangEmpatbelas = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    double fitnessEmpatbelas = getFitness(makulEmpatbelas, intervalEmpatbelas, ruangEmpatbelas);                    
                    //Kristal lima belas                    
                    KristalToArr.convert(limabelas.getKristal());
                    int makulLimabelas = KristalToArr.getValueGenDosen(KristalToArr.getArray());
                    int intervalLimabelas = KristalToArr.getValueGenInterval(KristalToArr.getArray());
                    int ruangLimabelas = KristalToArr.getValueGenRuangan(KristalToArr.getArray());
                    double fitnessLimabelas = getFitness(makulLimabelas, intervalLimabelas, ruangLimabelas);                                        

                    double totalFitnessLima = fitnessSebelas + fitnessDuabelas + fitnessTigabelas + fitnessEmpatbelas + fitnessLimabelas;
                    double probabilitasLima1 = getProbabilitas(fitnessSebelas, totalFitnessLima);
                    double probabilitasLima2 = getProbabilitas(fitnessDuabelas, totalFitnessLima);                    
                    double probabilitasLima3 = getProbabilitas(fitnessTigabelas, totalFitnessLima);                    
                    double probabilitasLima4 = getProbabilitas(fitnessEmpatbelas, totalFitnessLima);
                    double probabilitasLima5 = getProbabilitas(fitnessLimabelas, totalFitnessLima);
                    
                    probKum[0] = getProbabilitasKumulatif(0, probabilitasLima1);
                    probKum[1] = getProbabilitasKumulatif(probKum[0], probabilitasLima2);
                    probKum[2] = getProbabilitasKumulatif(probKum[1], probabilitasLima3);                    
                    probKum[3] = getProbabilitasKumulatif(probKum[2], probabilitasLima4);
                    probKum[4] = getProbabilitasKumulatif(probKum[3], probabilitasLima5);
                    setDataRouletteWheel(5);
                    sortingRouletteWheel(KristalToArr.getArray());//sekaligus seleksi
                    
                    for(int a=0; a<5; a++){
                        System.out.println(dataRouletteWheel[a]);
                    }
                    System.out.println("\nprobkum");
                    for(int a=0; a<5; a++){
                        System.out.println(probKum[a]);
                    }                    
                    setPopulasiBaru();
                    break;                
            default: System.out.println("Jumlah Kristal tidak bisa diproses");
        }
        
        /*System.out.println("data Kristal satu  = ");
        for(int a=0; a<4; a++){
            for(int b=0; b<6; b++){
                System.out.print(satu.getKristal()[a][b]);
            }
        }*/
        
        //konversi ke data Kristal tanpa jam (kolom paling kiri)
        //KristalToArr.convert();
        /*(System.out.println("hasil tampil array");
        for(int a=0; a<4; a++){
            for(int b=0; b<5; b++){
                System.out.print(x.getArray()[a][b]+" ");
            }
            System.out.println();
        }
        
        System.out.println("\ntampil value gen");
        System.out.println("gen dosen = "+x.getValueGenDosen(x.getArray())+"\n");
        System.out.println("gen interval = "+x.getValueGenInterval(x.getArray())+"\n");
        System.out.println("gen ruangan = "+x.getValueGenRuangan(x.getArray())+"\n");*/
    }    


}
