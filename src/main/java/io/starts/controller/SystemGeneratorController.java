package io.starts.controller;

import com.baomidou.mybatisplus.extension.api.R;
import io.starts.service.SystemGeneratorService;
import io.starts.utils.PageUtils;
import io.starts.utils.Query;
import io.starts.utils.ReturnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author haoyang
 * @create 2022-12-08 20:23
 * @Description
 */
@Controller
@RequestMapping("/system/generator")
public class SystemGeneratorController {

    private final SystemGeneratorService systemGeneratorService;

    public SystemGeneratorController(SystemGeneratorService systemGeneratorService) {
        this.systemGeneratorService = systemGeneratorService;
    }

    /**
     * 获取数据库列表
     * @param params 数据库数据集合
     * @return 返回数据
     */
    @ResponseBody
    @RequestMapping("/list")
    public ReturnData list(@RequestParam Map<String, Object> params){
        PageUtils pageUtil = systemGeneratorService.queryList(new Query(params));

        return (ReturnData) ReturnData.ok().put("page", pageUtil);
    }


}
