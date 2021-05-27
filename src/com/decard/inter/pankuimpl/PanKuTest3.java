package com.decard.inter.pankuimpl;

import com.decard.inter.IPankuApiService;

public class PanKuTest3 implements IPankuApiService {

    @Override
    public BaseResponse pack(ParaBean paraBean) {
        String methodName = paraBean.methodName;
        System.out.println("PanKuTest3 方法名  "+methodName);
        return new BaseResponse(3000);
    }

}
