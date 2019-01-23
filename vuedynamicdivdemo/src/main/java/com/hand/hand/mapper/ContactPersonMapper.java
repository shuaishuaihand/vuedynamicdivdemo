package com.hand.hand.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ContactPersonMapper {

    List<Map<String, Object>> findContactPersonList(String name);

}
