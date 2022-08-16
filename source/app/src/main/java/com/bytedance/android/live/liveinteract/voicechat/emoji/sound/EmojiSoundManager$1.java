package com.bytedance.android.live.liveinteract.voicechat.emoji.sound;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.videotalk.emoji.model.C4929c;
import com.bytedance.android.live.liveinteract.videotalk.emoji.p389a.C4926e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C149557frI;
import p003X.C149564frP;

/* loaded from: classes20.dex */
public final /* synthetic */ class EmojiSoundManager$1 extends FunctionReferenceImpl implements Function1<C4926e, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31227);
    }

    public EmojiSoundManager$1(C149557frI c149557frI) {
        super(1, c149557frI, C149557frI.class, "onTalkRoomEmojiEvent", "onTalkRoomEmojiEvent(Lcom/bytedance/android/live/liveinteract/videotalk/emoji/widget/TalkRoomEmojiEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C4926e c4926e) {
        C4929c c4929c;
        C4926e c4926e2 = c4926e;
        if (!PatchProxy.proxy(new Object[]{c4926e2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c4926e2);
            C149557frI c149557frI = (C149557frI) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c4926e2}, c149557frI, C149557frI.LIZ, false, 1).isSupported) {
                C4929c c4929c2 = c4926e2.LIZJ;
                C149564frP c149564frP = c149557frI.LIZJ;
                if (c149564frP != null) {
                    c4929c = c149564frP.LIZJ;
                } else {
                    c4929c = null;
                }
                if (Intrinsics.areEqual(c4929c2, c4929c)) {
                    if (c4926e2.LIZLLL) {
                        ALogger.m15797i("emoji_sound", C0002O.m25086C("intercept stop emoji sound ", c4926e2.LIZJ.LIZLLL));
                    } else if (c4926e2.LIZIZ == 2 || c4926e2.LIZIZ == 3) {
                        ALogger.m15797i("emoji_sound", C0002O.m25083C("same emoji state=", Integer.valueOf(c4926e2.LIZIZ), " of ", c4926e2.LIZJ.LIZLLL, " stopAudio"));
                        c149557frI.LIZ();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
