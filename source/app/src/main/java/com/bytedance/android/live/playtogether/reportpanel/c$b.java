package com.bytedance.android.live.playtogether.reportpanel;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.model.C2917q;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C89627LSz;
import p003X.LK5;
import p003X.LT0;
import p003X.LT1;

/* loaded from: classes5.dex */
public final class c$b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final /* synthetic */ C89627LSz LIZIZ;
    public final Lazy LIZJ;
    public final Lazy LIZLLL;

    /* renamed from: LJ */
    public final Lazy f26550LJ;
    public final Lazy LJFF;

    static {
        Covode.recordClassIndex(33100);
    }

    private final View LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (View) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    private final TextView LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (TextView) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    private final View LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (View) (proxy.isSupported ? proxy.result : this.f26550LJ.mo27335getValue());
    }

    private final HSImageView LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (HSImageView) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c$b(C89627LSz c89627LSz, View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZIZ = c89627LSz;
        this.LIZJ = LazyKt__LazyJVMKt.lazy(new ImagePickerController$VH$tipsContainer$2(view));
        this.LIZLLL = LazyKt__LazyJVMKt.lazy(new ImagePickerController$VH$tipsTextView$2(view));
        this.f26550LJ = LazyKt__LazyJVMKt.lazy(new ImagePickerController$VH$closeImageView$2(view));
        this.LJFF = LazyKt__LazyJVMKt.lazy(new ImagePickerController$VH$previewImageView$2(view));
    }

    public final void LIZ(C2917q c2917q, int i) {
        if (PatchProxy.proxy(new Object[]{c2917q, Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        if (c2917q == null) {
            View LIZJ = LIZJ();
            Intrinsics.checkNotNullExpressionValue(LIZJ, "");
            LIZJ.setVisibility(8);
            View LIZ2 = LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            LIZ2.setVisibility(0);
            LIZLLL().setActualImageResource(2130857679);
        } else {
            View LIZJ2 = LIZJ();
            Intrinsics.checkNotNullExpressionValue(LIZJ2, "");
            LIZJ2.setVisibility(0);
            View LIZ3 = LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            LIZ3.setVisibility(8);
            LIZLLL().setImageURI(Uri.fromFile(new File(c2917q.f25781LJ)));
        }
        if (i == 0) {
            TextView LIZIZ = LIZIZ();
            Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
            LIZIZ.setText(LK5.LIZ(2131583418));
        } else {
            TextView LIZIZ2 = LIZIZ();
            Intrinsics.checkNotNullExpressionValue(LIZIZ2, "");
            LIZIZ2.setText(i + "/4");
        }
        this.itemView.setOnClickListener(new LT0(this, c2917q));
        LIZJ().setOnClickListener(new LT1(this, c2917q, i));
    }
}
