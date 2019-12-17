package com.facededesign.model;

public class SepettekiUrun {

	private Integer Id;
	private String urunAdi;
	private Integer adet;
	private Integer fiyat;

	public SepettekiUrun() {
	}

	public SepettekiUrun(Integer Id, String urunAdi, Integer adet, Integer fiyat) {
		this.Id = Id;
		this.urunAdi = urunAdi;
		this.adet = adet;
		this.fiyat = fiyat;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getUrunAdi() {
		return urunAdi;
	}

	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}

	public Integer getAdet() {
		return adet;
	}

	public void setAdet(Integer adet) {
		this.adet = adet;
	}

	public Integer getFiyat() {
		return fiyat;
	}

	public void setFiyat(Integer fiyat) {
		this.fiyat = fiyat;
	}

}
