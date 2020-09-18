package com.dongann.common.enums;

public enum ErrCodes {

    SUCCESS("0000","成功"),

    UNKNOWN_ERROR("0001","未知异常"),

    TOKEN_ERROR("0002","token验证错误"),

    SIGN_ERROR("0003", "验签名失败"),

    UN_AUTH_ERROR("0004","用户未登陆"),

    PARAM_ERROR("0005","参数验证错误"),

    SYSTEM_ERROR("0006","系统异常"),

    BUSINESS_ERROR("0007","业务错误"),

    SYSTEM_MAINTAIN_ERROR("0008","系统正在维护");



    private String _code;
    private String _msg;

    private ErrCodes(String code, String msg){
        _code = code;
        _msg = msg;
    }

    public String getCode(){
        return _code;
    }
    public String getMsg(){
        return _msg;
    }

    public static ErrCodes getByCode(String code){
        for(ErrCodes ec : ErrCodes.values()){
            if(ec.getCode().equals(code)){
                return ec;
            }
        }

        return null;
    }
}
