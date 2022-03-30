package com.covid19.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PhieuKhaiBaoYTe" )
public class PhieuKhaiBaoYTe {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "maPhieuKhaiBao", nullable = false)
    private int maPhieuKhaiBao;
	
	@Column(name = "cauHoi1", nullable = false)
	private boolean cauHoi1;
	
	@Column(name = "cauHoi2", nullable = false)
	private boolean cauHoi2;
	
	@Column(name = "cauHoi3", nullable = false)
	private boolean cauHoi3;
	
	@Column(name = "cauHoi3_1", nullable = false)
	private boolean cauHoi3_1;
	
	@Column(name = "cauHoi3_2", nullable = false)
	private boolean cauHoi3_2;
	
	@Column(name = "cauHoi3_3", nullable = false)
	private boolean cauHoi3_3;
	
	@ManyToOne
    @JoinColumn(name = "cccd_ConNguoi")
    private ConNguoi cccd_ConNguoi;

	public PhieuKhaiBaoYTe(int maPhieuKhaiBao, boolean cauHoi1, boolean cauHoi2, boolean cauHoi3, boolean cauHoi3_1,
			boolean cauHoi3_2, boolean cauHoi3_3, ConNguoi cccd_ConNguoi) {
		super();
		this.maPhieuKhaiBao = maPhieuKhaiBao;
		this.cauHoi1 = cauHoi1;
		this.cauHoi2 = cauHoi2;
		this.cauHoi3 = cauHoi3;
		this.cauHoi3_1 = cauHoi3_1;
		this.cauHoi3_2 = cauHoi3_2;
		this.cauHoi3_3 = cauHoi3_3;
		this.cccd_ConNguoi = cccd_ConNguoi;
	}

	public PhieuKhaiBaoYTe() {
		// TODO Auto-generated constructor stub
	}

	public int getMaPhieuKhaiBao() {
		return maPhieuKhaiBao;
	}

	public void setMaPhieuKhaiBao(int maPhieuKhaiBao) {
		this.maPhieuKhaiBao = maPhieuKhaiBao;
	}

	public boolean isCauHoi1() {
		return cauHoi1;
	}

	public void setCauHoi1(boolean cauHoi1) {
		this.cauHoi1 = cauHoi1;
	}

	public boolean isCauHoi2() {
		return cauHoi2;
	}

	public void setCauHoi2(boolean cauHoi2) {
		this.cauHoi2 = cauHoi2;
	}

	public boolean isCauHoi3() {
		return cauHoi3;
	}

	public void setCauHoi3(boolean cauHoi3) {
		this.cauHoi3 = cauHoi3;
	}

	public boolean isCauHoi3_1() {
		return cauHoi3_1;
	}

	public void setCauHoi3_1(boolean cauHoi3_1) {
		this.cauHoi3_1 = cauHoi3_1;
	}

	public boolean isCauHoi3_2() {
		return cauHoi3_2;
	}

	public void setCauHoi3_2(boolean cauHoi3_2) {
		this.cauHoi3_2 = cauHoi3_2;
	}

	public boolean isCauHoi3_3() {
		return cauHoi3_3;
	}

	public void setCauHoi3_3(boolean cauHoi3_3) {
		this.cauHoi3_3 = cauHoi3_3;
	}

	public ConNguoi getCccd_ConNguoi() {
		return cccd_ConNguoi;
	}

	public void setCccd_ConNguoi(ConNguoi cccd_ConNguoi) {
		this.cccd_ConNguoi = cccd_ConNguoi;
	}
	
}
