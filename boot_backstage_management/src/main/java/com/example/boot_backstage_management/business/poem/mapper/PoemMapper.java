package com.example.boot_backstage_management.business.poem.mapper;

import com.example.boot_backstage_management.business.poem.model.Poem;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: mingliao17
 * @CreateTime: 2020/6/6 16:16
 * @Descrption: change_the_world
 */
@Repository
public interface PoemMapper {

    List<Map> selectPoemList(Poem poem);

    int poemAdd(Poem poem);
}
