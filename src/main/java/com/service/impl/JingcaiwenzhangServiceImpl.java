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


import com.dao.JingcaiwenzhangDao;
import com.entity.JingcaiwenzhangEntity;
import com.service.JingcaiwenzhangService;
import com.entity.vo.JingcaiwenzhangVO;
import com.entity.view.JingcaiwenzhangView;

@Service("jingcaiwenzhangService")
public class JingcaiwenzhangServiceImpl extends ServiceImpl<JingcaiwenzhangDao, JingcaiwenzhangEntity> implements JingcaiwenzhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingcaiwenzhangEntity> page = this.selectPage(
                new Query<JingcaiwenzhangEntity>(params).getPage(),
                new EntityWrapper<JingcaiwenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingcaiwenzhangEntity> wrapper) {
		  Page<JingcaiwenzhangView> page =new Query<JingcaiwenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingcaiwenzhangVO> selectListVO(Wrapper<JingcaiwenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingcaiwenzhangVO selectVO(Wrapper<JingcaiwenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingcaiwenzhangView> selectListView(Wrapper<JingcaiwenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingcaiwenzhangView selectView(Wrapper<JingcaiwenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
