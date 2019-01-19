package com.hand.hand.mapper;


import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
public interface OrgMapper {

    List<Map<String, Object>> findListByPid(@Param("pid") Integer pid);

}
