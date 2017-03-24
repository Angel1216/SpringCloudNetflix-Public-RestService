package com.autentia.spring.cloud.netflix;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.autentia.spring.cloud.netflix.ApplicationRestService;
import com.autentia.spring.cloud.netflix.ServiceExample;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest (classes ={ApplicationRestService.class})
@TestPropertySource(locations = "classpath:application-test.properties")

public class ServiceExampleTest {

	private static String EXPECTED_VALUE = "GitRepository example value for public service";	

	@Resource
	ServiceExample serviceExampleSUT;
	
	@Test
	public void ShouldReturnAConfigValue() {
	
		String resultValue = serviceExampleSUT.example();		
		assertEquals(EXPECTED_VALUE, resultValue);		
	}
}
