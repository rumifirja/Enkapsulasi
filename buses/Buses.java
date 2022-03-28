package buses;
public class Buses {

    private double penumpang, maxpenumpang, counter, penumpangBaru;

    // konstruktor
    public Buses(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    //method mutator 
    public void pluspenumpang(int penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxpenumpang) {
            System.out.println("Overload penumpang");
        } else {
            this.penumpang = temp;
        }

    }

    public void getPassword(int password) {
        if (password == 90) {
            System.out.println("password benar");
        } else {
            System.out.println("pass salah");
        }
    }
    
    public void getAverage(){
    double average = penumpangBaru - penumpang;
        System.out.println("rata-rata berat ="+average);
    }

    public void cetak() {
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("penumpang seharusnya adalah =" + maxpenumpang);
    }

}
