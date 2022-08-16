package com.bytedance.android.live.liveinteract.voicechat.p395wm;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.plantform.core.C4806x;
import com.bytedance.android.live.liveinteract.plantform.model.RoomLinkerContent;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9541n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C449933qt;
import p003X.C80608Hpy;
import p003X.C88440Kt0;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.wm.LinkRoomFightAudioWindowManager$2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class LinkRoomFightAudioWindowManager$2 extends FunctionReferenceImpl implements Function1<C9541n, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31873);
    }

    public LinkRoomFightAudioWindowManager$2(C80608Hpy c80608Hpy) {
        super(1, c80608Hpy, C80608Hpy.class, "onRemoteRoomSilenceStatechanged", "onRemoteRoomSilenceStatechanged(Lcom/bytedance/android/livesdkapi/depend/model/live/linker/LinkRoomFightUpdateContent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C9541n c9541n) {
        Map.Entry LIZ;
        RoomLinkerContent roomLinkerContent;
        C9541n c9541n2 = c9541n;
        if (!PatchProxy.proxy(new Object[]{c9541n2}, this, changeQuickRedirect, false, 1).isSupported) {
            C80608Hpy c80608Hpy = (C80608Hpy) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c9541n2}, c80608Hpy, C80608Hpy.LIZ, false, 1).isSupported) {
                ALogger.m15797i("link_room_fight", "onRemoteRoomSilenceStatechanged: updateContent = " + c9541n2);
                if (c9541n2 != null) {
                    List<AnchorLinkUser> list = c9541n2.LIZLLL;
                    Map<Long, ? extends RoomLinkerContent> map = c9541n2.LJFF;
                    Integer num = null;
                    if (map != null && (LIZ = C449933qt.LIZ((Map) map)) != null && (roomLinkerContent = (RoomLinkerContent) LIZ.getValue()) != null && (num = Integer.valueOf(roomLinkerContent.roomLinkSilenceStatus)) != null && num.intValue() == 1) {
                        C88440Kt0.LIZ(2131584238);
                    } else {
                        C88440Kt0.LIZ(2131584241);
                    }
                    long j = c9541n2.f28175LJ;
                    if (list != null && num != null) {
                        num.intValue();
                        C4806x c4806x = c80608Hpy.LJIL;
                        if (c4806x != null) {
                            c4806x.LIZ(list, j, "", c9541n2.LJFF);
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
