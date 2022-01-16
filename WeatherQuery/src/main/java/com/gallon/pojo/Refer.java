package com.gallon.pojo;

import java.util.List;
import com.alibaba.fastjson.annotation.JSONField;
/**
 * @author Gallon
 * @description
 */
public class Refer{

	@JSONField(name="license")
	private List<String> license;

	@JSONField(name="sources")
	private List<String> sources;

	public void setLicense(List<String> license){
		this.license = license;
	}

	public List<String> getLicense(){
		return license;
	}

	public void setSources(List<String> sources){
		this.sources = sources;
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