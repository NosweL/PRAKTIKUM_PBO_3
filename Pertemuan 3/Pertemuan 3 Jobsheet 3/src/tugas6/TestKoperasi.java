/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author welson
 */
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        int angsuran, jmlPinjam;
        Scanner wel = new Scanner(System.in);
        
        Anggota donny = new Anggota("111333444", "Dony", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.println("===========================================");
        System.out.println("Masukkan Jumlah Pinjaman : ");
        jmlPinjam = wel.nextInt();
        System.out.println("\nMeminjam uang " + jmlPinjam);
        donny.pinjam(jmlPinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("Masukkan Angsuran : ");
        angsuran = wel.nextInt();
        System.out.println("\nMembayar Angsuran " + angsuran);
        donny.angsur(angsuran);
        System.out.println("===========================================");
        System.out.println("Masukkan Angsuran : ");
        angsuran = wel.nextInt();
        System.out.println("\nMembayar Angsuran " + angsuran);
        donny.angsur(angsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

    }

}
