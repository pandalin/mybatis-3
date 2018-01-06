package com.learning;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author xm.lin xm.lin@anxincloud.com
 * @Description
 * @date 2018/1/5 16:33
 */
@Mapper
public interface UserMapper {

    @Select("select * from sys_user where id = ${id}")
    User selectUserById(@Param("id") Long id);
}
