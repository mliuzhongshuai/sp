package org.platform.dao;

import org.platform.common.CommonDao;
import org.platform.entity.Stu;
import org.springframework.stereotype.Repository;

/**
 * Created by liuzhongshuai on 15/11/11.
 */
@Repository
public class StuDao extends CommonDao {

    private String mapId="org.platform.mapping.student";


    /**
     * 保存学生信息
     * @param stu
     */
    public void saveStu(Stu stu){
        this.sqlSession.insert(mapId+"saveStu",stu);
    }
}
