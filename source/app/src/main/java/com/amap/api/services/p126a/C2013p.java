package com.amap.api.services.p126a;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.help.InputtipsQuery;
import com.amap.api.services.help.Tip;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.p */
/* loaded from: classes19.dex */
public class C2013p extends AbstractC1843b<InputtipsQuery, ArrayList<Tip>> {
    static {
        Covode.recordClassIndex(5624);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16380a(), "/assistant/inputtips?");
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json");
        String m16997c = m16997c(((InputtipsQuery) this.f24221a).getKeyword());
        if (!TextUtils.isEmpty(m16997c)) {
            stringBuffer.append("&keywords=");
            stringBuffer.append(m16997c);
        }
        String city = ((InputtipsQuery) this.f24221a).getCity();
        if (!C2014q.m16314i(city)) {
            String m16997c2 = m16997c(city);
            stringBuffer.append("&city=");
            stringBuffer.append(m16997c2);
        }
        String type = ((InputtipsQuery) this.f24221a).getType();
        if (!C2014q.m16314i(type)) {
            String m16997c3 = m16997c(type);
            stringBuffer.append("&type=");
            stringBuffer.append(m16997c3);
        }
        if (((InputtipsQuery) this.f24221a).getCityLimit()) {
            stringBuffer.append("&citylimit=true");
        } else {
            stringBuffer.append("&citylimit=false");
        }
        LatLonPoint location = ((InputtipsQuery) this.f24221a).getLocation();
        if (location != null) {
            stringBuffer.append("&location=");
            stringBuffer.append(location.getLongitude());
            stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            stringBuffer.append(location.getLatitude());
        }
        stringBuffer.append("&key=");
        stringBuffer.append(C1864bf.m16960f(this.f24224d));
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public ArrayList<Tip> mo16254a(String str) {
        try {
            return C2014q.m16305m(new JSONObject(str));
        } catch (JSONException e) {
            C2007j.m16371a(e, "InputtipsHandler", "paseJSON");
            return null;
        }
    }

    public C2013p(Context context, InputtipsQuery inputtipsQuery) {
        super(context, inputtipsQuery);
    }
}
