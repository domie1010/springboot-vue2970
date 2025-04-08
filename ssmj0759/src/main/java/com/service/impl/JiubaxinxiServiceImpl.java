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


import com.dao.JiubaxinxiDao;
import com.entity.JiubaxinxiEntity;
import com.service.JiubaxinxiService;
import com.entity.vo.JiubaxinxiVO;
import com.entity.view.JiubaxinxiView;

@Service("jiubaxinxiService")
public class JiubaxinxiServiceImpl extends ServiceImpl<JiubaxinxiDao, JiubaxinxiEntity> implements JiubaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiubaxinxiEntity> page = this.selectPage(
                new Query<JiubaxinxiEntity>(params).getPage(),
                new EntityWrapper<JiubaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiubaxinxiEntity> wrapper) {
		  Page<JiubaxinxiView> page =new Query<JiubaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiubaxinxiVO> selectListVO(Wrapper<JiubaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiubaxinxiVO selectVO(Wrapper<JiubaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiubaxinxiView> selectListView(Wrapper<JiubaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiubaxinxiView selectView(Wrapper<JiubaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
