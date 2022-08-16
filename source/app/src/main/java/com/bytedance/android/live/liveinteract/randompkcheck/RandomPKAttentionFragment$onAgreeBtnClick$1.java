package com.bytedance.android.live.liveinteract.randompkcheck;

import android.widget.FrameLayout;
import android.widget.Switch;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C79762HcK;
import p003X.C79782Hce;

/* loaded from: classes3.dex */
public final class RandomPKAttentionFragment$onAgreeBtnClick$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C79782Hce this$0;

    static {
        Covode.recordClassIndex(29590);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RandomPKAttentionFragment$onAgreeBtnClick$1(C79782Hce c79782Hce) {
        super(1);
        this.this$0 = c79782Hce;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(bool.booleanValue() ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            Switch r0 = this.this$0.LIZLLL;
            if (r0 != null) {
                r0.setChecked(false);
            }
            FrameLayout frameLayout = this.this$0.LIZJ;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            C79762HcK.LIZ(C4832a.LIZJ, true, false, 2, null);
            C4832a.LIZJ.LIZ("announcement_bottom");
            this.this$0.dismiss();
        }
        return Unit.INSTANCE;
    }
}
