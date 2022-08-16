package com.alipay.sdk.p082m.p088c0;

import com.alipay.sdk.p082m.p096g0.AbstractC1278a;
import com.alipay.sdk.p082m.p125z.C1449b;
import com.bytedance.covode.number.Covode;
import com.umeng.commonsdk.vchannel.C33968a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.c0.b */
/* loaded from: classes2.dex */
public final class C1249b {

    /* renamed from: a */
    public File f22092a;

    /* renamed from: b */
    public AbstractC1278a f22093b;

    static {
        Covode.recordClassIndex(4749);
    }

    public C1249b(String str, AbstractC1278a abstractC1278a) {
        this.f22092a = null;
        this.f22093b = null;
        this.f22092a = new File(str);
        this.f22093b = abstractC1278a;
    }

    /* renamed from: a */
    public static String m19335a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", C33968a.f42937f);
            jSONObject.put("error", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m19334b() {
        File file = this.f22092a;
        if (file == null) {
            return;
        }
        if (!file.exists() || !this.f22092a.isDirectory() || this.f22092a.list().length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f22092a.list()) {
            arrayList.add(str);
        }
        Collections.sort(arrayList);
        String str2 = (String) arrayList.get(arrayList.size() - 1);
        int size = arrayList.size();
        String format = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
        new StringBuilder();
        if (str2.equals(C0002O.m25086C(format, ".log"))) {
            if (arrayList.size() < 2) {
                return;
            }
            str2 = (String) arrayList.get(arrayList.size() - 2);
            size--;
        }
        if (!this.f22093b.logCollect(m19335a(C1449b.m18654a(this.f22092a.getAbsolutePath(), str2)))) {
            size--;
        }
        for (int i = 0; i < size; i++) {
            C116971W2r.LIZ(new File(this.f22092a, (String) arrayList.get(i)));
        }
    }

    /* renamed from: a */
    public final void m19337a() {
        new Thread(new RunnableC1250c(this)).start();
    }
}
