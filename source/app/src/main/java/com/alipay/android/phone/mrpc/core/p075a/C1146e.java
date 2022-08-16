package com.alipay.android.phone.mrpc.core.p075a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.alipay.sdk.p082m.p091e.C1262f;
import com.bytedance.covode.number.Covode;
import com.umeng.commonsdk.vchannel.C33968a;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.alipay.android.phone.mrpc.core.a.e */
/* loaded from: classes2.dex */
public final class C1146e extends AbstractC1143b {

    /* renamed from: c */
    public int f21865c;

    /* renamed from: d */
    public Object f21866d;

    static {
        Covode.recordClassIndex(4617);
    }

    public C1146e(int i, String str, Object obj) {
        super(str, obj);
        this.f21865c = i;
    }

    @Override // com.alipay.android.phone.mrpc.core.p075a.AbstractC1147f
    /* renamed from: a */
    public final void mo19666a(Object obj) {
        this.f21866d = obj;
    }

    @Override // com.alipay.android.phone.mrpc.core.p075a.AbstractC1147f
    /* renamed from: a */
    public final byte[] mo19667a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f21866d != null) {
                arrayList.add(new BasicNameValuePair("extParam", C1262f.m19311a(this.f21866d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f21863a));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f21865c);
            arrayList.add(new BasicNameValuePair(C33968a.f42937f, sb.toString()));
            new StringBuilder("mParams is:").append(this.f21864b);
            arrayList.add(new BasicNameValuePair("requestData", this.f21864b == null ? "[]" : C1262f.m19311a(this.f21864b)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("request  =");
            sb2.append(this.f21864b);
            sb2.append(Constants.COLON_SEPARATOR);
            sb2.append(e);
            throw new RpcException(9, sb2.toString() == null ? "" : e.getMessage(), e);
        }
    }
}
