package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages={"controller","websocket","config"})
public class SampleController {

	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
	

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
	
}
