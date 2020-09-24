package com.guepunya.personalscheduling.core;

/**
 *
 * @author Hello Willy Sianturi!
 */
public class KristalToArr {
    
    
    public KristalToArr() {          
    }

    String [][] hasil = new String[4][5];
    
    // konversi ke data kromosom tanpa jam (kolom paling kiri)
    public void convert(Object[][] data){
        for(int a=0; a<4; a++){
            for(int b=0; b<5; b++){
                hasil[a][b] = (String) data[a][b+1];
            }
        }
    }
    
    public String [][] getArray(){
        return hasil;
    }
    
    String tempValue1, tempValue2, tempValue3, tempValue4;
    
    public void resetTempValue(){
        tempValue1 = "";
        tempValue2 = "";
        tempValue3 = "";
        tempValue4 = "";
    }
    
    public String[][] transposeMatrix(String[][] dataTranspose){
        String[][] hasil = new String[5][4];
        //copy data to hasil
        for(int a=0; a<4; a++){
            for(int b=0; b<5; b++){
                hasil[b][a] = dataTranspose[a][b];
            }
        }
        return hasil;
    }    
    
    String [][] genDosen = new String[4][5];
    String [][] genInterval = new String[4][5];
    String [][] genRuang = new String[4][5];
    
    
    public int  getValueGenDosen(String[][] data){
        
        int hasil = 0;
        int [] hari = new int[5];

        genDosen = transposeMatrix(data);
        
        
        for(int a=0; a<5; a++){
            tempValue1 = String.valueOf(genDosen[a][0].charAt(0));
            tempValue2 = String.valueOf(genDosen[a][1].charAt(0));
            tempValue3 = String.valueOf(genDosen[a][2].charAt(0));
            tempValue4 = String.valueOf(genDosen[a][3].charAt(0));
            
            //System.out.println("hari ke"+a+" ==>1 = "+tempValue1+" 2 = "+tempValue2+" 3 = "+tempValue3+"4 ="+tempValue4);
            
            //set value 9 ==> jika digunakan min 1 dalam sehari
            if((!tempValue1.equals("-")) && (tempValue2.equals("-")) && (tempValue3.equals("-")) && (tempValue4.equals("-"))){
                hari[a] = 9;
            }else if((tempValue1.equals("-")) && (!tempValue2.equals("-")) && (tempValue3.equals("-")) && (tempValue4.equals("-"))){
                hari[a] = 9;            
            }else if((tempValue1.equals("-")) && (tempValue2.equals("-")) && (!tempValue3.equals("-")) && (tempValue4.equals("-"))){
                hari[a] = 9;            
            }else if((tempValue1.equals("-")) && (tempValue2.equals("-")) && (tempValue3.equals("-")) && (!tempValue4.equals("-"))){
                hari[a] = 9;            
            }
            
            //set value 7 ==> jika ada mataKuliah namun tanpa selisih
            else if((!tempValue1.equals("-")) && (!tempValue2.equals("-")) && (tempValue3.equals("-")) && (tempValue4.equals("-"))){
                hari[a] = 7;
            }else if((tempValue1.equals("-")) && (!tempValue2.equals("-")) && (!tempValue3.equals("-")) && (tempValue4.equals("-"))){
                hari[a] = 7;
            }else if((tempValue1.equals("-")) && (tempValue2.equals("-")) && (!tempValue3.equals("-")) && (!tempValue4.equals("-"))){
                hari[a] = 7;
            }
            //set value 5 ==> jika tidak digunakan sama sekali atau selai 9 dan 7
            else{
                hari[a] = 5;
            }                        
        }
        
        /*System.out.println("value gen dosen per hari");
        for(int a=0; a<hari.length; a++){
            System.out.println("hari "+hari[a]);
        }*/
        //sigma all
        for(int a=0; a<hari.length; a++){
            hasil+=hari[a];
        }
        
        return hasil;
    }
    
