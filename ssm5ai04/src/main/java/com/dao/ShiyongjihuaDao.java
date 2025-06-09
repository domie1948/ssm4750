package com.dao;

import com.entity.ShiyongjihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyongjihuaVO;
import com.entity.view.ShiyongjihuaView;


/**
 * 使用计划
 * 
 * @author 
 * @email 
 * @date 2021-05-08 10:23:06
 */
public interface ShiyongjihuaDao extends BaseMapper<ShiyongjihuaEntity> {
	
	List<ShiyongjihuaVO> selectListVO(@Param("ew") Wrapper<ShiyongjihuaEntity> wrapper);
	
	ShiyongjihuaVO selectVO(@Param("ew") Wrapper<ShiyongjihuaEntity> wrapper);
	
	List<ShiyongjihuaView> selectListView(@Param("ew") Wrapper<ShiyongjihuaEntity> wrapper);

	List<ShiyongjihuaView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyongjihuaEntity> wrapper);
	
	ShiyongjihuaView selectView(@Param("ew") Wrapper<ShiyongjihuaEntity> wrapper);
	
}
