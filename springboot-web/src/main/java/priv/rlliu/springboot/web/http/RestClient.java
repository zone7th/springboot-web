package priv.rlliu.springboot.web.http;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @Description: 第三方服务接口 
 * @author Martin
 * @date 2019年1月2日 下午1:44:22
 * url.testapi=http://123.206.181.25:5555/CounterWebApp/tracepush/UceUsualTraceContentHandlerTrue
 */
@FeignClient(name = "testapi", url = "${url.testapi}")
@RequestMapping(value = "/CounterWebApp", produces = {"application/json;charset=UTF-8"})
public interface  RestClient {
	@RequestMapping(value = "/tracepush/UceUsualTraceContentHandlerTrue", method = RequestMethod.POST)
	void postRemoteTest(@RequestBody String data);
}
