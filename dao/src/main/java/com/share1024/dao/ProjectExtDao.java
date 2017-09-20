package com.share1024.dao;

import com.share1024.model.ProjectExt;
import org.apache.ibatis.annotations.Param;

/**
 * Created by yesheng on 2017/9/17.
 */
public interface ProjectExtDao {
    void save(@Param("projectExt") ProjectExt projectExt);
}
