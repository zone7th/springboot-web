package priv.rlliu.springboot.web.http;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import priv.rlliu.springboot.web.vo.RecVo;
import priv.rlliu.springboot.web.vo.ReqVo;

/**
 * 
 * @Description: 第三方服务接口 
 * @author Martin
 * @date 2019年1月2日 下午1:44:22
 * url.selfapi=http://10.201.250.239:8585/selfhttpX/receive
 */
@FeignClient(name = "selfapi", url = "${url.selfapi}")
@RequestMapping(value = "/selfhttpX", produces = {"application/json;charset=UTF-8"})
public interface  RestSelfClient {
	@RequestMapping(value = "/receive", method = RequestMethod.POST)
	RecVo postSelfRemoteTest(@RequestBody ReqVo req);
}
