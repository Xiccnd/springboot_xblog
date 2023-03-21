package com.entity.view;

import com.entity.DiscussjingcaiwenzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 精彩文章评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-18 15:00:31
 */
@TableName("discussjingcaiwenzhang")
public class DiscussjingcaiwenzhangView  extends DiscussjingcaiwenzhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjingcaiwenzhangView(){
	}
 
 	public DiscussjingcaiwenzhangView(DiscussjingcaiwenzhangEntity discussjingcaiwenzhangEntity){
 	try {
			BeanUtils.copyProperties(this, discussjingcaiwenzhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
