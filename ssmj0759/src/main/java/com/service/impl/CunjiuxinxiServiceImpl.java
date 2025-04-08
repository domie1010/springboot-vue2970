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


import com.dao.CunjiuxinxiDao;
import com.entity.CunjiuxinxiEntity;
import com.service.CunjiuxinxiService;
import com.entity.vo.CunjiuxinxiVO;
import com.entity.view.CunjiuxinxiView;

@Service("cunjiuxinxiService")
public class CunjiuxinxiServiceImpl extends ServiceImpl<CunjiuxinxiDao, CunjiuxinxiEntity> implements CunjiuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CunjiuxinxiEntity> page = this.selectPage(
                new Query<CunjiuxinxiEntity>(params).getPage(),
                new EntityWrapper<CunjiuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CunjiuxinxiEntity> wrapper) {
		  Page<CunjiuxinxiView> page =new Query<CunjiuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CunjiuxinxiVO> selectListVO(Wrapper<CunjiuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CunjiuxinxiVO selectVO(Wrapper<CunjiuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CunjiuxinxiView> selectListView(Wrapper<CunjiuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CunjiuxinxiView selectView(Wrapper<CunjiuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
