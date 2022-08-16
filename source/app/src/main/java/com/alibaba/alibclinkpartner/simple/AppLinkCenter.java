package com.alibaba.alibclinkpartner.simple;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.alibclinkpartner.simple.data.ALSLSimpleUri;
import com.alibaba.alibclinkpartner.simple.p069a.C1009a;
import com.alibaba.alibclinkpartner.simple.p069a.C1010b;
import com.alipay.sdk.p082m.p105l.C1314b;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p2995ta.utdid2.device.UTDevice;
import com.umeng.message.proguard.C34037f;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import p002O.C0002O;
import p003X.C116971W2r;

/* loaded from: classes13.dex */
public class AppLinkCenter {
    public String appkey;
    public Context mContext;

    /* renamed from: com.alibaba.alibclinkpartner.simple.AppLinkCenter$1 */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class C10061 {
        static {
            Covode.recordClassIndex(4318);
        }
    }

    /* renamed from: com.alibaba.alibclinkpartner.simple.AppLinkCenter$a */
    /* loaded from: classes13.dex */
    public static class C1007a {

        /* renamed from: a */
        public static AppLinkCenter f21509a = new AppLinkCenter(null);

        static {
            Covode.recordClassIndex(4319);
        }
    }

    static {
        Covode.recordClassIndex(4317);
    }

    public AppLinkCenter() {
    }

    public /* synthetic */ AppLinkCenter(C10061 c10061) {
        this();
    }

    /* renamed from: a */
    private String m20015a(ALSLSimpleUri aLSLSimpleUri, String str) {
        HashMap hashMap = new HashMap();
        StringBuffer stringBuffer = new StringBuffer();
        hashMap.put("h5Url", aLSLSimpleUri.url);
        hashMap.put("backURL", aLSLSimpleUri.backUrl);
        hashMap.put("appkey", this.appkey);
        hashMap.put("appName", C1010b.m20009a(this.mContext));
        hashMap.put("packageName", aLSLSimpleUri.packageName);
        hashMap.put("v", "4.0.0.mini");
        hashMap.put("source", "alsl.mini");
        hashMap.put("action", "ali.open.nav");
        hashMap.put("module", aLSLSimpleUri.module);
        hashMap.put("sdkName", "linkPartner");
        hashMap.put("bc_fl_src", aLSLSimpleUri.bcFlSrc);
        hashMap.put("bootImage", "0");
        if (aLSLSimpleUri.extraParam != null && aLSLSimpleUri.extraParam.size() > 0) {
            String str2 = (String) aLSLSimpleUri.extraParam.get("tag");
            String str3 = (String) aLSLSimpleUri.extraParam.get(C1314b.f22207g);
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("tag", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put(C1314b.f22207g, str3);
            } else {
                hashMap.put(C1314b.f22207g, UTDevice.getUtdid(this.mContext));
            }
            aLSLSimpleUri.extraParam.remove("tag");
            aLSLSimpleUri.extraParam.remove(C1314b.f22207g);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                try {
                    String encode = URLEncoder.encode((String) entry.getKey(), C34037f.f43302f);
                    String encode2 = URLEncoder.encode((String) entry.getValue(), C34037f.f43302f);
                    stringBuffer.append(encode);
                    stringBuffer.append("=");
                    stringBuffer.append(encode2);
                    stringBuffer.append("&");
                } catch (Throwable unused) {
                }
            }
        }
        if (aLSLSimpleUri.extraParam.size() > 0) {
            stringBuffer.append("params=");
            stringBuffer.append(C1010b.m20006a(aLSLSimpleUri.extraParam));
        }
        if (stringBuffer.toString().endsWith("&")) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        if (str.contains("?")) {
            new StringBuilder();
            return C0002O.m25085C(str, "&", stringBuffer.toString());
        }
        new StringBuilder();
        return C0002O.m25085C(str, "?", stringBuffer.toString());
    }

    public static AppLinkCenter instance() {
        return C1007a.f21509a;
    }

    public void init(Context context, String str) {
        this.mContext = context;
        this.appkey = str;
        C1009a.m20011a(context, "smart_link_sp");
    }

    public int openUrl(Context context, ALSLSimpleUri aLSLSimpleUri) {
        if (aLSLSimpleUri == null) {
            return 2001;
        }
        if (!C1010b.m20008a(context, aLSLSimpleUri.packageName)) {
            return 2002;
        }
        String m20015a = m20015a(aLSLSimpleUri, "tbopen://m.taobao.com/tbopen/index.html");
        C1009a.m20010a(aLSLSimpleUri.packageName, m20015a);
        Intent intent = new Intent();
        intent.setData(Uri.parse(m20015a));
        intent.setPackage(aLSLSimpleUri.packageName);
        intent.setAction(aLSLSimpleUri.action);
        intent.setFlags(805339136);
        try {
            C116971W2r.LIZ(context, intent);
            return 1001;
        } catch (Exception unused) {
            return PushConstants.NOTIFICATION_SERVICE_SEND_MESSAGE;
        }
    }
}
