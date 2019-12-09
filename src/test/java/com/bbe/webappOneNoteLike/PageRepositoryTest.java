package com.bbe.webappOneNoteLike;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.DemoApplication;
import demo.domain.page.Page;
import demo.domain.page.PageRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class PageRepositoryTest {

	@Autowired
	private PageRepository repository;
	
	@Test
	public void testFindByTitrePage() throws Exception{
		Page cettePage = repository.save(new Page("titrePage"));
		assertThat(repository.findByNomPage("titrePage").getId(), is(cettePage.getId()));
	}
}
