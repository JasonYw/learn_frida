package com.alipay.apmobilesecuritysdk.common;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p080e.C1197h;
import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import p002O.C0002O;

/* renamed from: com.alipay.apmobilesecuritysdk.common.a */
/* loaded from: classes2.dex */
public final class C1184a {
    static {
        Covode.recordClassIndex(4656);
    }

    /* renamed from: a */
    public static boolean m19573a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1197h.m19521e(context));
        return m19572a(arrayList) || m19572a(new ArrayList<String>() { // from class: com.alipay.apmobilesecuritysdk.common.RushTimeUtil$1
            static {
                Covode.recordClassIndex(4655);
            }

            {
                add("2018-06-17&2018-06-18");
                add("2018-09-08&2018-09-09");
                add("2018-11-10&2018-11-11");
                add("2018-12-11&2018-12-12");
                add("2019-02-04&2019-02-05");
                add("2019-06-17&2019-06-18");
                add("2019-09-08&2019-09-09");
                add("2019-11-10&2019-11-11");
                add("2019-12-11&2019-12-12");
                add("2020-01-24&2020-01-25");
                add("2020-06-17&2020-06-18");
                add("2020-09-08&2020-09-09");
                add("2020-11-10&2020-11-11");
                add("2020-12-11&2020-12-12");
                add("2021-02-11&2021-02-12");
                add("2021-06-17&2021-06-18");
                add("2021-09-08&2021-09-09");
                add("2021-11-10&2021-11-11");
                add("2021-12-11&2021-12-12");
                add("2022-01-31&2022-02-01");
                add("2022-06-17&2022-06-18");
                add("2022-09-08&2022-09-09");
                add("2022-11-10&2022-11-11");
                add("2022-12-11&2022-12-12");
            }
        });
    }

    /* renamed from: a */
    public static boolean m19572a(List<String> list) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setLenient(false);
        int random = ((int) (Math.random() * 24.0d * 60.0d * 60.0d)) * 1;
        try {
            for (String str : list) {
                String[] split = str.split("&");
                if (split != null && split.length == 2) {
                    Date date = new Date();
                    new StringBuilder();
                    Date parse = simpleDateFormat.parse(C0002O.m25086C(split[0], " 00:00:00"));
                    new StringBuilder();
                    Date parse2 = simpleDateFormat.parse(C0002O.m25086C(split[1], " 23:59:59"));
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(parse2);
                    calendar.add(13, random);
                    Date time = calendar.getTime();
                    if (date.after(parse) && date.before(time)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
