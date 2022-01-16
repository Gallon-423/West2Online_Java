package com.gallon.pojo;

import com.alibaba.fastjson.annotation.JSONField;
/**
 * @author Gallon
 * @description
 */
public class DailyItem{

	@JSONField(name="moonset")
	private String moonset;

	@JSONField(name="windSpeedDay")
	private String windSpeedDay;

	@JSONField(name="sunrise")
	private String sunrise;

	@JSONField(name="moonPhaseIcon")
	private String moonPhaseIcon;

	@JSONField(name="windScaleDay")
	private String windScaleDay;

	@JSONField(name="windScaleNight")
	private String windScaleNight;

	@JSONField(name="wind360Day")
	private String wind360Day;

	@JSONField(name="iconDay")
	private String iconDay;

	@JSONField(name="wind360Night")
	private String wind360Night;

	@JSONField(name="tempMax")
	private String tempMax;

	@JSONField(name="cloud")
	private String cloud;

	@JSONField(name="textDay")
	private String textDay;

	@JSONField(name="precip")
	private String precip;

	@JSONField(name="textNight")
	private String textNight;

	@JSONField(name="humidity")
	private String humidity;

	@JSONField(name="moonPhase")
	private String moonPhase;

	@JSONField(name="windDirDay")
	private String windDirDay;

	@JSONField(name="windDirNight")
	private String windDirNight;

	@JSONField(name="vis")
	private String vis;

	@JSONField(name="fxDate")
	private String fxDate;

	@JSONField(name="moonrise")
	private String moonrise;

	@JSONField(name="pressure")
	private String pressure;

	@JSONField(name="iconNight")
	private String iconNight;

	@JSONField(name="sunset")
	private String sunset;

	@JSONField(name="windSpeedNight")
	private String windSpeedNight;

	@JSONField(name="uvIndex")
	private String uvIndex;

	@JSONField(name="tempMin")
	private String tempMin;

	public void setMoonset(String moonset){
		this.moonset = moonset;
	}

	public String getMoonset(){
		return moonset;
	}

	public void setWindSpeedDay(String windSpeedDay){
		this.windSpeedDay = windSpeedDay;
	}

	public String getWindSpeedDay(){
		return windSpeedDay;
	}

	public void setSunrise(String sunrise){
		this.sunrise = sunrise;
	}

	public String getSunrise(){
		return sunrise;
	}

	public void setMoonPhaseIcon(String moonPhaseIcon){
		this.moonPhaseIcon = moonPhaseIcon;
	}

	public String getMoonPhaseIcon(){
		return moonPhaseIcon;
	}

	public void setWindScaleDay(String windScaleDay){
		this.windScaleDay = windScaleDay;
	}

	public String getWindScaleDay(){
		return windScaleDay;
	}

	public void setWindScaleNight(String windScaleNight){
		this.windScaleNight = windScaleNight;
	}

	public String getWindScaleNight(){
		return windScaleNight;
	}

	public void setWind360Day(String wind360Day){
		this.wind360Day = wind360Day;
	}

	public String getWind360Day(){
		return wind360Day;
	}

	public void setIconDay(String iconDay){
		this.iconDay = iconDay;
	}

	public String getIconDay(){
		return iconDay;
	}

	public void setWind360Night(String wind360Night){
		this.wind360Night = wind360Night;
	}

	public String getWind360Night(){
		return wind360Night;
	}

	public void setTempMax(String tempMax){
		this.tempMax = tempMax;
	}

	public String getTempMax(){
		return tempMax;
	}

	public void setCloud(String cloud){
		this.cloud = cloud;
	}

	public String getCloud(){
		return cloud;
	}

	public void setTextDay(String textDay){
		this.textDay = textDay;
	}

	public String getTextDay(){
		return textDay;
	}

	public void setPrecip(String precip){
		this.precip = precip;
	}

	public String getPrecip(){
		return precip;
	}

	public void setTextNight(String textNight){
		this.textNight = textNight;
	}

	public String getTextNight(){
		return textNight;
	}

	public void setHumidity(String humidity){
		this.humidity = humidity;
	}

	public String getHumidity(){
		return humidity;
	}

	public void setMoonPhase(String moonPhase){
		this.moonPhase = moonPhase;
	}

	public String getMoonPhase(){
		return moonPhase;
	}

	public void setWindDirDay(String windDirDay){
		this.windDirDay = windDirDay;
	}

	public String getWindDirDay(){
		return windDirDay;
	}

	public void setWindDirNight(String windDirNight){
		this.windDirNight = windDirNight;
	}

	public String getWindDirNight(){
		return windDirNight;
	}

	public void setVis(String vis){
		this.vis = vis;
	}

	public String getVis(){
		return vis;
	}

	public void setFxDate(String fxDate){
		this.fxDate = fxDate;
	}

	public String getFxDate(){
		return fxDate;
	}

	public void setMoonrise(String moonrise){
		this.moonrise = moonrise;
	}

	public String getMoonrise(){
		return moonrise;
	}

	public void setPressure(String pressure){
		this.pressure = pressure;
	}

	public String getPressure(){
		return pressure;
	}

	public void setIconNight(String iconNight){
		this.iconNight = iconNight;
	}

	public String getIconNight(){
		return iconNight;
	}

	public void setSunset(String sunset){
		this.sunset = sunset;
	}

	public String getSunset(){
		return sunset;
	}

	public void setWindSpeedNight(String windSpeedNight){
		this.windSpeedNight = windSpeedNight;
	}

	public String getWindSpeedNight(){
		return windSpeedNight;
	}

	public void setUvIndex(String uvIndex){
		this.uvIndex = uvIndex;
	}

	public String getUvIndex(){
		return uvIndex;
	}

	public void setTempMin(String tempMin){
		this.tempMin = tempMin;
	}

	public String getTempMin(){
		return tempMin;
	}

	@Override
 	public String toString(){
		return 
			"DailyItem{" + 
			"moonset = '" + moonset + '\'' + 
			",windSpeedDay = '" + windSpeedDay + '\'' + 
			",sunrise = '" + sunrise + '\'' + 
			",moonPhaseIcon = '" + moonPhaseIcon + '\'' + 
			",windScaleDay = '" + windScaleDay + '\'' + 
			",windScaleNight = '" + windScaleNight + '\'' + 
			",wind360Day = '" + wind360Day + '\'' + 
			",iconDay = '" + iconDay + '\'' + 
			",wind360Night = '" + wind360Night + '\'' + 
			",tempMax = '" + tempMax + '\'' + 
			",cloud = '" + cloud + '\'' + 
			",textDay = '" + textDay + '\'' + 
			",precip = '" + precip + '\'' + 
			",textNight = '" + textNight + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",moonPhase = '" + moonPhase + '\'' + 
			",windDirDay = '" + windDirDay + '\'' + 
			",windDirNight = '" + windDirNight + '\'' + 
			",vis = '" + vis + '\'' + 
			",fxDate = '" + fxDate + '\'' + 
			",moonrise = '" + moonrise + '\'' + 
			",pressure = '" + pressure + '\'' + 
			",iconNight = '" + iconNight + '\'' + 
			",sunset = '" + sunset + '\'' + 
			",windSpeedNight = '" + windSpeedNight + '\'' + 
			",uvIndex = '" + uvIndex + '\'' + 
			",tempMin = '" + tempMin + '\'' + 
			"}";
		}
}