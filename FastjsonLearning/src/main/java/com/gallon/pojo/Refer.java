package com.gallon.pojo;

import java.util.List;
import com.alibaba.fastjson.annotation.JSONField;

public class Refer{

	@JSONField(name="license")
	private List<String> license;

	@JSONField(name="sources")
	private List<String> sources;

	public List<String> getLicense(){
		return license;
	}

	public List<String> getSources(){
		return sources;
	}

	@Override
 	public String toString(){
		return 
			"Refer{" + 
			"license = '" + license + '\'' + 
			",sources = '" + sources + '\'' + 
			"}";
		}
}