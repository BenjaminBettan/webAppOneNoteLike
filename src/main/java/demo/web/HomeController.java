package demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${conference.name:toto}")
	private String userName;
	
	@RequestMapping("/")
	public String home() {
		return "Hello " + userName;
	}
}
