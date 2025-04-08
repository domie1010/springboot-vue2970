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


import com.dao.QujiuxinxiDao;
import com.entity.QujiuxinxiEntity;
import com.service.QujiuxinxiService;
import com.entity.vo.QujiuxinxiVO;
import com.entity.view.QujiuxinxiView;

@Service("qujiuxinxiService")
public class QujiuxinxiServiceImpl extends ServiceImpl<QujiuxinxiDao, QujiuxinxiEntity> implements QujiuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QujiuxinxiEntity> page = this.selectPage(
                new Query<QujiuxinxiEntity>(params).getPage(),
                new EntityWrapper<QujiuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QujiuxinxiEntity> wrapper) {
		  Page<QujiuxinxiView> page =new Query<QujiuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QujiuxinxiVO> selectListVO(Wrapper<QujiuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QujiuxinxiVO selectVO(Wrapper<QujiuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QujiuxinxiView> selectListView(Wrapper<QujiuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QujiuxinxiView selectView(Wrapper<QujiuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
