package com.bytedance.android.live.liveinteract.plantform.camera;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC412992Wf;
import p003X.C106862S5w;
import p003X.IQY;

/* loaded from: classes3.dex */
public final class SwitchCameraContext$service$2 extends Lambda implements Function1<IQY<AbstractC4793f>, Unit> {
    public static final SwitchCameraContext$service$2 INSTANCE = new SwitchCameraContext$service$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(29199);
    }

    public SwitchCameraContext$service$2() {
        super(1);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.plantform.camera.SwitchCameraContext$service$2$1 */
    /* loaded from: classes3.dex */
    public static final class C47871 extends Lambda implements Function1<AbstractC412992Wf<AbstractC4793f>, Unit> {
        public static final C47871 INSTANCE = new C47871();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(29200);
        }

        public C47871() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(AbstractC412992Wf<AbstractC4793f> abstractC412992Wf) {
            if (!PatchProxy.proxy(new Object[]{abstractC412992Wf}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC412992Wf);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IQY<AbstractC4793f> iqy) {
        IQY<AbstractC4793f> iqy2 = iqy;
        if (!PatchProxy.proxy(new Object[]{iqy2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(iqy2);
            iqy2.LIZ(C47871.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
