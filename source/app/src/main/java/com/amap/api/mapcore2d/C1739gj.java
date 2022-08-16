package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.umeng.commonsdk.internal.C33838c;
import com.umeng.message.proguard.C34037f;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* renamed from: com.amap.api.mapcore2d.gj */
/* loaded from: classes19.dex */
public final class C1739gj {

    /* renamed from: a */
    public StringBuilder f23726a = new StringBuilder();

    static {
        Covode.recordClassIndex(5287);
    }

    /* renamed from: a */
    public final C1733gg m17434a(String str, Context context, C1685ey c1685ey) {
        C1733gg c1733gg = new C1733gg("");
        c1733gg.setErrorCode(7);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("status") || !jSONObject.has(C33838c.f42636f)) {
                this.f23726a.append("json is error ".concat(String.valueOf(str)));
            }
            String string = jSONObject.getString("status");
            String string2 = jSONObject.getString(C33838c.f42636f);
            if (string.equals("0")) {
                this.f23726a.append("auth fail:".concat(String.valueOf(string2)));
            }
        } catch (Throwable th) {
            StringBuilder sb = this.f23726a;
            sb.append("json exception error:" + th.getMessage());
            C1752gu.m17302a(th, "MapParser", "paseAuthFailurJson");
        }
        try {
            StringBuilder sb2 = this.f23726a;
            sb2.append("#SHA1AndPackage#");
            sb2.append(C1573cq.m18119e(context));
            String str2 = c1685ey.f23570b.get("gsid").get(0);
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb3 = this.f23726a;
                sb3.append(" #gsid#");
                sb3.append(str2);
            }
            String str3 = c1685ey.f23571c;
            if (!TextUtils.isEmpty(str3)) {
                this.f23726a.append(" #csid#".concat(String.valueOf(str3)));
            }
        } catch (Throwable unused) {
        }
        c1733gg.setLocationDetail(this.f23726a.toString());
        if (this.f23726a.length() > 0) {
            StringBuilder sb4 = this.f23726a;
            sb4.delete(0, sb4.length());
        }
        return c1733gg;
    }

    /* renamed from: a */
    public final C1733gg m17433a(byte[] bArr) {
        C1733gg c1733gg;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ByteBuffer byteBuffer = null;
        try {
            c1733gg = new C1733gg("");
        } catch (Throwable th) {
            try {
                c1733gg = new C1733gg("");
                c1733gg.setErrorCode(5);
                StringBuilder sb = this.f23726a;
                sb.append("parser data error:" + th.getMessage());
                c1733gg.setLocationDetail(this.f23726a.toString());
            } finally {
                if (0 != 0) {
                    byteBuffer.clear();
                }
            }
        }
        if (bArr == null) {
            c1733gg.setErrorCode(5);
            this.f23726a.append("byte[] is null");
            c1733gg.setLocationDetail(this.f23726a.toString());
            this.f23726a.delete(0, this.f23726a.length());
            return c1733gg;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.get() == 0) {
            c1733gg.m17463b(String.valueOf((int) wrap.getShort()));
            wrap.clear();
            wrap.clear();
            return c1733gg;
        }
        c1733gg.setLongitude(C1757gy.m17278a(wrap.getInt() / 1000000.0d));
        c1733gg.setLatitude(C1757gy.m17278a(wrap.getInt() / 1000000.0d));
        c1733gg.setAccuracy(wrap.getShort());
        c1733gg.m17461c(String.valueOf((int) wrap.get()));
        c1733gg.m17459d(String.valueOf((int) wrap.get()));
        if (wrap.get() == 1) {
            byte[] bArr2 = new byte[wrap.get() & 255];
            wrap.get(bArr2);
            try {
                c1733gg.setCountry(new String(bArr2, C34037f.f43302f));
            } catch (Throwable unused) {
            }
            byte[] bArr3 = new byte[wrap.get() & 255];
            wrap.get(bArr3);
            try {
                str = new String(bArr3, C34037f.f43302f);
                try {
                    c1733gg.setProvince(str);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                str = "";
            }
            byte[] bArr4 = new byte[wrap.get() & 255];
            wrap.get(bArr4);
            try {
                str2 = new String(bArr4, C34037f.f43302f);
                try {
                    c1733gg.setCity(str2);
                } catch (Throwable unused4) {
                }
            } catch (Throwable unused5) {
                str2 = "";
            }
            byte[] bArr5 = new byte[wrap.get() & 255];
            wrap.get(bArr5);
            try {
                str3 = new String(bArr5, C34037f.f43302f);
                try {
                    c1733gg.setDistrict(str3);
                } catch (Throwable unused6) {
                }
            } catch (Throwable unused7) {
                str3 = "";
            }
            byte[] bArr6 = new byte[wrap.get() & 255];
            wrap.get(bArr6);
            try {
                str4 = new String(bArr6, C34037f.f43302f);
                try {
                    c1733gg.setStreet(str4);
                    c1733gg.setRoad(str4);
                } catch (Throwable unused8) {
                }
            } catch (Throwable unused9) {
                str4 = "";
            }
            byte[] bArr7 = new byte[wrap.get() & 255];
            wrap.get(bArr7);
            try {
                c1733gg.setNumber(new String(bArr7, C34037f.f43302f));
            } catch (Throwable unused10) {
            }
            byte[] bArr8 = new byte[wrap.get() & 255];
            wrap.get(bArr8);
            try {
                str5 = new String(bArr8, C34037f.f43302f);
                try {
                    c1733gg.setPoiName(str5);
                } catch (Throwable unused11) {
                }
            } catch (Throwable unused12) {
                str5 = "";
            }
            byte[] bArr9 = new byte[wrap.get() & 255];
            wrap.get(bArr9);
            try {
                c1733gg.setAoiName(new String(bArr9, C34037f.f43302f));
            } catch (Throwable unused13) {
            }
            byte[] bArr10 = new byte[wrap.get() & 255];
            wrap.get(bArr10);
            try {
                str6 = new String(bArr10, C34037f.f43302f);
                try {
                    c1733gg.setAdCode(str6);
                } catch (Throwable unused14) {
                }
            } catch (Throwable unused15) {
                str6 = "";
            }
            byte[] bArr11 = new byte[wrap.get() & 255];
            wrap.get(bArr11);
            try {
                c1733gg.setCityCode(new String(bArr11, C34037f.f43302f));
            } catch (Throwable unused16) {
            }
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
                sb2.append(" ");
            }
            if (!TextUtils.isEmpty(str2) && (!str.contains("市") || !str.equals(str2))) {
                sb2.append(str2);
                sb2.append(" ");
            }
            if (!TextUtils.isEmpty(str3)) {
                sb2.append(str3);
                sb2.append(" ");
            }
            if (!TextUtils.isEmpty(str4)) {
                sb2.append(str4);
                sb2.append(" ");
            }
            if (!TextUtils.isEmpty(str5)) {
                if (!TextUtils.isEmpty(str6)) {
                    sb2.append("靠近");
                }
                sb2.append(str5);
                sb2.append(" ");
            }
            Bundle bundle = new Bundle();
            bundle.putString("citycode", c1733gg.getCityCode());
            bundle.putString("desc", sb2.toString());
            bundle.putString("adcode", c1733gg.getAdCode());
            c1733gg.setExtras(bundle);
            c1733gg.m17457e(sb2.toString());
            String adCode = c1733gg.getAdCode();
            c1733gg.setAddress((adCode == null || adCode.trim().length() <= 0) ? sb2.toString() : sb2.toString().replace(" ", ""));
        }
        wrap.get(new byte[wrap.get() & 255]);
        if (wrap.get() == 1) {
            wrap.getInt();
            wrap.getInt();
            wrap.getShort();
        }
        if (wrap.get() == 1) {
            byte[] bArr12 = new byte[wrap.get() & 255];
            wrap.get(bArr12);
            try {
                c1733gg.setBuildingId(new String(bArr12, C34037f.f43302f));
            } catch (Throwable unused17) {
            }
            byte[] bArr13 = new byte[wrap.get() & 255];
            wrap.get(bArr13);
            try {
                c1733gg.setFloor(new String(bArr13, C34037f.f43302f));
            } catch (Throwable unused18) {
            }
        }
        if (wrap.get() == 1) {
            wrap.get();
            wrap.getInt();
            wrap.get();
        }
        if (wrap.get() == 1) {
            c1733gg.setTime(wrap.getLong());
        }
        byte[] bArr14 = new byte[wrap.getShort()];
        wrap.get(bArr14);
        try {
            c1733gg.m17465a(new String(bArr14, C34037f.f43302f));
        } catch (Throwable unused19) {
        }
        wrap.clear();
        if (this.f23726a.length() > 0) {
            StringBuilder sb3 = this.f23726a;
            sb3.delete(0, sb3.length());
        }
        return c1733gg;
    }
}
