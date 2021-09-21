/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author welso
 */
public class Anggota {

    public String noKtp, nama;
    public int limitPinjam, jumlahPinjam;

    public Anggota(String noKtp, String nama, int limitPinjam) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjam;
    }

    public int pinjam(int jumlahPinjam) {
        if (jumlahPinjam > limitPinjam) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
            return jumlahPinjam;
        } else {
            return this.jumlahPinjam += jumlahPinjam;
        }
    }

    public int getJumlahPinjaman() {
        return jumlahPinjam;
    }

    public int angsur(int angsuran) {
        return jumlahPinjam -= angsuran;
    }
}
