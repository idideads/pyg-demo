package com.test.pyg.sallergoods.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.test.entity.PageResult;
import com.test.pyg.mapper.TbBrandMapper;
import com.test.pyg.pojo.TbBrand;
import com.test.pyg.sallergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper tbBrandMapper;

    @Override
    public List<TbBrand> findAll() {
        return tbBrandMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        //设置分页代理，需要用到查第几页和每页大小
        PageHelper.startPage(pageNum, pageSize);
        //查询结果强转成分页结果对象
        Page<TbBrand> page = (Page<TbBrand>) tbBrandMapper.selectByExample(null);
        //返回需要查询的自定义分页对象，包含总记录数和一页的结果集
        return new PageResult(page.getTotal(), page.getResult());
    }
}
