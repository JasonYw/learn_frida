package com.android.ttcjpaysdk.base.framework;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import com.android.ttcjpaysdk.base.service.api.CJPayDataKeepAPI;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C76765GOh;

/* renamed from: com.android.ttcjpaysdk.base.framework.a */
/* loaded from: classes17.dex */
public abstract class AbstractC2129a extends DialogFragment {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap _$_findViewCache;
    public View rootView;

    static {
        Covode.recordClassIndex(6022);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported && (hashMap = this._$_findViewCache) != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract void bindViews(View view);

    public abstract int getLayoutId();

    public abstract void initAction();

    public abstract void initData();

    public abstract void initViews(View view);

    public abstract void next();

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void setStatusBar() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        Dialog dialog = getDialog();
        Intrinsics.checkNotNullExpressionValue(dialog, "");
        C76765GOh.LIZ(dialog.getWindow(), this.rootView, true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        super.onStart();
        Dialog dialog = getDialog();
        Intrinsics.checkNotNullExpressionValue(dialog, "");
        Window window = dialog.getWindow();
        if (window != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setBackgroundDrawableResource(17170445);
            getDialog().setCanceledOnTouchOutside(false);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 48;
            attributes.width = -1;
            attributes.height = -1;
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(bundle);
        CJPayDataKeepAPI.saveData(bundle, this);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        if (bundle != null) {
            CJPayDataKeepAPI.restoreData(bundle, this);
        } else {
            CJPayDataKeepAPI.autoWiredData(bundle, this);
        }
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.rootView = C116971W2r.LIZ(layoutInflater, getLayoutId(), viewGroup, false);
        View view = this.rootView;
        Intrinsics.checkNotNull(view);
        bindViews(view);
        initData();
        View view2 = this.rootView;
        Intrinsics.checkNotNull(view2);
        initViews(view2);
        initAction();
        next();
        return this.rootView;
    }
}
