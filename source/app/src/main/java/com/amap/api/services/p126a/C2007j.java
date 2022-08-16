package com.amap.api.services.p126a;

import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;
import com.umeng.commonsdk.internal.C33838c;
import com.xiaomi.mipush.sdk.Constants;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amap.api.services.a.j */
/* loaded from: classes19.dex */
public class C2007j {
    static {
        Covode.recordClassIndex(5618);
    }

    /* renamed from: a */
    public static String m16369a(List<LatLonPoint> list) {
        return m16368a(list, ";");
    }

    /* renamed from: a */
    public static double m16375a(double d) {
        return Double.parseDouble(new DecimalFormat("0.000000", new DecimalFormatSymbols(Locale.US)).format(d));
    }

    /* renamed from: a */
    public static String m16373a(LatLonPoint latLonPoint) {
        if (latLonPoint == null) {
            return "";
        }
        double m16375a = m16375a(latLonPoint.getLongitude());
        double m16375a2 = m16375a(latLonPoint.getLatitude());
        return m16375a + Constants.ACCEPT_TIME_SEPARATOR_SP + m16375a2;
    }

    /* renamed from: c */
    public static Date m16366c(String str) {
        Date date = null;
        if (str != null && !str.trim().equals("")) {
            try {
                date = new SimpleDateFormat("HHmm").parse(str);
                return date;
            } catch (ParseException e) {
                m16371a(e, "CoreUtil", "parseString2Time");
            }
        }
        return date;
    }

    /* renamed from: d */
    public static Date m16365d(String str) {
        Date date = null;
        if (str != null && !str.trim().equals("")) {
            try {
                date = new SimpleDateFormat("HH:mm").parse(str);
                return date;
            } catch (ParseException e) {
                m16371a(e, "CoreUtil", "parseTime");
            }
        }
        return date;
    }

    /* renamed from: a */
    public static String m16370a(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        if (date != null) {
            return simpleDateFormat.format(date);
        }
        return "";
    }

    /* renamed from: b */
    public static void m16367b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("errcode")) {
                m16374a(jSONObject.getInt("errcode"), jSONObject.getString("errmsg"));
            } else if (!jSONObject.has("status")) {
            } else {
                String string = jSONObject.getString("status");
                if (string.equals("1")) {
                    return;
                }
                if (string.equals("0") && !jSONObject.has("infocode")) {
                    throw new AMapException("未知错误");
                }
                int i = jSONObject.getInt("infocode");
                if (string.equals("0")) {
                    m16374a(i, jSONObject.getString(C33838c.f42636f));
                }
            }
        } catch (JSONException e) {
            m16371a(e, "CoreUtil", "paseAuthFailurJson");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: a */
    public static boolean m16372a(String str) {
        if (str != null && str.trim().length() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m16368a(List<LatLonPoint> list, String str) {
        if (list == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            LatLonPoint latLonPoint = list.get(i);
            if (latLonPoint != null) {
                double m16375a = m16375a(latLonPoint.getLongitude());
                double m16375a2 = m16375a(latLonPoint.getLatitude());
                stringBuffer.append(m16375a);
                stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                stringBuffer.append(m16375a2);
                stringBuffer.append(str);
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static void m16374a(int i, String str) {
        if (i != 0) {
            if (i != 22000) {
                if (i != 32200) {
                    if (i == 32201) {
                        throw new AMapException("App key未开通“附近”功能,请注册附近KEY", 2, str);
                    }
                    switch (i) {
                        case 10000:
                            return;
                        case 10001:
                            throw new AMapException("用户key不正确或过期", 2, str);
                        case 10002:
                            throw new AMapException("请求服务不存在", 2, str);
                        case 10003:
                            throw new AMapException("访问已超出日访问量", 2, str);
                        case 10004:
                            throw new AMapException("用户访问过于频繁", 2, str);
                        case 10005:
                            throw new AMapException("用户IP无效", 2, str);
                        case 10006:
                            throw new AMapException("用户域名无效", 2, str);
                        case 10007:
                            throw new AMapException("用户签名未通过", 2, str);
                        case 10008:
                            throw new AMapException("用户MD5安全码未通过", 2, str);
                        case 10009:
                            throw new AMapException("请求key与绑定平台不符", 2, str);
                        case 10010:
                            throw new AMapException("IP访问超限", 2, str);
                        case 10011:
                            throw new AMapException("服务不支持https请求", 2, str);
                        case 10012:
                            throw new AMapException("权限不足，服务请求被拒绝", 2, str);
                        case 10013:
                            throw new AMapException("开发者删除了key，key被删除后无法正常使用", 2, str);
                        default:
                            switch (i) {
                                case 20000:
                                    throw new AMapException("请求参数非法", 2, str);
                                case 20001:
                                    throw new AMapException("缺少必填参数", 2, str);
                                case 20002:
                                    throw new AMapException("请求协议非法", 2, str);
                                case 20003:
                                    throw new AMapException("其他未知错误", 2, str);
                                default:
                                    switch (i) {
                                        case 20800:
                                            throw new AMapException("规划点（包括起点、终点、途经点）不在中国陆地范围内", 2, str);
                                        case 20801:
                                            throw new AMapException("规划点（起点、终点、途经点）附近搜不到路", 2, str);
                                        case 20802:
                                            throw new AMapException("路线计算失败，通常是由于道路连通关系导致", 2, str);
                                        case 20803:
                                            throw new AMapException("起点终点距离过长", 2, str);
                                        default:
                                            switch (i) {
                                                case 30000:
                                                    throw new AMapException("请求服务响应错误", 2, str);
                                                case 30001:
                                                    throw new AMapException("引擎返回数据异常", 2, str);
                                                case 30002:
                                                    throw new AMapException("服务端请求链接超时", 2, str);
                                                case 30003:
                                                    throw new AMapException("读取服务结果超时", 2, str);
                                                default:
                                                    switch (i) {
                                                        case 32000:
                                                            throw new AMapException("key对应的tableID不存在", 2, str);
                                                        case 32001:
                                                            throw new AMapException("ID不存在", 2, str);
                                                        case 32002:
                                                            throw new AMapException("服务器维护中", 2, str);
                                                        default:
                                                            throw new AMapException(str, 2, str);
                                                    }
                                            }
                                    }
                            }
                    }
                }
                throw new AMapException("找不到对应的userid信息,请检查您提供的userid是否存在", 2, str);
            }
            throw new AMapException("tableID格式不正确不存在", 2, str);
        }
    }

    /* renamed from: a */
    public static void m16371a(Throwable th, String str, String str2) {
        try {
            C1906cb m16715d = C1906cb.m16715d();
            if (m16715d != null) {
                m16715d.m16718b(th, str, str2);
            }
        } catch (Throwable unused) {
        }
    }
}
