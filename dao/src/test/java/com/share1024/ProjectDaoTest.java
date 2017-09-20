package com.share1024;

import com.share1024.dao.ProjectDao;
import com.share1024.dao.ProjectExtDao;
import com.share1024.model.Project;
import com.share1024.model.ProjectExt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yesheng on 2017/9/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class ProjectDaoTest {

    @Autowired
    private ProjectDao projectDao;

    @Autowired
    private ProjectExtDao projectExtDao;

    @Test
    public void test(){

        Project project = new Project();
        project.setCategoryName("java");
        project.setPic1("http:1");
        project.setPic2("http2");
        project.setRank(0);
        project.setResourceUrl("http://www.baidu.com");
        project.setScanAmount(0);
        project.setTitle("java毕业设计");

        int result = projectDao.save(project);
        System.out.println(result+"===="+project.getId());

        ProjectExt projectExt = new ProjectExt();
        projectExt.setProjectContent("sdsdd");
        projectExtDao.save(projectExt);
    }
}
