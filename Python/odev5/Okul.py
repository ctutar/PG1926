class Okul():
    tip = "egitimyeri"

    def __init__(self, adi, turu, ogretmen_sayisi, ögrenci_sayisi, sinif_sayisi):
        self.adi = adi
        self.turu = turu
        self.ogretmen_sayisi = ogretmen_sayisi
        self.ögrenci_sayisi = ögrenci_sayisi
        self.sinif_sayisi = sinif_sayisi

O1 = Okul("Gazi", "İlkÖğretim Okulu", 20, 650, 30)
O2 = Okul("Kahramanmaraş", "Fen Lisesi", 28, 450, 40)
O3 = Okul("Malatya İnönü", "Üniversitesi", 125, 15450, 300)

Okullar = [O1, O2, O3]

for okul in Okullar:
    print(okul.adi, okul.turu, okul.ogretmen_sayisi, okul.ögrenci_sayisi, okul.sinif_sayisi)