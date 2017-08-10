package com.dipen.radius.contorller;

import org.hibernate.mapping.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.dipen.radius.RadiusApplication;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RadiusApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties ={"management.port=0"})
public class UserControllerTest {
	@LocalServerPort
	private int port;
	
	@Value("{local.management.port}")
	private int mgt;
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Test
	public void shouldReturn200WhenSeigingRequestToController() throws Exception
	{
		@SuppressWarnings("rawtypes")
		ResponseEntity<Map> entity = this.testRestTemplate.getForEntity(
				"http://localhost:"+this.port+"/welcome", Map.class);
		//then(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		Assert.assertEquals(entity.getStatusCode(), HttpStatus.OK);
	}
	
	
}
