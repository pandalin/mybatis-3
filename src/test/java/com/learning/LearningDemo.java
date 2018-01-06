package com.learning;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xm.lin xm.lin@anxincloud.com
 * @Description
 * @date 2018/1/5 16:28
 */
public class LearningDemo {

    public static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(LearningDemo.class);

    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream(LearningDemo.class.getClassLoader(),"com/learning/mybatis-learning.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        logger.debug(userMapper.selectUserById(1L).toString());
    }
}
