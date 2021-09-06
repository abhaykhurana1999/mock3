package spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic(1,"Jeanette", "Penddreth","jpenddreth0@census.gov","Female"),
				new Topic(2,"Giavani", "Frediani","gfrediani1@senate.gov","Male"),
				new Topic(3,"Noell", "Bea","nbea2@imageshack.us","Female"),
				new Topic(4,"Willard", "Valek","wvalek3@vk.com","Male")
				);
	}

}
