package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiandongcheEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiandongcheView;


/**
 * 电动车
 *
 * @author 
 * @email 
 * @date 2024-05-10 11:57:52
 */
public interface DiandongcheService extends IService<DiandongcheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiandongcheView> selectListView(Wrapper<DiandongcheEntity> wrapper);
   	
   	DiandongcheView selectView(@Param("ew") Wrapper<DiandongcheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiandongcheEntity> wrapper);
   	

}

