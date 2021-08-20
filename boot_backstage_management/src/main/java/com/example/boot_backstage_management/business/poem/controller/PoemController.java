package com.example.boot_backstage_management.business.poem.controller;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSON;
import com.example.boot_backstage_management.business.poem.model.Poem;
import com.example.boot_backstage_management.business.poem.service.PoemService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: mingliao17
 * @CreateTime: 2020/6/6 16:05
 * @Descrption: change_the_world
 */
@RequestMapping("/poem")
@Controller
public class PoemController {

    @Autowired
    private PoemService poemService;

    public static final String init_url = "business/poem";

    @GetMapping
    public String trunPoemList() {
        return init_url + "/poem_list";
    }

    @ResponseBody
    @GetMapping("/selectPoemList")
    public String selectPoemList(Poem poem, Integer page, Integer limit) {
        Page pageBefore = PageHelper.startPage(page, limit);
        List<Map> poemList = poemService.selectPoemList(poem);
        HashMap returnMap = new HashMap();
        returnMap.put("code", "0");
        returnMap.put("msg", "0");
        returnMap.put("count", pageBefore.getTotal());
        returnMap.put("data", poemList);
        return JSON.toJSONString(returnMap);
    }

    @GetMapping("/turnPoemAdd")
    public String trunPoemAdd() {
        return init_url + "/poem_add";
    }

    @ResponseBody
    @PostMapping("/poemAdd")
    public String poemAdd(Poem poem) {
        poemService.poemAdd(poem);
        return "ok";
    }

    @GetMapping("/turnPoemUpdate")
    public String turnPoemUpdate() {
        return init_url + "/poem_update";
    }

    @ResponseBody
    @PostMapping("/poemUpdate")
    public String poemUpdate() {
        return "";
    }

    @ResponseBody
    @GetMapping("/poemDel")
    public String poemDel() {
        return "";
    }

    @ResponseBody
    @GetMapping("/poemExport")
    public String poemExport() {
        return "";
    }

}
