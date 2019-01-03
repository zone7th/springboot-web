package priv.rlliu.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import priv.rlliu.springboot.web.service.HttpService;
import priv.rlliu.springboot.web.vo.RecVo;
import priv.rlliu.springboot.web.vo.ReqVo;

/**
 * 
 * @Description:http调用测试控制类
 * @author Martin
 * @date 2019年1月2日 下午2:15:51
 * 
 */
@RestController
@RequestMapping(value = "/http")
public class HttpController {
	  @Autowired
	  private HttpService httpService;
	  
	  
	  @RequestMapping(method = RequestMethod.POST, value = "/send")
	  public RecVo send(@RequestBody ReqVo req) {
		return  httpService.postSelfTest(req);
	  }
		  		   
}


