package priv.rlliu.springboot.web.vo;

import java.io.Serializable;

/**
 * 
 * @Description: 返回体
 * @author Martin
 * @date 2019年1月2日 下午5:37:47
 */
public class RecVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String isSuccess;

	public String getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
}
