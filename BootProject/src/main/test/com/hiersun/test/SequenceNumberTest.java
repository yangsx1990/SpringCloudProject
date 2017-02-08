package com.hiersun.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hiersun.service.SequenceNumberService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SequenceNumberTest {

	@Autowired private SequenceNumberService sequenceNumberService;

	@Test
	public void test() {
		System.out.println("sssss=" + sequenceNumberService.getNumber());
	}

}
