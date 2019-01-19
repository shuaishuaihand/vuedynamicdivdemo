package com.hand.hand.service.Impl;
import com.hand.hand.mapper.OrgMapper;
import com.hand.hand.mapper.UserMapper;
import com.hand.hand.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class OrgServiceImpl implements OrgService {

    @Autowired
    private OrgMapper orgMapper;

    @Resource
    private UserMapper userMapper;

    /**
     * 递归查询组织机构-用户树节点
     * @return
     */
    public List<Map<String, Object>> findOrgUserTree(int pid) {
        // 查找根节点
        List<Map<String, Object>> list = orgMapper.findListByPid(pid);
        List<Map<String, Object>> children;
        for (Map<String, Object>  m: list) {
            children = findOrgUserTree((int)m.get("id"));
            if (children != null && children.size() != 0) {
                m.put("children",children);
            } else {
                children = userMapper.findUserByOrgId((int)m.get("id"));
                if (children != null && children.size() != 0) {
                    m.put("children",children);
                }
                //设置叶子组织机构（没有人员），为不可选
                if(children == null ||children.size() == 0){
                    m.put("isDisabled",true);
                }
            }
        }
        return list;
    }

}
