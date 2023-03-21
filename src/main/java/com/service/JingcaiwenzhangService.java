package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingcaiwenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingcaiwenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingcaiwenzhangView;


/**
 * 精彩文章
 *
 * @author 
 * @email 
 * @date 2023-03-18 15:00:31
 */
public interface JingcaiwenzhangService extends IService<JingcaiwenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingcaiwenzhangVO> selectListVO(Wrapper<JingcaiwenzhangEntity> wrapper);
   	
   	JingcaiwenzhangVO selectVO(@Param("ew") Wrapper<JingcaiwenzhangEntity> wrapper);
   	
   	List<JingcaiwenzhangView> selectListView(Wrapper<JingcaiwenzhangEntity> wrapper);
   	
   	JingcaiwenzhangView selectView(@Param("ew") Wrapper<JingcaiwenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingcaiwenzhangEntity> wrapper);
   	

}

