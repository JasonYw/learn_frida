package anet.channel.p024c;

import com.bytedance.covode.number.Covode;
import com.taobao.orange.OrangeConfigListenerV1;

/* renamed from: anet.channel.c.b */
/* loaded from: classes21.dex */
public class C0474b implements OrangeConfigListenerV1 {

    /* renamed from: a */
    public final /* synthetic */ C0473a f20431a;

    static {
        Covode.recordClassIndex(2166);
    }

    public C0474b(C0473a c0473a) {
        this.f20431a = c0473a;
    }

    public void onConfigUpdate(String str, boolean z) {
        this.f20431a.onConfigUpdate(str);
    }
}
