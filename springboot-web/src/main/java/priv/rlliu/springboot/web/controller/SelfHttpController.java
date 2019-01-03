package priv.rlliu.springboot.web.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping(value = "/selfhttp")
public class SelfHttpController {
	  /**
	   * 
	   * @Description: 模拟终端返回
	   * @param req
	   * @return
	   * @author Martin
	   * @date 2019年1月2日 下午7:09:12
	   */
	  	@RequestMapping(method = RequestMethod.POST, value = "/receive")
	    public RecVo receive(@RequestBody ReqVo req) {
	  		RecVo recVo =  new RecVo();
	  		recVo.setIsSuccess("TRUE");
	  		return recVo;
	    }
	  	
}


