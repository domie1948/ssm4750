package com.entity.view;

import com.entity.JianxiutixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 检修提醒
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 10:23:06
 */
@TableName("jianxiutixing")
public class JianxiutixingView  extends JianxiutixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianxiutixingView(){
	}
 
 	public JianxiutixingView(JianxiutixingEntity jianxiutixingEntity){
 	try {
			BeanUtils.copyProperties(this, jianxiutixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
