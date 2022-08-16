package com.bytedance.android.lightreplace;

import com.bytedance.android.lightreplace.ReplaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.android.lightreplace.a */
/* loaded from: classes2.dex */
public final class C2771a {
    public static ChangeQuickRedirect LIZ;
    public Class<?>[] LIZIZ;
    public Class<?> LIZJ;
    public List<ReplaceHolder.AbstractC2770a> LIZLLL;

    static {
        Covode.recordClassIndex(13784);
    }

    public C2771a(Method method) {
        this(method.getParameterTypes(), method.getReturnType());
    }

    public C2771a(Class<?>[] clsArr, Class<?> cls) {
        this.LIZLLL = new CopyOnWriteArrayList();
        this.LIZIZ = clsArr;
        this.LIZJ = cls;
    }
}
