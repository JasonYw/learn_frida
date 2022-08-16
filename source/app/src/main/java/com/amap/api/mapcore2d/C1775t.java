package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import com.heytap.mcssdk.constant.C15151a;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.amap.api.mapcore2d.t */
/* loaded from: classes25.dex */
public class C1775t {
    static {
        Covode.recordClassIndex(5323);
    }

    /* renamed from: a */
    public static String m17195a() {
        return m17193a(Calendar.getInstance());
    }

    /* renamed from: a */
    public static String m17193a(Calendar calendar) {
        return m17192a(calendar.getTime(), "yyyy-MM-dd");
    }

    /* renamed from: a */
    public static double m17194a(String str, String str2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return (simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime()) / C15151a.f30809f;
        } catch (ParseException e) {
            e.printStackTrace();
            return -1.0d;
        }
    }

    /* renamed from: a */
    public static String m17192a(Date date, String str) {
        return new SimpleDateFormat(str).format(date);
    }
}
