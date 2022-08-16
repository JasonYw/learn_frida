package com.bytedance.android.live.broadcast.gamedetail.anchor;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC88931L2f;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.L21;
import p003X.L2Q;
import p003X.L2R;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.anchor.a */
/* loaded from: classes5.dex */
public final class C3033a extends AbstractC88931L2f {
    public static ChangeQuickRedirect LIZ;
    public View LIZIZ;
    public final Lazy LIZJ = LIZIZ(L2Q.class);
    public HashMap LIZLLL;

    static {
        Covode.recordClassIndex(16036);
    }

    public final L2Q LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (L2Q) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    @Override // p003X.AbstractC88931L2f
    public final void LIZJ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported && (hashMap = this.LIZLLL) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractC88931L2f, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZJ();
    }

    @Override // p003X.AbstractC88931L2f, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            Dialog dialog = getDialog();
            Intrinsics.checkNotNullExpressionValue(dialog, "");
            Window window = dialog.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                if (decorView != null) {
                    decorView.setPadding(0, 0, 0, 0);
                }
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                    attributes.width = -1;
                    attributes.gravity = 80;
                    attributes.height = LK5.LIZ(128.0f);
                }
                if (window != null) {
                    window.setAttributes(attributes);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    window.setDimAmount(0.5f);
                }
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            View view2 = this.LIZIZ;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            view2.findViewById(2131168999).setOnClickListener(new L2R(this));
            View view3 = this.LIZIZ;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            view3.findViewById(2131168969).setOnClickListener(new L21(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        View LIZ2 = C116971W2r.LIZ(layoutInflater, 2131698301, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        this.LIZIZ = LIZ2;
        View view = this.LIZIZ;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return view;
    }
}
