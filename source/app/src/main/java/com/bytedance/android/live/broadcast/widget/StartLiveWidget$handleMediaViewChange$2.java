package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class StartLiveWidget$handleMediaViewChange$2 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StartLiveWidget$handleMediaViewChange$1 $changeClickBtnBg$1;
    public final /* synthetic */ Ref.BooleanRef $isTitleValid;

    static {
        Covode.recordClassIndex(18810);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveWidget$handleMediaViewChange$2(Ref.BooleanRef booleanRef, StartLiveWidget$handleMediaViewChange$1 startLiveWidget$handleMediaViewChange$1) {
        super(1);
        this.$isTitleValid = booleanRef;
        this.$changeClickBtnBg$1 = startLiveWidget$handleMediaViewChange$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        LIZ(str);
        return Unit.INSTANCE;
    }

    public final void LIZ(String str) {
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        Ref.BooleanRef booleanRef = this.$isTitleValid;
        if (str.length() < 5) {
            z = false;
        }
        booleanRef.element = z;
        this.$changeClickBtnBg$1.LIZ();
    }
}
