/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author DONY-SAMDHILA
 */
class Direktur extends Pegawai {
    private static final int gajiDir=100000;
    private static final int tunjangan=50000;
    
    @Override
    public int gaji(){
        return gajiDir;
    }
    public int tunjangan(){
        return tunjangan;
    }
}
