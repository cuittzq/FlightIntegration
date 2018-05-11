package com.tzq.biz.common.model.integration.req;

import com.tzq.biz.common.model.BaseVO;

/**
 * Created by cl24957 on 2018/5/11.
 */
public class LCCCabinPriceVerifyReqVO extends BaseVO<Long> {
    private Long id;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long aLong) {
        this.id = aLong;
    }
}
