package com.covid19.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid19.Entity.BenhNhan;

@Repository
public interface BenhNhanRepository extends JpaRepository<BenhNhan, Integer> {

}
