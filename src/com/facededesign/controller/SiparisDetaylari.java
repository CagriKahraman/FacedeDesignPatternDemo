package com.facededesign.controller;

import java.util.List;

import com.facededesign.model.SepettekiUrun;

public class SiparisDetaylari {

	public void SiparisDetaylariEkle(int siparisId, List<SepettekiUrun> urunler) {
		System.out.println(siparisId + " nolu sipariþi ile alýnan ürünler:");
		System.out.println("-----------------------------------------");
		Double toplam = 0.0;

		for (SepettekiUrun sepettekiUrun : urunler) {
			System.out.println("Ürün Adi: " + sepettekiUrun.getUrunAdi() + " " + sepettekiUrun.getAdet()
					+ " adet alýndý." + "Ara Toplam:" + sepettekiUrun.getAdet() * sepettekiUrun.getFiyat());
			toplam += (double) (sepettekiUrun.getFiyat() * sepettekiUrun.getAdet());

		}

		System.out.println("Toplam:" + toplam);

	}

}
