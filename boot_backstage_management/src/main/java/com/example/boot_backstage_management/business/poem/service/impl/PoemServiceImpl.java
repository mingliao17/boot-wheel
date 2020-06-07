package com.example.boot_backstage_management.business.poem.service.impl;

import com.example.boot_backstage_management.business.poem.mapper.PoemMapper;
import com.example.boot_backstage_management.business.poem.model.Poem;
import com.example.boot_backstage_management.business.poem.service.PoemService;
import com.example.boot_backstage_management.common.SnowIdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: mingliao17
 * @CreateTime: 2020/6/6 18:29
 * @Descrption: change_the_world
 */
@Service
public class PoemServiceImpl implements PoemService {

    @Autowired
    private PoemMapper poemMapper;

    @Override
    public List<Map> selectPoemList(Poem poem) {
        return poemMapper.selectPoemList(poem);
    }

    @Override
    public int poemAdd(Poem poem) {
        poem.setId(SnowIdUtils.getUniqueLongHex());
        return poemMapper.poemAdd(poem);
    }
}
