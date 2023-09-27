import java.util.Scanner;

public class Scanning{
    
    //Data//
    static String Nama;
    static String Umur;
    static String Kelas;
    static String NIM;
    
    //Scanner
    static Scanner Scan = new Scanner(System.in);

    public static void NewInput(String Type ,String DisplayText) {
        System.out.print(DisplayText);
        if (Type == "Nama") {
            Nama = Scan.nextLine();
        }
          if (Type == "Umur") {
            Umur = Scan.nextLine();
        }
          if (Type == "Kelas") {
            Kelas = Scan.nextLine();
        }
          if (Type == "NIM") {
            NIM = Scan.nextLine();
            
        }
    }

    public static void main(String[] args) {
        //Input Data//
        NewInput("Nama", "\nSiapa nama anda?");
        NewInput("Umur", "Umur Berapa?");
        NewInput("Kelas", "Kelas Berapa?");
        NewInput("NIM", "NIM kamu?");

        System.out.println("\n--START SUMMARY--");
        System.out.println("Nama : Rafi Hidayat");
        System.out.println("Umur : " + Umur + " ( Lahir pada tahun : " + (2023 -  Integer.valueOf(Umur)) + " )");
        System.out.println("Kelas :" + Kelas);
        System.out.println("NIM : " + NIM);
        System.out.println("--END SUMMARY--");
    }
}