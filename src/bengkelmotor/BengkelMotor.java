package bengkelmotor;

import java.util.Scanner;

public class BengkelMotor extends Payment {

    public static void main(String[] args) {
        Scanner pembayaran = new Scanner(System.in);

        Selection shop = new Repair();

        Maintenance brand = new Maintenance(shop);

        try {

            System.out.println("Selamat datang di bengkel motor.\n");
            System.out.println("Nama Customer : ");
            String nama = pembayaran.nextLine();
            System.out.println("Kilometer yang telah ditempuh motor : ");
            double kilometer = pembayaran.nextDouble();

            System.out.println("\n");
            System.out.println("Pilih salah satu: ");
            System.out.println("[1] Maintenance");
            System.out.println("[2] Repair");
            System.out.println("===================");

            int aksi = pembayaran.nextInt();

            switch (aksi) {
                case 1: {
                    brand.pemeliharaan();
                    System.out.println("Ingin melakukan apa?");
                    System.out.println("[1] Ganti oli");
                    System.out.println("[2] Ganti karbu");
                    System.out.println("[3] Ganti rantai");
                    System.out.println("[4] Ganti ban");
                    System.out.println("===================");
                    int tl1 = pembayaran.nextInt();

                    Payment pm = new Payment();

                    System.out.println("\n");

                    pm.detail(nama);
                    pm.detail(kilometer);
                    double by = pm.biaya(aksi);
                    double hg = pm.hargaGanti(tl1);
                    double gb = pm.total1(tl1);
                    String sys_a = pm.sistem_a(tl1);

                    System.out.println(sys_a);
                    System.out.println("Harga suku cadang : " + hg);
                    System.out.println("Biaya penggantian : " + by);
                    System.out.println("Total Keseluruhan : " + gb);
                    System.out.println("angka diatas adalah harga yang harus dibayar customer");
                    break;
                }
                case 2: {
                    brand.perbaikan();
                    System.out.println("Ingin melakukan apa?");
                    System.out.println("[1] Perbaikan mesin");
                    System.out.println("[2] Perbaikan rem");
                    System.out.println("[3] Perbaikan setir");
                    System.out.println("[4] Perbaikan busi");
                    System.out.println("===================");
                    int tl2 = pembayaran.nextInt();

                    Payment pm = new Payment();

                    System.out.println("\n");

                    pm.detail(nama);
                    pm.detail(kilometer);
                    double by = pm.biaya(aksi);
                    double gk = pm.hargaPerbaikan(tl2);
                    double gb = pm.total2(tl2);
                    String sys_b = pm.sistem_b(tl2);

                    System.out.println(sys_b);
                    System.out.println("Harga komponen : " + gk);
                    System.out.println("Biaya perbaikan : " + by);
                    System.out.println("Total Keseluruhan : " + gb);
                    System.out.println("angka diatas adalah harga yang harus dibayar customer");
                    break;
                }
                default:
                    System.out.println("Incorrect input. System terminated");
            }
        } catch (Exception salah_euy) {
            System.out.println("Cuk error cuk");
        }

    }

}
