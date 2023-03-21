package com.dao;

import com.entity.DiscussjingcaiwenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingcaiwenzhangVO;
import com.entity.view.DiscussjingcaiwenzhangView;


/**
 * 精彩文章评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-18 15:00:31
 */
public interface DiscussjingcaiwenzhangDao extends BaseMapper<DiscussjingcaiwenzhangEntity> {
	
	List<DiscussjingcaiwenzhangVO> selectListVO(@Param("ew") Wrapper<DiscussjingcaiwenzhangEntity> wrapper);
	
	DiscussjingcaiwenzhangVO selectVO(@Param("ew") Wrapper<DiscussjingcaiwenzhangEntity> wrapper);
	
	List<DiscussjingcaiwenzhangView> selectListView(@Param("ew") Wrapper<DiscussjingcaiwenzhangEntity> wrapper);

	List<DiscussjingcaiwenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingcaiwenzhangEntity> wrapper);
	
	DiscussjingcaiwenzhangView selectView(@Param("ew") Wrapper<DiscussjingcaiwenzhangEntity> wrapper);
	

}
