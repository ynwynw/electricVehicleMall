package com.cl.dao;

import com.cl.entity.DiandongcheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiandongcheView;


/**
 * 电动车
 * 
 * @author 
 * @email 
 * @date 2024-05-10 11:57:52
 */
public interface DiandongcheDao extends BaseMapper<DiandongcheEntity> {
	
	List<DiandongcheView> selectListView(@Param("ew") Wrapper<DiandongcheEntity> wrapper);

	List<DiandongcheView> selectListView(Pagination page,@Param("ew") Wrapper<DiandongcheEntity> wrapper);
	
	DiandongcheView selectView(@Param("ew") Wrapper<DiandongcheEntity> wrapper);
	

}
