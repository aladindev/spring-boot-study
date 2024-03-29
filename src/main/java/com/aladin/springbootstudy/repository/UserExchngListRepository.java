package com.aladin.springbootstudy.repository;

import com.aladin.springbootstudy.dto.UserExchngListDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserExchngListRepository {
    List<UserExchngListDto> getUserExchngList(@Param("email") String email);
    List<UserExchngListDto> getUserEmailList();
}
