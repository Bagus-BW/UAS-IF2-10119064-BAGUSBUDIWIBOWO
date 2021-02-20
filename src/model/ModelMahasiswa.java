/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagus_24
 */
public class ModelMahasiswa {
    public String nim,nama;
    
    public ModelMahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    public void getNim() {
        System.out.println("Nim Mahasiswa : " + this.nim);
    }

    public void getNama() {
        System.out.println("Nama Mahasiswa : " + this.nama);
    }
    
    
}
