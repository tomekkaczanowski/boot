package pl.kaczanowscy.tomek.boot.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/thing")
	public MyThing thing() {
		return new MyThing("whatever");
	}

}
