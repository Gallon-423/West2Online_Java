package com.gallon.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class City{

	@JSONField(name="name")
	private String name;

	@JSONField(name="lon")
	private String lon;

	@JSONField(name="id")
	private int id;

	@JSONField(name="lat")
	private String lat;

	public String getName(){
		return name;
	}

	public String getLon(){
		return lon;
	}

	public int getId(){
		return id;
	}

	public String getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"City{" + "id = '" + id + '\'' +
					",name = '" + name + '\'' +
			",lon = '" + lon + '\'' +
			",lat = '" + lat + '\'' + 
			"}";
		}

	public void setName(String name) {
		this.name = name;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}
}