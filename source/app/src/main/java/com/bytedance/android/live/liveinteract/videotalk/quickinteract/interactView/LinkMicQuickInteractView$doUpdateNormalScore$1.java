package com.bytedance.android.live.liveinteract.videotalk.quickinteract.interactView;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class LinkMicQuickInteractView$doUpdateNormalScore$1 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LinkMicQuickInteractView this$0;

    static {
        Covode.recordClassIndex(30362);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkMicQuickInteractView$doUpdateNormalScore$1(LinkMicQuickInteractView linkMicQuickInteractView) {
        super(1);
        this.this$0 = linkMicQuickInteractView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            if (!TextUtils.equals(str2, this.this$0.LIZIZ)) {
                LinkMicQuickInteractView linkMicQuickInteractView = this.this$0;
                linkMicQuickInteractView.LIZIZ(linkMicQuickInteractView.LIZIZ);
            }
        }
        return Unit.INSTANCE;
    }
}