package com.covid19.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid19.Entity.ConNguoi;
import com.covid19.Repository.ConNguoiRepository;

@Service
public class ConNguoiService implements IConNguoiService {
	
	@Autowired
	ConNguoiRepository conNguoiRepository;
	
	@Autowired
    EntityManager entityManager;

	@Override
	public ConNguoi addConNguoi(ConNguoi connNguoi) {
		conNguoiRepository.save(connNguoi);
		return connNguoi;
	}

	@Override
	public ConNguoi updateConNguoi(String cmnd, ConNguoi conNguoi) {
		if(conNguoi != null)
		{
			ConNguoi cn = conNguoiRepository.findOne(cmnd);
			if(cn != null) 
			{
				cn.setDiaChi(conNguoi.getDiaChi());
				cn.setGioiTinh(conNguoi.getGioiTinh());
				cn.setHoTen(conNguoi.getHoTen());
				cn.setNgaySinh(conNguoi.getNgaySinh());
				cn.setSdt(conNguoi.getSdt());
				conNguoiRepository.save(cn);
			}
			return cn;
		}
		return null;
	}

	@Override
	public boolean deleteConNguoi(String cmnd) {
		ConNguoi cn = conNguoiRepository.findOne(cmnd);
		if(cn != null)
		{
			conNguoiRepository.delete(cn);
			return true;
		}
		return false;
	}

	@Override
	public List<ConNguoi> getAllConNguoi() {
		
		return conNguoiRepository.findAll();
	}

	@Override
	public ConNguoi getOneConNguoi(String cmnd) {
		
		return conNguoiRepository.findOne(cmnd);
	}
	
	
	
}
