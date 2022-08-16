package com.bytedance.android.annie.container.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.annie.api.bridge.BaseJSBridgeMethodFactory;
import com.bytedance.android.annie.api.bridge.IJSBridgeManager;
import com.bytedance.android.annie.api.bridge.IShareInfoProvider;
import com.bytedance.android.annie.api.bridge.ShareInfo;
import com.bytedance.android.annie.api.card.HybridCard;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.android.annie.api.container.HybridFragment;
import com.bytedance.android.annie.api.monitor.AbstractC2582a;
import com.bytedance.android.annie.container.fragment.AnnieFragment$handleNestedScrollWithVp$1$onPageSelected$1;
import com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1;
import com.bytedance.android.annie.container.fragment.C2606a;
import com.bytedance.android.annie.scheme.p215vo.BaseHybridParamVo;
import com.bytedance.android.annie.scheme.p215vo.CardParamVo;
import com.bytedance.android.annie.scheme.p215vo.FragmentParamVo;
import com.bytedance.android.annie.scheme.p215vo.PageType;
import com.bytedance.android.annie.scheme.p215vo.WebHybridParamVo;
import com.bytedance.android.annie.view.ForceInterceptConstraintLayout;
import com.bytedance.android.annie.view.FullscreenVideoFrame;
import com.bytedance.android.annie.view.WebRiskHintView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge.IJavaMethod;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC101138PsK;
import p003X.AbstractC101229Ptn;
import p003X.AbstractC90724Lok;
import p003X.AbstractC99767PQz;
import p003X.AbstractC99852PUg;
import p003X.AbstractC99853PUh;
import p003X.B0B;
import p003X.C101013PqJ;
import p003X.C101125Ps7;
import p003X.C101227Ptl;
import p003X.C101313Pv9;
import p003X.C106862S5w;
import p003X.C109391T5d;
import p003X.C116971W2r;
import p003X.C150339g3v;
import p003X.C89747LXp;
import p003X.C89748LXq;
import p003X.C89754LXw;
import p003X.C90746Lp6;
import p003X.C91077LuR;
import p003X.C91078LuS;
import p003X.C99758PQq;
import p003X.C99783PRp;
import p003X.C99825PTf;
import p003X.C99826PTg;
import p003X.C99851PUf;
import p003X.C99854PUi;
import p003X.C99855PUj;
import p003X.C99858PUm;
import p003X.C99859PUn;
import p003X.C99860PUo;
import p003X.C99973PYx;
import p003X.FXB;
import p003X.GQN;
import p003X.L18;
import p003X.LHO;
import p003X.LPI;
import p003X.PK0;
import p003X.PP2;
import p003X.PQR;
import p003X.PTC;
import p003X.PTO;
import p003X.PTP;
import p003X.PTQ;
import p003X.PTT;
import p003X.PTV;
import p003X.PTW;
import p003X.PTZ;
import p003X.PUK;
import p003X.PUL;
import p003X.PUM;
import p003X.PUN;
import p003X.PUU;
import p003X.PUW;
import p003X.PUX;
import p003X.Q4I;
import p003X.Q4J;
import p003X.Q4K;
import p003X.Q4L;
import p003X.RunnableC101010PqG;
import p003X.View$OnClickListenerC101179Psz;
import p003X.View$OnKeyListenerC101180Pt0;
import p003X.ViewTreeObserver$OnGlobalLayoutListenerC91076LuQ;
import p003X.ViewTreeObserver$OnPreDrawListenerC109657TFj;

/* renamed from: com.bytedance.android.annie.container.fragment.a */
/* loaded from: classes7.dex */
public class C2606a extends HybridFragment implements IShareInfoProvider, WeakHandler.IHandler, AbstractC13971f {
    public static final C101013PqJ Companion = new C101013PqJ((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap _$_findViewCache;
    public final Boolean disableWebViewLoad;
    public HybridFragment.IActionListener mActionListener;
    public PTQ mAnnieContext;
    public View mBaseBarBackView;
    public View mBaseBarCloseView;
    public View mBaseBarShareView;
    public AbstractC101138PsK mCalendarMethodProvider;
    public AbstractC2582a mCommonLifecycle;
    public FullscreenVideoFrame mCustomLayout;
    public View mCustomView;
    public WebChromeClient.CustomViewCallback mCustomViewCallback;
    public int mExtraHeight;
    public AbstractC99852PUg mFailSubFragmentProxy;
    public FrameLayout mFloatView;
    public FragmentParamVo mFragmentParams;
    public WeakHandler mHandler;
    public int mHybridCardBgColor;
    public int mHybridCardScrollY;
    public View mIndicatorView;
    public boolean mIsError;
    public boolean mIsFullScreenPopup;
    public IHybridComponent.AbstractC2581a mJSBridgeListener;
    public ShareInfo mJsbShareInfo;
    public boolean mKeyboardShown;
    public int mLastPaddingTop;
    public AbstractC99767PQz mLatchProcess;
    public View mLoadingLayout;
    public AbstractC99852PUg mLoadingSubFragmentProxy;
    public boolean mModStatusBar;
    public View mNavBar;
    public View mNavBarBackView;
    public View mNavBarCloseView;
    public AbstractC99852PUg mNavBarFragmentProxy;
    public View mNavBarShareView;
    public TextView mNavBarTitleView;
    public ViewTreeObserver.OnGlobalLayoutListener mOnLayoutChangeListener;
    public View mParentView;
    public ViewTreeObserver.OnPreDrawListener mPreDrawListener;
    public View mRootView;
    public AbstractC101229Ptn mScreenShotProvider;
    public IHybridComponent.IOnScrollChangeListener mScrollListenerI;
    public View mTitleBarContainer;
    public WebRiskHintView mWebRiskHintView;
    public int preLength;
    public boolean profileShown;
    public Disposable subscribe;
    public boolean visibleChangeByApp;
    public C99973PYx configModel = new C99973PYx(false, false);
    public boolean mClearHistory = true;
    public final Lazy mShareInfo$delegate = LazyKt__LazyJVMKt.lazy(AnnieFragment$mShareInfo$2.INSTANCE);
    public List<HybridFragment.ILifeCycleListener> mLifecycleListeners = new ArrayList();
    public final Lazy<AnnieFragment$mGlobalLayoutListener$1.ViewTreeObserver$OnGlobalLayoutListenerC26051> mGlobalLayoutListener = LazyKt__LazyJVMKt.lazy(new AnnieFragment$mGlobalLayoutListener$1(this));
    public int mPreviousHeight = -1;
    public int mPullUpState = -1;
    public final Lazy mNavBarHeight$delegate = LazyKt__LazyJVMKt.lazy(AnnieFragment$mNavBarHeight$2.INSTANCE);
    public boolean containerVisible = true;
    public final CompositeDisposable visibleChangeDisposes = new CompositeDisposable();

    static {
        Covode.recordClassIndex(10755);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 83).isSupported && (hashMap = this._$_findViewCache) != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 82);
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

    public final int getMNavBarHeight() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : ((Number) this.mNavBarHeight$delegate.mo27335getValue()).intValue();
    }

