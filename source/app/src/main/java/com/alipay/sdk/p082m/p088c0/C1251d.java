package com.alipay.sdk.p082m.p088c0;

import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import p002O.C0002O;

/* renamed from: com.alipay.sdk.m.c0.d */
/* loaded from: classes26.dex */
public final class C1251d {

    /* renamed from: a */
    public static String f22095a = "";

    /* renamed from: b */
    public static String f22096b = "";

    /* renamed from: c */
    public static String f22097c = "";

    static {
        Covode.recordClassIndex(4751);
    }

    /* renamed from: a */
    public static synchronized void m19333a(String str) {
        synchronized (C1251d.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            m19330a(arrayList);
        }
    }

    /* renamed from: a */
    public static synchronized void m19332a(String str, String str2, String str3) {
        synchronized (C1251d.class) {
            f22095a = str;
            f22096b = str2;
            f22097c = str3;
        }
    }

    /* renamed from: a */
    public static synchronized void m19331a(Throwable th) {
        String str;
        synchronized (C1251d.class) {
            ArrayList arrayList = new ArrayList();
            if (th != null) {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                str = stringWriter.toString();
            } else {
                str = "";
            }
            arrayList.add(str);
            m19330a(arrayList);
        }
    }

    /* renamed from: a */
    public static synchronized void m19330a(List<String> list) {
        synchronized (C1251d.class) {
            if (C1448a.m18665a(f22096b) || C1448a.m18665a(f22097c)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(f22097c);
            for (String str : list) {
                stringBuffer.append(C0002O.m25086C(", ", str));
            }
            stringBuffer.append("\n");
            try {
                File file = new File(f22095a);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(f22095a, f22096b);
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                FileWriter fileWriter = ((long) stringBuffer.length()) + file2.length() <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                fileWriter.write(stringBuffer.toString());
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception unused) {
            }
        }
    }
}
