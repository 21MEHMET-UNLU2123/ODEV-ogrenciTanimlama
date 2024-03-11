public class Ogrenci {

    String ad;
    String bolum;
    int girisYili;
    int ogrenciNo;
    Double gano;
    int bolumKodu;

    public Ogrenci(String ad, String bolum, int girisYili, int ogrenciNo, Double gano, int bolumKodu) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.ogrenciNo = ogrenciNo;
        this.gano = gano;
        this.bolumKodu = bolumKodu;
    }

    public Ogrenci(String ad, String bolum, int girisYili) {
        this(ad, bolum, girisYili, 0, 0.0, 0);
    }

    public Ogrenci(String ad, String bolum, int girisYili, int ogrenciNo) {
        this(ad, bolum, girisYili, ogrenciNo, 0.0, 0);
    }

    public Ogrenci(String ad, String bolum, int girisYili, int ogrenciNo, double gano) {
        this(ad, bolum, girisYili, ogrenciNo, gano, 0);
    }

    public void setad(String ad) {
        this.ad = ad;
    }

    public String getad() {
        return ad;
    }

    public void setbolum(String bolum) {
        this.bolum = bolum;
    }

    public String getbolum() {
        return bolum;
    }

    public void setgirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public int getgirisYili() {
        return girisYili;
    }

    public void setogreciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public int getogrenciNo() {
        return ogrenciNo;
    }

    public void setgano(double gano)
            throws IllegalArgumentException {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano değeri 0 ile 4 arasında olmalıdır");
        }
        this.gano = gano;
    }

    public double getgano() {
        return gano;
    }

    public void setbolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public int getbolumKodu() {
        return bolumKodu;
    }

    public  void bilgileriYazdir() {
            System.out.println("OGR : " + ad + "\t" + bolum + "\t" + girisYili + "\t" + ogrenciNo + "\t" + gano + "\t" + bolumKodu);
        }

    public static double HarcHesapla(int dersSayisi, int uzatilanYil) {
        double harcMiktari = dersSayisi * 200;
        double uzatmaUcreti = uzatilanYil * 80;
        return harcMiktari + uzatmaUcreti;
    }

    public static double HarcHesapla(int dersSayisi, int uzatilanYil, double vergiOrani) {
        double harcMiktari = HarcHesapla(dersSayisi, uzatilanYil);
        return harcMiktari * vergiOrani;
    }

    public static double HarcHesapla(int dersSayisi, int uzatilanYil, double vergiOrani, double indirimMiktari) {
        double harcMiktari = HarcHesapla(dersSayisi, uzatilanYil);
        return vergiOrani - indirimMiktari;
    }
}
