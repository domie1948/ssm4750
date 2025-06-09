package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JianxiutixingDao;
import com.entity.JianxiutixingEntity;
import com.service.JianxiutixingService;
import com.entity.vo.JianxiutixingVO;
import com.entity.view.JianxiutixingView;

@Service("jianxiutixingService")
public class JianxiutixingServiceImpl extends ServiceImpl<JianxiutixingDao, JianxiutixingEntity> implements JianxiutixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianxiutixingEntity> page = this.selectPage(
                new Query<JianxiutixingEntity>(params).getPage(),
                new EntityWrapper<JianxiutixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianxiutixingEntity> wrapper) {
		  Page<JianxiutixingView> page =new Query<JianxiutixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianxiutixingVO> selectListVO(Wrapper<JianxiutixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianxiutixingVO selectVO(Wrapper<JianxiutixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianxiutixingView> selectListView(Wrapper<JianxiutixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianxiutixingView selectView(Wrapper<JianxiutixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
