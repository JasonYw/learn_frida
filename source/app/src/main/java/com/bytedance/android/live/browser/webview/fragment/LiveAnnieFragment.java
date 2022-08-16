package com.bytedance.android.live.browser.webview.fragment;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.annie.container.fragment.C2606a;
import com.bytedance.android.annie.scheme.p215vo.BaseHybridParamVo;
import com.bytedance.android.annie.scheme.p215vo.FragmentParamVo;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdkapi.service.ILiveVideoFloatWindowService;
import com.bytedance.android.livesdkapi.view.IVideoFloatManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.AbstractC101211PtV;
import p003X.C106862S5w;
import p003X.C422912oP;
import p003X.C87010KQi;
import p003X.RunnableC101177Psx;
import p003X.RunnableC101178Psy;

/* loaded from: classes8.dex */
public final class LiveAnnieFragment extends C2606a implements AbstractC4055k, AbstractC101211PtV, IVideoFloatManager.AutoFloatEnable, AbstractC13971f {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap _$_findViewCache;
    public final Lazy canShowFloatLive$delegate = LazyKt__LazyJVMKt.lazy(LiveAnnieFragment$canShowFloatLive$2.INSTANCE);
    public boolean mIsMute;
    public boolean mIsShowLiveFloatWindow;

    static {
        Covode.recordClassIndex(23115);
    }

    private final boolean getCanShowFloatLive() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        return ((Boolean) (proxy.isSupported ? proxy.result : this.canShowFloatLive$delegate.mo27335getValue())).booleanValue();
    }

    @Override // com.bytedance.android.annie.container.fragment.C2606a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14).isSupported && (hashMap = this._$_findViewCache) != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.annie.container.fragment.C2606a
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 13);
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

    @Override // com.bytedance.android.livesdkapi.view.IVideoFloatManager.AutoFloatEnable
    public final String getRequestPage() {
        return "LiveAnnieFragment";
    }

    @Override // com.bytedance.android.annie.container.fragment.C2606a, com.bytedance.android.annie.api.container.HybridFragment, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneFullName() {
        return "com/bytedance/android/live/browser/webview/fragment/LiveAnnieFragment";
    }

    @Override // com.bytedance.android.annie.container.fragment.C2606a, com.bytedance.android.annie.api.container.HybridFragment, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneSimpleName() {
        return "LiveAnnieFragment";
    }

    @Override // com.bytedance.android.livesdkapi.view.IVideoFloatManager.AutoFloatEnable
    public final boolean isAutoFloatEnable() {
        return true;
    }

    @Override // com.bytedance.android.annie.container.fragment.C2606a
    public final boolean pullUpAdapterStatusBar() {
        return true;
    }

    @Override // com.bytedance.android.live.browser.webview.fragment.AbstractC4055k
    public final boolean isShowLiveFloatWindow() {
        return this.mIsShowLiveFloatWindow;
    }

    @Override // com.bytedance.android.livesdkapi.view.IVideoFloatManager.AutoFloatEnable
    public final void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        close();
    }

    @Override // com.bytedance.android.annie.container.fragment.C2606a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        super.onDestroy();
        needAdapterStatusBarColor();
    }

    private final void initFloatLive() {
        FragmentParamVo fragmentParamVo;
        BaseHybridParamVo baseHybridParamVo;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported && (fragmentParamVo = this.mFragmentParams) != null && (baseHybridParamVo = fragmentParamVo.LIZLLL) != null && baseHybridParamVo.LJJIZ && baseHybridParamVo.LJIJJLI && getCanShowFloatLive()) {
            showLiveFloatWindow();
        }
    }

    @Override // com.bytedance.android.live.browser.webview.fragment.AbstractC4055k
    public final void hideLiveFloatWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9).isSupported || !this.mIsShowLiveFloatWindow) {
            return;
        }
        this.mIsShowLiveFloatWindow = false;
        FrameLayout frameLayout = this.mFloatView;
        if (frameLayout != null) {
            C422912oP.LIZJ(new RunnableC101178Psy(frameLayout, this));
        }
    }

    @Override // com.bytedance.android.annie.container.fragment.C2606a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        super.onDestroyView();
        if (this.mIsShowLiveFloatWindow) {
            hideLiveFloatWindow();
        }
        if (this.mIsMute) {
            handleChangeMuteStatus(false);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.browser.webview.fragment.AbstractC4055k
    public final void showLiveFloatWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8).isSupported || this.mIsShowLiveFloatWindow) {
            return;
        }
        this.mIsShowLiveFloatWindow = true;
        FrameLayout frameLayout = this.mFloatView;
        if (frameLayout != null) {
            C422912oP.LIZJ(new RunnableC101177Psx(frameLayout, this));
        }
    }

    @Override // com.bytedance.android.annie.container.fragment.C2606a, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        super.onActivityCreated(bundle);
        initFloatLive();
    }

    @Override // p003X.AbstractC101211PtV
    public final void setMuteStatus(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        this.mIsMute = z;
        handleChangeMuteStatus(z);
    }

    @Override // com.bytedance.android.annie.container.fragment.C2606a
    public final boolean inIgnoreArea(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(motionEvent);
        return ((ILiveVideoFloatWindowService) ServiceManager.getService(ILiveVideoFloatWindowService.class)).onFloatWindowInterceptTouchEvent(this, motionEvent);
    }

    public final void handleChangeMuteStatus(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        if (z) {
            C87010KQi.LIZ().LIZ(new C5986ap(47));
        } else {
            C87010KQi.LIZ().LIZ(new C5986ap(48));
        }
        ((ILiveVideoFloatWindowService) ServiceManager.getService(ILiveVideoFloatWindowService.class)).toggleLiveAudio(z);
    }

    @Override // com.bytedance.android.annie.container.fragment.C2606a
    public final void handlePullStateChange(int i) {
        BaseHybridParamVo baseHybridParamVo;
        FragmentParamVo fragmentParamVo;
        BaseHybridParamVo baseHybridParamVo2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        if (i != 3) {
            if (i == 4 && (fragmentParamVo = this.mFragmentParams) != null && (baseHybridParamVo2 = fragmentParamVo.LIZLLL) != null && baseHybridParamVo2.LJJIZ && getCanShowFloatLive() && this.mIsShowLiveFloatWindow) {
                hideLiveFloatWindow();
            }
        } else {
            FragmentParamVo fragmentParamVo2 = this.mFragmentParams;
            if (fragmentParamVo2 != null && (baseHybridParamVo = fragmentParamVo2.LIZLLL) != null && baseHybridParamVo.LJJIZ && getCanShowFloatLive()) {
                showLiveFloatWindow();
            }
        }
        super.handlePullStateChange(i);
    }
}
