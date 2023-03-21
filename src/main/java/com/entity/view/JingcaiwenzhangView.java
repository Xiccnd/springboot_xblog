package com.entity.view;

import com.entity.JingcaiwenzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 精彩文章
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-18 15:00:31
 */
@TableName("jingcaiwenzhang")
public class JingcaiwenzhangView  extends JingcaiwenzhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingcaiwenzhangView(){
	}
 
 	public JingcaiwenzhangView(JingcaiwenzhangEntity jingcaiwenzhangEntity){
 	try {
			BeanUtils.copyProperties(this, jingcaiwenzhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
