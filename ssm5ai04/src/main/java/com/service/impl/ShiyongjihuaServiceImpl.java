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


import com.dao.ShiyongjihuaDao;
import com.entity.ShiyongjihuaEntity;
import com.service.ShiyongjihuaService;
import com.entity.vo.ShiyongjihuaVO;
import com.entity.view.ShiyongjihuaView;

@Service("shiyongjihuaService")
public class ShiyongjihuaServiceImpl extends ServiceImpl<ShiyongjihuaDao, ShiyongjihuaEntity> implements ShiyongjihuaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyongjihuaEntity> page = this.selectPage(
                new Query<ShiyongjihuaEntity>(params).getPage(),
                new EntityWrapper<ShiyongjihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyongjihuaEntity> wrapper) {
		  Page<ShiyongjihuaView> page =new Query<ShiyongjihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyongjihuaVO> selectListVO(Wrapper<ShiyongjihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyongjihuaVO selectVO(Wrapper<ShiyongjihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyongjihuaView> selectListView(Wrapper<ShiyongjihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyongjihuaView selectView(Wrapper<ShiyongjihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
