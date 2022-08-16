package com.bytedance.android.live.playtogether.edit;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class PlayTogetherEditViewModel$entranceInfo$2 extends Lambda implements Function0<MutableLiveData<b$b>> {
    public static final PlayTogetherEditViewModel$entranceInfo$2 INSTANCE = new PlayTogetherEditViewModel$entranceInfo$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32954);
    }

    public PlayTogetherEditViewModel$entranceInfo$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.MutableLiveData<com.bytedance.android.live.playtogether.edit.b$b>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ MutableLiveData<b$b> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new MutableLiveData<>();
    }
}
