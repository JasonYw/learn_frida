package com.bytedance.android.latch.internal.jsb;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C73879FBh;
import p003X.T6W;

/* loaded from: classes17.dex */
public final /* synthetic */ class AttachComponentMethodBase$invoke$1 extends FunctionReference implements Function1<JSONObject, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13738);
    }

    public AttachComponentMethodBase$invoke$1(T6W t6w) {
        super(1, t6w);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "handleResult";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        return proxy.isSupported ? (KDeclarationContainer) proxy.result : Reflection.getOrCreateKotlinClass(T6W.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "handleResult(Lorg/json/JSONObject;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (!PatchProxy.proxy(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(jSONObject2);
            T6W t6w = (T6W) this.receiver;
            if (!PatchProxy.proxy(new Object[]{jSONObject2}, t6w, T6W.LIZ, false, 3).isSupported) {
                t6w.f12377LJ.invoke(C73879FBh.LIZ(C73879FBh.LIZ(TuplesKt.m137to("latch_code", 1), TuplesKt.m137to("jsb_paths", C73879FBh.LIZ(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(t6w.LIZJ.LIZ()), AttachComponentMethodBase$handleResult$paths$1.INSTANCE)))), jSONObject2));
                t6w.LIZLLL.mo30099invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
