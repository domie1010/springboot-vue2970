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


import com.dao.JiushuigoumaiDao;
import com.entity.JiushuigoumaiEntity;
import com.service.JiushuigoumaiService;
import com.entity.vo.JiushuigoumaiVO;
import com.entity.view.JiushuigoumaiView;

@Service("jiushuigoumaiService")
public class JiushuigoumaiServiceImpl extends ServiceImpl<JiushuigoumaiDao, JiushuigoumaiEntity> implements JiushuigoumaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiushuigoumaiEntity> page = this.selectPage(
                new Query<JiushuigoumaiEntity>(params).getPage(),
                new EntityWrapper<JiushuigoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiushuigoumaiEntity> wrapper) {
		  Page<JiushuigoumaiView> page =new Query<JiushuigoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiushuigoumaiVO> selectListVO(Wrapper<JiushuigoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiushuigoumaiVO selectVO(Wrapper<JiushuigoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiushuigoumaiView> selectListView(Wrapper<JiushuigoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiushuigoumaiView selectView(Wrapper<JiushuigoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
