package priv.rlliu.springboot.web.vo;

import java.io.Serializable;

/**
 * 
 * @Description: 请求体
 * @author Martin
 * @date 2019年1月2日 下午5:37:47
 */
public class ReqVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int count;
	
	private String json;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}
}
