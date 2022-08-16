package com.bytedance.android.live.playtogether.reportpanel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C89627LSz;

/* loaded from: classes5.dex */
public final class ImagePickerController$adapter$2 extends Lambda implements Function0<c$a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C89627LSz this$0;

    static {
        Covode.recordClassIndex(33084);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickerController$adapter$2(C89627LSz c89627LSz) {
        super(0);
        this.this$0 = c89627LSz;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.playtogether.reportpanel.c$a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.bytedance.android.live.playtogether.reportpanel.c$a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ c$a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        final C89627LSz c89627LSz = this.this$0;
        final Context LIZ = c89627LSz.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        return new RecyclerView.Adapter<c$b>(c89627LSz, LIZ) { // from class: com.bytedance.android.live.playtogether.reportpanel.c$a
            public static ChangeQuickRedirect LIZ;
            public final Context LIZIZ;
            public final /* synthetic */ C89627LSz LIZJ;

            static {
                Covode.recordClassIndex(33099);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final int getItemCount() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
                if (proxy2.isSupported) {
                    return ((Integer) proxy2.result).intValue();
                }
                return Math.min(this.LIZJ.LIZIZ.size() + 1, 4);
            }

            {
                C106862S5w.LIZ(LIZ);
                this.LIZIZ = LIZ;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final /* synthetic */ void onBindViewHolder(c$b c_b, int i) {
                c$b c_b2 = c_b;
                if (!PatchProxy.proxy(new Object[]{c_b2, Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
                    C106862S5w.LIZ(c_b2);
                    if (i < this.LIZJ.LIZIZ.size()) {
                        c_b2.LIZ(this.LIZJ.LIZIZ.get(i), i);
                    } else {
                        c_b2.LIZ(null, i);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final /* synthetic */ c$b onCreateViewHolder(ViewGroup viewGroup, int i) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return (c$b) proxy2.result;
                }
                C106862S5w.LIZ(viewGroup);
                View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(this.LIZIZ), 2131700105, viewGroup, false);
                C89627LSz c89627LSz2 = this.LIZJ;
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                return new c$b(c89627LSz2, LIZ2);
            }
        };
    }
}
