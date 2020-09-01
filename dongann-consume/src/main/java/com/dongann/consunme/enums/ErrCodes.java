package com.dongann.consunme.enums;

public enum ErrCodes {

    SUCCESS("0000","成功"),

    UNKNOWN_ERROR("0001","未知异常"),

    DB_ERROR("0002","数据库操作异常"),

    PARAM_ERROR("0003","参数验证错误"),

    SYSTEM_ERROR("0004","系统异常"),

    BUSINESS_ERROR("0005","业务错误"),

    INFO_ERROR("0006", "提示级错误"),

    SYSTEM_MAINTAIN_ERROR("0007","系统正在维护"),

    UN_AUTH_ERROR("0008","用户未登陆"),

    DUPLICATED_PAY_ERROR("0009","重复支付"),

    UN_HAS_PASSWORD("0010","未设置支付密码"),

    AUTH_ERROR("0011", "审核中"),

    AUTH_REJECT_ERROR("0012", "审核拒绝"),

    NOT_ENOUGH_REFUND_BAL("0013","退款基本账户余额不足"),

    CAN_NO_ADD_CUSER("0014","创建用户失败"),

    SIGN_ERROR("0015", "验签名失败"),

    STOCK_ERROR("0016", "库存充足,不能退款"),
    CENTER_ERROR("0017", "抱歉，收货地区的服务正在建设中，敬请期待！");


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
