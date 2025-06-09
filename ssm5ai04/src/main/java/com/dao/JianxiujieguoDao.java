package com.dao;

import com.entity.JianxiujieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianxiujieguoVO;
import com.entity.view.JianxiujieguoView;


/**
 * 检修结果
 * 
 * @author 
 * @email 
 * @date 2021-05-08 10:23:06
 */
public interface JianxiujieguoDao extends BaseMapper<JianxiujieguoEntity> {
	
	List<JianxiujieguoVO> selectListVO(@Param("ew") Wrapper<JianxiujieguoEntity> wrapper);
	
	JianxiujieguoVO selectVO(@Param("ew") Wrapper<JianxiujieguoEntity> wrapper);
	
	List<JianxiujieguoView> selectListView(@Param("ew") Wrapper<JianxiujieguoEntity> wrapper);

	List<JianxiujieguoView> selectListView(Pagination page,@Param("ew") Wrapper<JianxiujieguoEntity> wrapper);
	
	JianxiujieguoView selectView(@Param("ew") Wrapper<JianxiujieguoEntity> wrapper);
	
}
