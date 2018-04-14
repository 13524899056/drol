package com.jie;

import com.jie.service.CommunityService;
import com.jie.service.DroolsService;
import com.jie.service.LocaleService;
import com.jwaoo.community.model.Tags;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Locale;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration

public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    Logger log = Logger.getLogger(AppTest.class.toString());
    @Autowired
    private LocaleService service;
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Autowired
    private DroolsService droolsService;

    @Test
    public void startDrool(){
        droolsService.fireRule();
    }

    @Test
    public void localeTest(){
       Locale cn = new Locale("zh","CN");
       log.info(service.getMessage("welcome", cn));
       Locale en = new Locale("en","US");
       log.info(service.getMessage("welcome",en));
    }

    @Autowired
    private CommunityService communityService;

    @Test
    public void countTags(){
        Tags tags = new Tags();
        Long count = -1L;
        try {
            count = communityService.countTags(tags);
        }catch(Exception e){
            e.printStackTrace();
        }
        log.info("tags count:"+count);
    }
}
