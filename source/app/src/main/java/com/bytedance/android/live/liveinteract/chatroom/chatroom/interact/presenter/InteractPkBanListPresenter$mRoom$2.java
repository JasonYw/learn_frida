package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class InteractPkBanListPresenter$mRoom$2 extends Lambda implements Function0<Room> {
    public static final InteractPkBanListPresenter$mRoom$2 INSTANCE = new InteractPkBanListPresenter$mRoom$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(25877);
    }

    public InteractPkBanListPresenter$mRoom$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.livesdkapi.depend.model.live.Room] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Room mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        IService service = ServiceManager.getService(IRoomService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        return ((ILiveRoomService) service).getCurrentRoom();
    }
}
