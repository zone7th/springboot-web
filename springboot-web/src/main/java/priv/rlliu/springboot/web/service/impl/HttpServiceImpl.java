package priv.rlliu.springboot.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import priv.rlliu.springboot.web.http.RestClient;
import priv.rlliu.springboot.web.http.RestSelfClient;
import priv.rlliu.springboot.web.service.HttpService;
import priv.rlliu.springboot.web.vo.RecVo;
import priv.rlliu.springboot.web.vo.ReqVo;
import priv.rlliu.springboot.web.vo.TestVo;

/**
 * 
 * @Description: 服务接口实现
 * @author Martin
 * @date 2019年1月2日 下午12:10:39
 */
@Service
public class HttpServiceImpl implements HttpService{
	
	@Autowired
	private RestClient restClient;
	
	@Autowired
	private RestSelfClient restSelfClient;
	
	@Override
	public void postTest(int count) {
		List<TestVo>  list = new ArrayList<TestVo>();
		if(count < 20){
			count = 0;
		}else{
			int length = count / 20;
			for (int i = 0; i < length; i++) {
				list.add(saveAllAttr());
			}
		}
		
		restClient.postRemoteTest(JSONObject.toJSONString(list));
	}
	
	
	private TestVo saveAllAttr(){
		TestVo testVo = new TestVo();
		testVo.setA1("XXXX");
		testVo.setA2("XXXX");
		testVo.setA3("XXXX");
		testVo.setA4("XXXX");
		testVo.setA5("XXXX");
		testVo.setA6("XXXX");
		testVo.setA7("XXXX");
		testVo.setA8("XXXX");
		testVo.setA9("XXXX");
		testVo.setA10("XXXX");
		testVo.setA11("XXXX");
		testVo.setA12("XXXX");
		testVo.setA13("XXXX");
		testVo.setA14("XXXX");
		testVo.setA15("XXXX");
		testVo.setA16("XXXX");
		testVo.setA17("XXXX");
		testVo.setA18("XXXX");
		testVo.setA19("XXXX");
		testVo.setA20("XXXX");
		return testVo;
	}


	@Override
	public RecVo postSelfTest(ReqVo req) {
		List<TestVo>  list = new ArrayList<TestVo>();
		int count = req.getCount();
		if(count < 20){
			count = 0;
		}else{
			int length = count / 20;
			for (int i = 0; i < length; i++) {
				list.add(saveAllAttr());
			}
		}
		req.setJson(JSONObject.toJSONString(list));
		return restSelfClient.postSelfRemoteTest(req);
	}
	
}
