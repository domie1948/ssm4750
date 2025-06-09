package com.dao;

import com.entity.JianxiutixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianxiutixingVO;
import com.entity.view.JianxiutixingView;


/**
 * 检修提醒
 * 
 * @author 
 * @email 
 * @date 2021-05-08 10:23:06
 */
public interface JianxiutixingDao extends BaseMapper<JianxiutixingEntity> {
	
	List<JianxiutixingVO> selectListVO(@Param("ew") Wrapper<JianxiutixingEntity> wrapper);
	
	JianxiutixingVO selectVO(@Param("ew") Wrapper<JianxiutixingEntity> wrapper);
	
	List<JianxiutixingView> selectListView(@Param("ew") Wrapper<JianxiutixingEntity> wrapper);

	List<JianxiutixingView> selectListView(Pagination page,@Param("ew") Wrapper<JianxiutixingEntity> wrapper);
	
	JianxiutixingView selectView(@Param("ew") Wrapper<JianxiutixingEntity> wrapper);
	
}
