package com.bytedance.android.live.network.impl.factory;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.p402a.C5170a;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Collection;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C102238QOa;
import p003X.C102259QOv;
import p003X.QV1;

/* loaded from: classes8.dex */
public final class MultiTypeRequestConverterFactory$handleCustomResponse$9$1 extends Lambda implements Function0<Pair<? extends Object, ? extends Extra>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C10532g $bodyReader;
    public final /* synthetic */ C5170a $header;
    public final /* synthetic */ C102238QOa this$0;

    static {
        Covode.recordClassIndex(32659);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeRequestConverterFactory$handleCustomResponse$9$1(C102238QOa c102238QOa, C10532g c10532g, C5170a c5170a) {
        super(0);
        this.this$0 = c102238QOa;
        this.$bodyReader = c10532g;
        this.$header = c5170a;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: LIZ */
    public final Pair<Object, Extra> mo30099invoke() {
        Collection collection;
        Extra extra;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        Function0 function0 = this.this$0.f11064LJ;
        Object obj = null;
        if (function0 != null) {
            collection = (Collection) function0.mo30099invoke();
        } else {
            collection = null;
        }
        C10532g c10532g = this.$bodyReader;
        if (c10532g != null) {
            long LIZ = c10532g.LIZ();
            extra = null;
            while (true) {
                int LIZIZ = c10532g.LIZIZ();
                if (LIZIZ != -1) {
                    if (LIZIZ != 1) {
                        if (LIZIZ == 2 && (!Intrinsics.areEqual(this.this$0.LJI, Extra.class))) {
                            Object mo25795decode = this.this$0.LIZIZ.LIZ((Class) this.this$0.LJI).mo25795decode(c10532g);
                            if (mo25795decode != null) {
                                extra = (Extra) mo25795decode;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.base.model.Extra");
                            }
                        } else {
                            QV1.LJII(c10532g);
                        }
                    } else {
                        Object mo25795decode2 = this.this$0.LIZIZ.LIZ(this.this$0.LJFF).mo25795decode(c10532g);
                        if (collection != null) {
                            Intrinsics.checkNotNullExpressionValue(mo25795decode2, "");
                            collection.add(mo25795decode2);
                        } else {
                            obj = mo25795decode2;
                        }
                    }
                } else {
                    c10532g.LIZ(LIZ);
                    break;
                }
            }
        } else {
            extra = null;
        }
        if (collection == null) {
            if (obj == null) {
                obj = this.this$0.LJFF.newInstance();
            }
        } else {
            obj = collection;
        }
        if (extra == null) {
            extra = new Extra();
        }
        C102259QOv.LIZ(extra, this.$header);
        if (collection != null) {
            return new Pair<>(collection, extra);
        }
        return new Pair<>(obj, extra);
    }
}
