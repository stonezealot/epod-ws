package com.epb.epod.bean;

import java.util.List;

import com.epb.epod.entity.Podmas;
import com.epb.epod.entity.Truckmas;

public class Master {

	private List<Truckmas> truckmas;
	private List<Podmas> podmas;

	public Master() {
		super();
	}

	public Master(List<Truckmas> truckmas, List<Podmas> podmas) {
		super();
		this.truckmas = truckmas;
		this.podmas = podmas;
	}

	public List<Truckmas> getTruckmas() {
		return truckmas;
	}

	public void setTruckmas(List<Truckmas> truckmas) {
		this.truckmas = truckmas;
	}

	public List<Podmas> getPodmas() {
		return podmas;
	}

	public void setPodmas(List<Podmas> podmas) {
		this.podmas = podmas;
	}

}
