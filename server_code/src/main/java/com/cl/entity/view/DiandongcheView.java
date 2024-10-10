package com.cl.entity.view;

import com.cl.entity.DiandongcheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 电动车
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-05-10 11:57:52
 */
@TableName("diandongche")
public class DiandongcheView  extends DiandongcheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiandongcheView(){
	}
 
 	public DiandongcheView(DiandongcheEntity diandongcheEntity){
 	try {
			BeanUtils.copyProperties(this, diandongcheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
