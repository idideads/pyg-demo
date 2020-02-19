package com.test.pyg.sallergoods.service.impl;

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
}
