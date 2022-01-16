package com.gallon.pojo;

import java.util.List;
import com.alibaba.fastjson.annotation.JSONField;
/**
 * @author Gallon
 * @description
 */
public class Weather{

	@JSONField(name="fxLink")
	private String fxLink;

	@JSONField(name="code")
	private String code;

	@JSONField(name="refer")
	private Refer refer;

	@JSONField(name="daily")
	private List<DailyItem> daily;

	@JSONField(name="updateTime")
	private String updateTime;

	public void setFxLink(String fxLink){
		this.fxLink = fxLink;
	}

	public String getFxLink(){
		return fxLink;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setRefer(Refer refer){
		this.refer = refer;
	}

	public Refer getRefer(){
		return refer;
	}

	public void setDaily(List<DailyItem> daily){
		this.daily = daily;
	}

	public List<DailyItem> getDaily(){
		return daily;
	}

	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	public String getUpdateTime(){
		return updateTime;
	}

	@Override
 	public String toString(){
		return 
			"Weather{" + 
			"fxLink = '" + fxLink + '\'' + 
			",code = '" + code + '\'' + 
			",refer = '" + refer + '\'' + 
			",daily = '" + daily + '\'' + 
			",updateTime = '" + updateTime + '\'' + 
			"}";
		}
}