package com.bytedance.android.live.broadcast.floatview;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcast.floatview.datacontext.BroadcastFloatContext;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.HashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C2VQ;
import p003X.C4574547f;
import p003X.C79169HIt;

/* loaded from: classes5.dex */
public final class BroadcastFloatWindowWidget$onCreate$1 extends Lambda implements Function1<BroadcastFloatContext.FloatStatus, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BroadcastFloatWindowWidget this$0;

    static {
        Covode.recordClassIndex(15871);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastFloatWindowWidget$onCreate$1(BroadcastFloatWindowWidget broadcastFloatWindowWidget) {
        super(1);
        this.this$0 = broadcastFloatWindowWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(BroadcastFloatContext.FloatStatus floatStatus) {
        String str;
        if (!PatchProxy.proxy(new Object[]{floatStatus}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(floatStatus);
            if (floatStatus == BroadcastFloatContext.FloatStatus.HIDDEN) {
                C4574547f LIZ = C4574547f.LIZ();
                HashMap hashMap = new HashMap();
                hashMap.put("mini_window_live_duration_ms", String.valueOf(this.this$0.LIZLLL().getFirst().LIZJ().LIZ().longValue()));
                if (this.this$0.LIZLLL().getFirst().LJFF().LIZ().booleanValue()) {
                    str = "mini_window";
                } else {
                    str = "other";
                }
                hashMap.put("back_room_path", str);
                hashMap.put("mini_window_drag_times", String.valueOf(this.this$0.LIZLLL().getFirst().m15901LJ().LIZ().intValue()));
                hashMap.put(PushMessageHelper.MESSAGE_TYPE, this.this$0.LIZLLL().getFirst().LJI().LIZ().logStr);
                IService service = ServiceManager.getService(IRoomService.class);
                Intrinsics.checkNotNullExpressionValue(service, "");
                Room currentRoom = ((ILiveRoomService) service).getCurrentRoom();
                if (currentRoom != null) {
                    hashMap.put("live_type", C2VQ.LIZ(currentRoom.getStreamType()));
                }
                IService service2 = ServiceManager.getService(IInteractService.class);
                Intrinsics.checkNotNullExpressionValue(service2, "");
                int linkMode = ((IInteractService) service2).getLinkMode();
                if (C79169HIt.LIZIZ(linkMode, 8)) {
                    hashMap.put("interact_function", "chat_room");
                } else if (C79169HIt.LIZIZ(linkMode, 32)) {
                    IService service3 = ServiceManager.getService(IInteractService.class);
                    Intrinsics.checkNotNullExpressionValue(service3, "");
                    if (((IInteractService) service3).getCurrentScene() == 13) {
                        hashMap.put("interact_function", "ktv");
                    } else {
                        hashMap.put("interact_function", "chat_room");
                    }
                }
                Set<MessagePriority> keySet = this.this$0.LIZLLL().getFirst().LJII().LIZ().keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "");
                for (MessagePriority messagePriority : keySet) {
                    if (messagePriority != MessagePriority.NONE) {
                        hashMap.put(C0002O.m25085C("message_", messagePriority.logStr, "_num"), String.valueOf(this.this$0.LIZLLL().getFirst().LJII().LIZ().get(messagePriority)));
                    }
                }
                LIZ.LIZ("livesdk_mini_window_live_over", hashMap, C8668v.class, Room.class);
            }
        }
        return Unit.INSTANCE;
    }
}
