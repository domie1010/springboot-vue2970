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


import com.dao.DiscussjiushuixinxiDao;
import com.entity.DiscussjiushuixinxiEntity;
import com.service.DiscussjiushuixinxiService;
import com.entity.vo.DiscussjiushuixinxiVO;
import com.entity.view.DiscussjiushuixinxiView;

@Service("discussjiushuixinxiService")
public class DiscussjiushuixinxiServiceImpl extends ServiceImpl<DiscussjiushuixinxiDao, DiscussjiushuixinxiEntity> implements DiscussjiushuixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiushuixinxiEntity> page = this.selectPage(
                new Query<DiscussjiushuixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjiushuixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiushuixinxiEntity> wrapper) {
		  Page<DiscussjiushuixinxiView> page =new Query<DiscussjiushuixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiushuixinxiVO> selectListVO(Wrapper<DiscussjiushuixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiushuixinxiVO selectVO(Wrapper<DiscussjiushuixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiushuixinxiView> selectListView(Wrapper<DiscussjiushuixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiushuixinxiView selectView(Wrapper<DiscussjiushuixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
