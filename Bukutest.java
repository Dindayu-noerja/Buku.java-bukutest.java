import java.util.Scanner;

public class Bukutest{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inputkan judul Buku :");
        String judul = in.nextLine();
        System.out.println("Inputkan Pengarang Buku: ");
        String pengarang = in.nextLine();
        System.out.println("Inputkan ID Buku: ");
        String id = in.nextLine();
        System.out.println("Inputkan tahunTerbit Buku: ");
        String tahunTerbit = in.nextLine();
        Buku Ucup = new Buku(judul,id,pengarang,tahunTerbit);
        System.out.println("Ucup Membeli Buku : ");
         System.out.println("Judul = "+Ucup.Judul);
        System.out.println("Id = "+Ucup.id);
        System.out.println("Pengarang = "+Ucup.Pengarang);
        System.out.println("TAhun Terbit = "+Ucup.TahunTerbit);

        //object
        Buku Dindayu = new Buku("pecinta hati", 1234, "joko anwar", 2008);
        System.out.println("Dindayu Membeli Buku : ");
        System.out.println("Judul = "+Dindayu.Judul);
        System.out.println("Id = "+Dindayu.id);
        System.out.println("Pengarang = "+Dindayu.Pengarang);
        System.out.println("TAhun Terbit = "+Dindayu.TahunTerbit);

        Buku Yusuf = new Buku("pejaga hati", 5678, "anfika noer", 2021);
        System.out.println("Yusuf Membeli Buku : ");
        System.out.println("Judul = "+Yusuf.Judul);
        System.out.println("Id = "+Yusuf.id);
        System.out.println("Pengarang = "+Yusuf.Pengarang);
        System.out.println("TAhun Terbit = "+Yusuf.TahunTerbit);
        Buku Danis = new Buku("amalan ibadah", 2345, "rafi bintang", 2009);
        System.out.println("Danis Membeli Buku : ");
        System.out.println("Judul = "+Danis.Judul);
        System.out.println("Id = "+Danis.id);
        System.out.println("Pengarang = "+Danis.Pengarang);
        System.out.println("TAhun Terbit = "+Danis.TahunTerbit);
        Buku Aura = new Buku("cinta monyet", 7865, "budi rafi", 2022);
        System.out.println("Aura Membeli Buku : ");
        System.out.println("Judul = "+Aura.Judul);
        System.out.println("Id = "+Aura.id);
        System.out.println("Pengarang = "+Aura.Pengarang);
        System.out.println("TAhun Terbit = "+Aura.TahunTerbit);
        Buku Dinda = new Buku("pecinta dia", 23108, "joko anwar", 2013);
        System.out.println("Dinda Membeli Buku : ");
        System.out.println("Judul = "+Dinda.Judul);
        System.out.println("Id = "+Dinda.id);
        System.out.println("Pengarang = "+Dinda.Pengarang);
        System.out.println("TAhun Terbit = "+Dinda.TahunTerbit);

    }
}