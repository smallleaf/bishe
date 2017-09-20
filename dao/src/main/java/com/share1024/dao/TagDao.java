package com.share1024.dao;

import com.share1024.model.Tag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yesheng on 2017/9/17.
 */
public interface TagDao {
    void save(@Param("name") String name);

    List<Tag> findTags(@Param("projectId") int projectId);




}
