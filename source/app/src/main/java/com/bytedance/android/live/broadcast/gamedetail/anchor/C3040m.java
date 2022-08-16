package com.bytedance.android.live.broadcast.gamedetail.anchor;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6833ap;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import p003X.AbstractC88931L2f;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C81918IQm;
import p003X.LHN;
import p003X.M0Q;
import p003X.View$OnClickListenerC88914L1o;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.anchor.m */
/* loaded from: classes5.dex */
public final class C3040m extends AbstractC88931L2f {
    public static ChangeQuickRedirect LIZ;
    public View LIZIZ;
    public HashMap LIZJ;

    static {
        Covode.recordClassIndex(16093);
    }

    @Override // p003X.AbstractC88931L2f
    public final void LIZJ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && (hashMap = this.LIZJ) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractC88931L2f, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZJ();
    }

    @Override // p003X.AbstractC88931L2f, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
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
                    attributes.height = MathKt__MathJVMKt.roundToInt(C81918IQm.LIZ(getContext(), 340.0f));
                }
                if (window != null) {
                    window.setAttributes(attributes);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    window.setDimAmount(0.5f);
                }
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            View view2 = this.LIZIZ;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            ImageView imageView = (ImageView) view2.findViewById(2131177628);
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = LHN.LIZLLL();
            layoutParams.height = (LHN.LIZLLL() * 262) / 375;
            SettingKey<C6833ap> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_RES_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            M0Q.LIZ(imageView, ImageModel.genBy(settingKey.getValue().LIZJ));
            View view3 = this.LIZIZ;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            ((TextView) view3.findViewById(2131165405)).setOnClickListener(new View$OnClickListenerC88914L1o(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        View LIZ2 = C116971W2r.LIZ(layoutInflater, 2131698308, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        this.LIZIZ = LIZ2;
        return LIZ2;
    }
}
