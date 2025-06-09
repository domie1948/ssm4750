package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianxiujieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianxiujieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianxiujieguoView;


/**
 * 检修结果
 *
 * @author 
 * @email 
 * @date 2021-05-08 10:23:06
 */
public interface JianxiujieguoService extends IService<JianxiujieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianxiujieguoVO> selectListVO(Wrapper<JianxiujieguoEntity> wrapper);
   	
   	JianxiujieguoVO selectVO(@Param("ew") Wrapper<JianxiujieguoEntity> wrapper);
   	
   	List<JianxiujieguoView> selectListView(Wrapper<JianxiujieguoEntity> wrapper);
   	
   	JianxiujieguoView selectView(@Param("ew") Wrapper<JianxiujieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianxiujieguoEntity> wrapper);
   	
}

