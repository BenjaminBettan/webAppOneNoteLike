package com.bbe.webappOneNoteLike;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import demo.DemoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebIntegrationTest(randomPort = true)
public class HomeControlerIntegrationTest {
	
	@Value("${local.server.port}")//le port doit être libre, choisis en un
	private int port;

	@Test
	public void runHomeController() {
		String url = "http://localhost:" + port +"/";
		String body = new RestTemplate().getForObject(url, String.class);
		assertThat(body, is("Hello toto"));
	}

}
