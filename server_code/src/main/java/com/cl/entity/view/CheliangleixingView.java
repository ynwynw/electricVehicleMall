package com.cl.entity.view;

import com.cl.entity.CheliangleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 车辆类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-05-10 11:57:52
 */
@TableName("cheliangleixing")
public class CheliangleixingView  extends CheliangleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheliangleixingView(){
	}
 
 	public CheliangleixingView(CheliangleixingEntity cheliangleixingEntity){
 	try {
			BeanUtils.copyProperties(this, cheliangleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
