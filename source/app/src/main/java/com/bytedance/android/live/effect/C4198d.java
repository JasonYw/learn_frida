package com.bytedance.android.live.effect;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.p329a.a$a;
import com.bytedance.android.live.effect.template.BeautifyTemplate;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import java.util.HashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.KF9;
import p003X.KFH;
import p003X.KFS;
import p003X.KFU;
import p003X.KFV;

/* renamed from: com.bytedance.android.live.effect.d */
/* loaded from: classes5.dex */
public final class C4198d extends C9078n implements AbstractC13971f {
    public static ChangeQuickRedirect LIZ;
    public static final KFU LIZJ = new KFU((byte) 0);
    public KFH LIZIZ;
    public HashMap LIZLLL;

    static {
        Covode.recordClassIndex(24498);
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO
    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new HashMap();
        }
        View view = (View) this.LIZLLL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.LIZLLL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO
    public final void LIZJ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported && (hashMap = this.LIZLLL) != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneFullName() {
        return "com/bytedance/android/live/effect/LiveBeautifyDialogFragment";
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneSimpleName() {
        return "LiveBeautifyDialogFragment";
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZJ();
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setStyle(1, 2131494937);
        setCancelable(true);
    }

    @Override // p003X.C88402KsO, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (Dialog) proxy.result;
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
        }
        return onCreateDialog;
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        Window window2;
        Window window3;
        MethodCollector.m14708i(1671);
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(1671);
            return;
        }
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.setLayout(-1, -1);
        }
        int i = Build.VERSION.SDK_INT;
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.addFlags(Integer.MIN_VALUE);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window = dialog3.getWindow()) != null) {
            window.setStatusBarColor(0);
            MethodCollector.m14707o(1671);
            return;
        }
        MethodCollector.m14707o(1671);
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            LIZ(2131172581).setOnClickListener(new KFS(this));
            KFH kfh = this.LIZIZ;
            if (kfh != null && !kfh.isAdded() && getChildFragmentManager().findFragmentByTag(getTag()) == null) {
                FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
                Intrinsics.checkNotNullExpressionValue(beginTransaction, "");
                beginTransaction.add(2131166302, kfh, getTag());
                SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_BLOCK_CODE_OPT;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                    beginTransaction.commitAllowingStateLoss();
                } else {
                    beginTransaction.commitNowAllowingStateLoss();
                }
            }
        }
        LIZ(KFV.LIZIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        return C116971W2r.LIZ(layoutInflater, 2131699045, viewGroup, false);
    }

    @JvmStatic
    public static final C4198d LIZ(a$a a_a, BeautifyTemplate beautifyTemplate, String str, LiveEffectContextFactory.Type type) {
        KFH LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{a_a, beautifyTemplate, str, type}, null, LIZ, true, 11);
        if (!proxy.isSupported) {
            proxy = PatchProxy.proxy(new Object[]{a_a, beautifyTemplate, str, type}, LIZJ, KFU.LIZ, false, 1);
            if (!proxy.isSupported) {
                C106862S5w.LIZ(beautifyTemplate, str, type);
                C4198d c4198d = new C4198d();
                KF9 kf9 = KFH.LJII;
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{kf9, a_a, beautifyTemplate, str, type, null, 16, null}, null, KF9.LIZ, true, 2);
                if (proxy2.isSupported) {
                    LIZ2 = (KFH) proxy2.result;
                } else {
                    LIZ2 = kf9.LIZ(a_a, beautifyTemplate, str, type, null);
                }
                c4198d.LIZIZ = LIZ2;
                return c4198d;
            }
        }
        return (C4198d) proxy.result;
    }
}
