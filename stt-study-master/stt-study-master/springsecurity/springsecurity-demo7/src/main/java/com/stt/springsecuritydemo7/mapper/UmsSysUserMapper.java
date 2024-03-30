package com.stt.springsecuritydemo7.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stt.springsecuritydemo7.domain.entity.UmsSysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UmsSysUserMapper extends BaseMapper<UmsSysUser> {
    UmsSysUser selectUserByUsername(@Param("username") String username);
}