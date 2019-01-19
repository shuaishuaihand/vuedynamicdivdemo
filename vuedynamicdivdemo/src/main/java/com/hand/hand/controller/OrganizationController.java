package com.hand.hand.controller;
import com.hand.hand.service.OrgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/org")
public class OrganizationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationController.class);

    @Resource
    private OrgService orgService;

    /**
     * 查询组织结构下拉树
     * @return
     */
    @RequestMapping(value = "/findOrgUserTree", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public List<Map<String,Object>> findOrgUserTree() {
        return orgService.findOrgUserTree(0);
    }
}
