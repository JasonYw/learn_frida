package com.bytedance.android.live.liveinteract.voicechat.panel.adapter;

import android.view.View;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.list.AbstractC4361s;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class AudioTalkGuestViewHolder$bindView$$inlined$let$lambda$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LinkPlayerInfo $linkPlayerInfo$inlined;
    public final /* synthetic */ C5078b this$0;

    static {
        Covode.recordClassIndex(31642);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioTalkGuestViewHolder$bindView$$inlined$let$lambda$2(C5078b c5078b, LinkPlayerInfo linkPlayerInfo) {
        super(1);
        this.this$0 = c5078b;
        this.$linkPlayerInfo$inlined = linkPlayerInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (!this.$linkPlayerInfo$inlined.LJJJJZ) {
                this.$linkPlayerInfo$inlined.LJJJJZ = true;
                AbstractC4361s abstractC4361s = this.this$0.LJJIIZI;
                if (abstractC4361s != null) {
                    abstractC4361s.LIZ(this.$linkPlayerInfo$inlined);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
