package springboot.helloworld.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
//全局捕获异常
@ControllerAdvice
public class CatchExceptionController {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, String> resultError(){
		Map<String, String> result = new HashMap<String, String>();
		result.put("500", "系统错误");
		return result;
	}
}
