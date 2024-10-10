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


import com.cl.dao.DiscussdiandongcheDao;
import com.cl.entity.DiscussdiandongcheEntity;
import com.cl.service.DiscussdiandongcheService;
import com.cl.entity.view.DiscussdiandongcheView;

@Service("discussdiandongcheService")
public class DiscussdiandongcheServiceImpl extends ServiceImpl<DiscussdiandongcheDao, DiscussdiandongcheEntity> implements DiscussdiandongcheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdiandongcheEntity> page = this.selectPage(
                new Query<DiscussdiandongcheEntity>(params).getPage(),
                new EntityWrapper<DiscussdiandongcheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdiandongcheEntity> wrapper) {
		  Page<DiscussdiandongcheView> page =new Query<DiscussdiandongcheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussdiandongcheView> selectListView(Wrapper<DiscussdiandongcheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdiandongcheView selectView(Wrapper<DiscussdiandongcheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
