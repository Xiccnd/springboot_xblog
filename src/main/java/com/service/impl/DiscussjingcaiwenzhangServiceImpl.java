package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjingcaiwenzhangDao;
import com.entity.DiscussjingcaiwenzhangEntity;
import com.service.DiscussjingcaiwenzhangService;
import com.entity.vo.DiscussjingcaiwenzhangVO;
import com.entity.view.DiscussjingcaiwenzhangView;

@Service("discussjingcaiwenzhangService")
public class DiscussjingcaiwenzhangServiceImpl extends ServiceImpl<DiscussjingcaiwenzhangDao, DiscussjingcaiwenzhangEntity> implements DiscussjingcaiwenzhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingcaiwenzhangEntity> page = this.selectPage(
                new Query<DiscussjingcaiwenzhangEntity>(params).getPage(),
                new EntityWrapper<DiscussjingcaiwenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingcaiwenzhangEntity> wrapper) {
		  Page<DiscussjingcaiwenzhangView> page =new Query<DiscussjingcaiwenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingcaiwenzhangVO> selectListVO(Wrapper<DiscussjingcaiwenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingcaiwenzhangVO selectVO(Wrapper<DiscussjingcaiwenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingcaiwenzhangView> selectListView(Wrapper<DiscussjingcaiwenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingcaiwenzhangView selectView(Wrapper<DiscussjingcaiwenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
