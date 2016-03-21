package org.platform.dao;

import java.util.Map;

/**
 * Created by liuzhongshuai on 15/11/11.
 */
public interface StuDao {

    String mapId="org.platform.dao.StuDao";


    /**
     * 保存学生信息
     * @param map
     */
    void saveStu(Map<String,String> map);
}
