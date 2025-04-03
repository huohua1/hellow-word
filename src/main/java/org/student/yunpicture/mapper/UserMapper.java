package org.student.yunpicture.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.student.yunpicture.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 39388
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2025-02-27 21:14:16
* @Entity org.student.yunpicture.model.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




