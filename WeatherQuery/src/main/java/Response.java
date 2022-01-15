import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;
/**
 * @author Gallon
 * @description
 */
public class Response{

	@JSONField(name="code")
	private String code;

	@JSONField(name="refer")
	private Refer refer;

	@JSONField(name="location")
	private List<LocationItem> location;

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

	public void setLocation(List<LocationItem> location){
		this.location = location;
	}

	public List<LocationItem> getLocation(){
		return location;
	}
}
