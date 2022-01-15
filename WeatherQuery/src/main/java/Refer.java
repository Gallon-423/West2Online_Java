import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;
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
}
