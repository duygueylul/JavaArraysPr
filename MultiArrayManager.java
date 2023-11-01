package JavaArrays;
import java.text.DecimalFormat;
import java.util.Random;



public class MultiArrayManager {
	
	private int vizeNotu,finalNotu;
	// Vize notunun %40 ile Final notunun %60'ı alınarak hesaplanacak.
    private double notOrt; 
    private String hNotu,ayrac = "-------------";

    // Random Oluşacak Notlar İçin Tanımlama 
    private Random rand = new Random();

    //Dizi Tanımlaması 
  //  8 elemanı bulunan tek boyutlu bir dizi.
    private String ogrIsim [] = {"Duygu","Eylül","Albertine","Feyza","Elif","Sevgül","Özcan","Nas"};
  // Çok boyutlu dizimizin 8 Satır 5 Sütundan oluşmasını istiyoruz.
    private Object ogrBil [][] = new Object [ogrIsim.length][5]; 


    // Metot Tanımlamaları
    private String  getHarfNotu(double notOrt){
        if(notOrt >= 88 && notOrt <= 100)
            return "AA";
        else if(notOrt >= 77 && notOrt < 88)
            return "BA";
        else if(notOrt >= 66 && notOrt< 77)
            return "BB";
        else if(notOrt >= 55 && notOrt < 66)
            return "CB";
        else if(notOrt >= 44 && notOrt < 55)
            return "CC";
        else if(notOrt >= 33 && notOrt < 44)
            return "DC";
        else
            return "FF";
    }
    
    
    protected  void createArray(){
        for(int i=0; i < ogrIsim.length; i++){
            vizeNotu = rand.nextInt(100)+1;
            finalNotu = rand.nextInt(100)+1;
            notOrt = (vizeNotu*0.4)+(finalNotu*0.6);
            ogrBil[i][0] =ogrIsim[i] ;
            ogrBil[i][1] = vizeNotu;
            ogrBil[i][2] = finalNotu;
            ogrBil[i][3] = new DecimalFormat("##.##").format(notOrt);
            ogrBil[i][4] = getHarfNotu(notOrt);
        }
        }
        
        protected  void getArray(){
            if(ogrBil[0][0] != null){
                System.out.println(ayrac+"\n< Öğrenci Not Bilgileri >\n"+ayrac);
                System.out.print("Öğrenci İsmi\t\tVize Notu\t\tFinal Notu\t\tNot Ortalaması\t\tHarf Notu\n"+ayrac+"\n");
                for(int i = 0 ; i < ogrIsim.length ; i++)
                    System.out.println(ogrBil[i][0]+"\t\t\t\t"+ogrBil[i][1]+"\t\t\t\t"+ogrBil[i][2]+"\t\t\t\t"+ogrBil[i][3]+"\t\t\t\t"+ogrBil[i][4]);
                System.out.println(ayrac);
            }
            else
                System.out.println(ayrac+"\n-> Lütfen öncelikle diziyi oluşturun.\n"+ayrac);
	
	
    }
}
