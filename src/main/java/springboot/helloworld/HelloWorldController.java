package springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan("springboot.helloworld")
public class HelloWorldController {
	@RequestMapping("/index")
	public String index(){
		return "success";
	}
	public static void main(String[] args){
		SpringApplication.run(HelloWorldController.class, args);
	}
}
