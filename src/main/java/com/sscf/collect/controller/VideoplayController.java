/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.controller;

import java.util.Date;

import javax.validation.Valid;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sscf.collect.dto.VideoplayDto;
import com.sscf.collect.entity.Videoplay;
import com.sscf.collect.service.VideoplayService;
import com.sscf.education.common.entity.PageResult;
import com.sscf.education.common.entity.Result;
import com.sscf.education.common.util.ResultUtil;

import cn.hutool.core.date.DateUtil;

/**
 * @author lvcn
 */
@RestController
@RequestMapping(value = "/admin-api")
public class VideoplayController extends BaseController {

    /** The videoplay service . */
    @Autowired
    private VideoplayService videoplayService;

    /**
     * 查询 Videoplay .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    @RequestMapping(value = "/qryVideoplay")
    @ResponseBody
    public Result qryVideoplay(@RequestBody @Valid VideoplayDto dto) {
        Date startTime = dto.getStart_time();
        Date endTime = dto.getEnd_time();

        String sortField = dto.getSort_field();
        if (StringUtils.isBlank(sortField)) {
            dto.setSort_field(null);
        }

        String sortType = dto.getSort_type();
        if (!StringUtils.equalsIgnoreCase(sortType, "ASC") && !StringUtils.equalsIgnoreCase(sortType, "DESC")) {
            dto.setSort_type("ASC");
        }

        PageResult<Videoplay> page = null;
        long days = DateUtil.betweenDay(startTime, endTime, true);
        if (days >= 0) {
            dto.setDays((int) days + 1);
            page = videoplayService.qryPageVideoplay(dto);
        } else {
            page = new PageResult<>(null);
        }

        return ResultUtil.success(page);
    }

}
