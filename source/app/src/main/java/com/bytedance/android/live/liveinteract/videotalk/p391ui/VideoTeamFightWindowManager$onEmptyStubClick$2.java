package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C80627HqH;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.VideoTeamFightWindowManager$onEmptyStubClick$2 */
/* loaded from: classes3.dex */
public final class VideoTeamFightWindowManager$onEmptyStubClick$2 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $position;
    public final /* synthetic */ C80627HqH this$0;

    static {
        Covode.recordClassIndex(30466);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTeamFightWindowManager$onEmptyStubClick$2(C80627HqH c80627HqH, int i) {
        super(1);
        this.this$0 = c80627HqH;
        this.$position = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        Integer num2 = num;
        if (!PatchProxy.proxy(new Object[]{num2}, this, changeQuickRedirect, false, 1).isSupported && num2 != null) {
            num2.intValue();
            this.this$0.LIZIZ(this.$position);
        }
        return Unit.INSTANCE;
    }
}
