package com.ahuthj;

import com.alibaba.fastjson.JSON;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.ahuthj.util.HttpClientUtil.sendPostDataByJson;
import static com.ahuthj.util.HttpClientUtil.sendPostDataByMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FutureKingApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(FutureKingApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("info级别的日志");
		logger.warn("warn级别的日志");
		logger.error("error级别的日志");
	}

	@Test
	public void testSendPostDataByMap() throws ClientProtocolException, IOException {
		String url = "http://localhost:8080/httpService/sendPostDataByMap";
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "hj");
		map.put("city", "南京");
		String body = sendPostDataByMap(url, map, "utf-8");
		System.out.println("响应结果：" + body);
	}

	@Test
	public void testSendPostDataByJson() throws ClientProtocolException, IOException {
		String url = "http://localhost:8080/httpService/sendPostDataByJson";
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "hj");
		map.put("city", "南京");
		String body = sendPostDataByJson(url, JSON.toJSONString(map), "utf-8");
		System.out.println("响应结果：" + body);
	}
}
