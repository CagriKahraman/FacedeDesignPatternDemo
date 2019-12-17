package com.facededesign.controller;

import java.util.List;

import com.facededesign.model.KargoSirketi;
import com.facededesign.model.Musteri;
import com.facededesign.model.SepettekiUrun;

public class SiparisFacede {

	private Musteri musteri;
	private KargoSirketi kargoSirketi;
	private UrunIslemleri urunIslemleri = new UrunIslemleri();
	private SiparisIslemleri siparisIslemleri = new SiparisIslemleri();
	private SiparisDetaylari siparisDetaylari = new SiparisDetaylari();

	public void SiparisVer(String musteriAdi, String musteriSoyadi, String secilenKargoSirketi,
			List<SepettekiUrun> urunler) {

		musteri = new Musteri();
		kargoSirketi = new KargoSirketi();

		musteri.setAd(musteriAdi);
		musteri.setSoyad(musteriSoyadi);
		kargoSirketi.setKargoAdi(secilenKargoSirketi);

		int siparisId = siparisIslemleri.SiparisEkle(System.currentTimeMillis(), musteri, kargoSirketi);
		siparisDetaylari.SiparisDetaylariEkle(siparisId, urunler);
		for (SepettekiUrun sepettekiUrun : urunler) {
			urunIslemleri.StokGuncelle(sepettekiUrun.getId(), sepettekiUrun.getAdet());
		}
		System.out.println("Ýþlem tamamlandý");

	}
}
