package com.jie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * Created by kaihua.qian@jwaoo.com
 * on 2018/4/12 9:51.
 */
@Service
public class LocaleService {

    @Autowired
    private MessageSource messageSource;

    public String getMessage(String key,Locale locale){
        //Locale cn = new Locale("zh","CN");
        return messageSource.getMessage(key,new Object[]{"f","cc","d"},locale);
    }
}
