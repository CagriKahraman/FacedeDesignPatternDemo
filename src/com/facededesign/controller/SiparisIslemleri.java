package com.facededesign.controller;

import java.util.Date;

import com.facededesign.model.KargoSirketi;
import com.facededesign.model.Musteri;

public class SiparisIslemleri {

	public int SiparisEkle(Long siparisTarihi, Musteri musteri, KargoSirketi kargoSirketi) {

		System.out.println(siparisTarihi + " tarihinde " + musteri.getAd() + musteri.getSoyad()
				+ " isimli müþteri sipariþi eklendi" + "seçilen kargo þirketi:" + kargoSirketi.getKargoAdi());
		return 1;

	}
}
