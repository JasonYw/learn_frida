package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import p002O.C0002O;

/* renamed from: com.amap.api.mapcore2d.dr */
/* loaded from: classes19.dex */
public class C1625dr {

    /* renamed from: a */
    public static String f23398a = "";

    static {
        Covode.recordClassIndex(5173);
    }

    /* renamed from: a */
    public static boolean m17825a(Context context, boolean z) {
        if (context == null) {
            return false;
        }
        if (TextUtils.isEmpty(f23398a)) {
            f23398a = C1587cu.m18038o(context);
        }
        if (!TextUtils.isEmpty(f23398a) && TextUtils.isDigitsOnly(f23398a)) {
            return ",202,204,206,208,212,213,214,216,218,219,220,222,225,226,228,230,231,232,234,235,238,240,242,244,246,247,248,250,255,257,259,260,262,266,268,270,272,274,276,278,280,282,283,284,286,288,289,290,292,293,294,295,297,302,308,310,311,312,313,314,315,316,310,330,332,334,338,340,342,344,346,348,350,352,354,356,358,360,362,363,364,365,366,368,370,372,374,376,400,401,402,404,405,406,410,412,413,414,415,416,417,418,419,420,421,422,424,425,426,427,428,429,430,431,432,434,436,437,438,440,441,450,452,454,455,456,457,466,467,470,472,502,505,510,514,515,520,525,528,530,534,535,536,537,539,540,541,542,543,544,545,546,547,548,549,550,551,552,553,555,602,603,604,605,606,607,608,609,610,611,612,613,614,615,616,617,618,619,620,621,622,623,624,625,626,627,628,629,630,631,632,633,634,635,636,637,638,639,640,641,642,643,645,646,647,648,649,650,651,652,653,654,655,657,659,702,704,706,708,710,712,714,716,722,724,730,732,734,736,738,740,742,744,746,748,750,901,".contains(C0002O.m25085C(Constants.ACCEPT_TIME_SEPARATOR_SP, f23398a, Constants.ACCEPT_TIME_SEPARATOR_SP));
        }
        if (!z) {
            return false;
        }
        return true;
    }
}
