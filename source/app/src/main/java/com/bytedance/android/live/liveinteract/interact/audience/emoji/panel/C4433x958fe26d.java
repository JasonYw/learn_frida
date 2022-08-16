package com.bytedance.android.live.liveinteract.interact.audience.emoji.panel;

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
import p003X.H33;
import p003X.H3B;

/* renamed from: com.bytedance.android.live.liveinteract.interact.audience.emoji.panel.LinkPKAudienceInteractEmojiListAdapter$onBindViewHolder$$inlined$let$lambda$1 */
/* loaded from: classes3.dex */
public final class C4433x958fe26d extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TalkRoomBaseEmoji $emoji;
    public final /* synthetic */ C4434g $holder$inlined;
    public final /* synthetic */ H33 this$0;

    static {
        Covode.recordClassIndex(27222);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4433x958fe26d(TalkRoomBaseEmoji talkRoomBaseEmoji, H33 h33, C4434g c4434g) {
        super(1);
        this.$emoji = talkRoomBaseEmoji;
        this.this$0 = h33;
        this.$holder$inlined = c4434g;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            H3B h3b = this.this$0.LIZIZ;
            if (h3b != null) {
                h3b.LIZ((C4929c) this.$emoji);
            }
        }
        return Unit.INSTANCE;
    }
}
