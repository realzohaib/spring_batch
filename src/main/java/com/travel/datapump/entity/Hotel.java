package com.travel.datapump.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Hotel {
	@Embedded
	@JsonProperty("country_name")
	private CountryName countryname;
	@Id
	private Integer id;
	@JsonProperty("country_code")
	private String countrycode;
	@Embedded
	@JsonProperty("center")
	private Center center;
	@ElementCollection
	@JsonProperty("hotels")
	private List<String> hotels;
	private String iata;
	private String type;
	@Embedded
	@JsonProperty("name")
	private Name name;
	
	
	public CountryName getCountryname() {
		return countryname;
	}
	public void setCountryname(CountryName countryname) {
		this.countryname = countryname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public Center getCenter() {
		return center;
	}
	public void setCenter(Center center) {
		this.center = center;
	}
	public List<String> getHotels() {
		return hotels;
	}
	public void setHotels(List<String> hotels) {
		this.hotels = hotels;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}

}
