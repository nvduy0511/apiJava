package com.covid19.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid19.Entity.BenhNhan;
import com.covid19.Repository.BenhNhanRepository;


@Service
public class BenhNhanService implements IBenhNhanService {

	@Autowired
	BenhNhanRepository benhNhanRepository;
	
	@Autowired
    EntityManager entityManager;
	
	@Override
	public BenhNhan addBenhNhan(BenhNhan benhNhan) {
		benhNhanRepository.save(benhNhan);
		return benhNhan;
	}

	@Override
	public BenhNhan updateBenhNhan(int maBN, BenhNhan benhNhan) {
		if(benhNhan  != null)
		{
			BenhNhan bn = benhNhanRepository.findOne(maBN);
			if(bn != null)
			{
				bn.setCmnd_BenhNhan(benhNhan.getCmnd_BenhNhan());
				bn.setMaCSYT_BenhNhan(benhNhan.getMaCSYT_BenhNhan());
				bn.setNgayPhatHien(benhNhan.getNgayPhatHien());
				bn.setSoLanMac(benhNhan.getSoLanMac());
				bn.setSoMuiVacin(benhNhan.getSoMuiVacin());
				benhNhanRepository.save(bn);
			}
			return bn;
		}
		return null;
	}

	@Override
	public boolean deleteBenhNhan(int maBN) {
		BenhNhan bn = benhNhanRepository.findOne(maBN);
		if(bn != null)
		{
			benhNhanRepository.delete(bn);
			return true;
		}
		return false;
	}

	@Override
	public List<BenhNhan> getAllBenhNhan() {
		return benhNhanRepository.findAll();
	}

	@Override
	public BenhNhan getOneBenhNhan(int maBN) {
		return benhNhanRepository.findOne(maBN);
	}

}
