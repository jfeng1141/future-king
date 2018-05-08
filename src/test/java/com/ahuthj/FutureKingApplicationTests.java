package com.ahuthj;

import com.ahuthj.util.HttpClientUtil;
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
	public void testSendPostDataByJson() throws ClientProtocolException, IOException {
		String url = "http://public-api.nj.ins.product.tuniu.org/ins-product/shn/manage/line/query/queryInsDetail";
		Map<String, String> map = new HashMap<String, String>();
		map.put("resIds", "1930451953");
		String body = HttpClientUtil.sendPostDataByJson(url, JSON.toJSONString(map), "utf-8");
		System.out.println("2响应结果：" + body);
	}

	@Test
	public void sendGetData()  throws ClientProtocolException, IOException {
		String url = "http://public-api.nj.ins.product.tuniu.org/ins-product/MonitorProxy";
		String body = HttpClientUtil.sendGetData(url,"utf-8");
		System.out.println("3响应结果：" + body);
	}
}
