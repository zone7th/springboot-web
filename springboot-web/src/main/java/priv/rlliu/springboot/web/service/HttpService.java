package priv.rlliu.springboot.web.service;

import priv.rlliu.springboot.web.vo.RecVo;
import priv.rlliu.springboot.web.vo.ReqVo;

/**
 * 
 * @Description: 服务接口
 * @author Martin
 * @date 2019年1月2日 下午12:08:29
 */
public interface HttpService {
	
	/**
	 * 
	 * @Description: 属性大小
	 * @param count
	 * @author Martin
	 * @return 
	 * @date 2019年1月2日 下午2:03:59
	 */
	RecVo  postSelfTest(ReqVo req);
}