    public int  getValueGenInterval(String[][] data){
        int hasil = 0;
        int [] hari = new int[5];
        
        genInterval = transposeMatrix(data);        
        
        for(int a=0; a<5; a++){
            tempValue1 = String.valueOf(genInterval[a][0].charAt(0));
            tempValue2 = String.valueOf(genInterval[a][1].charAt(0));
            tempValue3 = String.valueOf(genInterval[a][2].charAt(0));
            tempValue4 = String.valueOf(genInterval[a][3].charAt(0));

            //System.out.println("hari ke"+a+" ==>1 = "+tempValue1+" 2 = "+tempValue2+" 3 = "+tempValue3+"4 ="+tempValue4);            
            
            //set value 9 ==> jika interval selisih satu dalam 1 hari
            if((tempValue1.equals("-")) && (!tempValue2.equals("-")) && (tempValue3.equals("-")) && (!tempValue4.equals("-"))){
                hari[a] = 9;
            }else if((!tempValue1.equals("-")) && (tempValue2.equals("-")) && (!tempValue3.equals("-")) && (tempValue4.equals("-"))){
                hari[a] = 9;            
            }
            //set value 7 ==> jika 1 hari hanya terisi satu mata kuliah
            else if((!tempValue1.equals("-")) && (tempValue2.equals("-")) && (tempValue3.equals("-")) && (tempValue4.equals("-"))){
                hari[a] = 7;
            }else if((tempValue1.equals("-")) && (!tempValue2.equals("-")) && (tempValue3.equals("-")) && (tempValue4.equals("-"))){
                hari[a] = 7;            
            }else if((tempValue1.equals("-")) && (tempValue2.equals("-")) && (!tempValue3.equals("-")) && (tempValue4.equals("-"))){
                hari[a] = 7;            
            }else if((tempValue1.equals("-")) && (tempValue2.equals("-")) && (tempValue3.equals("-")) && (!tempValue4.equals("-"))){
                hari[a] = 7;            
            }
            //set value 6
            else if(!(tempValue1.equals("-")) && (tempValue2.equals("-")) && (tempValue3.equals("-")) && (!tempValue4.equals("-"))){
                hari[a] = 6;
            }
            //set value 5 ==> jika tidak digunakan sama sekali atau crash atau selain yang disebut diatas
            else{
                hari[a] = 5;
            }                        
        }

        /*System.out.println("value gen interval per hari");
        for(int a=0; a<hari.length; a++){
            System.out.println("hari "+hari[a]);
        }*/
        
        //sigma all
        for(int a=0; a<hari.length; a++){
            hasil+=hari[a];
        }
        
        return hasil;
    }    
    
    public int  getValueGenRuangan(String[][] data){
        int hasil = 0;
        int [] hari = new int[5];

        genRuang = transposeMatrix(data);       
        
        for(int a=0; a<5; a++){
            tempValue1 = String.valueOf(genRuang[a][0].charAt(0));
            tempValue2 = String.valueOf(genRuang[a][1].charAt(0));
            tempValue3 = String.valueOf(genRuang[a][2].charAt(0));
            tempValue4 = String.valueOf(genRuang[a][3].charAt(0));
            
            //System.out.println("hari ke"+a+" ==>1 = "+tempValue1+" 2 = "+tempValue2+" 3 = "+tempValue3+"4 ="+tempValue4);
            
            
            //set value 9 ==> jika digunakan 2 kali dengan selisih 1
            if((tempValue1.equals("-")) && (!tempValue2.equals("-")) && (tempValue3.equals("-")) && (!tempValue4.equals("-"))){
                hari[a] = 9;
            }else if((tempValue1.equals("-")) && (!tempValue2.equals("-")) && (tempValue3.equals("-")) && (!tempValue4.equals("-"))){
                hari[a] = 9;            
            }
            //set value 5
            else if((!tempValue1.equals("-")) && (tempValue2.equals("-")) && (tempValue3.equals("-")) && (tempValue4.equals("-"))){
                hari[a] = 5;
            }else if((tempValue1.equals("-")) && (!tempValue2.equals("-")) && (tempValue3.equals("-")) && (tempValue4.equals("-"))){
                hari[a] = 5;
            }else if((tempValue1.equals("-")) && (tempValue2.equals("-")) && (!tempValue3.equals("-")) && (tempValue4.equals("-"))){
                hari[a] = 5;
            }else if((tempValue1.equals("-")) && (tempValue2.equals("-")) && (tempValue3.equals("-")) && (!tempValue4.equals("-"))){
                hari[a] = 5;
            }
            //set value 3 ==> selain yang disebutkan diatas
            else{
                hari[a] = 5;
            }                        
        }
        
        
        /*System.out.println("value gen ruangan per hari");
        for(int a=0; a<hari.length; a++){
            System.out.println("hari "+hari[a]);
        }*/
        
        //sigma all
        for(int a=0; a<hari.length; a++){
            hasil+=hari[a];
        }
        
        return hasil;
    } 
    
}
