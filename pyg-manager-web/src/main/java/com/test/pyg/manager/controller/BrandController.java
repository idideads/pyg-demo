package com.test.pyg.manager.controller;

import com.test.entity.PageResult;
import com.test.pyg.pojo.TbBrand;
import com.test.pyg.sallergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll() {
        System.out.println("BrandController.findAll");
        return brandService.findAll();
    }

    @RequestMapping("/findPage")
    public PageResult findPage(int pageNum, int pageSize) {
        System.out.println("BrandController.findPage");
        return brandService.findPage(pageNum, pageSize);
    }
}
