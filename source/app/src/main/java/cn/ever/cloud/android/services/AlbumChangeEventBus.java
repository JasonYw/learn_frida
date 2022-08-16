package cn.ever.cloud.android.services;

import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.entity.AlbumChange;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p003X.C106862S5w;
import p003X.C520996iD;

/* loaded from: classes23.dex */
public final class AlbumChangeEventBus {
    public static final C520996iD Companion = new C520996iD((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final MutableSharedFlow<AlbumChange> albumChangeEvent = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    public final SdkScope scope;

    static {
        Covode.recordClassIndex(2960);
    }

    public final Flow<AlbumChange> albumChanges() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        return FlowKt.asSharedFlow(this.albumChangeEvent);
    }

    public AlbumChangeEventBus(SdkScope sdkScope) {
        C106862S5w.LIZ(sdkScope);
        this.scope = sdkScope;
    }

    public final void notifyAlbums(AlbumChange albumChange) {
        if (PatchProxy.proxy(new Object[]{albumChange}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(albumChange);
        SdkScope.launch$default(this.scope, null, new AlbumChangeEventBus$notifyAlbums$1(this, albumChange, null), 1, null);
    }
}