    public final ShareInfo getMShareInfo() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        return (ShareInfo) (proxy.isSupported ? proxy.result : this.mShareInfo$delegate.mo27335getValue());
    }

    @Override // com.bytedance.android.annie.api.container.HybridFragment, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public String getSceneFullName() {
        return "com/bytedance/android/annie/container/fragment/AnnieFragment";
    }

    @Override // com.bytedance.android.annie.api.container.HybridFragment, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public String getSceneSimpleName() {
        return "AnnieFragment";
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public void handlePullStateChange(int i) {
    }

    public boolean inIgnoreArea(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 79);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(motionEvent);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 84).isSupported) {
            return;
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public boolean pullUpAdapterStatusBar() {
        return false;
    }

    @Override // com.bytedance.android.annie.api.bridge.IShareInfoProvider
    public ShareInfo getShareInfo() {
        return this.mJsbShareInfo;
    }

    @Override // com.bytedance.android.annie.api.container.HybridFragment
    public boolean disableDragDown() {
        if (this.mHybridCardScrollY > 0) {
            return true;
        }
        return false;
    }

    public final boolean isFullScreen() {
        BaseHybridParamVo baseHybridParamVo;
        FragmentParamVo fragmentParamVo = this.mFragmentParams;
        if (fragmentParamVo != null && (baseHybridParamVo = fragmentParamVo.LIZLLL) != null && baseHybridParamVo.LJIJJLI) {
            return true;
        }
        return false;
    }

    private final void bindCustomLayoutEvent() {
        FullscreenVideoFrame fullscreenVideoFrame;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32).isSupported && (fullscreenVideoFrame = this.mCustomLayout) != null) {
            fullscreenVideoFrame.setListener(new C101313Pv9(this));
        }
    }

    private final void bindEvent() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25).isSupported) {
            return;
        }
        bindTitleEvent();
        bindRetryEvent();
        bindCustomLayoutEvent();
        bindKeyboardEvent();
    }

    private final int getSoftInputMode() {
        BaseHybridParamVo baseHybridParamVo;
        FragmentParamVo fragmentParamVo = this.mFragmentParams;
        int i = -1;
        if (fragmentParamVo == null || (baseHybridParamVo = fragmentParamVo.LIZLLL) == null) {
            return -1;
        }
        if (baseHybridParamVo.LJJJ) {
            i = 48;
        }
        if (baseHybridParamVo.LJJJI >= 0) {
            return baseHybridParamVo.LJJJI;
        }
        return i;
    }

    @Override // com.bytedance.android.annie.api.container.HybridFragment
    public void back() {
        IHybridComponent mAnnieCard;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 56).isSupported && (mAnnieCard = getMAnnieCard()) != null) {
            mAnnieCard.goBack();
        }
    }

    @Override // com.bytedance.android.annie.api.container.HybridFragment
    public void cancelLoading() {
        AbstractC99852PUg abstractC99852PUg;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 65).isSupported && (abstractC99852PUg = this.mLoadingSubFragmentProxy) != null) {
            abstractC99852PUg.LIZJ();
        }
    }

    @Override // com.bytedance.android.annie.api.bridge.IShareInfoProvider
    public void refreshFromShare() {
        IHybridComponent mAnnieCard;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 57).isSupported && (mAnnieCard = getMAnnieCard()) != null) {
            IHybridComponent.DefaultImpls.load$default(mAnnieCard, null, null, 3, null);
        }
    }

    @Override // com.bytedance.android.annie.api.container.HybridFragment, com.bytedance.android.annie.api.card.IHybridComponent
    public void release() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        super.release();
        this.mLifecycleListeners.clear();
    }

    private final void bindKeyboardEvent() {
        ViewTreeObserver viewTreeObserver;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51).isSupported) {
            return;
        }
        this.mParentView = getParentView();
        this.mOnLayoutChangeListener = new ViewTreeObserver$OnGlobalLayoutListenerC91076LuQ(this);
        View view = this.mParentView;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.mOnLayoutChangeListener);
        }
    }

    private final void bindRetryEvent() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31).isSupported) {
            return;
        }
        AbstractC99852PUg abstractC99852PUg = this.mFailSubFragmentProxy;
        if (!(abstractC99852PUg instanceof AbstractC99853PUh)) {
            abstractC99852PUg = null;
        }
        AbstractC99853PUh abstractC99853PUh = (AbstractC99853PUh) abstractC99852PUg;
        if (abstractC99853PUh != null) {
            AnnieFragment$bindRetryEvent$1 annieFragment$bindRetryEvent$1 = new AnnieFragment$bindRetryEvent$1(this);
            if (!PatchProxy.proxy(new Object[]{annieFragment$bindRetryEvent$1}, abstractC99853PUh, AbstractC99853PUh.LIZLLL, false, 1).isSupported) {
                C106862S5w.LIZ(annieFragment$bindRetryEvent$1);
                abstractC99853PUh.LJFF = annieFragment$bindRetryEvent$1;
            }
        }
    }

    private final void delaySafeRegisterScreenCaptureListener() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 70).isSupported) {
            return;
        }
        this.mScreenShotProvider = PTW.LIZIZ.LIZ(this, getActivity());
        this.subscribe = Observable.timer(1500L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C101227Ptl(this), C91077LuR.LIZIZ);
    }

    private final View getParentView() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        Window window = getWindow();
        if (window == null) {
            return null;
        }
        View findViewById = window.getDecorView().findViewById(16908290);
        if (!(findViewById instanceof ViewGroup)) {
            findViewById = null;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.getChildAt(0);
    }

    private final Window getWindow() {
        Dialog dialog;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48);
        if (proxy.isSupported) {
            return (Window) proxy.result;
        }
        if (isFullScreen()) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return null;
            }
            return activity.getWindow();
        }
        DialogFragment dialogFragment = (DialogFragment) getParentFragment();
        if (dialogFragment == null || (dialog = dialogFragment.getDialog()) == null) {
            return null;
        }
        return dialog.getWindow();
    }

    private final boolean isUgPadScene() {
        FragmentParamVo fragmentParamVo;
        BaseHybridParamVo baseHybridParamVo;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!isFullScreen() || !C99783PRp.m22998LJ().LIZJ || (fragmentParamVo = this.mFragmentParams) == null || (baseHybridParamVo = fragmentParamVo.LIZLLL) == null || !baseHybridParamVo.LJJJIL) {
            return false;
        }
        return true;
    }

    private final void removeKeyboardListener() {
        View view;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10).isSupported && (view = this.mParentView) != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "");
            if (viewTreeObserver.isAlive() && this.mOnLayoutChangeListener != null) {
                int i = Build.VERSION.SDK_INT;
                viewTreeObserver.removeOnGlobalLayoutListener(this.mOnLayoutChangeListener);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 64).isSupported) {
            return;
        }
        super.onDetach();
        Disposable disposable = this.subscribe;
        if (disposable != null) {
            disposable.dispose();
        }
        this.visibleChangeDisposes.dispose();
        AbstractC101229Ptn abstractC101229Ptn = this.mScreenShotProvider;
        if (abstractC101229Ptn != null) {
            abstractC101229Ptn.LIZ(false);
        }
    }

    public final void onHideCustomView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36).isSupported) {
            return;
        }
        if (this.mCustomView == null) {
            this.mCustomViewCallback = null;
            return;
        }
        TextView textView = this.mNavBarTitleView;
        if (textView != null) {
            textView.setVisibility(0);
        }
        FullscreenVideoFrame fullscreenVideoFrame = this.mCustomLayout;
        if (fullscreenVideoFrame != null) {
            fullscreenVideoFrame.setVisibility(0);
            fullscreenVideoFrame.removeView(this.mCustomView);
            this.mCustomView = null;
            UIUtils.requestOrienation(getActivity(), false);
            WebChromeClient.CustomViewCallback customViewCallback = this.mCustomViewCallback;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 62).isSupported) {
            return;
        }
        super.onPause();
        IHybridComponent mAnnieCard = getMAnnieCard();
        if (!(mAnnieCard instanceof PTO)) {
            mAnnieCard = null;
        }
        HybridCard hybridCard = (HybridCard) mAnnieCard;
        if (hybridCard != null) {
            hybridCard.onPause();
        }
        sendVisibleChangeEvent(false);
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            B0B.LIZIZ(containerId());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 61).isSupported) {
            return;
        }
        super.onStop();
        if (this.containerVisible) {
            this.visibleChangeByApp = C99825PTf.LIZ();
        }
        realVisibleChange(false);
    }

    public C2606a() {
        C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJJIIZI;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        this.disableWebViewLoad = c90746Lp6.LIZ();
    }

    private final void bindTitleEvent() {
        BaseHybridParamVo baseHybridParamVo;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26).isSupported) {
            return;
        }
        registerBackEvent(this.mBaseBarBackView);
        registerBackEvent(this.mNavBarBackView);
        registerShareEvent(this.mBaseBarShareView);
        FragmentParamVo fragmentParamVo = this.mFragmentParams;
        if (fragmentParamVo != null && (baseHybridParamVo = fragmentParamVo.LIZLLL) != null && baseHybridParamVo.LJJIL) {
            registerShareEvent(this.mNavBarShareView);
        } else {
            registerNavBarShareEvent(this.mNavBarShareView);
        }
        registerCloseEvent(this.mBaseBarCloseView);
        registerCloseEvent(this.mNavBarCloseView);
    }

    private final void parseArgs() {
        FragmentParamVo fragmentParamVo;
        BaseHybridParamVo baseHybridParamVo;
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            fragmentParamVo = (FragmentParamVo) arguments.getParcelable("hybrid_common_vo");
        } else {
            fragmentParamVo = null;
        }
        if (!(fragmentParamVo instanceof FragmentParamVo)) {
            fragmentParamVo = null;
        }
        this.mFragmentParams = fragmentParamVo;
        FragmentParamVo fragmentParamVo2 = this.mFragmentParams;
        if (fragmentParamVo2 != null && fragmentParamVo2.LIZIZ != null) {
            z = true;
        }
        this.configModel = new C99973PYx(z, C99783PRp.LIZLLL().LIZ);
        FragmentParamVo fragmentParamVo3 = this.mFragmentParams;
        if (fragmentParamVo3 != null && (baseHybridParamVo = fragmentParamVo3.LIZLLL) != null) {
            this.mHybridCardBgColor = PUN.LIZ(baseHybridParamVo.LJJIIJZLJL, baseHybridParamVo.LJJIIJ, CastProtectorUtils.parseColor("#00000000"));
        }
    }

    public final void addCardAndBindEvent() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported || getContext() == null) {
            return;
        }
        FragmentParamVo fragmentParamVo = this.mFragmentParams;
        if (fragmentParamVo != null) {
            setMAnnieCard(addHybridCard(fragmentParamVo));
            B0B.LIZ(containerId(), this);
            initRiskBanner(fragmentParamVo.LIZLLL);
            BaseHybridParamVo baseHybridParamVo = fragmentParamVo.LIZLLL;
            if (baseHybridParamVo != null) {
                setCloseByGesture(!baseHybridParamVo.LJIILIIL);
            }
        }
        PTW.LIZIZ.LIZ((HybridFragment) this);
        PTW.LIZIZ.LIZIZ(this);
        delaySafeRegisterScreenCaptureListener();
    }

    public final boolean needAdapterKeyboard() {
        FragmentParamVo fragmentParamVo;
        BaseHybridParamVo baseHybridParamVo;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if ((C99783PRp.LJIIIZ() && C99783PRp.m22998LJ().LIZJ) || (fragmentParamVo = this.mFragmentParams) == null || (baseHybridParamVo = fragmentParamVo.LIZLLL) == null || baseHybridParamVo.LJJJI != -1) {
            return false;
        }
        if (baseHybridParamVo.LJIJJLI) {
            if (!baseHybridParamVo.LIZIZ && !baseHybridParamVo.LJIL) {
                return false;
            }
            return true;
        } else if (!baseHybridParamVo.LJIJI) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean needAdapterStatusBarColor() {
        FragmentParamVo fragmentParamVo;
        BaseHybridParamVo baseHybridParamVo;
        FragmentParamVo fragmentParamVo2;
        BaseHybridParamVo baseHybridParamVo2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 75);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJIIJ;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        Boolean LIZ = c90746Lp6.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (!LIZ.booleanValue() || !pullUpAdapterStatusBar() || (fragmentParamVo = this.mFragmentParams) == null || (baseHybridParamVo = fragmentParamVo.LIZLLL) == null || !baseHybridParamVo.LJJJJJ || (fragmentParamVo2 = this.mFragmentParams) == null || (baseHybridParamVo2 = fragmentParamVo2.LIZLLL) == null || !baseHybridParamVo2.LJJIL) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        View view;
        ViewTreeObserver viewTreeObserver;
        View view2;
        ViewTreeObserver viewTreeObserver2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        super.onDestroy();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.mPreDrawListener;
        if (onPreDrawListener != null && (view2 = this.mParentView) != null && (viewTreeObserver2 = view2.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnPreDrawListener(onPreDrawListener);
        }
        if (this.configModel.LIZIZ && (view = this.mRootView) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.mGlobalLayoutListener.mo27335getValue());
        }
        if (needAdapterStatusBarColor() && C99783PRp.LJIIIZ() && C99783PRp.m22998LJ().LIZLLL && this.mModStatusBar) {
            GQN.LIZIZ(getActivity());
            this.mModStatusBar = false;
        }
        B0B.LIZIZ(containerId());
        removeKeyboardListener();
        release();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        boolean areEqual;
        WeakReference weakReference;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 63).isSupported) {
            return;
        }
        super.onResume();
        sendVisibleChangeEvent(true);
        IHybridComponent mAnnieCard = getMAnnieCard();
        Object obj = null;
        if (!(mAnnieCard instanceof PTO)) {
            mAnnieCard = null;
        }
        HybridCard hybridCard = (HybridCard) mAnnieCard;
        if (hybridCard != null) {
            hybridCard.onResume();
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{this}, null, B0B.LIZ, true, 6);
        if (proxy.isSupported) {
            areEqual = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(this);
            if (!B0B.LIZIZ.LIZ().isEmpty()) {
                Set<Map.Entry<String, WeakReference<C2606a>>> entrySet = B0B.LIZIZ.LIZ().entrySet();
                Intrinsics.checkNotNullExpressionValue(entrySet, "");
                Map.Entry entry = (Map.Entry) CollectionsKt___CollectionsKt.last(entrySet);
                if (entry != null && (weakReference = (WeakReference) entry.getValue()) != null) {
                    obj = weakReference.get();
                }
                areEqual = Intrinsics.areEqual(obj, this);
            }
            realVisibleChange(true);
        }
        if (!areEqual) {
            return;
        }
        realVisibleChange(true);
    }

    public final void setBackViewVisibility() {
        FragmentParamVo fragmentParamVo;
        BaseHybridParamVo baseHybridParamVo;
        int i;
        View view;
        View view2;
        int i2 = 0;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45).isSupported && (fragmentParamVo = this.mFragmentParams) != null && (baseHybridParamVo = fragmentParamVo.LIZLLL) != null && getMAnnieCard() != null) {
            IHybridComponent mAnnieCard = getMAnnieCard();
            boolean z = true;
            if ((mAnnieCard == null || !mAnnieCard.canGoBack()) && !baseHybridParamVo.LJIJJLI) {
                z = false;
                i = 8;
            } else {
                i = 0;
            }
            if ((!baseHybridParamVo.LJJJJJ || baseHybridParamVo.LJIIJJI) && ((!baseHybridParamVo.LJJIJL || !baseHybridParamVo.LJIIJ) && z)) {
                i2 = 8;
            }
            if (baseHybridParamVo.LJIIJ && (view2 = this.mBaseBarCloseView) != null) {
                view2.setVisibility(i2);
            }
            if (baseHybridParamVo.LJIIJJI && (view = this.mBaseBarBackView) != null) {
                view.setVisibility(i);
            }
            if (baseHybridParamVo.LJJIL) {
                View view3 = this.mNavBarBackView;
                if (view3 != null) {
                    view3.setVisibility(i);
                }
                View view4 = this.mNavBarCloseView;
                if (view4 != null) {
                    view4.setVisibility(i2);
                }
            }
        }
    }

    private final void adapterVo() {
        FragmentParamVo fragmentParamVo;
        BaseHybridParamVo baseHybridParamVo;
        String str;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15).isSupported && getActivity() != null && (fragmentParamVo = this.mFragmentParams) != null && (baseHybridParamVo = fragmentParamVo.LIZLLL) != null && baseHybridParamVo.LJJIJ) {
            baseHybridParamVo.LJJ = PUN.LIZIZ.LIZ(baseHybridParamVo.LJJ, C99783PRp.m22998LJ().LIZLLL);
            baseHybridParamVo.LJJI = PUN.LIZIZ.LIZ(baseHybridParamVo.LJJI, !C99783PRp.m22998LJ().LIZLLL);
            PUN pun = PUN.LIZIZ;
            int i = this.mHybridCardBgColor;
            boolean z = C99783PRp.m22998LJ().LIZLLL;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, pun, PUN.LIZ, false, 9);
            if (proxy.isSupported) {
                i = ((Integer) proxy.result).intValue();
            } else if (i == CastProtectorUtils.parseColor("#00ffffff") || i == -1) {
                if (z) {
                    str = "white";
                } else {
                    str = "#00000000";
                }
                i = CastProtectorUtils.parseColor(str);
            }
            this.mHybridCardBgColor = i;
        }
    }

    private final FrameLayout.LayoutParams getUgPadSceneLayoutParams() {
        int i;
        int i2;
        int i3;
        float f;
        BaseHybridParamVo baseHybridParamVo;
        int i4;
        int i5 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35);
        if (proxy.isSupported) {
            return (FrameLayout.LayoutParams) proxy.result;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        getActivity();
        C89747LXp c89747LXp = C89747LXp.LIZIZ;
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity);
        Intrinsics.checkNotNullExpressionValue(activity, "");
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{activity}, c89747LXp, C89747LXp.LIZ, false, 13);
        if (proxy2.isSupported) {
            i = ((Integer) proxy2.result).intValue();
        } else {
            C106862S5w.LIZ(activity);
            i = c89747LXp.LIZ((Activity) activity).heightPixels;
        }
        C89747LXp c89747LXp2 = C89747LXp.LIZIZ;
        FragmentActivity activity2 = getActivity();
        Intrinsics.checkNotNull(activity2);
        Intrinsics.checkNotNullExpressionValue(activity2, "");
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{activity2}, c89747LXp2, C89747LXp.LIZ, false, 14);
        if (proxy3.isSupported) {
            i2 = ((Integer) proxy3.result).intValue();
        } else {
            C106862S5w.LIZ(activity2);
            i2 = c89747LXp2.LIZ((Activity) activity2).widthPixels;
        }
        FragmentParamVo fragmentParamVo = this.mFragmentParams;
        if (fragmentParamVo != null && (baseHybridParamVo = fragmentParamVo.LIZLLL) != null) {
            f = baseHybridParamVo.LJJJJ;
            if (!baseHybridParamVo.LJIIZILJ) {
                i4 = C89748LXq.LIZIZ.LIZ(44.0f);
            } else {
                i4 = 0;
            }
            if (!baseHybridParamVo.LIZIZ) {
                i5 = C89748LXq.LIZIZ.LIZLLL();
            }
            i3 = i5;
            i5 = i4;
        } else {
            i3 = 0;
            f = 1.0f;
        }
        int i6 = (i - i5) - i3;
        if (i2 / i > f) {
            layoutParams.width = (int) (i6 * f);
            layoutParams.height = i6;
            layoutParams.gravity = 17;
            return layoutParams;
        }
        layoutParams.width = i2;
        layoutParams.height = i6;
        return layoutParams;
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public void close() {
        String str;
        BaseHybridParamVo baseHybridParamVo;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 53).isSupported) {
            return;
        }
        if (isFullScreen()) {
            FragmentParamVo fragmentParamVo = this.mFragmentParams;
            if (fragmentParamVo != null && (baseHybridParamVo = fragmentParamVo.LIZLLL) != null) {
                str = baseHybridParamVo.LJJIJIIJIL;
            } else {
                str = null;
            }
            if (str != null && !StringsKt__StringsJVMKt.isBlank(str)) {
                if (Intrinsics.areEqual(Uri.parse(str).getQueryParameter("intercept_back"), "1")) {
                    IHybridComponent mAnnieCard = getMAnnieCard();
                    if (mAnnieCard != null) {
                        mAnnieCard.sendJsEvent("H5_webcastPageQuit", new JSONObject());
                        return;
                    }
                    return;
                }
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                return;
            }
            activity2.finish();
        } else if (getParentFragment() == null || !(getParentFragment() instanceof DialogFragment)) {
        } else {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((DialogFragment) parentFragment).dismissAllowingStateLoss();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.DialogFragment");
        }
    }

    private final void initStatusBar() {
        BaseHybridParamVo baseHybridParamVo;
        byte b;
        boolean LIZ;
        MethodCollector.m14708i(932);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16).isSupported) {
            MethodCollector.m14707o(932);
            return;
        }
        FragmentParamVo fragmentParamVo = this.mFragmentParams;
        if (fragmentParamVo != null && (baseHybridParamVo = fragmentParamVo.LIZLLL) != null) {
            if (baseHybridParamVo.LJJIJ) {
                String str = baseHybridParamVo.LJJ;
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != 93818879) {
                        if (hashCode == 113101865 && str.equals("white")) {
                            GQN.LIZIZ(getActivity());
                        }
                    } else if (str.equals("black")) {
                        GQN.LIZ(getActivity());
                    }
                }
                GQN.LIZJ(getActivity());
                PUN.LIZ((Activity) getActivity(), baseHybridParamVo.LJJI);
            } else {
                String str2 = baseHybridParamVo.LJJIJIIJIL;
                if (str2 == null) {
                    str2 = "";
                }
                if (PUN.LIZIZ(str2) && C99783PRp.m22998LJ().LIZLLL) {
                    b = 1;
                } else {
                    b = 0;
                }
                String str3 = baseHybridParamVo.LJJ;
                if (str3 != null) {
                    FragmentActivity activity = getActivity();
                    String str4 = baseHybridParamVo.LJJI;
                    boolean z = baseHybridParamVo.LIZIZ;
                    boolean z2 = baseHybridParamVo.LJIL;
                    if (!PatchProxy.proxy(new Object[]{activity, Byte.valueOf(b), str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, null, PUN.LIZ, true, 5).isSupported) {
                        C106862S5w.LIZ(str3);
                        if (activity != null) {
                            if (b != 0) {
                                GQN.LIZ(activity);
                                GQN.LIZJ(activity);
                                PUN.LIZ((Activity) activity, "white");
                            } else {
                                if (Intrinsics.areEqual("white", str3)) {
                                    GQN.LIZIZ(activity);
                                    GQN.LIZJ(activity);
                                } else if (Intrinsics.areEqual("black", str3)) {
                                    GQN.LIZ(activity);
                                    if (!z && !z2) {
                                        GQN.LIZJ(activity);
                                    }
                                }
                                PUN.LIZ((Activity) activity, str4);
                            }
                        }
                    }
                }
            }
            if (baseHybridParamVo.LJIJJLI) {
                if (baseHybridParamVo.LIZIZ) {
                    FragmentActivity activity2 = getActivity();
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity2, (byte) 0, (byte) 0}, null, FXB.LIZ, true, 1);
                    if (proxy.isSupported) {
                        LIZ = ((Boolean) proxy.result).booleanValue();
                    } else {
                        if (LHO.LIZIZ) {
                            boolean z3 = LHO.LIZJ;
                        }
                        LIZ = FXB.LIZ(activity2);
                    }
                    if (LIZ) {
                        PUN.LIZ(getActivity(), baseHybridParamVo.LJJ);
                    } else {
                        LHO lho = LHO.LIZLLL;
                        FragmentActivity activity3 = getActivity();
                        if (!PatchProxy.proxy(new Object[]{activity3}, lho, LHO.LIZ, false, 2).isSupported && activity3 != null) {
                            int i = Build.VERSION.SDK_INT;
                            if (!PatchProxy.proxy(new Object[]{activity3}, lho, LHO.LIZ, false, 3).isSupported) {
                                activity3.getWindow().setFlags(AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END, AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END);
                                if (!PatchProxy.proxy(new Object[]{activity3}, lho, LHO.LIZ, false, 5).isSupported) {
                                    C106862S5w.LIZ(activity3);
                                    int i2 = Build.VERSION.SDK_INT;
                                    Window window = activity3.getWindow();
                                    Intrinsics.checkNotNullExpressionValue(window, "");
                                    window.setStatusBarColor(lho.LIZ((Activity) activity3));
                                }
                            }
                        }
                    }
                }
                if (baseHybridParamVo.LJIL) {
                    PUN.LIZ(getActivity(), baseHybridParamVo.LJJ);
                }
            }
            MethodCollector.m14707o(932);
            return;
        }
        MethodCollector.m14707o(932);
    }

    private final AbstractC2582a createFragmentProxyCommonLifecycle(AbstractC2582a abstractC2582a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC2582a}, this, changeQuickRedirect, false, 40);
        if (proxy.isSupported) {
            return (AbstractC2582a) proxy.result;
        }
        return new C99860PUo(this, abstractC2582a);
    }

    private final void initCustomLayout(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24).isSupported) {
            return;
        }
        this.mCustomLayout = (FullscreenVideoFrame) view.findViewById(2131171963);
    }

    private final void registerBackEvent(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27).isSupported && view != null) {
            view.setOnClickListener(new PTV(this));
        }
    }

    private final void registerCloseEvent(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28).isSupported && view != null) {
            view.setOnClickListener(new View$OnClickListenerC101179Psz(this));
        }
    }

    private final void registerNavBarShareEvent(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 30).isSupported && view != null) {
            view.setOnClickListener(new PTZ(this));
        }
    }

    private final void registerShareEvent(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29).isSupported && view != null) {
            view.setOnClickListener(new PTP(this));
        }
    }

    @Override // com.bytedance.android.annie.api.bridge.IShareInfoProvider
    public void injectShareInfo(ShareInfo shareInfo) {
        if (PatchProxy.proxy(new Object[]{shareInfo}, this, changeQuickRedirect, false, 52).isSupported) {
            return;
        }
        this.mJsbShareInfo = shareInfo;
        View view = this.mNavBarShareView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void registerLifecycleListener(HybridFragment.ILifeCycleListener iLifeCycleListener) {
        if (PatchProxy.proxy(new Object[]{iLifeCycleListener}, this, changeQuickRedirect, false, 42).isSupported) {
            return;
        }
        C106862S5w.LIZ(iLifeCycleListener);
        this.mLifecycleListeners.add(iLifeCycleListener);
    }

    public final void setActionListener(HybridFragment.IActionListener iActionListener) {
        if (PatchProxy.proxy(new Object[]{iActionListener}, this, changeQuickRedirect, false, 41).isSupported) {
            return;
        }
        C106862S5w.LIZ(iActionListener);
        this.mActionListener = iActionListener;
    }

    @Override // com.bytedance.android.annie.api.container.HybridFragment
    public void setHybridTitle(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 71).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        TextView textView = this.mNavBarTitleView;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.bytedance.android.annie.api.container.HybridFragment, com.bytedance.android.annie.api.card.IHybridComponent
    public void setOnScrollChangeListener(IHybridComponent.IOnScrollChangeListener iOnScrollChangeListener) {
        if (PatchProxy.proxy(new Object[]{iOnScrollChangeListener}, this, changeQuickRedirect, false, 72).isSupported) {
            return;
        }
        C106862S5w.LIZ(iOnScrollChangeListener);
        this.mScrollListenerI = iOnScrollChangeListener;
    }

    private final void initUi(View view) {
        BaseHybridParamVo baseHybridParamVo;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        FragmentParamVo fragmentParamVo = this.mFragmentParams;
        if (fragmentParamVo != null && (baseHybridParamVo = fragmentParamVo.LIZLLL) != null) {
            initTitleBar(view, baseHybridParamVo);
            initIndicator(view, baseHybridParamVo);
            initLoadingView(view, baseHybridParamVo);
            initFailView(view, baseHybridParamVo);
            initCustomLayout(view);
        }
        bindEvent();
    }

    private final void updateTitleBarContainerUi(float f) {
        int i;
        if (!PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, changeQuickRedirect, false, 77).isSupported && (i = this.mExtraHeight) > 0) {
            int LIZ = ((int) (i * f)) + C89748LXq.LIZIZ.LIZ(9.0f);
            if (Math.abs(LIZ - this.mLastPaddingTop) > 1) {
                this.mLastPaddingTop = LIZ;
                View view = this.mTitleBarContainer;
                if (view != null) {
                    view.setPadding(0, LIZ, 0, 0);
                }
            }
        }
    }

    public final void enableClose(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 81).isSupported) {
            return;
        }
        if (isFullScreen()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "systemBack");
            setCloseByGesture(z, "containerShouldClose", jSONObject);
            return;
        }
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof PUL)) {
            parentFragment = null;
        }
        PUL pul = (PUL) parentFragment;
        if (pul != null) {
            pul.setCusCancelable(z);
        }
    }

    public final String getVisibleChangeReason(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 60);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (z) {
            if (this.visibleChangeByApp) {
                return PushConstants.EXTRA_APPLICATION_PENDING_INTENT;
            }
            return "page";
        } else if (!z) {
            if (C99825PTf.LIZ()) {
                return PushConstants.EXTRA_APPLICATION_PENDING_INTENT;
            }
            return "page";
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void handleNestedScrollWithVp(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38).isSupported) {
            return;
        }
        final View findViewRecursive = findViewRecursive(view, AnnieFragment$handleNestedScrollWithVp$vp$1.INSTANCE);
        if (findViewRecursive instanceof ViewPager) {
            final ArrayList arrayList = new ArrayList();
            ViewPager viewPager = (ViewPager) findViewRecursive;
            if (viewPager != null) {
                viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: X.5VB
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(10766);
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void onPageScrollStateChanged(int i) {
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void onPageScrolled(int i, float f, int i2) {
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void onPageSelected(int i) {
                        boolean z;
                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        if (arrayList.size() != ((ViewPager) findViewRecursive).getChildCount()) {
                            arrayList.clear();
                            int childCount = ((ViewPager) findViewRecursive).getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                List list = arrayList;
                                C2606a c2606a = C2606a.this;
                                View childAt = ((ViewPager) findViewRecursive).getChildAt(i2);
                                Intrinsics.checkNotNullExpressionValue(childAt, "");
                                View findViewRecursive2 = c2606a.findViewRecursive(childAt, AnnieFragment$handleNestedScrollWithVp$1$onPageSelected$1.INSTANCE);
                                if (!(findViewRecursive2 instanceof RecyclerView)) {
                                    findViewRecursive2 = null;
                                }
                                list.add(findViewRecursive2);
                            }
                        }
                        int i3 = 0;
                        for (Object obj : arrayList) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            RecyclerView recyclerView = (RecyclerView) obj;
                            if (recyclerView != null) {
                                if (i3 == i) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                recyclerView.setNestedScrollingEnabled(z);
                            }
                            i3 = i4;
                        }
                    }
                });
            }
        }
    }

    public final void loadShareInfoSafely(WebView webView) {
        if (PatchProxy.proxy(new Object[]{webView}, this, changeQuickRedirect, false, 44).isSupported) {
            return;
        }
        C106862S5w.LIZ(webView);
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            loadShareInfo(webView);
            return;
        }
        IHybridComponent mAnnieCard = getMAnnieCard();
        if (!(mAnnieCard instanceof FrameLayout)) {
            mAnnieCard = null;
        }
        FrameLayout frameLayout = (FrameLayout) mAnnieCard;
        if (frameLayout != null) {
            frameLayout.post(new RunnableC101010PqG(this, webView));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        if (!C99783PRp.LJIIIZ()) {
            super.onCreate(bundle);
            return;
        }
        super.onCreate(bundle);
        this.mHandler = new WeakHandler(this);
        parseArgs();
        adapterVo();
        initStatusBar();
    }

    public final void realVisibleChange(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 59).isSupported || z == this.containerVisible) {
            return;
        }
        this.containerVisible = z;
        this.visibleChangeDisposes.add(Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new PUW(this, z), C91078LuS.LIZIZ));
    }

    public final void sendVisibleChangeEvent(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 58).isSupported) {
            return;
        }
        PUN.LIZ(getMAnnieCard(), z);
        AbstractC101229Ptn abstractC101229Ptn = this.mScreenShotProvider;
        if (abstractC101229Ptn != null) {
            abstractC101229Ptn.LIZ(z);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.android.live.room.AbstractC5483d
    public void setArguments(Bundle bundle) {
        if (!PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 8).isSupported && bundle != null && bundle.getParcelable("hybrid_common_vo") != null) {
            super.setArguments(bundle);
        }
    }

    @Override // com.bytedance.android.annie.api.container.HybridFragment
    public void setCloseByGesture(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 55).isSupported) {
            return;
        }
        setCloseByGesture(z, "on_key_back", new JSONObject());
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public void setJSBridgeListener(IHybridComponent.AbstractC2581a abstractC2581a) {
        if (PatchProxy.proxy(new Object[]{abstractC2581a}, this, changeQuickRedirect, false, 73).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC2581a);
        this.mJSBridgeListener = abstractC2581a;
        IHybridComponent mAnnieCard = getMAnnieCard();
        if (mAnnieCard != null) {
            mAnnieCard.setJSBridgeListener(abstractC2581a);
        }
    }

    @Override // com.bytedance.android.annie.api.container.HybridFragment, p003X.PTU
    public void setRadius(float f) {
        IHybridComponent mAnnieCard;
        if (!PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, changeQuickRedirect, false, 66).isSupported && (mAnnieCard = getMAnnieCard()) != null) {
            mAnnieCard.setRadius(f);
        }
    }

    private final void initRiskBanner(BaseHybridParamVo baseHybridParamVo) {
        Boolean bool;
        View hybridView;
        if (PatchProxy.proxy(new Object[]{baseHybridParamVo}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJI;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        Boolean LIZ = c90746Lp6.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (LIZ.booleanValue()) {
            View view = null;
            if (baseHybridParamVo != null) {
                bool = baseHybridParamVo.LJJIFFI;
            } else {
                bool = null;
            }
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                IHybridComponent mAnnieCard = getMAnnieCard();
                if (mAnnieCard != null) {
                    view = mAnnieCard.getHybridView();
                }
                if (view instanceof PP2) {
                    IHybridComponent mAnnieCard2 = getMAnnieCard();
                    if (mAnnieCard2 != null && (hybridView = mAnnieCard2.getHybridView()) != null) {
                        ((PP2) hybridView).setCallback(new Q4I(this));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.annie.card.web.base.ISecLinkHandler");
                }
            }
        }
    }

    public final void loadShareInfo(WebView webView) {
        FragmentParamVo fragmentParamVo;
        BaseHybridParamVo baseHybridParamVo;
        if (!PatchProxy.proxy(new Object[]{webView}, this, changeQuickRedirect, false, 43).isSupported && (fragmentParamVo = this.mFragmentParams) != null && (baseHybridParamVo = fragmentParamVo.LIZLLL) != null && baseHybridParamVo.LJIIL) {
            ShareInfo mShareInfo = getMShareInfo();
            String url = webView.getUrl();
            if (url != null) {
                url.toString();
            } else {
                url = "";
            }
            mShareInfo.setUrl(url);
            int i = Build.VERSION.SDK_INT;
            webView.evaluateJavascript("document.title", new Q4J(this));
            webView.evaluateJavascript("document.getElementsByName('description')[0].content", new Q4K(this));
            webView.evaluateJavascript("document.getElementsByTagName('link')[0].href", new Q4L(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        View parentView;
        Window window;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        super.onActivityCreated(bundle);
        int softInputMode = getSoftInputMode();
        if (softInputMode >= 0 && (window = getWindow()) != null) {
            window.setSoftInputMode(softInputMode);
        }
        C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJIL;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        Boolean LIZ = c90746Lp6.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (LIZ.booleanValue() && isFullScreen() && (parentView = getParentView()) != null) {
            this.mPreDrawListener = new ViewTreeObserver$OnPreDrawListenerC109657TFj(parentView, this);
            parentView.getViewTreeObserver().addOnPreDrawListener(this.mPreDrawListener);
            return;
        }
        addCardAndBindEvent();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, changeQuickRedirect, false, 80).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        if (isUgPadScene()) {
            IHybridComponent mAnnieCard = getMAnnieCard();
            if (!(mAnnieCard instanceof PTO)) {
                mAnnieCard = null;
            }
            PTO pto = (PTO) mAnnieCard;
            if (pto != null) {
                FrameLayout.LayoutParams ugPadSceneLayoutParams = getUgPadSceneLayoutParams();
                pto.setLayoutParams(ugPadSceneLayoutParams);
                IHybridComponent mAnnieCard2 = getMAnnieCard();
                if (!(mAnnieCard2 instanceof PTO)) {
                    mAnnieCard2 = null;
                }
                HybridCard hybridCard = (HybridCard) mAnnieCard2;
                if (hybridCard != null) {
                    hybridCard.updateScreenMetrics(ugPadSceneLayoutParams.width, ugPadSceneLayoutParams.height);
                }
            }
        }
    }

    public final void setShowTopClose(boolean z) {
        FragmentParamVo fragmentParamVo;
        BaseHybridParamVo baseHybridParamVo;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 78).isSupported) {
            return;
        }
        IHybridComponent mAnnieCard = getMAnnieCard();
        int i = 8;
        if (mAnnieCard != null && mAnnieCard.canGoBack() && (fragmentParamVo = this.mFragmentParams) != null && (baseHybridParamVo = fragmentParamVo.LIZLLL) != null && baseHybridParamVo.LJIIJJI) {
            View view = this.mBaseBarBackView;
            if (view != null) {
                if (z) {
                    i = 0;
                }
                view.setVisibility(i);
                return;
            }
            return;
        }
        View view2 = this.mBaseBarCloseView;
        if (view2 != null) {
            if (z) {
                i = 0;
            }
            view2.setVisibility(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r3 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p003X.PTO addHybridCard(com.bytedance.android.annie.scheme.p215vo.FragmentParamVo r7) {
        /*
            r6 = this;
            r5 = 933(0x3a5, float:1.307E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m14708i(r5)
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.annie.container.fragment.C2606a.changeQuickRedirect
            r0 = 34
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r6, r1, r2, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.result
            X.PTO r0 = (p003X.PTO) r0
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)
            return r0
        L1f:
            android.content.Context r1 = r6.getContext()
            r2 = 0
            if (r1 == 0) goto L98
            java.lang.String r0 = ""
            X.PTO r3 = r6.createCard(r1, r7)
            boolean r0 = r6.isUgPadScene()
            r4 = 2131176956(0x7f072dfc, float:1.7968454E38)
            if (r0 == 0) goto L78
            android.view.View r1 = r6._$_findCachedViewById(r4)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            if (r1 == 0) goto L44
            android.widget.FrameLayout$LayoutParams r0 = r6.getUgPadSceneLayoutParams()
            r1.addView(r3, r0)
        L44:
            com.bytedance.android.annie.scheme.vo.FragmentParamVo r0 = r6.mFragmentParams
            if (r0 == 0) goto L75
            com.bytedance.android.annie.scheme.vo.BaseHybridParamVo r0 = r0.LIZLLL
            if (r0 == 0) goto L75
            java.lang.String r1 = r0.LJJJJI
            if (r1 == 0) goto L75
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.isBlank(r1)
            if (r0 != 0) goto L75
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Throwable -> L6d
            android.view.View r0 = r6._$_findCachedViewById(r4)     // Catch: java.lang.Throwable -> L6d
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6b
            r0.setBackgroundColor(r1)     // Catch: java.lang.Throwable -> L6d
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6d
        L67:
            kotlin.Result.m30308constructorimpl(r0)     // Catch: java.lang.Throwable -> L6d
            goto L75
        L6b:
            r0 = r2
            goto L67
        L6d:
            r0 = move-exception
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m30308constructorimpl(r0)
        L75:
            if (r3 == 0) goto L94
            goto L90
        L78:
            android.view.View r0 = r6._$_findCachedViewById(r4)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            if (r0 == 0) goto L83
            r0.addView(r3)
        L83:
            if (r3 == 0) goto L94
            android.view.View r1 = r3.getHybridView()
            if (r1 == 0) goto L90
            int r0 = r6.mHybridCardBgColor
            r1.setBackgroundColor(r0)
        L90:
            r0 = 3
            com.bytedance.android.annie.api.card.IHybridComponent.DefaultImpls.load$default(r3, r2, r2, r0, r2)
        L94:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)
            return r3
        L98:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.annie.container.fragment.C2606a.addHybridCard(com.bytedance.android.annie.scheme.vo.FragmentParamVo):X.PTO");
    }

    public final void onDialogPullUpStateChange(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 74).isSupported) {
            return;
        }
        this.mPullUpState = i;
        if (i != 3) {
            if (i == 4) {
                View view = this.mIndicatorView;
                if (view != null) {
                    view.setVisibility(0);
                }
                if (needAdapterStatusBarColor() && C99783PRp.m22998LJ().LIZLLL && this.mModStatusBar) {
                    GQN.LIZIZ(getActivity());
                    this.mModStatusBar = false;
                }
            }
        } else {
            View view2 = this.mIndicatorView;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (needAdapterStatusBarColor() && C99783PRp.m22998LJ().LIZLLL) {
                FragmentActivity activity = getActivity();
                Boolean bool = Boolean.FALSE;
                if (!PatchProxy.proxy(new Object[]{activity, bool}, null, GQN.LIZ, true, 20).isSupported && activity != null) {
                    GQN.LIZ(activity.getWindow(), bool);
                }
                this.mModStatusBar = true;
            }
        }
        handlePullStateChange(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void registerBridge(IJSBridgeManager iJSBridgeManager) {
        Map mapOf;
        Map mapOf2;
        if (PatchProxy.proxy(new Object[]{iJSBridgeManager}, this, changeQuickRedirect, false, 69).isSupported) {
            return;
        }
        Iterator<T> it = PTW.LIZIZ.LIZ((Fragment) this).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.mLifecycleListeners.add(entry.getValue());
            iJSBridgeManager.registerMethod((String) entry.getKey(), (AbstractC13049f.AbstractC13051b) entry.getValue());
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{this}, null, C99758PQq.LIZ, true, 6);
        if (proxy.isSupported) {
            mapOf = (Map) proxy.result;
        } else {
            C106862S5w.LIZ(this);
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m137to("setTitle", new L18(this)), TuplesKt.m137to("cancelLoading", new PTT(this)), TuplesKt.m137to("setContainer", new LPI(this)));
        }
        for (Map.Entry entry2 : mapOf.entrySet()) {
            iJSBridgeManager.registerMethod((String) entry2.getKey(), (AbstractC13049f.AbstractC13051b) entry2.getValue());
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this}, null, C99758PQq.LIZ, true, 7);
        if (proxy2.isSupported) {
            mapOf2 = (Map) proxy2.result;
        } else {
            C106862S5w.LIZ(this);
            mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("setSideslip", new PUX(this)));
        }
        for (Map.Entry entry3 : mapOf2.entrySet()) {
            iJSBridgeManager.registerMethod((String) entry3.getKey(), (PK0) entry3.getValue());
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            for (BaseJSBridgeMethodFactory baseJSBridgeMethodFactory : PQR.LIZ()) {
                Iterator<T> it2 = baseJSBridgeMethodFactory.provideFragmentLegacyMethods(activity, this).entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it2.next();
                    iJSBridgeManager.registerMethod((String) entry4.getKey(), (IJavaMethod) entry4.getValue());
                }
                Iterator<T> it3 = baseJSBridgeMethodFactory.provideStateFulFragmentMethods(this).entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry5 = (Map.Entry) it3.next();
                    iJSBridgeManager.registerMethod((String) entry5.getKey(), (AbstractC13049f.AbstractC13051b) entry5.getValue());
                }
                Iterator<T> it4 = baseJSBridgeMethodFactory.provideProxyStateFulFragmentMethods(activity, this).entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry6 = (Map.Entry) it4.next();
                    this.mLifecycleListeners.add(entry6.getValue());
                    iJSBridgeManager.registerMethod((String) entry6.getKey(), (AbstractC13049f.AbstractC13051b) entry6.getValue());
                }
                Iterator<T> it5 = baseJSBridgeMethodFactory.provideStateLessFragmentMethods(this).entrySet().iterator();
                while (it5.hasNext()) {
                    Map.Entry entry7 = (Map.Entry) it5.next();
                    iJSBridgeManager.registerMethod((String) entry7.getKey(), (PK0) entry7.getValue());
                }
            }
            this.mCalendarMethodProvider = PTW.LIZIZ.LIZ(activity, this);
            AbstractC101138PsK abstractC101138PsK = this.mCalendarMethodProvider;
            if (abstractC101138PsK != null) {
                iJSBridgeManager.registerMethod("calendar", abstractC101138PsK.LIZ());
            }
        }
        if (_$_findCachedViewById(2131176956) != null) {
            PTW ptw = PTW.LIZIZ;
            FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(2131176956);
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            AbstractC13049f.AbstractC13051b LIZ = ptw.LIZ(frameLayout);
            if (LIZ != null) {
                iJSBridgeManager.registerMethod("clipScreen", LIZ);
            }
        }
    }

    private final void initTitleBar(View view, BaseHybridParamVo baseHybridParamVo) {
        if (PatchProxy.proxy(new Object[]{view, baseHybridParamVo}, this, changeQuickRedirect, false, 20).isSupported) {
            return;
        }
        if (baseHybridParamVo.LIZIZ || baseHybridParamVo.LJIL) {
            this.mExtraHeight = C89747LXp.LIZIZ.LIZ();
        }
        if (!baseHybridParamVo.LJIIZILJ || baseHybridParamVo.LJJIL) {
            initNavBar(view, baseHybridParamVo);
        }
        initBaseTitleBar(view, baseHybridParamVo);
    }

    public final void onDialogSlide(View view, float f) {
        if (PatchProxy.proxy(new Object[]{view, Float.valueOf(f)}, this, changeQuickRedirect, false, 76).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        View view2 = this.mBaseBarCloseView;
        if (view2 != null) {
            view2.setAlpha(f);
        }
        updateTitleBarContainerUi(f);
    }

    public final void sendKeyboardJsEvent(boolean z, int i) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)}, this, changeQuickRedirect, false, 46).isSupported) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("visible", z);
            jSONObject.put(C109391T5d.LJFF, i);
            sendJsEvent("H5_keyboardStatusChange", jSONObject);
            sendJsEvent("keyboardStatusChange", jSONObject);
        } catch (JSONException unused) {
        }
    }

    private final void initIndicator(View view, BaseHybridParamVo baseHybridParamVo) {
        String str;
        BaseHybridParamVo baseHybridParamVo2;
        if (!PatchProxy.proxy(new Object[]{view, baseHybridParamVo}, this, changeQuickRedirect, false, 21).isSupported && baseHybridParamVo.LJIJI) {
            if ((baseHybridParamVo.LJFF || baseHybridParamVo.LJJJJJ) && !baseHybridParamVo.LJII && !C89754LXw.LIZ(getActivity())) {
                View findViewById = view.findViewById(2131186812);
                FragmentParamVo fragmentParamVo = this.mFragmentParams;
                if (fragmentParamVo != null && (baseHybridParamVo2 = fragmentParamVo.LIZLLL) != null) {
                    str = baseHybridParamVo2.LJIIIIZZ;
                } else {
                    str = null;
                }
                this.mIndicatorView = view.findViewById(2131186811);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                if (Intrinsics.areEqual("white", str)) {
                    View view2 = this.mIndicatorView;
                    if (view2 != null) {
                        view2.setBackgroundResource(2130837824);
                    }
                } else if (Intrinsics.areEqual("dark", str)) {
                    View view3 = this.mIndicatorView;
                    if (view3 != null) {
                        view3.setBackgroundResource(2130837823);
                    }
                } else {
                    View view4 = this.mIndicatorView;
                    if (view4 != null) {
                        view4.setBackgroundResource(2130837824);
                    }
                }
            }
        }
    }

    private final void initLoadingView(View view, BaseHybridParamVo baseHybridParamVo) {
        if (!PatchProxy.proxy(new Object[]{view, baseHybridParamVo}, this, changeQuickRedirect, false, 22).isSupported && !baseHybridParamVo.LJJIIZ && !C99783PRp.LIZLLL().LIZIZ) {
            Context context = getContext();
            AbstractC99852PUg abstractC99852PUg = null;
            if (context != null) {
                C99973PYx c99973PYx = this.configModel;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(2131165635);
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c99973PYx, frameLayout, context}, null, C150339g3v.LIZ, true, 2);
                if (proxy.isSupported) {
                    abstractC99852PUg = (AbstractC99852PUg) proxy.result;
                } else {
                    C106862S5w.LIZ(c99973PYx, frameLayout, context);
                    abstractC99852PUg = new C99851PUf(context, frameLayout);
                }
            }
            this.mLoadingSubFragmentProxy = abstractC99852PUg;
            AbstractC99852PUg abstractC99852PUg2 = this.mLoadingSubFragmentProxy;
            if (abstractC99852PUg2 != null) {
                this.mLoadingLayout = abstractC99852PUg2.LIZ();
            }
            AbstractC99852PUg abstractC99852PUg3 = this.mLoadingSubFragmentProxy;
            if (abstractC99852PUg3 != null) {
                abstractC99852PUg3.LIZLLL();
            }
        }
    }

    private final void setViewDrawable(View view, int i) {
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i)}, this, changeQuickRedirect, false, 19).isSupported) {
            return;
        }
        if (view instanceof TextView) {
            C89748LXq c89748LXq = C89748LXq.LIZIZ;
            Context context = getContext();
            Intrinsics.checkNotNull(context);
            Intrinsics.checkNotNullExpressionValue(context, "");
            ((TextView) view).setCompoundDrawables(c89748LXq.LIZ(i, context), null, null, null);
        } else if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            if (imageView != null) {
                C89748LXq c89748LXq2 = C89748LXq.LIZIZ;
                Context context2 = getContext();
                Intrinsics.checkNotNull(context2);
                Intrinsics.checkNotNullExpressionValue(context2, "");
                imageView.setImageDrawable(c89748LXq2.LIZ(i, context2));
            }
        } else if (view != null) {
            view.setBackgroundResource(i);
        }
    }

    public final View findViewRecursive(View view, Function1<? super View, Boolean> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, function1}, this, changeQuickRedirect, false, 37);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(view, function1);
        if (function1.invoke(view).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            View findViewRecursive = findViewRecursive(childAt, function1);
            if (findViewRecursive != null) {
                return findViewRecursive;
            }
        }
        return null;
    }

    private final PTO createCard(Context context, FragmentParamVo fragmentParamVo) {
        AbstractC2582a abstractC2582a;
        PageType pageType;
        CardParamVo cardParamVo;
        IHybridComponent.HybridType hybridType;
        BaseHybridParamVo baseHybridParamVo;
        AbstractC2582a abstractC2582a2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, fragmentParamVo}, this, changeQuickRedirect, false, 39);
        if (proxy.isSupported) {
            return (PTO) proxy.result;
        }
        PTQ ptq = this.mAnnieContext;
        if (ptq == null) {
            AbstractC2582a abstractC2582a3 = this.mCommonLifecycle;
            if (abstractC2582a3 != null) {
                abstractC2582a2 = createFragmentProxyCommonLifecycle(abstractC2582a3);
            } else {
                abstractC2582a2 = null;
            }
            this.mAnnieContext = new PTQ(abstractC2582a2, this.mLatchProcess, null, null, 12);
        } else {
            Intrinsics.checkNotNull(ptq);
            AbstractC2582a abstractC2582a4 = this.mCommonLifecycle;
            if (abstractC2582a4 != null) {
                abstractC2582a = createFragmentProxyCommonLifecycle(abstractC2582a4);
            } else {
                abstractC2582a = null;
            }
            ptq.LIZ = abstractC2582a;
        }
        if (fragmentParamVo != null && (baseHybridParamVo = fragmentParamVo.LIZLLL) != null && baseHybridParamVo.LJIJI) {
            pageType = PageType.POPUP;
        } else {
            pageType = PageType.FULLSCREEN;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{fragmentParamVo, pageType}, null, C99826PTg.LIZ, true, 9);
        if (proxy2.isSupported) {
            cardParamVo = (CardParamVo) proxy2.result;
        } else {
            C106862S5w.LIZ(fragmentParamVo, pageType);
            cardParamVo = new CardParamVo(fragmentParamVo.LIZIZ, WebHybridParamVo.LJIIJJI.LIZ(fragmentParamVo.LIZLLL), pageType);
        }
        PTQ ptq2 = this.mAnnieContext;
        Intrinsics.checkNotNull(ptq2);
        PTO pto = new PTO(context, cardParamVo, ptq2);
        pto.setJSBridgeListener(new C101125Ps7(this));
        pto.LIZ(new PUK(this));
        PUM pum = new PUM(pto, this);
        if (!PatchProxy.proxy(new Object[]{pum}, pto, PTO.LIZ, false, 9).isSupported) {
            C106862S5w.LIZ(pum);
            IHybridComponent mCurrentHybridComponent = pto.getMCurrentHybridComponent();
            if (mCurrentHybridComponent != null) {
                hybridType = mCurrentHybridComponent.hybridType();
            } else {
                hybridType = null;
            }
            if (hybridType == IHybridComponent.HybridType.H5) {
                IHybridComponent mCurrentHybridComponent2 = pto.getMCurrentHybridComponent();
                if (!(mCurrentHybridComponent2 instanceof PTC)) {
                    mCurrentHybridComponent2 = null;
                }
                PTC ptc = (PTC) mCurrentHybridComponent2;
                if (ptc != null) {
                    ptc.LIZ(pum);
                }
            } else {
                pto.f10640LJ = pum;
            }
        }
        pto.setOnScrollChangeListener(new PUU(this));
        return pto;
    }

    private final void initBaseTitleBar(View view, BaseHybridParamVo baseHybridParamVo) {
        View findViewById;
        View view2;
        View view3;
        View view4;
        View view5;
        if (PatchProxy.proxy(new Object[]{view, baseHybridParamVo}, this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        this.mTitleBarContainer = view.findViewById(2131166930);
        this.mBaseBarBackView = view.findViewById(2131166924);
        if (baseHybridParamVo.LJJIJL) {
            findViewById = view.findViewById(2131166925);
        } else {
            findViewById = view.findViewById(2131166926);
        }
        this.mBaseBarCloseView = findViewById;
        int i = baseHybridParamVo.LJJIJLIJ;
        if (i != 0 && i == 1) {
            setViewDrawable(this.mBaseBarCloseView, 2130837838);
        }
        if (baseHybridParamVo.LJJJJJ && (view5 = this.mBaseBarCloseView) != null) {
            view5.setAlpha(0.0f);
        }
        this.mBaseBarShareView = view.findViewById(2131166927);
        this.mWebRiskHintView = (WebRiskHintView) view.findViewById(2131166931);
        if (baseHybridParamVo.LJIIJJI && baseHybridParamVo.LJIJJLI && (view4 = this.mBaseBarBackView) != null) {
            view4.setVisibility(0);
        }
        if (baseHybridParamVo.LJIIJ && baseHybridParamVo.LJIJJLI && (view3 = this.mBaseBarCloseView) != null) {
            view3.setVisibility(0);
        }
        if (baseHybridParamVo.LJIIL && (view2 = this.mBaseBarShareView) != null) {
            view2.setVisibility(0);
        }
        if (baseHybridParamVo.LJIJJLI) {
            updateTitleBarContainerUi(1.0f);
        }
    }

    private final void initFailView(View view, BaseHybridParamVo baseHybridParamVo) {
        FrameLayout frameLayout;
        AbstractC99852PUg abstractC99852PUg;
        if (PatchProxy.proxy(new Object[]{view, baseHybridParamVo}, this, changeQuickRedirect, false, 23).isSupported) {
            return;
        }
        if (this.configModel.LIZJ) {
            frameLayout = (FrameLayout) view.findViewById(2131176958);
        } else {
            frameLayout = (FrameLayout) view.findViewById(2131176957);
        }
        Context context = getContext();
        AbstractC99852PUg abstractC99852PUg2 = null;
        if (context != null) {
            C99973PYx c99973PYx = this.configModel;
            Intrinsics.checkNotNull(frameLayout);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c99973PYx, frameLayout, context}, null, C150339g3v.LIZ, true, 3);
            if (proxy.isSupported) {
                abstractC99852PUg2 = (AbstractC99852PUg) proxy.result;
            } else {
                C106862S5w.LIZ(c99973PYx, frameLayout, context);
                if (c99973PYx.LIZJ) {
                    abstractC99852PUg2 = new C99854PUi(context, frameLayout);
                } else {
                    abstractC99852PUg2 = new C99855PUj(context, frameLayout);
                }
            }
        }
        this.mFailSubFragmentProxy = abstractC99852PUg2;
        C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJJIJIL;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        if (!c90746Lp6.LIZ().booleanValue() && (abstractC99852PUg = this.mFailSubFragmentProxy) != null) {
            abstractC99852PUg.LIZ();
        }
    }

    private final void initNavBar(View view, BaseHybridParamVo baseHybridParamVo) {
        AbstractC99852PUg abstractC99852PUg;
        View view2;
        View view3;
        TextView textView;
        View view4;
        View view5;
        View view6;
        int i;
        if (PatchProxy.proxy(new Object[]{view, baseHybridParamVo}, this, changeQuickRedirect, false, 18).isSupported) {
            return;
        }
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = null;
        if (context != null) {
            C99973PYx c99973PYx = this.configModel;
            if (baseHybridParamVo.LJJIL) {
                i = 2131166929;
            } else {
                i = 2131166928;
            }
            FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c99973PYx, frameLayout, context}, null, C150339g3v.LIZ, true, 1);
            if (proxy.isSupported) {
                abstractC99852PUg = (AbstractC99852PUg) proxy.result;
            } else {
                C106862S5w.LIZ(c99973PYx, frameLayout, context);
                if (c99973PYx.LIZJ) {
                    abstractC99852PUg = new C99859PUn(context, frameLayout);
                } else {
                    abstractC99852PUg = new C99858PUm(context, frameLayout);
                }
            }
        } else {
            abstractC99852PUg = null;
        }
        this.mNavBarFragmentProxy = abstractC99852PUg;
        AbstractC99852PUg abstractC99852PUg2 = this.mNavBarFragmentProxy;
        if (abstractC99852PUg2 != null) {
            view2 = abstractC99852PUg2.LIZ();
        } else {
            view2 = null;
        }
        this.mNavBar = view2;
        View view7 = this.mNavBar;
        if (view7 != null) {
            view3 = view7.findViewById(2131165277);
        } else {
            view3 = null;
        }
        this.mNavBarBackView = view3;
        View view8 = this.mNavBar;
        if (view8 != null) {
            textView = (TextView) view8.findViewById(2131171295);
        } else {
            textView = null;
        }
        this.mNavBarTitleView = textView;
        View view9 = this.mNavBar;
        if (view9 != null) {
            view4 = view9.findViewById(2131168744);
        } else {
            view4 = null;
        }
        this.mNavBarShareView = view4;
        View view10 = this.mNavBar;
        if (view10 != null) {
            view5 = view10.findViewById(2131166073);
        } else {
            view5 = null;
        }
        this.mNavBarCloseView = view5;
        if (baseHybridParamVo.LJJIL) {
            View view11 = this.mNavBar;
            if (view11 != null && (layoutParams = view11.getLayoutParams()) != null) {
                layoutParams.height = this.mExtraHeight + C89748LXq.LIZIZ.LIZ(53.0f);
            }
            View view12 = this.mNavBar;
            if (view12 != null) {
                view12.setPadding(0, this.mExtraHeight + C89748LXq.LIZIZ.LIZ(9.0f), 0, 0);
            }
            View view13 = this.mNavBar;
            if (view13 != null) {
                view13.setLayoutParams(layoutParams);
            }
            if (baseHybridParamVo.LJIIL && (view6 = this.mNavBarShareView) != null) {
                view6.setVisibility(0);
            }
        } else {
            AbstractC99852PUg abstractC99852PUg3 = this.mNavBarFragmentProxy;
            if (abstractC99852PUg3 != null) {
                abstractC99852PUg3.LIZLLL();
            }
            View view14 = this.mNavBarBackView;
            if (view14 != null) {
                view14.setVisibility(0);
            }
        }
        if (C99783PRp.m22998LJ().LIZLLL) {
            String str = baseHybridParamVo.LJJIJIIJIL;
            if (str == null) {
                str = "";
            }
            if (PUN.LIZIZ(str) || baseHybridParamVo.LJJIL) {
                View view15 = this.mNavBar;
                if (view15 != null) {
                    view15.setBackgroundResource(2130837828);
                }
                TextView textView2 = this.mNavBarTitleView;
                if (textView2 != null) {
                    textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                }
                setViewDrawable(this.mNavBarBackView, 2130837819);
                setViewDrawable(this.mNavBarCloseView, 2130837830);
                setViewDrawable(this.mNavBarShareView, 2130837847);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        super.onActivityResult(i, i2, intent);
        for (HybridFragment.ILifeCycleListener iLifeCycleListener : this.mLifecycleListeners) {
            iLifeCycleListener.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), strArr, iArr}, this, changeQuickRedirect, false, 68).isSupported) {
            return;
        }
        C106862S5w.LIZ(strArr, iArr);
        AbstractC101138PsK abstractC101138PsK = this.mCalendarMethodProvider;
        if (abstractC101138PsK != null) {
            abstractC101138PsK.LIZ(i, strArr, iArr);
        }
    }

    private final void setCloseByGesture(boolean z, String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, jSONObject}, this, changeQuickRedirect, false, 54).isSupported) {
            return;
        }
        C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJJJJJ;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        Boolean LIZ = c90746Lp6.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (LIZ.booleanValue() && hybridType() == IHybridComponent.HybridType.H5) {
            View view = getView();
            if (!(view instanceof ForceInterceptConstraintLayout)) {
                view = null;
            }
            ForceInterceptConstraintLayout forceInterceptConstraintLayout = (ForceInterceptConstraintLayout) view;
            if (forceInterceptConstraintLayout != null) {
                forceInterceptConstraintLayout.setFocusableInTouchMode(true);
                forceInterceptConstraintLayout.requestFocus();
                forceInterceptConstraintLayout.setOnDispatchKeyEvent(new AnnieFragment$setCloseByGesture$$inlined$apply$lambda$1(this, str, jSONObject, z));
                return;
            }
            return;
        }
        View view2 = getView();
        if (view2 != null) {
            view2.setFocusableInTouchMode(true);
            view2.requestFocus();
            view2.setOnKeyListener(new View$OnKeyListenerC101180Pt0(this, str, jSONObject, z));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        View LIZ = C116971W2r.LIZ(layoutInflater, 2131689750, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        initUi(LIZ);
        if (this.configModel.LIZIZ && (viewTreeObserver = LIZ.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.mGlobalLayoutListener.mo27335getValue());
        }
        this.mRootView = LIZ;
        this.mFloatView = (FrameLayout) LIZ.findViewById(2131175462);
        return LIZ;
    }

    @Override // com.bytedance.android.annie.api.container.HybridFragment, p003X.PTU
    public void setRadius(float f, float f2, float f3, float f4) {
        IHybridComponent mAnnieCard;
        if (!PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, changeQuickRedirect, false, 67).isSupported && (mAnnieCard = getMAnnieCard()) != null) {
            mAnnieCard.setRadius(f, f2, f3, f4);
        }
    }

    public static /* synthetic */ void sendKeyboardJsEvent$default(C2606a c2606a, boolean z, int i, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{c2606a, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 47).isSupported) {
            return;
        }
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            c2606a.sendKeyboardJsEvent(z, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendKeyboardJsEvent");
    }
}
