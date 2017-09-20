package com.share1024.dao;

import com.share1024.model.Tag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yesheng on 2017/9/17.
 */
public interface ProjTagRelateDao {

    void save(@Param("projectId") int projectId, @Param("tags") List<Integer> tags);
}
