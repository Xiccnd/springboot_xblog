package com.dao;

import com.entity.JingcaiwenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingcaiwenzhangVO;
import com.entity.view.JingcaiwenzhangView;


/**
 * 精彩文章
 * 
 * @author 
 * @email 
 * @date 2023-03-18 15:00:31
 */
public interface JingcaiwenzhangDao extends BaseMapper<JingcaiwenzhangEntity> {
	
	List<JingcaiwenzhangVO> selectListVO(@Param("ew") Wrapper<JingcaiwenzhangEntity> wrapper);
	
	JingcaiwenzhangVO selectVO(@Param("ew") Wrapper<JingcaiwenzhangEntity> wrapper);
	
	List<JingcaiwenzhangView> selectListView(@Param("ew") Wrapper<JingcaiwenzhangEntity> wrapper);

	List<JingcaiwenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<JingcaiwenzhangEntity> wrapper);
	
	JingcaiwenzhangView selectView(@Param("ew") Wrapper<JingcaiwenzhangEntity> wrapper);
	

}
