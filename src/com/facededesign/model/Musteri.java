package com.facededesign.model;

public class Musteri {

	private int Id;
	private String Ad;
	private String Soyad;

	public Musteri() {
	}

	public Musteri(int Id, String Ad, String Soyad) {
		this.Id = Id;
		this.Ad = Ad;
		this.Soyad = Soyad;

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAd() {
		return Ad;
	}

	public void setAd(String ad) {
		Ad = ad;
	}

	public String getSoyad() {
		return Soyad;
	}

	public void setSoyad(String soyad) {
		Soyad = soyad;
	}
}
