package com.bytedance.android.live.core.tetris.widgets;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.utils.rxutils.autodispose.C4154a;
import com.bytedance.android.logsdk.collect.observer.LifecycleLogObserver;
import com.bytedance.android.logsdk.collect.p785a.AbstractC9727b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import io.reactivex.disposables.CompositeDisposable;
import java.util.HashMap;
import java.util.Map;
import p003X.AbstractC4569445g;
import p003X.C117876Wac;
import p003X.C148062fT6;
import p003X.C149979fy7;
import p003X.C7KL;

/* loaded from: classes3.dex */
public abstract class LiveWidget extends Widget implements AbstractC9727b, AbstractC4569445g {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CompositeDisposable compositeDisposable;
    public C149979fy7 lifecycleTransformer;
    public LifecycleLogObserver mLifecycleLogObserver = LifecycleLogObserver.LIZJ;
    public Animator showAnimator;
    public C117876Wac transformer;

    static {
        Covode.recordClassIndex(23794);
    }

    @Override // p003X.C43X
    public Map<String, Object> getEnvData() {
        return null;
    }

    public String getSpm() {
        return "";
    }

    @Override // com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public boolean isIgnored() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public Animator startShowAnimation() {
        return null;
    }

    public final <T> C149979fy7<T> getAutoUnbindTransformer() {
        return this.lifecycleTransformer;
    }

    public Context getContext() {
        return this.context;
    }

    public DataCenter getDataCenter() {
        return this.dataCenter;
    }

    public final <T> C7KL<T> activityAutoDispose() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (C7KL) proxy.result;
        }
        return C148062fT6.LIZ((LifecycleOwner) this.context);
    }

    public final <T> C7KL<T> autoDispose() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (C7KL) proxy.result;
        }
        return C148062fT6.LIZ(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        super.onPause();
        LifecycleLogObserver lifecycleLogObserver = this.mLifecycleLogObserver;
        if (lifecycleLogObserver != null) {
            lifecycleLogObserver.LIZLLL(this);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        super.onResume();
        LifecycleLogObserver lifecycleLogObserver = this.mLifecycleLogObserver;
        if (lifecycleLogObserver != null) {
            lifecycleLogObserver.LIZJ(this);
        }
    }

    public final <T> C7KL<T> activityAutoDisposeWithTransformer() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (C7KL) proxy.result;
        }
        if (this.transformer == null) {
            this.transformer = new C117876Wac();
        }
        return C148062fT6.LIZ(C4154a.LIZ((LifecycleOwner) this.context, Lifecycle.Event.ON_DESTROY), this.transformer);
    }

    public final <T> C7KL<T> autoDisposeWithTransformer() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (C7KL) proxy.result;
        }
        if (this.transformer == null) {
            this.transformer = new C117876Wac();
        }
        return C148062fT6.LIZ(C4154a.LIZ(this, Lifecycle.Event.ON_DESTROY), this.transformer);
    }

    @Override // com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public Map<String, Object> getPropertyParams() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("uni_key", Integer.valueOf(hashCode()));
        return hashMap;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
        this.compositeDisposable = new CompositeDisposable();
        this.lifecycleTransformer = new C149979fy7(this.compositeDisposable);
        super.onCreate();
        this.showAnimator = startShowAnimation();
        LifecycleLogObserver lifecycleLogObserver = this.mLifecycleLogObserver;
        if (lifecycleLogObserver != null) {
            lifecycleLogObserver.LIZ(this);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        super.onDestroy();
        this.compositeDisposable.dispose();
        this.subWidgetManager = null;
        Animator animator = this.showAnimator;
        if (animator != null) {
            if (animator.isRunning()) {
                this.showAnimator.cancel();
            }
            this.showAnimator.removeAllListeners();
            this.showAnimator = null;
        }
        LifecycleLogObserver lifecycleLogObserver = this.mLifecycleLogObserver;
        if (lifecycleLogObserver != null) {
            lifecycleLogObserver.LIZIZ(this);
        }
    }

    public void releaseSubWidgetManager() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        if (this.subWidgetManager != null && this.widgetCallback.getWidgetManager().getHost() != null) {
            FragmentTransaction beginTransaction = this.widgetCallback.getWidgetManager().getChildFragmentManager().beginTransaction();
            beginTransaction.remove(this.subWidgetManager);
            beginTransaction.commitNowAllowingStateLoss();
        }
        this.subWidgetManager = null;
    }

    public final <T extends View> T findViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        return (T) this.contentView.findViewById(i);
    }
}
