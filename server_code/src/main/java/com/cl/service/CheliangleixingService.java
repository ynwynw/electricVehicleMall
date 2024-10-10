package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.CheliangleixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.CheliangleixingView;


/**
 * 车辆类型
 *
 * @author 
 * @email 
 * @date 2024-05-10 11:57:52
 */
public interface CheliangleixingService extends IService<CheliangleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangleixingView> selectListView(Wrapper<CheliangleixingEntity> wrapper);
   	
   	CheliangleixingView selectView(@Param("ew") Wrapper<CheliangleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangleixingEntity> wrapper);
   	

}

