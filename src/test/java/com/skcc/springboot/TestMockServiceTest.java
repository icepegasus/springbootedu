package com.skcc.springboot;

import com.skcc.springboot.mock.TestMockService;
import com.skcc.springboot.mock.TestServiceCaller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * @author HyunSub Shim
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMockServiceTest {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @MockBean //실제로 구현체가 없는 Interface 를 테스트 하고 싶을경우
    private TestMockService testMockService;

    @Autowired
    private TestServiceCaller testServiceCaller;

    @Test
    public void test() {

        String result = "Mocking Test!";

        given(testMockService.execute()).willReturn(result);

        assertThat(testServiceCaller.execute(), is(result));
        
        logger.debug("{}", result);

    }

}