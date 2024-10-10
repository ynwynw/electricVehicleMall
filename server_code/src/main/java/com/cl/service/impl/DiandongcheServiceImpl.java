package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.DiandongcheDao;
import com.cl.entity.DiandongcheEntity;
import com.cl.service.DiandongcheService;
import com.cl.entity.view.DiandongcheView;

@Service("diandongcheService")
public class DiandongcheServiceImpl extends ServiceImpl<DiandongcheDao, DiandongcheEntity> implements DiandongcheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiandongcheEntity> page = this.selectPage(
                new Query<DiandongcheEntity>(params).getPage(),
                new EntityWrapper<DiandongcheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiandongcheEntity> wrapper) {
		  Page<DiandongcheView> page =new Query<DiandongcheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiandongcheView> selectListView(Wrapper<DiandongcheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiandongcheView selectView(Wrapper<DiandongcheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
