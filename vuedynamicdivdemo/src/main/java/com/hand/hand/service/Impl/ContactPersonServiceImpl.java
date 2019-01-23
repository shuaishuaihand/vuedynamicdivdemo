package com.hand.hand.service.Impl;

import com.hand.hand.mapper.ContactPersonMapper;
import com.hand.hand.service.ContactPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ContactPersonServiceImpl implements ContactPersonService {

    @Autowired
    private ContactPersonMapper contactPersonMapper;


    /**
     * 递归查询组织机构-用户树节点
     * @return
     */
    public List<Map<String, Object>> findContactPersonList(String name) {

        return contactPersonMapper.findContactPersonList(name);
    }

}
