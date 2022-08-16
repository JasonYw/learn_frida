package com.bytedance.android.live.liveinteract.chatroom.chatroom.util;

import com.bytedance.android.live.liveinteract.voicechat.dialog.TalkOnlineGuestClickOptionDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C78299Gtp;
import p003X.C78300Gtq;
import p003X.C78571GyD;
import p003X.C79242HLo;
import p003X.HKN;

/* loaded from: classes3.dex */
public final class InviteFriendsUtilKt$showInviteFriendsDialog$1 extends Lambda implements Function1<TalkOnlineGuestClickOptionDialog.Option, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $isAudio;
    public final /* synthetic */ boolean $isGuideShowing;
    public final /* synthetic */ int $position;
    public final /* synthetic */ Room $room;
    public final /* synthetic */ Function1 $updateLinkedPosition;

    static {
        Covode.recordClassIndex(26448);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsUtilKt$showInviteFriendsDialog$1(Function1 function1, Room room, int i, boolean z, boolean z2) {
        super(1);
        this.$updateLinkedPosition = function1;
        this.$room = room;
        this.$position = i;
        this.$isAudio = z;
        this.$isGuideShowing = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [byte, boolean] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(TalkOnlineGuestClickOptionDialog.Option option) {
        int i;
        Object obj;
        TalkOnlineGuestClickOptionDialog.Option option2 = option;
        if (!PatchProxy.proxy(new Object[]{option2}, this, changeQuickRedirect, false, 1).isSupported && option2 != null) {
            int i2 = C78300Gtq.LIZ[option2.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    C78299Gtp c78299Gtp = C78299Gtp.LIZIZ;
                    boolean z = this.$isAudio;
                    ?? LJJ = C79242HLo.LJJ();
                    if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 1, Byte.valueOf(LJJ == true ? (byte) 1 : (byte) 0)}, c78299Gtp, C78299Gtp.LIZ, false, 4).isSupported) {
                        Pair[] pairArr = new Pair[3];
                        pairArr[0] = c78299Gtp.LIZJ(z);
                        pairArr[1] = c78299Gtp.LIZLLL(true);
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c78299Gtp, (byte) 0, Byte.valueOf((byte) LJJ), (byte) 0, 4, null}, null, C78299Gtp.LIZ, true, 23);
                        if (proxy.isSupported) {
                            obj = proxy.result;
                        } else {
                            obj = c78299Gtp.LIZ(false, (boolean) LJJ, false);
                        }
                        pairArr[2] = obj;
                        c78299Gtp.LIZ("anchor_audience_connection_invite_click", MapsKt__MapsKt.mapOf(pairArr), new Object[0]);
                    }
                    HKN.LIZ(this.$isGuideShowing, 0, 2, null);
                }
            } else {
                Function1 function1 = this.$updateLinkedPosition;
                if (!C78571GyD.LIZ(this.$room) && !C79242HLo.LJIJ() && !C79242HLo.LJIJI()) {
                    i = this.$position + 1;
                } else {
                    i = this.$position;
                }
                function1.invoke(Integer.valueOf(i));
            }
        }
        return Unit.INSTANCE;
    }
}
