package pl.krystian;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

	
	@GetMapping("/getDefault")
	public String getInfoDefault() {
		return "This is default api link";
	}
}
