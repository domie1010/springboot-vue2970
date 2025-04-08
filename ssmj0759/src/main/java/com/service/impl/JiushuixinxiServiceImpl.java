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


import com.dao.JiushuixinxiDao;
import com.entity.JiushuixinxiEntity;
import com.service.JiushuixinxiService;
import com.entity.vo.JiushuixinxiVO;
import com.entity.view.JiushuixinxiView;

@Service("jiushuixinxiService")
public class JiushuixinxiServiceImpl extends ServiceImpl<JiushuixinxiDao, JiushuixinxiEntity> implements JiushuixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiushuixinxiEntity> page = this.selectPage(
                new Query<JiushuixinxiEntity>(params).getPage(),
                new EntityWrapper<JiushuixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiushuixinxiEntity> wrapper) {
		  Page<JiushuixinxiView> page =new Query<JiushuixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiushuixinxiVO> selectListVO(Wrapper<JiushuixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiushuixinxiVO selectVO(Wrapper<JiushuixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiushuixinxiView> selectListView(Wrapper<JiushuixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiushuixinxiView selectView(Wrapper<JiushuixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
