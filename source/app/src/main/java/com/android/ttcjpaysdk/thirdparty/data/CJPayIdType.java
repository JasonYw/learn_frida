package com.android.ttcjpaysdk.thirdparty.data;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public enum CJPayIdType {
    MAINLAND("ID_CARD", "ID_CARD", 2131561436),
    HK_MACAU("HKMPASS", "HKMPASS", 2131558471),
    TAIWAN("TAIWANPASS", "TAIWANPASS", 2131558470),
    PASSPORT("PASSPORT", "PASSPORT", 2131561437),
    HK_MACAU_RESIDENCE("HK_MACAU_RESIDENCE", "ID_CARD", 2131561435),
    TAIWAN_RESIDENCE("TAIWAN_RESIDENCE", "ID_CARD", 2131561439);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String key;
    public final String label;
    public final int nameRes;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CJPayIdType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (CJPayIdType[]) proxy.result;
        }
        return (CJPayIdType[]) values().clone();
    }

    static {
        Covode.recordClassIndex(8333);
    }

    public static CJPayIdType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (CJPayIdType) proxy.result;
        }
        return (CJPayIdType) Enum.valueOf(CJPayIdType.class, str);
    }

    public static CJPayIdType getTypeFromLabel(String str) {
        CJPayIdType[] valuesCustom;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (CJPayIdType) proxy.result;
        }
        if (TextUtils.isEmpty(str)) {
            return MAINLAND;
        }
        for (CJPayIdType cJPayIdType : valuesCustom()) {
            if (cJPayIdType.label.equals(str)) {
                return cJPayIdType;
            }
        }
        return MAINLAND;
    }

    public static CJPayIdType getTypeFromIdCode(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return (CJPayIdType) proxy.result;
        }
        if (TextUtils.isEmpty(str)) {
            return MAINLAND;
        }
        int hashCode = str.hashCode();
        if (hashCode != -632765991) {
            if (hashCode != 1696501435) {
                if (hashCode == 1999404050 && str.equals("PASSPORT")) {
                    return PASSPORT;
                }
            } else if (str.equals("HKMPASS")) {
                return HK_MACAU;
            }
        } else if (str.equals("TAIWANPASS")) {
            return TAIWAN;
        }
        return MAINLAND;
    }

    public static String getIdNameFromType(Context context, CJPayIdType cJPayIdType) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, cJPayIdType}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (cJPayIdType != null) {
            return context.getString(cJPayIdType.nameRes);
        }
        return context.getString(MAINLAND.nameRes);
    }

    public static CJPayIdType getTypeFromIdName(Context context, String str) {
        CJPayIdType[] valuesCustom;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (CJPayIdType) proxy.result;
        }
        if (TextUtils.isEmpty(str)) {
            return MAINLAND;
        }
        for (CJPayIdType cJPayIdType : valuesCustom()) {
            if (context.getString(cJPayIdType.nameRes).equals(str)) {
                return cJPayIdType;
            }
        }
        return MAINLAND;
    }

    CJPayIdType(String str, String str2, int i) {
        this.label = str;
        this.key = str2;
        this.nameRes = i;
    }
}
