package org.platform.serviceImpl;

import org.platform.dao.StuDao;
import org.platform.entity.Stu;
import org.platform.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by liuzhongshuai on 15/11/11.
 */
public class StuImpl implements StuService {


    @Autowired
    private StuDao stuDao;

    public void saveStu(Stu stu) {
        stuDao.saveStu(stu);
    }
}
