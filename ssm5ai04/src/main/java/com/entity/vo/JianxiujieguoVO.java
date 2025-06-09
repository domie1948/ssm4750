package com.entity.vo;

import com.entity.JianxiujieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 检修结果
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-08 10:23:06
 */
public class JianxiujieguoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 检修情况
	 */
	
	private String jianxiuqingkuang;
		
	/**
	 * 检修工结果
	 */
	
	private String jianxiugongjieguo;
		
	/**
	 * 检修日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianxiuriqi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
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
	 * 设置：检修情况
	 */
	 
	public void setJianxiuqingkuang(String jianxiuqingkuang) {
		this.jianxiuqingkuang = jianxiuqingkuang;
	}
	
	/**
	 * 获取：检修情况
	 */
	public String getJianxiuqingkuang() {
		return jianxiuqingkuang;
	}
				
	
	/**
	 * 设置：检修工结果
	 */
	 
	public void setJianxiugongjieguo(String jianxiugongjieguo) {
		this.jianxiugongjieguo = jianxiugongjieguo;
	}
	
	/**
	 * 获取：检修工结果
	 */
	public String getJianxiugongjieguo() {
		return jianxiugongjieguo;
	}
				
	
	/**
	 * 设置：检修日期
	 */
	 
	public void setJianxiuriqi(Date jianxiuriqi) {
		this.jianxiuriqi = jianxiuriqi;
	}
	
	/**
	 * 获取：检修日期
	 */
	public Date getJianxiuriqi() {
		return jianxiuriqi;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
