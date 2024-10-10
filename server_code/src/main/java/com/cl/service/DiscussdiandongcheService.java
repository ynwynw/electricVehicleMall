package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussdiandongcheEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussdiandongcheView;


/**
 * 电动车评论表
 *
 * @author 
 * @email 
 * @date 2024-05-10 11:57:53
 */
public interface DiscussdiandongcheService extends IService<DiscussdiandongcheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdiandongcheView> selectListView(Wrapper<DiscussdiandongcheEntity> wrapper);
   	
   	DiscussdiandongcheView selectView(@Param("ew") Wrapper<DiscussdiandongcheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdiandongcheEntity> wrapper);
   	

}

