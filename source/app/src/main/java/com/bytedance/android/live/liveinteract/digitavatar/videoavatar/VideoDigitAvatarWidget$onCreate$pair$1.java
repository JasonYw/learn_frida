package com.bytedance.android.live.liveinteract.digitavatar.videoavatar;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType;
import com.bytedance.android.live.liveinteract.digitavatar.C4382d;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C2WC;
import p003X.C78730H1w;
import p003X.C79007HCn;
import p003X.C87308Kak;

/* loaded from: classes3.dex */
public final class VideoDigitAvatarWidget$onCreate$pair$1 extends Lambda implements Function0<C4382d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $isAnchor;
    public final /* synthetic */ VideoDigitAvatarWidget this$0;

    static {
        Covode.recordClassIndex(26726);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDigitAvatarWidget$onCreate$pair$1(VideoDigitAvatarWidget videoDigitAvatarWidget, boolean z) {
        super(0);
        this.this$0 = videoDigitAvatarWidget;
        this.$isAnchor = z;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, com.bytedance.android.live.liveinteract.digitavatar.d] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4382d mo30099invoke() {
        VideoShowMode videoShowMode;
        Room room;
        VideoShowMode videoShowMode2;
        C2WC<Room> LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C4382d c4382d = new C4382d();
        C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f7153dV;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Integer LIZ2 = c87308Kak.LIZ();
        int i = VideoShowMode.DIGIT_AVATAR.type;
        if (LIZ2 != null && LIZ2.intValue() == i) {
            videoShowMode = VideoShowMode.DIGIT_AVATAR;
        } else {
            int i2 = VideoShowMode.VIDEO.type;
            if (LIZ2 != null && LIZ2.intValue() == i2) {
                videoShowMode = VideoShowMode.VIDEO;
            } else {
                videoShowMode = VideoShowMode.AUDIO;
            }
        }
        boolean z = this.$isAnchor;
        C5923dp LJJJI = this.this$0.LJJJI();
        if (LJJJI != null && (LIZ = LJJJI.LIZ()) != null) {
            room = LIZ.LIZ();
        } else {
            room = null;
        }
        if (!C78730H1w.LIZ(z, room, false, 4, null).contains(videoShowMode)) {
            ALogger.m15795w("KtvDigitAvatar", "latest save mode is " + videoShowMode + ", but not support in this room");
            if (this.$isAnchor) {
                videoShowMode = VideoShowMode.VIDEO;
            } else {
                videoShowMode = VideoShowMode.AUDIO;
            }
        }
        C2WC<VideoShowMode> LIZJ = c4382d.LIZJ();
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        if (LJII.LJIL == LinkApplyType.PREPARE_APPLY.value) {
            videoShowMode2 = VideoShowMode.AUDIO;
        } else {
            videoShowMode2 = videoShowMode;
        }
        LIZJ.LIZ(videoShowMode2);
        c4382d.LJIILJJIL();
        ALogger.m15797i("KtvDigitAvatar", "初始化展示模式：" + videoShowMode);
        return c4382d;
    }
}
