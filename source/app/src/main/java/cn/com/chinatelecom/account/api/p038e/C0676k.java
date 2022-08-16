package cn.com.chinatelecom.account.api.p038e;

import android.text.TextUtils;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cn.com.chinatelecom.account.api.e.k */
/* loaded from: classes2.dex */
public final class C0676k {

    /* renamed from: a */
    public static final byte[] f21034a = {-30, -91, -67, -20, -69, -120, -30, -68, -113, -20, -99, -68};

    /* renamed from: b */
    public static final byte[] f21035b = {-30, -91, -67, -20, -69, -120, -19, -73, -101, -19, -79, -106, -17, -74, -120, -17, -78, -78};

    /* renamed from: c */
    public static final byte[] f21036c = {-17, -103, -121, -17, -80, -98, -19, -86, -117, -29, -98, -109, -30, -91, -91};

    /* renamed from: k */
    public static byte[] f21044k = {-20, -99, -86, -19, -73, -101, -19, -79, -106, -30, -75, -108, -20, -124, -81};

    /* renamed from: l */
    public static byte[] f21045l = {-19, -83, -79, -17, Byte.MIN_VALUE, -94, -19, -73, -101, -19, -79, -106, -20, -106, -96, -17, -74, -118, -17, -102, -91};

    /* renamed from: d */
    public static final byte[] f21037d = {89, 101, 105, 97, 111, 126, -30, -68, -113, -20, -99, -68, -17, -74, -120, -17, -78, -78};

    /* renamed from: e */
    public static final byte[] f21038e = {-17, -107, -107, -17, -102, -121, -30, -83, -87, -20, -108, -102, -17, -74, -120, -17, -78, -78};

    /* renamed from: f */
    public static final byte[] f21039f = {67, 69, -17, -74, -120, -17, -78, -78};

    /* renamed from: g */
    public static final byte[] f21040g = {-29, -88, -114, -19, -109, -79, -17, -73, -97, -17, -74, -120, -17, -78, -78};

    /* renamed from: m */
    public static byte[] f21046m = {-30, -91, -67, -17, -113, -126, -17, -126, -105, -17, -83, -127, -17, -122, -100, 89, 78, 65};

    /* renamed from: h */
    public static final byte[] f21041h = {93, 67, 76, 67, -17, -126, -115, -20, -121, -88, -30, -68, -113, -20, -99, -68};

    /* renamed from: i */
    public static final byte[] f21042i = {93, 67, 76, 67, -17, -126, -115, -20, -121, -88, -17, -74, -120, -17, -78, -78};

    /* renamed from: j */
    public static final byte[] f21043j = {-17, -125, -121, -19, -73, -92, -17, -107, -107, -17, -102, -121, -30, -83, -87, -20, -108, -102, -17, -82, -69, -30, -66, -81};

    static {
        Covode.recordClassIndex(2727);
    }

    /* renamed from: a */
    public static String m20576a(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i);
            jSONObject.put("msg", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("reqId", str2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static JSONObject m20578a() {
        return m20574b(80003, C0632d.m20735a(f21044k), null);
    }

    /* renamed from: a */
    public static JSONObject m20577a(int i, String str) {
        return m20574b(i, str, null);
    }

    /* renamed from: b */
    public static JSONObject m20575b() {
        return m20574b(80001, C0632d.m20735a(f21035b), null);
    }

    /* renamed from: b */
    public static JSONObject m20574b(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i);
            jSONObject.put("msg", str);
            if (!TextUtils.isEmpty(null)) {
                jSONObject.put("reqId", (Object) null);
                return jSONObject;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static JSONObject m20573c() {
        return m20574b(80000, C0632d.m20735a(f21034a), null);
    }

    /* renamed from: d */
    public static JSONObject m20572d() {
        return m20574b(80004, C0632d.m20735a(f21045l), null);
    }

    /* renamed from: e */
    public static JSONObject m20571e() {
        return m20574b(80103, C0632d.m20735a(f21046m), null);
    }

    /* renamed from: f */
    public static JSONObject m20570f() {
        return m20574b(80500, "传入参数为空", null);
    }

    /* renamed from: g */
    public static JSONObject m20569g() {
        return m20574b(80102, C0632d.m20735a(f21040g), null);
    }
}
