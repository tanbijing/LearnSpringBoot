package springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//标识所有方法返回json格式，相当于@Controller+@ResponseBody
@RestController
//自动配置Spring环境
@EnableAutoConfiguration
//扫描package下的控制器
@ComponentScan("springboot.helloworld")
public class HelloWorldController {
	@RequestMapping("/index")
	public String index(){
		Integer a = 1/0;
		return "success";
	}
	public static void main(String[] args){
		SpringApplication.run(HelloWorldController.class, args);
	}
}
