package com.facededesign.model;

public class KargoSirketi {

	private int Id;
	private String kargoAdi;
	private String iletisim;

	public KargoSirketi() {
	}

	public KargoSirketi(int Id, String kargoAdi, String iletisim) {

		this.Id = Id;
		this.kargoAdi = kargoAdi;
		this.iletisim = iletisim;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getKargoAdi() {
		return kargoAdi;
	}

	public void setKargoAdi(String kargoAdi) {
		this.kargoAdi = kargoAdi;
	}

	public String getIletisim() {
		return iletisim;
	}

	public void setIletisim(String iletisim) {
		this.iletisim = iletisim;
	}

}
