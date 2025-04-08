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


import com.dao.JiushuileixingDao;
import com.entity.JiushuileixingEntity;
import com.service.JiushuileixingService;
import com.entity.vo.JiushuileixingVO;
import com.entity.view.JiushuileixingView;

@Service("jiushuileixingService")
public class JiushuileixingServiceImpl extends ServiceImpl<JiushuileixingDao, JiushuileixingEntity> implements JiushuileixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiushuileixingEntity> page = this.selectPage(
                new Query<JiushuileixingEntity>(params).getPage(),
                new EntityWrapper<JiushuileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiushuileixingEntity> wrapper) {
		  Page<JiushuileixingView> page =new Query<JiushuileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiushuileixingVO> selectListVO(Wrapper<JiushuileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiushuileixingVO selectVO(Wrapper<JiushuileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiushuileixingView> selectListView(Wrapper<JiushuileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiushuileixingView selectView(Wrapper<JiushuileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
