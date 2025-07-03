/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sewalapanganfutsal;

/**
 *
 * @author Danzeld
 */
public class ItemLapangan {
    private int id;
    private String nama;
    
    public ItemLapangan(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNama(){
        return nama;
    }
    
    @Override
    public String toString(){
        return nama;
    }
    
}
