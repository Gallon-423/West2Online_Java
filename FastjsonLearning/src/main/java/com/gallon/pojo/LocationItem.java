package com.gallon.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class LocationItem{

	@JSONField(name="country")
	private String country;

	@JSONField(name="fxLink")
	private String fxLink;

	@JSONField(name="utcOffset")
	private String utcOffset;

	@JSONField(name="adm2")
	private String adm2;

	@JSONField(name="tz")
	private String tz;

	@JSONField(name="isDst")
	private String isDst;

	@JSONField(name="lon")
	private String lon;

	@JSONField(name="adm1")
	private String adm1;

	@JSONField(name="type")
	private String type;

	@JSONField(name="name")
	private String name;

	@JSONField(name="rank")
	private String rank;

	@JSONField(name="id")
	private String id;

	@JSONField(name="lat")
	private String lat;

	public String getCountry(){
		return country;
	}

	public String getFxLink(){
		return fxLink;
	}

	public String getUtcOffset(){
		return utcOffset;
	}

	public String getAdm2(){
		return adm2;
	}

	public String getTz(){
		return tz;
	}

	public String getIsDst(){
		return isDst;
	}

	public String getLon(){
		return lon;
	}

	public String getAdm1(){
		return adm1;
	}

	public String getType(){
		return type;
	}

	public String getName(){
		return name;
	}

	public String getRank(){
		return rank;
	}

	public String getId(){
		return id;
	}

	public String getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"LocationItem{" + 
			"country = '" + country + '\'' + 
			",fxLink = '" + fxLink + '\'' + 
			",utcOffset = '" + utcOffset + '\'' + 
			",adm2 = '" + adm2 + '\'' + 
			",tz = '" + tz + '\'' + 
			",isDst = '" + isDst + '\'' + 
			",lon = '" + lon + '\'' + 
			",adm1 = '" + adm1 + '\'' + 
			",type = '" + type + '\'' + 
			",name = '" + name + '\'' + 
			",rank = '" + rank + '\'' + 
			",id = '" + id + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}