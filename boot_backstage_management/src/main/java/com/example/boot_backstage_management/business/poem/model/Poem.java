package com.example.boot_backstage_management.business.poem.model;

import lombok.Data;

/**
 * @Author: mingliao17
 * @CreateTime: 2020/6/6 16:20
 * @Descrption: 古诗表对应实体类信息
 */
@Data
public class Poem {
    private String id;
    private String poemName;
    private String author;
    private String dynasty;
    private String poemContent;
    private String label;
    private String translation;
    private String aboutTheAuthor;
}
