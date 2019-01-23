package com.hand.hand.controller;

import com.hand.hand.service.ContactPersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/contact")
public class ContactPersonController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContactPersonController.class);

    @Resource
    private ContactPersonService ontactPersonService;

    /**
     * 查询所有联系名称
     * @return
     */
    @RequestMapping(value = "/findContactPersonList")
    @ResponseBody
    public List<Map<String,Object>> findContactPersonList(String name) {
        return ontactPersonService.findContactPersonList(name);
    }
}
