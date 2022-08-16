package com.android.ttcjpaysdk.bindcard.unionpay;

import android.app.Activity;
import com.android.ttcjpaysdk.base.eventbus.AbstractC2126a;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.router.AnimationType;
import com.android.ttcjpaysdk.base.service.ICJPayServiceCallBack;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignInfo;
import com.android.ttcjpaysdk.bindcard.unionpay.p145b.C2252a;
import com.android.ttcjpaysdk.bindcard.unionpay.p147d.C2256c;
import com.android.ttcjpaysdk.thirdparty.data.C2341h;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import p003X.C106862S5w;
import p003X.C135671cEk;
import p003X.C135692cF5;
import p003X.C135704cFH;
import p003X.C135705cFI;
import p003X.C135706cFJ;
import p003X.C135707cFK;
import p003X.C135754cG5;
import p003X.C135912cId;
import p003X.C135996cJz;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.a */
/* loaded from: classes17.dex */
public final class C2248a implements AbstractC2126a {
    public static ChangeQuickRedirect LIZ;
    public static UnionPaySignInfo LIZLLL;
    public C135692cF5 LIZIZ;
    public static final C135704cFH LJFF = new C135704cFH((byte) 0);
    public static final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) UnionPayEntranceManager$Companion$instance$2.INSTANCE);

    /* renamed from: LJ */
    public static boolean f25489LJ = true;

    @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
    public final void onEvent(BaseEvent baseEvent) {
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(baseEvent);
    }

    public C2248a() {
    }

    @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
    public final Class<? extends BaseEvent>[] listEvents() {
        return new Class[]{C135754cG5.class};
    }

    static {
        Covode.recordClassIndex(7311);
    }

    public final C135671cEk LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (C135671cEk) proxy.result;
        }
        return new C135671cEk();
    }

    public final C135692cF5 LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C135692cF5) proxy.result;
        }
        C135692cF5 c135692cF5 = this.LIZIZ;
        if (c135692cF5 == null) {
            return new C135692cF5(new C2252a(), new C2256c());
        }
        return c135692cF5;
    }

    public /* synthetic */ C2248a(byte b) {
        this();
    }

    public final void LIZIZ(Activity activity, UnionPaySignInfo unionPaySignInfo, ICJPayServiceCallBack iCJPayServiceCallBack) {
        C135692cF5 LIZ2;
        if (!PatchProxy.proxy(new Object[]{activity, unionPaySignInfo, iCJPayServiceCallBack}, this, LIZ, false, 6).isSupported && (LIZ2 = LIZ()) != null) {
            LIZ2.LIZIZ(activity, unionPaySignInfo, iCJPayServiceCallBack);
        }
    }

    public final void LIZ(Activity activity, C135754cG5 c135754cG5, ICJPayServiceCallBack iCJPayServiceCallBack) {
        C2341h c2341h;
        if (PatchProxy.proxy(new Object[]{activity, c135754cG5, iCJPayServiceCallBack}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (c135754cG5 != null) {
            c2341h = new C2341h(c135754cG5.ticket, c135754cG5.sdkData, c135754cG5.faceAppId, c135754cG5.scene, c135754cG5.faceScene);
        } else {
            c2341h = null;
        }
        UnionPaySignInfo unionPaySignInfo = LIZLLL;
        if (unionPaySignInfo != null) {
            C135912cId.LIZ(activity, unionPaySignInfo.signOrderNo, unionPaySignInfo.face_verify_info.verify_channel, c2341h, new C135705cFI(unionPaySignInfo, this, activity, c2341h, iCJPayServiceCallBack));
        }
    }

    public final void LIZ(Activity activity, UnionPaySignInfo unionPaySignInfo, ICJPayServiceCallBack iCJPayServiceCallBack) {
        C135692cF5 LIZ2;
        if (!PatchProxy.proxy(new Object[]{activity, unionPaySignInfo, iCJPayServiceCallBack}, this, LIZ, false, 5).isSupported && (LIZ2 = LIZ()) != null) {
            LIZ2.LIZ(activity, unionPaySignInfo, iCJPayServiceCallBack);
        }
    }

    public final void LIZ(Activity activity, UnionPaySignInfo unionPaySignInfo, int i, ICJPayServiceCallBack iCJPayServiceCallBack) {
        if (PatchProxy.proxy(new Object[]{activity, unionPaySignInfo, Integer.valueOf(i), iCJPayServiceCallBack}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(unionPaySignInfo);
        LIZLLL = unionPaySignInfo;
        int i2 = C135706cFJ.LIZ[unionPaySignInfo.getPageType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        LIZIZ().LIZ(false);
                        LIZIZ(activity, unionPaySignInfo, iCJPayServiceCallBack);
                        return;
                    }
                    return;
                }
                LIZIZ().LIZ(false);
                LIZ(activity, unionPaySignInfo, iCJPayServiceCallBack);
                return;
            }
            LIZIZ().LIZ(true);
            C135912cId.LIZ(activity, unionPaySignInfo.signOrderNo, unionPaySignInfo.face_verify_info.verify_channel, Integer.valueOf(i), "one_key_sign", unionPaySignInfo.face_verify_info.face_scene, new C135707cFK(iCJPayServiceCallBack));
        } else if (activity == null || activity.isFinishing()) {
        } else {
            C135996cJz.LIZ().LIZ("/unionpaybind/UnionPayTwoElementsActivity").LIZ(AnimationType.SlideLeftAndRigth).LIZ(activity);
            if (iCJPayServiceCallBack != null) {
                iCJPayServiceCallBack.onResult("1");
            }
        }
    }
}
