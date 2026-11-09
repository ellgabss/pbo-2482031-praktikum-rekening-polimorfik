public class BankPolimorfik {

    public static void main(String[] args) {
        Tabungan ani = new Tabungan("101", "Ani", 1000000, 2.5);
        Tabungan citra = new Tabungan("102", "Citra", 300000, 2.0);
        Giro budi = new Giro("201", "Budi", 200000, 500000);

        Rekening[] semua = {ani, citra, budi};
        //Percobaan: Rekening r = new Rekening("999", "Eko", 0);
        //Pesan error: Rekening is not abstract and does not override abstract method biayaAdminBulanan() in Rekening


        System.out.println("========== REKENING AWAL ==========");
        for (Rekening rek : semua) {
            rek.cetakInfo();
        }

        System.out.println();
        System.out.println("========== AKHIR BULAN ============");
        for (Rekening rek : semua) {
            System.out.println(rek.getNomor() + " biaya admin  : " + Rekening.formatRupiah(rek.potongBiayaAdmin()));
        }
    }
}

