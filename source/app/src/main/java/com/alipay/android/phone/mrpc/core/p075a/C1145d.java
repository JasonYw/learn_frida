package com.alipay.android.phone.mrpc.core.p075a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.alipay.sdk.p082m.p091e.C1261e;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* renamed from: com.alipay.android.phone.mrpc.core.a.d */
/* loaded from: classes2.dex */
public final class C1145d extends AbstractC1142a {
    static {
        Covode.recordClassIndex(4616);
    }

    public C1145d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.android.phone.mrpc.core.p075a.AbstractC1144c
    /* renamed from: a */
    public final Object mo19668a() {
        try {
            String str = new String(this.f21862b);
            StringBuilder sb = new StringBuilder("threadid = ");
            sb.append(Thread.currentThread().getId());
            sb.append("; rpc response:  ");
            sb.append(str);
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("resultStatus");
            if (i == 1000) {
                return this.f21861a == String.class ? jSONObject.optString("result") : C1261e.m19312a(jSONObject.optString("result"), this.f21861a);
            }
            throw new RpcException(Integer.valueOf(i), jSONObject.optString("tips"));
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("response  =");
            sb2.append(new String(this.f21862b));
            sb2.append(Constants.COLON_SEPARATOR);
            sb2.append(e);
            throw new RpcException((Integer) 10, sb2.toString() == null ? "" : e.getMessage());
        }
    }
}
