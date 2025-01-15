package com.bhagya.practice.model;

import java.util.Objects;

public class Passenger {

    private String fullName;
    private long MoNo;
    private long UIDno;

    @Override
    public String toString() {
        return "Passenger{" +
                "fullName='" + fullName + '\'' +
                ", MoNo=" + MoNo +
                ", UIDno=" + UIDno +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getMoNo() {
        return MoNo;
    }

    public void setMoNo(long moNo) {
        MoNo = moNo;
    }

    public long getUIDno() {
        return UIDno;
    }

    public void setUIDno(long UIDno) {
        this.UIDno = UIDno;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return MoNo == passenger.MoNo && UIDno == passenger.UIDno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(MoNo, UIDno);
    }
}
