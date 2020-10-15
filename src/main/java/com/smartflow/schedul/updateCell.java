package com.smartflow.schedul;

import com.smartflow.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @authtao
 * @date ：Created in 2020/10/14 15:41
 * 用于定时任务，更新覆盖表中的脏数据，例如Tuop20,25,30
 */
@Component
public class updateCell {
    private final
    HibernateTemplate hibernateTemplate;

    @Autowired
    public updateCell(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     * 每天凌晨三点执行一次,TU涡轮岛区
     */
        @Transactional
        @Scheduled(cron = "0 0 3 * * ? ")
        @SuppressWarnings("unchecked")
        public void updateTu()
        {
        List<CL_TUOP20> tuop20s=(List<CL_TUOP20>) hibernateTemplate.find("from CL_TUOP20 where state=0");
        for (CL_TUOP20 cl_tuop20:tuop20s
             ) {
            cl_tuop20.setState(1);
            hibernateTemplate.update(cl_tuop20);
        }
        List<CL_TUOP30> tuop30s=(List<CL_TUOP30>) hibernateTemplate.find("from CL_TUOP30 where state=0");
        for (CL_TUOP30 cl_tuop30:tuop30s
             ) {
            cl_tuop30.setState(1);
            hibernateTemplate.update(cl_tuop30);
        }
        List<CL_TUOP25> tuop25s=(List<CL_TUOP25>) hibernateTemplate.find("from CL_TUOP25 where state=0");
        for (CL_TUOP25 tuop25 :tuop25s
             ) {
            tuop25.setState(1);
            hibernateTemplate.update(tuop25);
        }
        List<CL_TUOP45> tuop45s=(List<CL_TUOP45>) hibernateTemplate.find("from CL_TUOP45 where state=0");
        for (CL_TUOP45 tuop45 :tuop45s
        ) {
            tuop45.setState(1);
            hibernateTemplate.update(tuop45);
        }
    }

    /**
     * 每天凌晨三点执行一次,Re岛区
     */
    @Transactional
    @Scheduled(cron = "0 0 3 * * ? ")
    @SuppressWarnings("unchecked")
    public void updateRe() {
        List<CL_REOP10A> reop10as =(List<CL_REOP10A>) hibernateTemplate.find("from CL_REOP10A where state=0");
        for (CL_REOP10A reop10A:reop10as 
        ) {
            reop10A.setState(1);
            hibernateTemplate.update(reop10A);
        }
        List<CL_REOP10B> clReop10bs =(List<CL_REOP10B>) hibernateTemplate.find("from CL_REOP10B where state=0");
        for (CL_REOP10B cl_reop10B:clReop10bs 
        ) {
            cl_reop10B.setState(1);
            hibernateTemplate.update(cl_reop10B);
        }
    }

    /**
     * 每天凌晨三点执行一次,Im岛区
     */
    @Transactional
    @Scheduled(cron = "0 0 3 * * ? ")
    @SuppressWarnings("unchecked")
    public void updateIm() {
        List<CL_IMOP20> imop20s=(List<CL_IMOP20>) hibernateTemplate.find("from CL_IMOP20 where state=0");
        for (CL_IMOP20 imop20:imop20s
        ) {
            imop20.setState(1);
            hibernateTemplate.update(imop20);
        }
        List<CL_IMOP25> imop25s=(List<CL_IMOP25>) hibernateTemplate.find("from CL_IMOP25 where state=0");
        for (CL_IMOP25 imop25:imop25s
        ) {
            imop25.setState(1);
            hibernateTemplate.update(imop25);
        }
        List<CL_IMOP30> imop30s=(List<CL_IMOP30>) hibernateTemplate.find("from CL_IMOP30 where state=0");
        for (CL_IMOP30 imop30 :imop30s
        ) {
            imop30.setState(1);
            hibernateTemplate.update(imop30);
        }
        List<CL_IMOP40> imop40s=(List<CL_IMOP40>) hibernateTemplate.find("from CL_IMOP40 where state=0");
        for (CL_IMOP40 imop40 :imop40s
        ) {
            imop40.setState(1);
            hibernateTemplate.update(imop40);
        }
    }
}
