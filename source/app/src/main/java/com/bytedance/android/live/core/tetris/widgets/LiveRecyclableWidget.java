package com.bytedance.android.live.core.tetris.widgets;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.SafetyGuard;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import p002O.C0002O;
import p003X.AbstractC4569445g;
import p003X.C149496fqJ;
import p003X.C3J9;
import p003X.C87010KQi;

/* loaded from: classes12.dex */
public abstract class LiveRecyclableWidget extends LiveWidget implements AbstractC4141a, AbstractC4569445g {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean alive;
    public Object[] args;
    public boolean clearAfterDestroyed;
    public Disposable disposable;
    public boolean initialized;
    public boolean isPreload;
    public boolean recyclable;

    static {
        Covode.recordClassIndex(23791);
    }

    public String getNitaTag() {
        return "";
    }

    public boolean isRecyclableOnRotation() {
        return true;
    }

    public void onClear() {
    }

    public void onEnterClear(int i) {
    }

    public void onExitClear(int i) {
    }

    public abstract void onInit(Object[] objArr);

    public abstract void onLoad(Object[] objArr);

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract void onUnload();

    @Override // com.bytedance.android.live.core.tetris.widgets.AbstractC4141a
    public final void setRecyclable() {
        this.recyclable = true;
    }

    public void slideRecyclerListToEnd() {
    }

    public int supportClearScene() {
        return 0;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.AbstractC4141a
    public final boolean isAlive() {
        return this.alive;
    }

    public final boolean isInitialized() {
        return this.initialized;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.AbstractC4141a
    public final void clearAfterDestroyed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        if (this.alive) {
            this.clearAfterDestroyed = true;
        } else if (this.isDestroyed) {
            onClear();
        }
    }

    public Boolean recylerViewIsBottom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        return Boolean.FALSE;
    }

    private void registerClearScreen() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8).isSupported && supportClearScene() != 0) {
            this.disposable = C87010KQi.LIZ().LIZ(C4143o.class).filter(new Predicate<C4143o>() { // from class: com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget.2
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(23793);
                }

                @Override // io.reactivex.functions.Predicate
                public final /* synthetic */ boolean test(C4143o c4143o) {
                    C4143o c4143o2 = c4143o;
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4143o2}, this, LIZ, false, 1);
                    if (proxy.isSupported) {
                        return ((Boolean) proxy.result).booleanValue();
                    }
                    if ((c4143o2.LIZJ & LiveRecyclableWidget.this.supportClearScene()) == c4143o2.LIZJ) {
                        return true;
                    }
                    return false;
                }
            }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<C4143o>() { // from class: com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(23792);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(C4143o c4143o) {
                    C4143o c4143o2 = c4143o;
                    if (!PatchProxy.proxy(new Object[]{c4143o2}, this, LIZ, false, 1).isSupported) {
                        try {
                            int i = c4143o2.LIZJ;
                            if (c4143o2.LIZIZ) {
                                ALogger.m15797i("ttlive_widget", "widget :" + getClass().getSimpleName() + " enter scene: " + i);
                                LiveRecyclableWidget.this.onEnterClear(i);
                                return;
                            }
                            ALogger.m15797i("ttlive_widget", "widget :" + getClass().getSimpleName() + " exit scene: " + i);
                            LiveRecyclableWidget.this.onExitClear(i);
                        } catch (Exception unused) {
                            ALogger.m15797i("ttlive_widget", "error! widget :" + getClass().getSimpleName() + " event:" + c4143o2.toString());
                        }
                    }
                }
            });
        }
    }

    public boolean isScreenPortrait() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.dataCenter == null) {
            return false;
        }
        return ((Boolean) this.dataCenter.get("data_is_portrait", (String) Boolean.FALSE)).booleanValue();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        this.alive = true;
        super.onCreate();
        if (!this.initialized) {
            onInit(this.args);
            this.initialized = true;
        }
        registerClearScreen();
        onLoad(this.args);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        MethodCollector.m14708i(1598);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            MethodCollector.m14707o(1598);
            return;
        }
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
            this.disposable = null;
        }
        if (this.contentView != null && this.containerView != null) {
            try {
                this.containerView.removeView(this.contentView);
            } catch (Exception e) {
                new StringBuilder();
                ALogger.m15799e("ttlive_widget", C0002O.m25086C(getClass().getSimpleName(), " destroy crash."), e);
            }
        }
        releaseSubWidgetManager();
        try {
            onUnload();
        } catch (Exception e2) {
            SafetyGuard.LIZ(e2, "LiveRecyclableWidget onUnload error");
        }
        super.onDestroy();
        this.containerView = null;
        this.dataCenter = null;
        setWidgetCallback(null);
        this.args = null;
        this.context = null;
        this.alive = false;
        if (this.clearAfterDestroyed || !this.recyclable) {
            onClear();
            this.initialized = false;
        }
        MethodCollector.m14707o(1598);
    }

    public void enqueueRunnableToMainThread(Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        if (C149496fqJ.LIZLLL()) {
            C3J9.LIZ(runnable);
        } else {
            runnable.run();
        }
    }

    public void setPreload(Boolean bool) {
        if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        this.isPreload = bool.booleanValue();
    }
}
