package com.covid19.service;

import java.util.List;

import com.covid19.Entity.BenhNhan;

public interface IBenhNhanService {

	public BenhNhan addBenhNhan(BenhNhan benhNhan);
	
	public BenhNhan updateBenhNhan(int maBN, BenhNhan benhNhan);
	
	public boolean deleteBenhNhan(int maBN);
	
	public List<BenhNhan> getAllBenhNhan();
	
	public BenhNhan getOneBenhNhan(int maBN);
}
