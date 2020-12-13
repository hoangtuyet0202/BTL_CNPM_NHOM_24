package com.model;

import java.sql.Timestamp;

public class DongGopModel extends AbstractModel<DongGopModel>{
	private int maDongGop;
	private int maHoKhau;
	private int soTienDG;
	private int maTheLoaiDG;
	private Timestamp ngayDG;

	public DongGopModel() {
	}
	
	public int getMaDongGop() {
		return this.maDongGop;
	}
	public void setMaDongGop(int maDongGop) {
		this.maDongGop = maDongGop;
	}
	public int getMaHoKhau() {
		return this.maHoKhau;
	}
	public void setMaHoKhau(int maHoKhau) {
		this.maHoKhau = maHoKhau;
	}
	public int getSoTienDG() {
		return this.soTienDG;
	}
	public void setSoTienDG(int soTienDG) {
		this.soTienDG = soTienDG;
	}
	public int getMaTheLoaiDG() {
		return this.maTheLoaiDG;
	}
	public void setMaTheLoaiDG(int maTheLoaiDG) {
		this.maTheLoaiDG = maTheLoaiDG;
	}
	public Timestamp getNgayDG() {
		return this.ngayDG;
	}
	public void setNgayDG(Timestamp ngayDG) {
		this.ngayDG = ngayDG;
	}	
}