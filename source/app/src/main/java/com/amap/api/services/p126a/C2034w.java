package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.nearby.UploadInfo;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.w */
/* loaded from: classes19.dex */
public class C2034w extends AbstractC1843b<UploadInfo, Integer> {

    /* renamed from: i */
    public Context f24867i;

    /* renamed from: j */
    public UploadInfo f24868j;

    static {
        Covode.recordClassIndex(5645);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16377c(), "/nearby/data/create");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(C1864bf.m16960f(this.f24867i));
        stringBuffer.append("&userid=");
        stringBuffer.append(this.f24868j.getUserID());
        LatLonPoint point = this.f24868j.getPoint();
        int longitude = (int) (point.getLongitude() * 1000000.0d);
        int latitude = (int) (point.getLatitude() * 1000000.0d);
        stringBuffer.append("&location=");
        stringBuffer.append(longitude / 1000000.0f);
        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        stringBuffer.append(latitude / 1000000.0f);
        stringBuffer.append("&coordtype=");
        stringBuffer.append(this.f24868j.getCoordType());
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public Integer mo16254a(String str) {
        return 0;
    }

    public C2034w(Context context, UploadInfo uploadInfo) {
        super(context, uploadInfo);
        this.f24867i = context;
        this.f24868j = uploadInfo;
    }
}
