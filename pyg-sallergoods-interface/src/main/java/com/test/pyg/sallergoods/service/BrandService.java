package com.test.pyg.sallergoods.service;

import com.test.entity.PageResult;
import com.test.pyg.pojo.TbBrand;

import java.util.List;

/**
 * 品牌服务接口
 */
public interface BrandService {
    /**
     * 查询所有品牌
     * @return 品牌List
     */
    List<TbBrand> findAll();

    /**
     * 分页查询品牌
     * @param pageNum:第几页
     * @param pageSize:每页大小
     * @return 分页对象
     */
    PageResult findPage(int pageNum, int pageSize);
}
