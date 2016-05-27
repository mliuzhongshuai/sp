package org.platform.common;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liuzhongshuai on 15/11/11.
 */
public abstract class CommonDao {

    @Autowired
    protected SqlSessionTemplate sqlSession;




}
