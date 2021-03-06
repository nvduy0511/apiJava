package com.covid19.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid19.Entity.CoSoYTe;
import com.covid19.Repository.CoSoYTeRepository;

@Service
public class CoSoYTeService implements ICoSoYTeService {

	@Autowired
	CoSoYTeRepository coSoYTeRepository;
	
	@Autowired
    EntityManager entityManager;

	@Override
	public CoSoYTe addCoSoYTe(CoSoYTe coSoYTe) {
		coSoYTeRepository.save(coSoYTe);
		return coSoYTe;
	}

	@Override
	public CoSoYTe updateCoSoYTe(int macsyt, CoSoYTe coSoYTe) {
		if(coSoYTe != null)
		{
			CoSoYTe csyt = coSoYTeRepository.findOne(macsyt);
			if(csyt != null)
			{
				csyt.setTenCSYT(coSoYTe.getTenCSYT());
				csyt.setSdt(coSoYTe.getSdt());
				csyt.setDiaChi(coSoYTe.getDiaChi());
				coSoYTeRepository.save(csyt);
			}
			return csyt;
		}
		return null;
	}

	@Override
	public boolean deleteCoSoYTe(int macsyt) {
		CoSoYTe csyt = coSoYTeRepository.findOne(macsyt);
		if(csyt != null)
		{
			coSoYTeRepository.delete(csyt);
			return true;
		}
		return false;
	}

	@Override
	public List<CoSoYTe> getAllCoSoYTe() {
		return coSoYTeRepository.findAll();
	}

	@Override
	public CoSoYTe getOneCoSoYTe(int macsyt) {
		return coSoYTeRepository.findOne(macsyt);
	}
	
	
	
}
