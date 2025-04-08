package com.entity.view;

import com.entity.JiubaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒吧信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
@TableName("jiubaxinxi")
public class JiubaxinxiView  extends JiubaxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiubaxinxiView(){
	}
 
 	public JiubaxinxiView(JiubaxinxiEntity jiubaxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jiubaxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
