package com.changgou.controller;

import com.changgou.entity.Result;
import com.changgou.entity.StatusCode;
import com.changgou.goods.pojo.Brand;
import com.changgou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 下午12:43 14/11/2021
 * @Modified By:
 */
@RestController  //@ResponseBody ＋ @Controller
@RequestMapping(value = "/brand")
@CrossOrigin //跨域 ：A域名访问B域名的数据会存在跨域（域名、端口、协议不一致时是跨域）
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping
    public Result<List<Brand>> findAll(){
        List<Brand> brandList = brandService.findAll();
        return new Result<List<Brand>>(true, StatusCode.OK,"查询集合成功！",brandList);
    }

}
