package com.bytedance.android.live.liveinteract.voicechat.emoji.panel;

import android.view.View;
import com.bytedance.android.live.liveinteract.videotalk.emoji.model.C4929c;
import com.bytedance.android.live.liveinteract.videotalk.emoji.model.TalkRoomBaseEmoji;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.H34;
import p003X.H3C;

/* loaded from: classes3.dex */
public final class InteractEmojiListAdapter$onBindViewHolder$$inlined$let$lambda$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TalkRoomBaseEmoji $emoji;
    public final /* synthetic */ C5018v $holder$inlined;
    public final /* synthetic */ H34 this$0;

    static {
        Covode.recordClassIndex(31168);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractEmojiListAdapter$onBindViewHolder$$inlined$let$lambda$1(TalkRoomBaseEmoji talkRoomBaseEmoji, H34 h34, C5018v c5018v) {
        super(1);
        this.$emoji = talkRoomBaseEmoji;
        this.this$0 = h34;
        this.$holder$inlined = c5018v;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            H3C h3c = this.this$0.LIZIZ;
            if (h3c != null) {
                h3c.LIZ((C4929c) this.$emoji);
            }
        }
        return Unit.INSTANCE;
    }
}
