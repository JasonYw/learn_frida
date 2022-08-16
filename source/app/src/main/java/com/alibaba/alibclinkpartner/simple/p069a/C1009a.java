package com.alibaba.alibclinkpartner.simple.p069a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import p003X.G4Y;

/* renamed from: com.alibaba.alibclinkpartner.simple.a.a */
/* loaded from: classes26.dex */
public class C1009a {

    /* renamed from: a */
    public static C1009a f21510a;

    /* renamed from: b */
    public static SharedPreferences f21511b;

    static {
        Covode.recordClassIndex(4321);
    }

    public C1009a(Context context, String str) {
        f21511b = G4Y.LIZ(context, str, 0);
    }

    /* renamed from: a */
    public static void m20011a(Context context, String str) {
        if (f21510a == null) {
            f21510a = new C1009a(context, str);
        }
    }

    /* renamed from: a */
    public static boolean m20010a(String str, Object obj) {
        SharedPreferences.Editor edit = f21511b.edit();
        String simpleName = obj.getClass().getSimpleName();
        boolean z = false;
        try {
            switch (simpleName.hashCode()) {
                case -1808118735:
                    if (simpleName.equals("String")) {
                        edit.putString(str, (String) obj);
                        break;
                    }
                    break;
                case -672261858:
                    if (simpleName.equals("Integer")) {
                        edit.putInt(str, ((Integer) obj).intValue());
                        break;
                    }
                    break;
                case 2374300:
                    if (simpleName.equals("Long")) {
                        edit.putLong(str, ((Long) obj).longValue());
                        break;
                    }
                    break;
                case 67973692:
                    if (simpleName.equals("Float")) {
                        edit.putFloat(str, ((Float) obj).floatValue());
                        break;
                    }
                    break;
                case 1729365000:
                    if (simpleName.equals("Boolean")) {
                        edit.putBoolean(str, ((Boolean) obj).booleanValue());
                        break;
                    }
                    break;
            }
            z = true;
        } catch (Exception unused) {
        }
        edit.apply();
        return z;
    }
}
