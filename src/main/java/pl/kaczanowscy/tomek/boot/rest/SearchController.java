package pl.kaczanowscy.tomek.boot.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class SearchController {

	@RequestMapping("/search")
	public SearchResult search() {
		return new SearchResult(Collections.EMPTY_LIST);
	}

}
