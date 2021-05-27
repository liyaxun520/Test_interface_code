package com.decard.inter;

public interface IPankuApiService {

    public static class ParaBean{
        //整理参数
        public String methodName;

        public ParaBean(String methodName) {
            this.methodName = methodName;
        }
    }
    public static class BaseResponse{
        public int code;

        public BaseResponse(int code) {
            this.code = code;
        }
    }

    BaseResponse pack(ParaBean paraBean);

}
