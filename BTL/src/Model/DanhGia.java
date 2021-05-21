/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;

/**
 *
 * @author quang
 */
public class DanhGia {
     private String maDanhGia;
     private int maNhom;
     private Double diem;

    public DanhGia() {
    }

    public DanhGia(String maDanhGia, int maNhom, Double diem) {
        this.maDanhGia = maDanhGia;
        this.maNhom = maNhom;
        this.diem = diem;
    }

    public String getMaDanhGia() {
        return maDanhGia;
    }

    public int getMaNhom() {
        return maNhom;
    }

    public Double getDiem() {
        return diem;
    }

    public void setMaDanhGia(String maDanhGia) {
        this.maDanhGia = maDanhGia;
    }

    public void setMaNhom(int maNhom) {
        this.maNhom = maNhom;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.maDanhGia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DanhGia other = (DanhGia) obj;
        if (!Objects.equals(this.maDanhGia, other.maDanhGia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DanhGia{" + "maDanhGia=" + maDanhGia + ", maNhom=" + maNhom + ", diem=" + diem + '}';
    }
    
}
