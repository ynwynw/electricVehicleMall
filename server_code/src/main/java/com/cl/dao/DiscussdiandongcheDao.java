package com.cl.dao;

import com.cl.entity.DiscussdiandongcheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussdiandongcheView;


/**
 * 电动车评论表
 * 
 * @author 
 * @email 
 * @date 2024-05-10 11:57:53
 */
public interface DiscussdiandongcheDao extends BaseMapper<DiscussdiandongcheEntity> {
	
	List<DiscussdiandongcheView> selectListView(@Param("ew") Wrapper<DiscussdiandongcheEntity> wrapper);

	List<DiscussdiandongcheView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdiandongcheEntity> wrapper);
	
	DiscussdiandongcheView selectView(@Param("ew") Wrapper<DiscussdiandongcheEntity> wrapper);
	

}
