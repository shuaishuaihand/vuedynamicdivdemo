package com.hand.hand.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
public interface UserMapper {

    List<Map<String, Object>> findUserByOrgId(@Param("orgId") int orgId);

}
