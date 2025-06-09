package com.entity.vo;

import com.entity.ShebeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 设备信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-08 10:23:06
 */
public class ShebeixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 单位
	 */
	
	private String danwei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 规格型号
	 */
	
	private String guigexinghao;
		
	/**
	 * 安全库存
	 */
	
	private Integer anquankucun;
		
	/**
	 * 检修次数
	 */
	
	private Integer jianxiucishu;
		
	/**
	 * 寿命剩余
	 */
	
	private String shoumingshengyu;
				
	
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
	 * 设置：单位
	 */
	 
	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}
	
	/**
	 * 获取：单位
	 */
	public String getDanwei() {
		return danwei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：规格型号
	 */
	 
	public void setGuigexinghao(String guigexinghao) {
		this.guigexinghao = guigexinghao;
	}
	
	/**
	 * 获取：规格型号
	 */
	public String getGuigexinghao() {
		return guigexinghao;
	}
				
	
	/**
	 * 设置：安全库存
	 */
	 
	public void setAnquankucun(Integer anquankucun) {
		this.anquankucun = anquankucun;
	}
	
	/**
	 * 获取：安全库存
	 */
	public Integer getAnquankucun() {
		return anquankucun;
	}
				
	
	/**
	 * 设置：检修次数
	 */
	 
	public void setJianxiucishu(Integer jianxiucishu) {
		this.jianxiucishu = jianxiucishu;
	}
	
	/**
	 * 获取：检修次数
	 */
	public Integer getJianxiucishu() {
		return jianxiucishu;
	}
				
	
	/**
	 * 设置：寿命剩余
	 */
	 
	public void setShoumingshengyu(String shoumingshengyu) {
		this.shoumingshengyu = shoumingshengyu;
	}
	
	/**
	 * 获取：寿命剩余
	 */
	public String getShoumingshengyu() {
		return shoumingshengyu;
	}
			
}
