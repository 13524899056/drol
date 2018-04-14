package com.jie.service;

import com.jie.service.inf.ComServiceInf;
import com.jwaoo.community.model.Tags;
import com.jwaoo.community.service.inf.CommunityServiceInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kaihua.qian@jwaoo.com
 * on 2018/4/14 10:39.
 */
@Service
public class CommunityService implements ComServiceInf {
    @Autowired
    private CommunityServiceInf communityServiceInf;

    public Long countTags(Tags condition) throws  Exception{
        return communityServiceInf.countByCondition(condition);
    }
}
