package com.entity.model;

import com.entity.ShiyongjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 使用计划
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-08 10:23:06
 */
public class ShiyongjihuaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 开始使用时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishishiyongshijian;
		
	/**
	 * 计划使用时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jihuashiyongshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：设备名称
	 */
	 
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
				
	
	/**
	 * 设置：开始使用时间
	 */
	 
	public void setKaishishiyongshijian(Date kaishishiyongshijian) {
		this.kaishishiyongshijian = kaishishiyongshijian;
	}
	
	/**
	 * 获取：开始使用时间
	 */
	public Date getKaishishiyongshijian() {
		return kaishishiyongshijian;
	}
				
	
	/**
	 * 设置：计划使用时间
	 */
	 
	public void setJihuashiyongshijian(Date jihuashiyongshijian) {
		this.jihuashiyongshijian = jihuashiyongshijian;
	}
	
	/**
	 * 获取：计划使用时间
	 */
	public Date getJihuashiyongshijian() {
		return jihuashiyongshijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
