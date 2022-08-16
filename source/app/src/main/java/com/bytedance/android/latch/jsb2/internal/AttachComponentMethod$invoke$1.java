package com.bytedance.android.latch.jsb2.internal;

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
import p003X.C137663ckt;
import p003X.C73879FBh;

/* loaded from: classes17.dex */
public final /* synthetic */ class AttachComponentMethod$invoke$1 extends FunctionReference implements Function1<JSONObject, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13765);
    }

    public AttachComponentMethod$invoke$1(C137663ckt c137663ckt) {
        super(1, c137663ckt);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "handleResult";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        return proxy.isSupported ? (KDeclarationContainer) proxy.result : Reflection.getOrCreateKotlinClass(C137663ckt.class);
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
            C137663ckt c137663ckt = (C137663ckt) this.receiver;
            if (!PatchProxy.proxy(new Object[]{jSONObject2}, c137663ckt, C137663ckt.LIZ, false, 2).isSupported) {
                c137663ckt.finishWithResult(C73879FBh.LIZ(C73879FBh.LIZ(TuplesKt.m137to("latch_code", 1), TuplesKt.m137to("jsb_paths", C73879FBh.LIZ(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(c137663ckt.LIZIZ.LIZ()), AttachComponentMethod$handleResult$paths$1.INSTANCE)))), jSONObject2));
                c137663ckt.LIZJ.mo30099invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
