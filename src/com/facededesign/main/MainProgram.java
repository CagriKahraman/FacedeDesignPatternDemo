package com.facededesign.main;

import java.util.ArrayList;
import java.util.List;

import com.facededesign.controller.SiparisFacede;
import com.facededesign.model.SepettekiUrun;

public class MainProgram {

	public static void main(String[] args) {

		SiparisFacede siparisFacede = new SiparisFacede();

		List<SepettekiUrun> urunler = new ArrayList<SepettekiUrun>();
		urunler.add(new SepettekiUrun(1,"kitap",5,1000));
		urunler.add(new SepettekiUrun(2,"defter",10,60));
		

		siparisFacede.SiparisVer("cagri", "kahraman", "Aras", (List<SepettekiUrun>) urunler);

	}



}
