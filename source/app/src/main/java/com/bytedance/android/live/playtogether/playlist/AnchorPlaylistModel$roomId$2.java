package com.bytedance.android.live.playtogether.playlist;

import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class AnchorPlaylistModel$roomId$2 extends Lambda implements Function0<Long> {
    public static final AnchorPlaylistModel$roomId$2 INSTANCE = new AnchorPlaylistModel$roomId$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33031);
    }

    public AnchorPlaylistModel$roomId$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Long mo30099invoke() {
        long j;
        Room currentRoomFromRoomContext;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            j = ((Long) proxy.result).longValue();
        } else {
            ILiveRoomService iLiveRoomService = (ILiveRoomService) ServiceManager.getService(IRoomService.class);
            if (iLiveRoomService != null && (currentRoomFromRoomContext = iLiveRoomService.getCurrentRoomFromRoomContext()) != null) {
                j = currentRoomFromRoomContext.getRoomId();
            } else {
                j = 0;
            }
        }
        return Long.valueOf(j);
    }
}
