package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingcaiwenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingcaiwenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingcaiwenzhangView;


/**
 * 精彩文章评论表
 *
 * @author 
 * @email 
 * @date 2023-03-18 15:00:31
 */
public interface DiscussjingcaiwenzhangService extends IService<DiscussjingcaiwenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingcaiwenzhangVO> selectListVO(Wrapper<DiscussjingcaiwenzhangEntity> wrapper);
   	
   	DiscussjingcaiwenzhangVO selectVO(@Param("ew") Wrapper<DiscussjingcaiwenzhangEntity> wrapper);
   	
   	List<DiscussjingcaiwenzhangView> selectListView(Wrapper<DiscussjingcaiwenzhangEntity> wrapper);
   	
   	DiscussjingcaiwenzhangView selectView(@Param("ew") Wrapper<DiscussjingcaiwenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingcaiwenzhangEntity> wrapper);
   	

}

