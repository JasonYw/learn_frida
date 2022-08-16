package com.bytedance.android.live.liveinteract.videotalk.adapter;

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
public final class VideoTalkGuestViewHolder$bindView$$inlined$let$lambda$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LinkPlayerInfo $linkPlayerInfo$inlined;
    public final /* synthetic */ C4846aa this$0;

    static {
        Covode.recordClassIndex(29659);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkGuestViewHolder$bindView$$inlined$let$lambda$2(C4846aa c4846aa, LinkPlayerInfo linkPlayerInfo) {
        super(1);
        this.this$0 = c4846aa;
        this.$linkPlayerInfo$inlined = linkPlayerInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        AbstractC4361s abstractC4361s;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (this.this$0.LJJIFFI == 0) {
                if (!this.$linkPlayerInfo$inlined.LJJJJZ) {
                    this.$linkPlayerInfo$inlined.LJJJJZ = true;
                    AbstractC4361s abstractC4361s2 = this.this$0.LJJII;
                    if (abstractC4361s2 != null) {
                        abstractC4361s2.LIZ(this.$linkPlayerInfo$inlined);
                    }
                }
            } else if (!this.$linkPlayerInfo$inlined.LJJJJLL && (abstractC4361s = this.this$0.LJJII) != null) {
                abstractC4361s.LIZIZ(this.$linkPlayerInfo$inlined);
            }
        }
        return Unit.INSTANCE;
    }
}
