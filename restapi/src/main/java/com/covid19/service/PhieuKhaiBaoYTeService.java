package com.covid19.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid19.Entity.PhieuKhaiBaoYTe;
import com.covid19.Repository.PhieuKhaiBaoYTeRepository;


@Service
public class PhieuKhaiBaoYTeService implements IPhieuKhaiBaoYTeService {

	@Autowired
	PhieuKhaiBaoYTeRepository phieuKhaiBaoYTeRepository;
	
	@Autowired
    EntityManager entityManager;
	
	@Override
	public PhieuKhaiBaoYTe addPhieuKhaiBaoYTe(PhieuKhaiBaoYTe phieuKhaiBaoYTe) {
		phieuKhaiBaoYTeRepository.save(phieuKhaiBaoYTe);
		return phieuKhaiBaoYTe;
	}

	@Override
	public PhieuKhaiBaoYTe updatePhieuKhaiBaoYTe(int maPhieuKhaiBao, PhieuKhaiBaoYTe phieuKhaiBaoYTe) {
		if(phieuKhaiBaoYTe != null)
		{
			PhieuKhaiBaoYTe pkbyt = phieuKhaiBaoYTeRepository.findOne(maPhieuKhaiBao);
			if(pkbyt != null)
			{
				pkbyt.setCauHoi1(phieuKhaiBaoYTe.isCauHoi1());
				pkbyt.setCauHoi2(phieuKhaiBaoYTe.isCauHoi2());
				pkbyt.setCauHoi3(phieuKhaiBaoYTe.isCauHoi3());
				pkbyt.setCauHoi3_1(phieuKhaiBaoYTe.isCauHoi3_1());
				pkbyt.setCauHoi3_2(phieuKhaiBaoYTe.isCauHoi3_2());
				pkbyt.setCauHoi3_3(phieuKhaiBaoYTe.isCauHoi3_3());
				pkbyt.setCccd_ConNguoi(phieuKhaiBaoYTe.getCccd_ConNguoi());
				phieuKhaiBaoYTeRepository.save(pkbyt);
			}
			return pkbyt;
		}
		return null;
	}

	@Override
	public boolean deletePhieuKhaiBaoYTe(int maPhieuKhaiBao) {
		PhieuKhaiBaoYTe pkbyt = phieuKhaiBaoYTeRepository.findOne(maPhieuKhaiBao);
		if(pkbyt != null)
		{
			phieuKhaiBaoYTeRepository.delete(pkbyt);
			return true;
		}
		return false;
	}

	@Override
	public List<PhieuKhaiBaoYTe> getAllPhieuKhaiBaoYTe() {
		return phieuKhaiBaoYTeRepository.findAll();
	}

	@Override
	public PhieuKhaiBaoYTe getOnePhieuKhaiBaoYTe(int maPhieuKhaiBao) {
		return phieuKhaiBaoYTeRepository.findOne(maPhieuKhaiBao);
	}

	
}
