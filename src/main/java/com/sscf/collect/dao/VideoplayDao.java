/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.dao;

import java.util.List;

import com.sscf.collect.dto.VideoplayDto;
import com.sscf.collect.entity.Videoplay;

/**
 * @author lvcn
 */
public interface VideoplayDao {

    /**
     * 查询Videoplay .
     * @param req 请求对象
     * @return
     */
    public List<Videoplay> qryVideoplay(VideoplayDto dto);

    /**
     * 查询Videoplay条数 .
     * @param req 请求对象
     * @return
     */
    public int getVideoplayCount(VideoplayDto dto);

}
