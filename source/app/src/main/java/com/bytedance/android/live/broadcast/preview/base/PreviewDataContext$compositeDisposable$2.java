package com.bytedance.android.live.broadcast.preview.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC412992Wf;
import p003X.C106862S5w;
import p003X.IQY;

/* loaded from: classes3.dex */
public final class PreviewDataContext$compositeDisposable$2 extends Lambda implements Function1<IQY<CompositeDisposable>, Unit> {
    public static final PreviewDataContext$compositeDisposable$2 INSTANCE = new PreviewDataContext$compositeDisposable$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17225);
    }

    public PreviewDataContext$compositeDisposable$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IQY<CompositeDisposable> iqy) {
        IQY<CompositeDisposable> iqy2 = iqy;
        if (!PatchProxy.proxy(new Object[]{iqy2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(iqy2);
            iqy2.LIZ(C31741.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.base.PreviewDataContext$compositeDisposable$2$1 */
    /* loaded from: classes3.dex */
    public static final class C31741 extends Lambda implements Function1<AbstractC412992Wf<CompositeDisposable>, Unit> {
        public static final C31741 INSTANCE = new C31741();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(17226);
        }

        public C31741() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC412992Wf<CompositeDisposable> abstractC412992Wf) {
            AbstractC412992Wf<CompositeDisposable> abstractC412992Wf2 = abstractC412992Wf;
            if (!PatchProxy.proxy(new Object[]{abstractC412992Wf2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC412992Wf2);
                abstractC412992Wf2.LIZIZ().dispose();
            }
            return Unit.INSTANCE;
        }
    }
}
