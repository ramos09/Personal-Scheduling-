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
public class Data2 {  
    public Data2() {
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
    
    Kristal [] kristal;
    public void buatKristal(){        
         kristal= new Kristal[intKristal];
        for(int a=0; a<intKristal; a++){
            kristal[a] = new Kristal(makul, dosen, ruang);
            reInitData();
        }
    }    
    
    public void tampilKristalAwal(){
        for(int a=0; a<intKristal; a++){            
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

    //buat tabel
    
    String [] namaKolom={"Jam || Hari","Senin", "Selasa", "Rabu", "Kamis", "Jumat"};      
    JTable [] Jtables;
    JFrame [] jFrame;
    
    public void buatTabel(){
        Jtables = new JTable[intKristal];
        jFrame = new JFrame[intKristal];
        for(int a=0; a<intKristal; a++){
            Jtables[a]=new JTable(new KristalModTab(kristal[a].getKristal(), namaKolom));
            jFrame[a] = new JFrame();
            createFormTabel(jFrame[a], Jtables[a]);
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
    
    public void sortingRouletteWheel(){
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
                    Kristal tempKristal = kristal[a];
                    kristal[a] = kristal[b];
                    kristal[b] = tempKristal;
                }
            }
        }
    }    
    
    double [] probKum;
    double [] fitness;
    double [] probabilitas;

    double crossOverProbability = 0.25;
    double [] dataCrossOverProbability;
    
    public void setRandomCrossOverProbability(){
        Random r=new Random();
        dataCrossOverProbability = new double[intKristal];        
        for(int a=0; a<intKristal; a++){
            dataCrossOverProbability[a] = r.nextDouble();
        }
    }
    
    public boolean cekKeberadaan(String data){
        //jika true maka data ditemukan || sudah ada
        //jika false maka data tidak ditemukan || belum ada        
        String olah = data.substring(0, 2);
        boolean hasil = true;
        int col = matrixHasil[0].length;
        for(int a=0; a<matrixHasil.length; a++){
            for(int b=0; b<col; b++){
                String dataMatrixHasil = matrixHasil[a][b].substring(0, 2);
                if(dataMatrixHasil.equals(olah)){
                    hasil = true;
                }
                else{
                    hasil = false;
                }
            }
        }
        return hasil;
    }
    
        String [][] matrixHasil;
    public Kristal doCrossOver(Kristal kristalA, Kristal kristalB){
        Kristal hasil = new Kristal(makul, dosen, ruang);
        KristalToArr kta1 = new KristalToArr();
        KristalToArr kta2 = new KristalToArr();
        kta1.convert(kristalA.getKristal());
        kta2.convert(kristalB.getKristal());
        String [][] dataKTA1 = kta1.getArray();
        String [][] dataKTA2 = kta2.getArray();
        int col = dataKTA1[0].length;
        matrixHasil = new String[dataKTA1.length][col]; 
        //System.out.println("Height = "+dataKTA1.length);
        //System.out.println("Width = "+col);
        
        for(int a=0; a<dataKTA1.length; a++){
            for(int b=0; b<col; b++){
                String getDataKTA1 = dataKTA1[a][b];
                String getDataKTA2 = dataKTA2[a][b];
                
                if((getDataKTA1.equals("-")) && (!getDataKTA2.equals("-")) && (cekKeberadaan(getDataKTA2) == false)){
                    matrixHasil[a][b] = getDataKTA2;
                }else if((!getDataKTA1.equals("-")) && (getDataKTA2.equals("-")) && (cekKeberadaan(getDataKTA1)) == false){
                    matrixHasil[a][b] = getDataKTA1;
                }else{
                    matrixHasil[a][b] = "-";
                }
            }
        }             
        
        System.out.println("data kristal baru");
        for(int a=0; a<matrixHasil.length; a++){
            for(int b=0; b<matrixHasil[0].length; b++){
                System.out.println(matrixHasil[a][b]);
            }
            System.out.println();
        }
        
        
        hasil = new Kristal(matrixHasil);
        return hasil;
    }
        
    public void crossOver(){
        setRandomCrossOverProbability();
        System.out.println("Data Crossover probability");
        for(int a=0; a<dataCrossOverProbability.length; a++){
            System.out.println(dataCrossOverProbability[a]);
        }
                
        for(int a=0; a<intKristal; a++){
            if(dataCrossOverProbability[a]<crossOverProbability){
                if(a>=(intKristal-1)){//a==(intKristal-1)
                    kristal[a] = doCrossOver(kristal[a], kristal[0]);
                }else{
                    kristal[a] = doCrossOver(kristal[a], kristal[a+1]);                    
                }                
            }
        }
    }

    private double probabilitasMutasi = 0.2;
    
    public int getPosisi(){        
        int hasil = 0;
        //Random r=new Random();
        Double pengasah;
            int data = 0 + (int)(Math.random() * ((60 - 0) + 1));// (0 to 60)
            String temp = String.valueOf(data);
            Double looper = Double.valueOf(temp);
            pengasah = Math.random();//(Math.random() * ((0.2 - 0)));// (5 to 10)
            Double penyebut = (looper/panjangTotalGen);
            if(pengasah<penyebut){
              hasil = data;
            }else{
              hasil = 0;
          }        
        return hasil;
    }
    
    int panjangTotalGen = 0;
    
    public Boolean cekPosisi(int angka){
        Boolean hasil = false;
        for(int a=0; a<posisi.length; a++){
            if(posisi[a] == angka){
                hasil = true;//data sudah ada
            }else{
                hasil = false;//data belum ada
            }
        }
        return hasil;
    }
    
    int [] posisi;
    private void mutasi() {
        panjangTotalGen = 20 * intKristal;
        System.out.println("panjang total gen = "+panjangTotalGen);
        int jumlahGenMutasi = (int) (probabilitasMutasi * panjangTotalGen);
        System.out.println("Jumlah gen mutasi = "+jumlahGenMutasi);
        
        posisi = new int[jumlahGenMutasi];
        
        for(int a=0; a<posisi.length; a++){
            int dataPosisi = getPosisi();
            if(cekPosisi(dataPosisi)==false){
                posisi[a] = dataPosisi;
            }else{
                while(cekPosisi(dataPosisi)==true){
                    dataPosisi = getPosisi();   
                }
                posisi[a] = dataPosisi;
            }
                
        }
        
        for(int a=0; a<posisi.length; a++){
            System.out.println("posisi Mutasi = "+posisi[a]);
        }
        
        Kristal temp = kristal[0];
        KristalToArr kta=new KristalToArr();
        kta.convert(temp.getKristal());
        int Height = kta.getArray().length;
        int Width = kta.getArray()[0].length;
        
        KristalToArr [] ktas = new KristalToArr[intKristal];
        KristalToArr array = new KristalToArr();
        int looper = 0; 
        int looperKristal = 0;
        for(int a=0; a<jumlahGenMutasi; a++){
            for(int b=0; b<intKristal; b++){
                array.convert(kristal[b].getKristal());
                for(int c=0; c<Height; c++){
                    for(int d=0; d<Width; d++){
                        looper+=1;                        
                        if(looper==posisi[a]){
                            /*System.out.println("Tukar data dalam mutasi");
                            System.out.println("Looper = "+looper);
                            System.out.println("Posisi = "+posisi[a]);*/
                            String temporary=array.getArray()[c][d];
                            if(d>=(Width-1)){
                                /*System.out.println("dalam d = width");
                                System.out.println("c = "+c);
                                System.out.println("d = "+d);*/
                                array.getArray()[c][d] = array.getArray()[c][0];
                                array.getArray()[c][0] = temporary;                                
                            }else{
                                /*System.out.println("luar d = width");
                                System.out.println("c = "+c);
                                System.out.println("d = "+d);*/
                                array.getArray()[c][d] = array.getArray()[c][d+1];
                                array.getArray()[c][d+1] = temporary;                                
                            }
                            
                        }
                    }
                }
            }                        
            //System.out.println("looper total setelah int= "+looper);
            looper = 0;
        }
        looper = 0;
        //System.out.println("looper total = "+looper);
    }    
    
    public void optimasi(){
        String optimasiInfo = "";
        KristalToArr KristalToArr=new KristalToArr();                        
        probabilitas = new double[intKristal];
        probKum = new double[intKristal];
        fitness = new double[intKristal];                
        
        double totalFitness = 0;
        for(int a=0; a<intKristal; a++){
            KristalToArr.convert(kristal[a].getKristal());
            int makul = KristalToArr.getValueGenDosen(KristalToArr.getArray());
            int interval = KristalToArr.getValueGenInterval(KristalToArr.getArray());
            int ruang = KristalToArr.getValueGenRuangan(KristalToArr.getArray());                    
            fitness[a] = getFitness(makul, interval, ruang);
            totalFitness+=fitness[a];
        }
                
        for(int a=0; a<intKristal; a++){
            probabilitas[a] = getProbabilitas(fitness[a], totalFitness);
            if(a==0){
                probKum[a] = getProbabilitasKumulatif(0, probabilitas[a]);    
            }else if(a>0){
                probKum[a] = getProbabilitas(probabilitas[a-1], probabilitas[a]);
            }
            
        }
        
     System.out.println("Kristal Awal");
     optimasiInfo+="Kristal Awal\n";
        for(int a=0; a<intKristal; a++){            
            System.out.println("Kristal ke "+a);            
            optimasiInfo+="Kristal ke "+a+"\n";
            int col = kristal[a].getKristal()[0].length;
            for(int b=0; b<kristal[a].getKristal().length; b++){
                for(int c=0; c<col; c++){
                    System.out.print(kristal[a].getKristal()[b][c]);
                    optimasiInfo+=kristal[a].getKristal()[b][c];
                }
                System.out.println();
                optimasiInfo+="\n";
            }            
        }
        
        
        setDataRouletteWheel(intKristal);        
        sortingRouletteWheel();//sekaligus seleksi data Kristal (ganti posisi)
        
        crossOver();
                
        
        System.out.println("Kristal Setelah Proses Cross Over");
        optimasiInfo+="Kristal Setelah Proses Cross Over\n";
        for(int a=0; a<intKristal; a++){
            KristalToArr.convert(kristal[a].getKristal());
            System.out.println("Kristal ke "+a);
            optimasiInfo+="Kristal ke "+a+"\n";
            int col = KristalToArr.getArray()[0].length;
            for(int b=0; b<KristalToArr.getArray().length; b++){
                for(int c=0; c<col; c++){
                    System.out.print(KristalToArr.getArray()[b][c]);
                    optimasiInfo+=KristalToArr.getArray()[b][c];
                }
                System.out.println();
                optimasiInfo+="\n";
            }            
        } 
        System.out.println("======================");        
        System.out.println("Memasuki Proses Mutasi");
        System.out.println("======================");
        optimasiInfo+="======================\nMemasuki Proses Mutasi\n======================\n";
        mutasi();
        
        System.out.println("Setelah Proses Mutasi");
        optimasiInfo+="Setelah Proses Mutasi\n";
        for(int a=0; a<intKristal; a++){
            KristalToArr.convert(kristal[a].getKristal());
            System.out.println("Kristal ke "+a);
            optimasiInfo+="Kristal ke "+a+"\n";
            int col = KristalToArr.getArray()[0].length;
            for(int b=0; b<KristalToArr.getArray().length; b++){
                for(int c=0; c<col; c++){
                    System.out.print(KristalToArr.getArray()[b][c]);
                    optimasiInfo+=KristalToArr.getArray()[b][c];
                }
                System.out.println();
                optimasiInfo+="\n";
            }            
        }
//        OptimasiInfo info = new OptimasiInfo();                
//        info.setData(optimasiInfo);
//        info.setVisible(true);
    }
    
    public void traceData(){
        
        String tracer="";
        System.out.println("\n==================================");
        System.out.println("Trace Data");
        System.out.println("==================================\n");
        tracer+="\n==================================\nTrace Data\n==================================\n";
                
        for(int a=0; a<intKristal; a++){
            System.out.println("Fitness Kristal ke "+a+" = "+fitness[a]);
            tracer+="Fitness Kristal ke "+a+" = "+fitness[a]+"\n";
        }        
        for(int a=0; a<intKristal; a++){
            System.out.println("Probabilitas Kristal ke "+a+" ="+probabilitas[a]);
            tracer+="Probabilitas Kristal ke "+a+" ="+probabilitas[a]+"\n";
        }

        for(int a=0; a<intKristal; a++){
            System.out.println("probabilitas Kumulatif Kristal ke "+a+" = "+probKum[a]);
            tracer+="probabilitas Kumulatif Kristal ke "+a+" = "+probKum[a]+"\n";
        }
        //tampil roulette wheel
        System.out.println("Data roulette Wheel");
        for(int a=0; a<intKristal; a++){
            System.out.println("Random ke"+a+" = "+dataRouletteWheel[a]);
            tracer+="Random ke"+a+" = "+dataRouletteWheel[a]+"\n";
        }
        JOptionPane.showMessageDialog(null, tracer,"Tracing Program",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
