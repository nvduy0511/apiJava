package com.covid19.API;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covid19.Entity.ConNguoi;
import com.covid19.service.IConNguoiService;


@RestController
public class NewAPI {

//	@Autowired
//	ISanPhamService iSanPhamService;
	@Autowired
	IConNguoiService iConNguoiService;
	
	@GetMapping("/test")
	public String testAPI() {
		return "success";
	}
	
	@PostMapping("/add")
	public ConNguoi addSanPham(@RequestBody ConNguoi  conNguoi)
	{
		return iConNguoiService.addConNguoi(conNguoi);
	}
//	
//	@PutMapping("/update")
//	public SanPham updateSanPham(@RequestParam long id, @RequestBody SanPham sanPham)
//	{
//		return iSanPhamService.updateSanPham(id, sanPham);
//	}
//	
//	@DeleteMapping("/delete")
//	public boolean deleteSanPham(@RequestParam long id)
//	{
//		return iSanPhamService.deleteSanPham(id);
//	}
//	
//	@GetMapping("/getone")
//	public SanPham getOneSanPham(@RequestParam long id)
//	{
//		return iSanPhamService.getOneSanPham(id);
//	}
	@GetMapping("/getall")
	public List<ConNguoi> getAll()
	{
		return iConNguoiService.getAllConNguoi();
	}
	
}
