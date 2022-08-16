package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum OpenApiErrorInfo {
    NETWORK_ERROR(40000, "Network Error Occur", "网络错误"),
    INCORRECT_PARAMS(40001, "User Incorrect Params", "参数错误"),
    NO_REQUEST_PERMISSION(40002, "No Request Permission", "没有调用权限"),
    DATA_ALREADY_EXIST(40003, "Data Already Exist", "数据已经存在"),
    INVALID_ACCESS_TOKEN(40004, "Invalid Access Token", "accessToken不合法"),
    NOT_LOGIN(40006, "User Doesn't Login", "用户未登录"),
    EXCEED_FREQ_LIMIT(40007, "Api Call Exceeds Limit Frequency", "接口调用频率过高"),
    SENSITIVE_WORD_DETECTED(40008, "Sensitive Word Detected", "检测到敏感词"),
    NO_SUFFICIENT_BALANCE(40009, "User Has No Sufficient Balance", "余额不足"),
    ILLEGAL_APP_ID(40011, "Illegal App Id", "appId不合法"),
    NET_REQUEST_PRE_VERIFY_URL_ILLEGAL(40013, "Network Request Pre-Verification Failed, The URL Illegal", "URL格式错误"),
    NET_REQUEST_PRE_VERIFY_NOT_HTTPS(40013, "Network Request Pre-Verification Failed, Schema Not HTTPS", "不是https协议"),
    NET_REQUEST_PRE_VERIFY_HOST_ILLEGAL(40013, "Network Request Pre-Verification Failed, Host Not In  White List", "域名不在白名单"),
    NET_REQUEST_PRE_VERIFY_NON_LAN_IP(40013, "Network Request Pre-Verification Failed, Use Non-LAN Raw IP", "非本地局域网IP"),
    NET_REQUEST_PRE_VERIFY_METHOD_UN_SUPPORT(40013, "Network Request Pre-Verification Failed, HTTP Method Not Support", "http方法不支持"),
    NET_REQUEST_RESPONSE_INCOMPATIBLE(40014, "Network Request Response Incompatible", "网络请求返回数据不符合要求"),
    NET_REQUEST_TIMEOUT(40015, "Network Request Timeout", "网络请求超时"),
    LOGIN_OUT_DATE(40017, "Login Out Of Date", "登陆code已过期"),
    NET_REQUEST_CONCURRENCY_EXCEED_LIMIT(40018, "Concurrency Network Request Exceeds Limit", "网络请求并发超过限制，最大并发数为10"),
    AUTHORIZE_USER_DENY(40019, "User Deny Authorization", "用户拒绝进行授权"),
    AUTHORIZE_SYS_DENY(40020, "System Deny Authorization", "系统拒绝进行授权"),
    INTERNAL_ERROR(50001, "Internal Error Occur", "内部错误"),
    SIGNATURE_ERROR(50004, "Signature Error", "验签失败"),
    INVALID_URL_PARAMS(50005, "Invalid Url Params", "无效的URL参数"),
    ACCOUNT_EXCEPTION(50006, "Account Exception", "账户异常"),
    REWARD_REACH_LIMIT(50007, "Acquired Reward Reach Upper Limit", "已达到道具奖励获取上限"),
    APP_NOT_LAUNCH(50008, "App Not Launch", "游戏未启动"),
    USER_NOT_IN_ROOM(50009, "User Not In Room", "用户不在房间内"),
    PAY_DIAMONDS_REACH_LIMIT(50010, "Pay Diamonds Reach Upper Limit", "超过抖币支付额上限"),
    PAY_CANCEL(50011, "User Payment Cancel", "用户取消支付"),
    DATA_NOT_EXIST(50012, "Data Not Exists", "数据不存在"),
    UNKNOWN_ORDER_STATUS(50013, "Unknown Order Status", "订单状态未知"),
    ORDER_STATUS_ERROR(50014, "Order Status Abnormal", "订单状态错误"),
    ORDER_PAID(50015, "Order Paid", "订单已支付"),
    ORDER_EXPIRED(50016, "Order Expired", "订单已超时");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int errorCode;
    public final String errorMsg;
    public final String tip;

    public static OpenApiErrorInfo valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (OpenApiErrorInfo) (proxy.isSupported ? proxy.result : Enum.valueOf(OpenApiErrorInfo.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static OpenApiErrorInfo[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (OpenApiErrorInfo[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(20520);
    }

    OpenApiErrorInfo(int i, String str, String str2) {
        this.errorCode = i;
        this.errorMsg = str;
        this.tip = str2;
    }
}
