package com.covid19.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covid19.Entity.BenhNhan;
import com.covid19.service.IBenhNhanService;

@RestController
public class BenhNhanAPI {

	@Autowired
	IBenhNhanService iBenhNhanService;
	
	@PostMapping("/benhnhan/add")
	public BenhNhan addBenhNhan(@RequestBody BenhNhan benhNhan)
	{
		return iBenhNhanService.addBenhNhan(benhNhan);
	}
	
	
	
}
