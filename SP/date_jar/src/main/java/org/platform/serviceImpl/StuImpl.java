package org.platform.serviceImpl;

import org.platform.dao.StuDao;
import org.platform.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * Created by liuzhongshuai on 15/11/11.
 */
@Service
@Transactional
public class StuImpl implements StuService {


    @Autowired
    private StuDao stuDao;

    /*@Autowired
    private StringRedisTemplate stringRedisTemplate;*/


    public void saveStu(Map<String, String> stu) {
        /*stringRedisTemplate.delete("myStr");
        stringRedisTemplate.opsForValue().set("myStr", "http://yjmyzz.cnblogs.com/");
        System.out.println(stringRedisTemplate.opsForValue().get("myStr"));
        System.out.println("---------------");*/

        stuDao.saveStu(stu);
    }
}
