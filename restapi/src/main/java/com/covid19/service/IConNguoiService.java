package com.covid19.service;

import java.util.List;

import com.covid19.Entity.ConNguoi;

public interface IConNguoiService {
	
	public ConNguoi addConNguoi(ConNguoi connNguoi);
	
	public ConNguoi updateConNguoi(String cmnd, ConNguoi conNguoi);
	
	public boolean deleteConNguoi(String cmnd);
	
	public List<ConNguoi> getAllConNguoi();
	
	public ConNguoi getOneConNguoi(String cmnd);

}
