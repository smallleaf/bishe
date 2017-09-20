package com.share1024.dao;

import com.share1024.model.Project;
import org.apache.ibatis.annotations.Param;

/**
 * Created by yesheng on 2017/9/17.
 */
public interface ProjectDao {

    int save(@Param("project") Project project);
}
