package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianxiutixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianxiutixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianxiutixingView;


/**
 * 检修提醒
 *
 * @author 
 * @email 
 * @date 2021-05-08 10:23:06
 */
public interface JianxiutixingService extends IService<JianxiutixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianxiutixingVO> selectListVO(Wrapper<JianxiutixingEntity> wrapper);
   	
   	JianxiutixingVO selectVO(@Param("ew") Wrapper<JianxiutixingEntity> wrapper);
   	
   	List<JianxiutixingView> selectListView(Wrapper<JianxiutixingEntity> wrapper);
   	
   	JianxiutixingView selectView(@Param("ew") Wrapper<JianxiutixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianxiutixingEntity> wrapper);
   	
}

