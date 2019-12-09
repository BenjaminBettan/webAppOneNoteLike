package demo.web;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Secured("ROLE_HERO")
	@RequestMapping("/")
	public String home() {
		return "ROOT PAGE";
	}
}
