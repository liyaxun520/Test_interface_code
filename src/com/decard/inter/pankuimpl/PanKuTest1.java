package com.decard.inter.pankuimpl;

import com.decard.inter.IPankuApiService;

public class PanKuTest1 implements IPankuApiService {

    @Override
    public BaseResponse pack(ParaBean paraBean) {
        String methodName = paraBean.methodName;
        System.out.println("PanKuTest1 方法名  "+methodName);
        return new BaseResponse(1000);
    }


}
