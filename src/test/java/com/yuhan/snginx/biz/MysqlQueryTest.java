package com.yuhan.snginx.biz;

import com.yuhan.snginx.SnginxApplicationTests;
import com.yuhan.snginx.modle.Java;
import com.yuhan.snginx.modle.User;
import com.yuhan.snginx.repo.mongo.JavaMongoDao;
import com.yuhan.snginx.repo.mongo.UserMongoDao;
import com.yuhan.snginx.repo.mysql.UserDao;
import com.yuhan.snginx.repo.redis.RedisDao;
import org.junit.Test;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;

/**
 * @author yuzhuJiao
 * @since 2023/08/27
 */
public class MysqlQueryTest extends SnginxApplicationTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserMongoDao userMongoDao;

    @Autowired
    private JavaMongoDao javaMongoDao;

    @Autowired
    private RedisDao redisDao;

    @Autowired
    private RedissonClient redissonClient;

    @Test
    public void findAll() {
        List<User> users = userDao.findAll();

        users.forEach(System.out::println);
    }

    @Test
    public void mongo() {
        User user = new User();
        user.setId(5L);
        user.setAge(25);
        user.setName("jiaoyuzhu");
        user.setEmail("1943069037@qq.com");
        user.setAddress("宁夏银川");
        userMongoDao.save(user);
    }


    @Test
    public void mongoSave() {
        Java java = new Java();
        java.setName("oracle open jdk");
        java.setDiff(10);
        java.setBrand("oracle");
        javaMongoDao.save(java);
    }

    @Test
    public void mongoFind() {
        Collection<User> all = userMongoDao.findAll(User.class);
        all.forEach(System.out::println);
    }

    @Test
    public void redis() {
        String name = redisDao.get("name");
        System.out.println(name);
    }

    @Test
    public void redissionTest() {
        String lockKey = "snginx:lock";
        RLock lock = redissonClient.getLock(lockKey);

        Thread1 thread1 = new Thread1(lock);
        Thread2 thread2 = new Thread2(lock);

        thread1.start();
        thread2.start();
    }

}
