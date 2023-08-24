package com.travel.datapump.entity;

import javax.persistence.Embeddable;


@Embeddable
public class Center {
	 private Double longitude;
	  private Double latitude;
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Center(Double longitude, Double latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public Center() {
		// TODO Auto-generated constructor stub
	}

}
