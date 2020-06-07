package com.example.boot_backstage_management.business.poem.service;

import com.example.boot_backstage_management.business.poem.model.Poem;

import java.util.List;
import java.util.Map;

/**
 * @Author: mingliao17
 * @CreateTime: 2020/6/6 18:29
 * @Descrption: change_the_world
 */
public interface PoemService {

    List<Map> selectPoemList(Poem poem);

    int poemAdd(Poem poem);
}
