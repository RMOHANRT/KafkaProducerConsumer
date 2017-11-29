package com.visa.dao;

public class AirportsBean {
	
	private String iata;
	private String airport;
	private String city;
	private String state;
	private String country;
	private String lat;
	private String longt;
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getAirport() {
		return airport;
	}
	public void setAirport(String airport) {
		this.airport = airport;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLongt() {
		return longt;
	}
	public void setLongt(String longt) {
		this.longt = longt;
	}
	
	public AirportsBean getInstanceAirportsBean(String line) {
		
		
		
		String[] str = line.split(",");

		AirportsBean airportsBeans=new AirportsBean(str[0],str[1],str[2],str[3],str[4],str[5],str[6]);
		
		
		return airportsBeans;
		
	}
	@Override
	public String toString() {
		return "AirportsBean [iata=" + iata + ", airport=" + airport + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", lat=" + lat + ", longt=" + longt + "]";
	}
	public AirportsBean(String iata, String airport, String city, String state, String country, String lat,
			String longt) {
		
		this.iata = iata;
		this.airport = airport;
		this.city = city;
		this.state = state;
		this.country = country;
		this.lat = lat;
		this.longt = longt;
	}
	
	
	public AirportsBean() {
		
	}

}
