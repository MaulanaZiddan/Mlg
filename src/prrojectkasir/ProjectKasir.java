package prrojectkasir;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


/**
 *
 * @author Maulana Ziddan
 */
import java.util.Scanner;
public class ProjectKasir {
    public static void main(String[] args) {
            Scanner input=new Scanner (System.in);

    int pesanan,jumlah;
    double totalakhir,total=0;
    String PesanLagi,namaplg;
    DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

    formatRp.setCurrencySymbol("Rp. ");
    formatRp.setMonetaryDecimalSeparator(',');
    formatRp.setGroupingSeparator('.');

            kursIndonesia.setDecimalFormatSymbols(formatRp);
    
        System.out.println("\t     Selamat Datang di MyChick!"
                + "\n======================================================="
                +"\n=======================================================");
       
            System.out.println("\t\tSELAMAT DATANG!\n"
                    + "-------------------------------------------------"
                    + "\nSilahkan pilih paket menu yang ada di bawah ini :"
                    + "\n1. Nasi+Ayam Geprek\t\tRp. 10.000"
                    + "\n2. Nasi+Ayam Crispy\t\tRp. 9.000"
                    + "\n3. Nasi+Ayam Geprek+Es Teh / Teh Hangat\tRp. 15.000"
                    + "\n4. Nasi+Ayam Crispy+Es Teh / Teh Hangat\tRp. 14.000"
                    + "\n-------------------------------------------------");
            
            do{
            totalakhir=total;
            System.out.println("Masukkan Nama Pelanggan");
            namaplg=input.next();
            System.out.println("\nMasukkan nomer dari menu :");
            pesanan=input.nextInt();
                while (pesanan>4||pesanan<1){
                    System.out.println("Mohon masukkan angka sesuai Menu Paket yang tersedia!");
                    System.out.println("\nMasukkan nomer dari menu :");
                    pesanan=input.nextInt();
                }
            System.out.println("Berapa jumlah yang ingin dipesan?");
            jumlah=input.nextInt();
            
            String[] nama={"Nasi+Ayam Geprek","Nasi+Ayam Crispy","Nasi+Ayam Geprek+Es Teh / Teh Hangat","Nasi+Ayam Crispy+Es Teh / Teh Hangat"};
            int[] harga={10000,9000,15000,14000};
            
            switch (pesanan) {
                case 1:
                    System.out.println("Anda memesan "+nama[0]+" sebanyak "+jumlah+" porsi");
                    System.out.println("Harga per porsi = Rp. "+harga[0]+",-");
                    total=totalakhir+(harga[0]*jumlah);
                    System.out.println("Total = Rp. "+(int)total+",-");
                    break;
                case 2:
                    System.out.println("Anda memesan "+nama[1]+" sebanyak "+jumlah+" porsi");
                    System.out.println("Harga per porsi = Rp."+harga[1]+",-");
                    total=totalakhir+(harga[1]*jumlah);
                    System.out.println("Total = Rp."+(int)total+",-");
                    break;
                case 3:
                    System.out.println("Anda memesan "+nama[2]+" sebanyak "+jumlah+" porsi");
                    System.out.println("Harga per porsi = Rp."+harga[2]+",-");
                    total=totalakhir+(harga[2]*jumlah);
                    System.out.println("Total = Rp."+(int)total+",-");
                    break;
                case 4:
                    System.out.println("Anda memesan "+nama[3]+" sebanyak "+jumlah+" porsi");
                    System.out.println("Harga per porsi = Rp."+harga[3]+",-");
                    total=totalakhir+(harga[3]*jumlah);
                    System.out.println("Total = Rp."+(int)total+",-");
                    break;
            }
            
            System.out.println("\nApakah anda ingin memesan lagi? \"y\" atau \"n\"");
            PesanLagi=input.next();
            }while (PesanLagi.equalsIgnoreCase("y"));
                if (PesanLagi.equalsIgnoreCase("n")){
                            System.out.println("\n=======================================");
                            System.out.printf("Total Yang Harus Dibayar Pelanggan: %s %n", kursIndonesia.format(total));
                            System.out.println("=======================================");
                        
                }
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Terimakasih Sudah Memesan, Silahkan Menunggu, Pesanan Akan Segera Diantarkan");
            System.out.println("----------------------------------------------------------------------------");
          
      
    }
    
}
