package loopfor;
import java.util.Scanner;
public class kasir {
    public static void main(String[] args){  
         Scanner sc = new Scanner(System.in);
      int pilih = 0,jumlah;
      double grandtotal = 0,total = 0;
      System.out.println("Aplikasi kasir");
            System.out.println("====================");
            System.out.println("1.Tas\n2.Sandal\n3.Sepatu");
            System.out.println("4.Selesai");
            System.out.println("");
              System.out.println("====================");
      do{
          System.out.print("PILIH = ");
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("Tas [100000]");
                    System.out.print("Jumlah = ");
                    jumlah=sc.nextInt();
                    total=100000*jumlah;
                    System.out.print("TOTAL HARGA = "+total);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Sandal [50000]");
                    System.out.print("Jumlah = ");
                    jumlah=sc.nextInt();
                    total=50000*jumlah;
                    System.out.print("TOTAL HARGA = "+total);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Sepatu [200000]");
                    System.out.print("Jumlah = ");
                    jumlah=sc.nextInt();
                    total=200000*jumlah;
                    System.out.print("TOTAL HARGA = "+total);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("TOTAL AKHIR BELANJA = "+grandtotal);
                    System.out.println("======================");
                    System.out.println("TERIMA KASIH SUDAH BERBELANJA");
                  break;
            }
            grandtotal += total;
            
}while (pilih!=4);
       
       
        
        
        
    }  
   
                    }
    

