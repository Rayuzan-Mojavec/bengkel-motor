package bengkelmotor;

public class Payment extends Price {

    private double hargaPerbaikan;
    private double hargaGanti;
    private double biaya;
    String sistem_a;
    String sistem_b;


    @Override
    double hargaPerbaikan (int hp) {
        switch (hp) {
            case 1:
                // perbaikan mesin
                hargaPerbaikan = 20000;
                break;
            case 2:
                // perbaikan kapas rem
                hargaPerbaikan = 12000;
                break;
            case 3:
                // perbaikan setir
                hargaPerbaikan = 16000;
                break;
            case 4:
                // perbaikan busi
                hargaPerbaikan = 11000;
                break;
            default:
                System.out.println("Incorrect input. System terminated");
                System.exit(0);
                break;
        }
        return hargaPerbaikan;
    }

    @Override
    double hargaGanti(int hg) {
        switch (hg) {
            case 1 :
                hargaGanti = 15000;
                break;
            case 2 :
                hargaGanti = 11000;
                break;
            case 3 :
                hargaGanti = 11000;
                break;
            case 4 :
                hargaGanti = 16000;
                break;
            default : {
                System.out.println("Incorrect input. System terminated");
                System.exit(0);
            }
        }
        return hargaGanti;
    }

    @Override
    double biaya(int by) {

        if (by == 1) { // biaya penggantian
            biaya = 13000;
            
        } else if (by == 2) { // biaya perbaikan
            biaya = 20000;
        }

        return biaya;
    }

    String sistem_a(int sys_a) {
        switch (sys_a) {
            case 1:
                sistem_a = "Penggantian oli dipilih";
                break;
            case 2:
                sistem_a = "Penggantian karbu dipilih";
                break;
            case 3:
                sistem_a = "Penggantian rantai dipilih";
                break;
            case 4:
                sistem_a = "Penggantian ban dipilih";
                break;
            default:
                break;
        }
        return sistem_a;
    }

    String sistem_b(int sys_b) {

        switch (sys_b) {
            case 1 : 
                sistem_b = "Perbaikan mesin dipilih";
                break;
            case 2 : 
                sistem_b = "Perbaikan rem dipilih";
                break;
            case 3 : 
                sistem_b = "Perbaikan setir dipilih";
                break;
            case 4 : 
                sistem_b = "Perbaikan busi dipilih";
                break;
            default : {
            }
        }

        return sistem_b;
    }

    void detail(String nama) {
        System.out.println("Nama : " + nama);
    }
    
    void detail(double kilometer) {
        System.out.println("Kilometer yang telah ditempuh motor : " + kilometer);
    }

    double total1(int tl1) {
        return hargaGanti + biaya;
    }

    double total2(int tl2) {
        return hargaPerbaikan + biaya;
    }
}
