package springboot.helloworld;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class SecondController {
	@RequestMapping("/getMap")
	@ResponseBody
	public Map<String, Object> getMap(){
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("errorCode", "200");
		result.put("errorMsg", "成功");
		return result;
	}
	@RequestMapping("/getName")
	public String getName(Map<String, String> result){
		result.put("name", "tom");
		System.out.println(result);
		return "name";
	}
}
