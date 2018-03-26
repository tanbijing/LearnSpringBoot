package springboot.helloworld;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SecondController {
	@RequestMapping("/getMap")
	public Map<String, Object> getMap(){
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("errorCode", "200");
		result.put("errorMsg", "成功");
		return result;
	}
}
