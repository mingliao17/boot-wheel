package com.example.boot_backstage_management;

import com.example.boot_backstage_management.business.poem.mapper.PoemMapper;
import com.example.boot_backstage_management.business.poem.model.Poem;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootBackstageManagementApplication.class)
class BootBackstageManagementApplicationTests {

    @Autowired
    private PoemMapper poemMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testPoemSelect(){
        Page pageBefore = PageHelper.startPage(1,5);
        Poem p = new Poem();
        p.setPoemName("秋");
        List<Map> poemList = poemMapper.selectPoemList(p);
        for(Map m : poemList){
            System.out.println(m.values());
        }
    }
}
