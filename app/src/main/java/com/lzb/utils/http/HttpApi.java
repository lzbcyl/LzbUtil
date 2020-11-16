package com.lzb.utils.http;

import com.lzb.lzbutils.bean.BaseResult;


import io.reactivex.Observable;
import retrofit2.http.GET;

public interface HttpApi {
    /**
     * 图片墙测试
     *
     * @return
     */
    @GET("/front/wallper/findList")
    Observable<BaseResult> findList();
}
