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
class Staf extends Pegawai {
    private static final int gajiStaf=10000;
    private static final int bonusStaf=50000;
    
    @Override
    public int gaji(){
        return gajiStaf;
    }
    public int Bonus(){
        return bonusStaf;
    }
}
