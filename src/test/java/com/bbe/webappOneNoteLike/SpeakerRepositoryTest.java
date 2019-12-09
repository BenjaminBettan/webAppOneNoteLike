package com.bbe.webappOneNoteLike;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.DemoApplication;
import demo.domain.Speaker;
import demo.domain.SpeakerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class SpeakerRepositoryTest {

	@Autowired
	private SpeakerRepository repository;
	
	@Test
	public void testFindByTwitter() throws Exception{
		Speaker benjamin = repository.save(new Speaker("Benjamin", "Bettan", "benjamin_bettan"));
		assertThat(repository.findByTwitter("benjamin_bettan").getId(), is(benjamin.getId()));
	}
}
