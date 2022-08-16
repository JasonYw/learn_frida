package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.service.ILiveUxTracer;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class StartLiveWidget$onCreate$$inlined$let$lambda$1 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StartLiveWidget this$0;

    static {
        Covode.recordClassIndex(18820);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveWidget$onCreate$$inlined$let$lambda$1(StartLiveWidget startLiveWidget) {
        super(1);
        this.this$0 = startLiveWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported) {
            StartLiveWidget startLiveWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, startLiveWidget, StartLiveWidget.LIZ, false, 13).isSupported && roomCreateInfo2 != null) {
                startLiveWidget.LIZ(roomCreateInfo2);
                ((ILiveUxTracer) ServiceManager.getService(ILiveUxTracer.class)).setArgument("new_anchor", Integer.valueOf(roomCreateInfo2.LJII));
            }
        }
        return Unit.INSTANCE;
    }
}
