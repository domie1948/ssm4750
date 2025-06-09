package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyongjihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyongjihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyongjihuaView;


/**
 * 使用计划
 *
 * @author 
 * @email 
 * @date 2021-05-08 10:23:06
 */
public interface ShiyongjihuaService extends IService<ShiyongjihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyongjihuaVO> selectListVO(Wrapper<ShiyongjihuaEntity> wrapper);
   	
   	ShiyongjihuaVO selectVO(@Param("ew") Wrapper<ShiyongjihuaEntity> wrapper);
   	
   	List<ShiyongjihuaView> selectListView(Wrapper<ShiyongjihuaEntity> wrapper);
   	
   	ShiyongjihuaView selectView(@Param("ew") Wrapper<ShiyongjihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyongjihuaEntity> wrapper);
   	
}

