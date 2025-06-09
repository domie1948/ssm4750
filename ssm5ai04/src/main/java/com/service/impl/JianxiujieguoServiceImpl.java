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


import com.dao.JianxiujieguoDao;
import com.entity.JianxiujieguoEntity;
import com.service.JianxiujieguoService;
import com.entity.vo.JianxiujieguoVO;
import com.entity.view.JianxiujieguoView;

@Service("jianxiujieguoService")
public class JianxiujieguoServiceImpl extends ServiceImpl<JianxiujieguoDao, JianxiujieguoEntity> implements JianxiujieguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianxiujieguoEntity> page = this.selectPage(
                new Query<JianxiujieguoEntity>(params).getPage(),
                new EntityWrapper<JianxiujieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianxiujieguoEntity> wrapper) {
		  Page<JianxiujieguoView> page =new Query<JianxiujieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianxiujieguoVO> selectListVO(Wrapper<JianxiujieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianxiujieguoVO selectVO(Wrapper<JianxiujieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianxiujieguoView> selectListView(Wrapper<JianxiujieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianxiujieguoView selectView(Wrapper<JianxiujieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
