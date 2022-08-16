package com.amap.api.maps2d;

import android.content.Context;
import com.amap.api.mapcore2d.C1484ar;
import com.amap.api.mapcore2d.C1583cs;
import com.amap.api.mapcore2d.C1590cw;
import com.amap.api.mapcore2d.C1771q;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p002O.C0002O;

/* loaded from: classes19.dex */
public final class MapsInitializer {

    /* renamed from: a */
    public static boolean f24096a;

    /* renamed from: b */
    public static boolean f24097b;

    /* renamed from: c */
    public static int f24098c;
    public static String sdcardDir;

    public static String getVersion() {
        return "6.0.0";
    }

    public static boolean getNetworkEnable() {
        return f24096a;
    }

    public static int getProtocol() {
        return f24098c;
    }

    public static boolean getUpdateDataActiveEnable() {
        return f24097b;
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(5361);
        sdcardDir = "";
        f24096a = true;
        f24098c = 1;
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(5361);
        sdcardDir = "";
        f24096a = true;
        f24098c = 1;
    }

    public static void setApiKey(String str) {
        C1583cs.m18095a(str);
    }

    public static void setNetworkEnable(boolean z) {
        f24096a = z;
    }

    public static void setUpdateDataActiveEnable(boolean z) {
        f24097b = z;
    }

    public static void loadWorldGridMap(boolean z) {
        C1771q.f24020i = !z ? 1 : 0;
    }

    public static void initialize(Context context) {
        if (context != null) {
            C1484ar.f22704a = context.getApplicationContext();
        }
    }

    public static void setProtocol(int i) {
        boolean z;
        f24098c = i;
        C1590cw m18013a = C1590cw.m18013a();
        if (f24098c == 2) {
            z = true;
        } else {
            z = false;
        }
        m18013a.m18009a(z);
    }

    public static void replaceURL(String str, String str2) {
        if (str != null && !str.equals("")) {
            C1771q.f24019h = str;
            new StringBuilder();
            C1771q.f24018g = C0002O.m25086C(str2, "DIY");
            if (str.contains("openstreetmap")) {
                C1771q.f24014c = 19;
            }
        }
    }
}
