package com.leyou.common.leyouservice.controller;

import com.leyou.common.leyouservice.service.BrandService;
import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;
    @GetMapping("page")
    public ResponseEntity<PageResult<Brand>> queryBrandsByPage(@RequestParam(value = "key", required = false)String key,
                                                               @RequestParam(value = "page", defaultValue = "1")Integer page,
                                                               @RequestParam(value = "rows", defaultValue = "5")Integer rows,
                                                               @RequestParam(value = "sortBy", required = false)String sortBy,
                                                               @RequestParam(value = "desc", required = false)Boolean desc
    ){
        PageResult<Brand> result = this.brandService.queryBrandsByPage(key, page, rows, sortBy, desc);
        if (CollectionUtils.isEmpty(result.getItems())){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }
}
