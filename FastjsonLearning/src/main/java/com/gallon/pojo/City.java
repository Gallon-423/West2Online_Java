package com.gallon.pojo;

import java.util.List;
import com.alibaba.fastjson.annotation.JSONField;

public class City{

	@JSONField(name="code")
	private String code;

	@JSONField(name="refer")
	private Refer refer;

	@JSONField(name="location")
	private List<LocationItem> location;

	public String getCode(){
		return code;
	}

	public Refer getRefer(){
		return refer;
	}

	public List<LocationItem> getLocation(){
		return location;
	}

	@Override
 	public String toString(){
		return 
			"City{" + 
			"code = '" + code + '\'' + 
			",refer = '" + refer + '\'' + 
			",location = '" + location + '\'' + 
			"}";
		}
}