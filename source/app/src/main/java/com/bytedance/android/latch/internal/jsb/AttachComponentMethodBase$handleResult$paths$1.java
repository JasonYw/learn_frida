package com.bytedance.android.latch.internal.jsb;

import com.bytedance.android.latch.internal.C2763c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import p003X.C106862S5w;
import p003X.C73879FBh;

/* loaded from: classes28.dex */
public final class AttachComponentMethodBase$handleResult$paths$1 extends Lambda implements Function1<C2763c.C2764a, JSONArray> {
    public static final AttachComponentMethodBase$handleResult$paths$1 INSTANCE = new AttachComponentMethodBase$handleResult$paths$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13737);
    }

    public AttachComponentMethodBase$handleResult$paths$1() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, org.json.JSONArray] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ JSONArray invoke(C2763c.C2764a c2764a) {
        C2763c.C2764a c2764a2 = c2764a;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2764a2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c2764a2);
        LinkedList linkedList = new LinkedList();
        for (C2763c.C2764a c2764a3 : c2764a2.LIZ()) {
            linkedList.addFirst(c2764a3.LIZIZ);
        }
        return C73879FBh.LIZ(linkedList);
    }
}
