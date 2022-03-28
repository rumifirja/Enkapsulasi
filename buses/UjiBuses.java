/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buses;
public class UjiBuses {

    public static void main(String[] args) {
        // TODO code application logic here
        Buses busMini = new Buses(10);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();

        busMini.pluspenumpang(3);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();

        busMini.getAverage();
        busMini.cetak();

    }

}
