package com.bytedance.android.live.playtogether.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class PlayTeamMemberViewModel$intervalFinish$2 extends Lambda implements Function0<MutableLiveData<Boolean>> {
    public static final PlayTeamMemberViewModel$intervalFinish$2 INSTANCE = new PlayTeamMemberViewModel$intervalFinish$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33184);
    }

    public PlayTeamMemberViewModel$intervalFinish$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.MutableLiveData<java.lang.Boolean>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ MutableLiveData<Boolean> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.TRUE);
        return mutableLiveData;
    }
}
