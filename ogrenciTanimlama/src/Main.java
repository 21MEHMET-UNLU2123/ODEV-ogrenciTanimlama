public class Main {
    public static void main(String[] args) {

        Ogrenci OGR1 = new Ogrenci("null", "null", 1973, 1973104001, 0.0, 104);
        Ogrenci OGR2 = new Ogrenci("Gökhan", "Bilgisayar Müh", 1985, 1985104001, 0.0, 104);
        Ogrenci OGR3 = new Ogrenci("Ayşe", "Makine Müh", 1985, 1985104001, 0.0, 104);
        Ogrenci OGR4 = new Ogrenci("Elif", "Elektirk-Elektronik Müh", 2020, 2020104001, 1.98, 104);

        System.out.println("Öğrencilerin Bilgileri");
        System.out.println();
        OGR1.bilgileriYazdir();
        OGR2.bilgileriYazdir();
        OGR3.bilgileriYazdir();
        OGR4.bilgileriYazdir();

    try{
        double harc3 = Ogrenci.HarcHesapla(2,1);
        double harc4 = Ogrenci.HarcHesapla(4,2);

        System.out.println("3.öğrencinin ödeyeceği harç: " +harc3);
        System.out.println("4.öğrencinin ödeyeceği harç: " +harc4);

    } catch(IllegalArgumentException e){
        System.out.println("Hata: " +e.getMessage());
    }
  }
}






