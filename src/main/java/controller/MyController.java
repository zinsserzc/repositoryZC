package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/ss")
	@ResponseBody
	String m(){
		return "ss";
	}
	
}
