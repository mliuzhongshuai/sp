package org.platform.serviceImpl;

import com.alibaba.dubbo.common.threadpool.support.cached.CachedThreadPool;
import org.platform.dao.StuDao;
import org.platform.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liuzhongshuai on 15/11/11.
 */
@Service
@Transactional
public class StuImpl implements StuService {


    @Autowired
    private StuDao stuDao;
    @Autowired
    private RedisTemplate redisTemplate;



    public void saveStu(Map<String, String> stu) {


        /*stringRedisTemplate.delete("myStr");
        stringRedisTemplate.opsForValue().set("myStr", "http://yjmyzz.cnblogs.com/");
        System.out.println(stringRedisTemplate.opsForValue().get("myStr"));
        System.out.println("---------------");*/

        ValueOperations<String, Object> valueOper=redisTemplate.opsForValue();


        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.reverse();

        List list =new ArrayList();



        stuDao.saveStu(stu);
    }
}
