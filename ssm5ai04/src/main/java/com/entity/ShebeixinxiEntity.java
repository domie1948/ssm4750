package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 设备信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-08 10:23:06
 */
@TableName("shebeixinxi")
public class ShebeixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShebeixinxiEntity() {
		
	}
	
	public ShebeixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 设备编号
	 */
					
	private String shebeibianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：设备编号
	 */
	public void setShebeibianhao(String shebeibianhao) {
		this.shebeibianhao = shebeibianhao;
	}
	/**
	 * 获取：设备编号
	 */
	public String getShebeibianhao() {
		return shebeibianhao;
	}
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
