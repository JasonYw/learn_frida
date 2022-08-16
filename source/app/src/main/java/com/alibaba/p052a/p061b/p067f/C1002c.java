package com.alibaba.p052a.p061b.p067f;

import android.util.Pair;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.alibaba.a.b.f.c */
/* loaded from: classes13.dex */
public class C1002c implements AbstractC1001b {

    /* renamed from: a */
    public String f21487a;

    /* renamed from: b */
    public String f21488b;

    /* renamed from: c */
    public Object f21489c;

    /* renamed from: d */
    public Object f21490d;

    /* renamed from: e */
    public Class f21491e;

    /* renamed from: f */
    public Field f21492f;

    /* renamed from: g */
    public Field f21493g;

    /* renamed from: h */
    public Field f21494h;

    /* renamed from: i */
    public Method f21495i;

    /* renamed from: j */
    public int f21496j = 1;

    /* renamed from: k */
    public boolean f21497k;

    static {
        Covode.recordClassIndex(4312);
    }

    public C1002c(String str, String str2) {
        this.f21487a = str;
        this.f21488b = str2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:8|(4:9|10|11|12)|13|(2:14|15)|(7:17|(6:19|20|21|22|23|24)|26|21|22|23|24)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (p003X.C116971W2r.LIZ("com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent") == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        com.alibaba.p052a.p061b.p065d.C0974i.m20099a("SecurityRequestAuth", "initSecurityCheck", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0048, code lost:
        if (r2 == null) goto L22;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void m20037b() {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.p052a.p061b.p067f.C1002c.m20037b():void");
    }

    public static Object com_alibaba_a_b_f_c_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        ActionInvokeEntrance.setEventUuid(110000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_alibaba_a_b_f_c_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return actionIntercept.second;
        }
        Object invoke = method.invoke(obj, objArr);
        ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_alibaba_a_b_f_c_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        return invoke;
    }

    @Override // com.alibaba.p052a.p061b.p067f.AbstractC1001b
    /* renamed from: a */
    public String mo20039a() {
        return this.f21487a;
    }

    @Override // com.alibaba.p052a.p061b.p067f.AbstractC1001b
    /* renamed from: a */
    public String mo20038a(String str) {
        Class cls;
        if (!this.f21497k) {
            m20037b();
        }
        if (this.f21487a == null) {
            C0974i.m20098a("SecurityRequestAuth", "There is no appkey,please check it!");
            return null;
        }
        if (str != null && this.f21489c != null && (cls = this.f21491e) != null && this.f21492f != null && this.f21493g != null && this.f21494h != null && this.f21495i != null && this.f21490d != null) {
            try {
                Object newInstance = cls.newInstance();
                this.f21492f.set(newInstance, this.f21487a);
                ((Map) this.f21493g.get(newInstance)).put("INPUT", str);
                this.f21494h.set(newInstance, Integer.valueOf(this.f21496j));
                return (String) com_alibaba_a_b_f_c_java_lang_reflect_Method_invoke(this.f21495i, this.f21490d, new Object[]{newInstance, this.f21488b});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
