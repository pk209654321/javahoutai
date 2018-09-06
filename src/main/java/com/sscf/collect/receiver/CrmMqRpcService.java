package com.sscf.collect.receiver;


import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.sscf.education.common.constants.DictConstants;
import com.sscf.education.common.entity.Result;

import cn.hutool.core.convert.Convert;

@Component
public class CrmMqRpcService {

   /* Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    AmqpTemplate amqpTemplate;

    @Autowired
    private CourseConsultantService courseConsultantService;

    @Autowired
    private UserConsultantRelService userConsultantRelService;

    *//**
     * aes加密key.
     *//*
    @Value(value = "${rabbitmq.crm.aes_key:}")
    private String aesKey;

    *//**
     * 账号改变.
     * @param data
     * @param replyTo
     * @param correlationId
     *//*
    @RabbitListener(queues = MqConstants.ONLINE_ACCOUNT_MODIFY)
    public void accountModify(byte[] data, @Header(AmqpHeaders.REPLY_TO) String replyTo, @Header(AmqpHeaders.CORRELATION_ID) byte[] correlationId) {
        String message = new String(data, Charset.defaultCharset());
        logger.info("accountModify:{}", message);

        Result result = ResultUtil.success();
        try {
            MqReq<AccountModifyReq> obj = JSON.parseObject(message, new TypeReference<MqReq<AccountModifyReq>>() {
            });
            AccountModifyReq req = obj.getData();

            String mobile = req.getMobile();
            if (StringUtils.isNotBlank(aesKey) && StringUtils.isNotBlank(mobile)) {
                AES4Crm aes = new AES4Crm(aesKey);
                mobile = aes.decryptStrFromBase64(mobile);
                req.setMobile(mobile);
            }

            CourseConsultant entity = courseConsultantService.getConsultantForCrm(req);
            AccountModifyRsp rsp = new AccountModifyRsp();
            if (entity != null) {
                rsp.setBusiness_id(Convert.toLong(entity.getUser_id()));
            }
            result = ResultUtil.success(rsp);
        } catch (Exception e) {
            result = ResultUtil.error(e);
            logger.error("账号改变失败.", e);
        }

        reply(replyTo, correlationId, result);

    }

    *//**
     * 业务员绑定用户关系修改失败.
     * @param data
     * @param replyTo
     * @param correlationId
     *//*
    @RabbitListener(queues = MqConstants.ONLINE_ACCOUNT_RELATION_MODIFY)
    public void accountRelationModify(byte[] data, @Header(AmqpHeaders.REPLY_TO) String replyTo, @Header(AmqpHeaders.CORRELATION_ID) byte[] correlationId) {
        String message = new String(data, Charset.defaultCharset());
        logger.info("accountRelationModify:{}", message);
        Result result = ResultUtil.success();
        try {
            MqReq<AccountRelationModifyReq> obj = JSON.parseObject(message, new TypeReference<MqReq<AccountRelationModifyReq>>() {
            });
            AccountRelationModifyReq req1 = obj.getData();
            Integer businessId = req1.getBusiness_id();
            List<Integer> userIds = req1.getUser_id();
            List<UserConsultantRel> list = new ArrayList<>();
            for (Integer userId : userIds) {
                UserConsultantRel rel = new UserConsultantRel();
                rel.setUser_id(userId);
                rel.setConsultant_id(businessId);
                rel.setFlag(DictConstants.CONSULTANT_ASSIGN_FLAG_MANUAL);
                list.add(rel);
            }

            if (CollectionUtils.isNotEmpty(list)) {
                userConsultantRelService.addBatchUserConsultantRel(list);
            }
        } catch (Exception e) {
            result = ResultUtil.error(e);
            logger.error("业务员绑定用户关系修改失败.", e);
        }

        reply(replyTo, correlationId, result);

    }

    *//**
     * 二维码查询.
     * @param data
     * @param replyTo
     * @param correlationId
     *//*
    @RabbitListener(queues = MqConstants.ONLINE_ACCOUNT_QUERY)
    public void accountQuery(byte[] data, @Header(AmqpHeaders.REPLY_TO) String replyTo, @Header(AmqpHeaders.CORRELATION_ID) byte[] correlationId) {
        String message = new String(data, Charset.defaultCharset());
        logger.info("accountQuery:{}", message);

        Result result = ResultUtil.success();
        try {
            MqReq<AccountQueryReq> obj = JSON.parseObject(message, new TypeReference<MqReq<AccountQueryReq>>() {
            });
            AccountQueryReq req = obj.getData();
            Long businessId = req.getBusiness_id();
            CourseConsultant entity = courseConsultantService.getAndCheckConsultant(businessId);
            AccountQueryRsp rsp = new AccountQueryRsp();
            if (entity != null) {
                rsp.setDescribe("赢大师");
                rsp.setQr_url_app(entity.getQrcode_url());
                rsp.setQr_url_wechat(entity.getWx_qrcode_url());
            }
            List<AccountQueryRsp> list = new ArrayList<>();
            list.add(rsp);
            result = ResultUtil.success(list);
        } catch (Exception e) {
            result = ResultUtil.error(e);
            logger.error("二维码查询失败.", e);
        }

        reply(replyTo, correlationId, result);

    }

    private void reply(String replyTo, byte[] correlationId, Result result) {
        amqpTemplate.convertAndSend(replyTo, JSON.toJSONString(result), message1 -> {
            message1.getMessageProperties().setCorrelationId(correlationId);
            return message1;
        });
    }
*/
}
