package com.bytedance.android.annie.container.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.annie.api.bridge.BaseJSBridgeMethodFactory;
import com.bytedance.android.annie.api.bridge.IJSBridgeManager;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.android.annie.api.container.HybridFragment;
import com.bytedance.android.annie.api.monitor.AbstractC2582a;
import com.bytedance.android.annie.container.fragment.C2606a;
import com.bytedance.android.annie.scheme.p215vo.BaseHybridParamVo;
import com.bytedance.android.annie.scheme.p215vo.FragmentParamVo;
import com.bytedance.android.annie.scheme.p215vo.LynxHybridParamVo;
import com.bytedance.android.annie.scheme.p215vo.PopupHybridParamVo;
import com.bytedance.android.annie.scheme.p215vo.WebHybridParamVo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge.IJavaMethod;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p002O.C0002O;
import p003X.AbstractC90724Lok;
import p003X.AbstractC99767PQz;
import p003X.C101172Pss;
import p003X.C101174Psu;
import p003X.C106862S5w;
import p003X.C150338g3u;
import p003X.C89747LXp;
import p003X.C89748LXq;
import p003X.C89754LXw;
import p003X.C90746Lp6;
import p003X.C99758PQq;
import p003X.C99760PQs;
import p003X.C99783PRp;
import p003X.C99826PTg;
import p003X.C99847PUb;
import p003X.C99857PUl;
import p003X.C99861PUp;
import p003X.C99862PUq;
import p003X.DialogInterface$OnShowListenerC100740Plu;
import p003X.PK0;
import p003X.PQM;
import p003X.PQR;
import p003X.PTR;
import p003X.PUL;

/* loaded from: classes7.dex */
public final class AnnieDialog extends PUL implements IHybridComponent.AbstractC2581a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap _$_findViewCache;
    public AbstractC2582a mCommonLifecycle;
    public IHybridComponent.AbstractC2581a mJSBridgeListener;
    public AbstractC99767PQz mLatchProcess;
    public Function0<Unit> mOnDestroyCallback;
    public String mOriginalScheme;
    public String mUrl;

    static {
        Covode.recordClassIndex(10732);
    }

    @Override // p003X.PUL
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22).isSupported && (hashMap = this._$_findViewCache) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.PUL
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 21);
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

    @Override // p003X.PUL, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23).isSupported) {
            return;
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // p003X.PUL, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        super.onDestroy();
        Function0<Unit> function0 = this.mOnDestroyCallback;
        if (function0 != null) {
            function0.mo30099invoke();
        }
    }

    @Override // p003X.PUL
    public final void updateVoParamsByCustom() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        updatePullDownClose();
        updateVoSizeParam();
        updateVoSizeParamOnPad();
    }

    private final int getOrientation() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.getRequestedOrientation();
        }
        return 1;
    }

    @Override // p003X.PUL
    public final void checkIsValidDialog() {
        PopupHybridParamVo popupHybridParamVo;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        if (!shouldLoadBackground() && (popupHybridParamVo = this.mPopHybridParamVo) != null && popupHybridParamVo.LJIL) {
            setCusCancelable(true);
        } else {
            getDialog().hide();
        }
    }

    private final void updateVoSizeParamOnPad() {
        PopupHybridParamVo popupHybridParamVo;
        int i;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11).isSupported && C99783PRp.m22998LJ().LIZJ && !C99783PRp.m22998LJ().LIZIZ && (popupHybridParamVo = this.mPopHybridParamVo) != null) {
            double d = popupHybridParamVo.LIZJ * (375.0d / popupHybridParamVo.LIZIZ);
            popupHybridParamVo.LIZIZ = 375;
            if (!popupHybridParamVo.LJIIZILJ) {
                if (0.0d < d && d < 480.0d) {
                    i = (int) d;
                } else if (C89754LXw.LIZIZ.LIZ()) {
                    i = -1;
                } else {
                    i = 700;
                }
                popupHybridParamVo.LIZJ = i;
            }
            popupHybridParamVo.LJJI = 0;
            popupHybridParamVo.LJJ = 0;
            popupHybridParamVo.LJJIJIL = "right";
        }
    }

    private final void updatePullDownClose() {
        BaseHybridParamVo baseHybridParamVo;
        String str;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported && (baseHybridParamVo = this.mBaseHybridParamVo) != null && (str = baseHybridParamVo.LJJIJIIJIL) != null) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, C150338g3u.LIZ, true, 1);
            if (proxy.isSupported) {
                if (!((Boolean) proxy.result).booleanValue()) {
                    return;
                }
            } else {
                C106862S5w.LIZ(str);
                C90746Lp6<List<String>> c90746Lp6 = AbstractC90724Lok.f9052LJ;
                Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
                List<String> LIZ = c90746Lp6.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                List<String> list = LIZ;
                if (!(!list.isEmpty())) {
                    return;
                }
                for (String str2 : list) {
                    if (!StringsKt__StringsJVMKt.startsWith$default(str2, "http", false, 2, null)) {
                        str2 = C0002O.m25086C("http://", str2);
                    }
                    Uri parse = Uri.parse(str2);
                    if (parse != null && parse.getPath() != null && parse.getHost() != null) {
                        if (!TextUtils.isEmpty(parse.getPath())) {
                            String path = parse.getPath();
                            Intrinsics.checkNotNull(path);
                            if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) path, false, 2, (Object) null)) {
                                continue;
                            }
                        }
                        if (!TextUtils.isEmpty(parse.getHost())) {
                            String host = parse.getHost();
                            Intrinsics.checkNotNull(host);
                            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) host, false, 2, (Object) null)) {
                            }
                        }
                    }
                }
                return;
            }
            BaseHybridParamVo baseHybridParamVo2 = this.mBaseHybridParamVo;
            if (baseHybridParamVo2 != null) {
                baseHybridParamVo2.LJFF = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r0.booleanValue() != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void updateVoSizeParam() {
        /*
            r7 = this;
            r4 = 0
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.annie.container.dialog.AnnieDialog.changeQuickRedirect
            r0 = 7
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r4, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto Lf
            return
        Lf:
            android.content.Context r1 = r7.getContext()
            java.lang.String r5 = ""
            if (r1 == 0) goto La3
            X.Lp6<java.lang.Boolean> r0 = p003X.AbstractC90724Lok.LJIJJLI
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.Object r0 = r0.LIZ()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9c
            android.content.res.Resources r0 = r1.getResources()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r3 = r0.widthPixels
        L38:
            X.LXq r1 = p003X.C89748LXq.LIZIZ
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            android.util.DisplayMetrics r0 = r1.LIZ(r0)
            int r6 = r0.heightPixels
            X.LXp r1 = p003X.C89747LXp.LIZIZ
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            int r0 = r1.LIZJ(r0)
            int r2 = r6 - r0
            X.PSD r0 = p003X.C99783PRp.m22998LJ()
            boolean r0 = r0.LIZJ
            if (r0 == 0) goto L74
            X.PSD r0 = p003X.C99783PRp.m22998LJ()
            boolean r0 = r0.LIZIZ
            if (r0 != 0) goto L74
            X.LXw r1 = p003X.C89754LXw.LIZIZ
            int r0 = r7.getOrientation()
            boolean r0 = r1.LIZ(r0)
            if (r0 == 0) goto L9a
            if (r3 >= r2) goto L9a
            r6 = r3
            r3 = r2
        L70:
            r7.updateVoSizeParam(r4, r3, r6)
            return
        L74:
            android.content.Context r1 = r7.getContext()
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 != 0) goto L7d
            r1 = 0
        L7d:
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r4 = p003X.C89754LXw.LIZ(r1)
            if (r4 == 0) goto L9a
            X.Lp6<java.lang.Boolean> r0 = p003X.AbstractC90724Lok.LJJJJ
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.Object r0 = r0.LIZ()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9a
            goto L70
        L9a:
            r6 = r2
            goto L70
        L9c:
            X.LXq r0 = p003X.C89748LXq.LIZIZ
            int r3 = r0.LIZIZ()
            goto L38
        La3:
            X.LXq r0 = p003X.C89748LXq.LIZIZ
            int r3 = r0.LIZIZ()
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.annie.container.dialog.AnnieDialog.updateVoSizeParam():void");
    }

    public final void setCommonLifecycle(AbstractC2582a abstractC2582a) {
        this.mCommonLifecycle = abstractC2582a;
    }

    public final void setLatchProcess(AbstractC99767PQz abstractC99767PQz) {
        this.mLatchProcess = abstractC99767PQz;
    }

    private final AbstractC2582a createCommonLifecycleProxy(AbstractC2582a abstractC2582a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC2582a}, this, changeQuickRedirect, false, 19);
        if (proxy.isSupported) {
            return (AbstractC2582a) proxy.result;
        }
        return new C99861PUp(this, abstractC2582a);
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public final void setJSBridgeListener(IHybridComponent.AbstractC2581a abstractC2581a) {
        if (PatchProxy.proxy(new Object[]{abstractC2581a}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC2581a);
        this.mJSBridgeListener = abstractC2581a;
        HybridFragment hybridFragment = this.mAnnieFragment;
        if (hybridFragment != null) {
            hybridFragment.setJSBridgeListener(abstractC2581a);
        }
    }

    @Override // com.bytedance.android.annie.api.container.HybridDialog
    public final void setOnDestroyCallback(Function0<Unit> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        this.mOnDestroyCallback = function0;
    }

    private final void landscapeNavigationSetting(Dialog dialog) {
        MethodCollector.m14708i(928);
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 17).isSupported) {
            MethodCollector.m14707o(928);
            return;
        }
        Window window = dialog.getWindow();
        if (window != null) {
            window.addFlags(8);
            hideNavigation(window);
            window.setType(1000);
        }
        dialog.setOnShowListener(new DialogInterface$OnShowListenerC100740Plu(this, dialog));
        MethodCollector.m14707o(928);
    }

    public final void hideNavigation(Window window) {
        if (PatchProxy.proxy(new Object[]{window}, this, changeQuickRedirect, false, 18).isSupported) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "");
        decorView.setSystemUiVisibility(5894);
    }

    @Override // p003X.PUL, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Context context = getContext();
            if (context != null) {
                if (C89754LXw.LIZ((Activity) context)) {
                    landscapeNavigationSetting(dialog);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(configuration);
        super.onConfigurationChanged(configuration);
        updateVoSizeParamOnPad();
        PopupHybridParamVo popupHybridParamVo = this.mPopHybridParamVo;
        if (popupHybridParamVo != null && getDialog() != null) {
            Dialog dialog = getDialog();
            Intrinsics.checkNotNullExpressionValue(dialog, "");
            updateWindowSize(dialog, popupHybridParamVo.LIZIZ, popupHybridParamVo.LIZJ, popupHybridParamVo.LJIILL);
        }
    }

    @Override // p003X.PUL
    public final void parseBusinessArguments(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(bundle);
        this.mUrl = bundle.getString(PushConstants.WEB_URL);
        this.mOriginalScheme = bundle.getString("original_scheme");
    }

    @Override // p003X.PUL, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        if (this.mCommonLifecycle == null && C99783PRp.LJIIIZ()) {
            this.mCommonLifecycle = new C99862PUq(null);
            AbstractC2582a abstractC2582a = this.mCommonLifecycle;
            if (abstractC2582a != null) {
                abstractC2582a.onBeforeOpenContainer();
            }
            AbstractC2582a abstractC2582a2 = this.mCommonLifecycle;
            if (abstractC2582a2 != null) {
                BaseHybridParamVo baseHybridParamVo = this.mBaseHybridParamVo;
                String str3 = "";
                if (baseHybridParamVo == null || (str = baseHybridParamVo.LJJIJIL) == null) {
                    str = str3;
                }
                LynxHybridParamVo lynxHybridParamVo = this.mLynxHybridParamVo;
                if (lynxHybridParamVo != null && (str2 = lynxHybridParamVo.LIZJ) != null) {
                    str3 = str2;
                }
                abstractC2582a2.onPrepareInitDataStart(str, str3, false);
            }
        }
        super.onCreate(bundle);
    }

    private final void adjustLandscapeParam(int i) {
        PopupHybridParamVo popupHybridParamVo;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 4).isSupported && (popupHybridParamVo = this.mPopHybridParamVo) != null) {
            if (C89754LXw.LIZIZ.LIZ(getOrientation())) {
                if (!popupHybridParamVo.LJIIZILJ) {
                    popupHybridParamVo.LJIIJ = 8;
                    popupHybridParamVo.LIZJ = (int) C89748LXq.LIZIZ.LIZ(i - (popupHybridParamVo.LJII * 2));
                    popupHybridParamVo.LIZIZ = 300;
                }
                if (!popupHybridParamVo.LJIJI) {
                    popupHybridParamVo.LJIILL = 8388613;
                } else if (popupHybridParamVo.LJIILL == 80) {
                    popupHybridParamVo.LJIILL = 8388693;
                }
                if (popupHybridParamVo.LIZLLL > 0) {
                    popupHybridParamVo.LIZIZ = popupHybridParamVo.LIZLLL;
                }
                if (popupHybridParamVo.f25628LJ > 0) {
                    popupHybridParamVo.LIZJ = popupHybridParamVo.f25628LJ;
                }
                if (popupHybridParamVo.LJFF > 0) {
                    C89748LXq c89748LXq = C89748LXq.LIZIZ;
                    popupHybridParamVo.LIZJ = (int) c89748LXq.LIZ((c89748LXq.LIZ((Activity) getActivity()) * popupHybridParamVo.LJFF) / 100);
                }
                popupHybridParamVo.LJJIII = false;
                Context context = getContext();
                if (context != null && C89747LXp.LIZIZ.LIZIZ(context)) {
                    popupHybridParamVo.LJJJJL = C89747LXp.LIZIZ.LIZJ(context);
                    return;
                }
                return;
            }
            Context context2 = getContext();
            if (context2 == null || !C89747LXp.LIZIZ.LIZIZ(context2)) {
                return;
            }
            popupHybridParamVo.LJJJJLI = C89747LXp.LIZIZ.LIZJ(context2);
        }
    }

    @Override // p003X.PUL
    public final HybridFragment getAnnieFragment(PopupHybridParamVo popupHybridParamVo) {
        FragmentParamVo fragmentParamVo;
        boolean z;
        boolean z2 = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{popupHybridParamVo}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (HybridFragment) proxy.result;
        }
        C106862S5w.LIZ(popupHybridParamVo);
        C2606a LIZ = PTR.LIZ();
        Bundle bundle = new Bundle();
        boolean isFullScreen = isFullScreen();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{popupHybridParamVo, Byte.valueOf(isFullScreen ? (byte) 1 : (byte) 0)}, null, C99826PTg.LIZ, true, 10);
        if (proxy2.isSupported) {
            fragmentParamVo = (FragmentParamVo) proxy2.result;
        } else {
            C106862S5w.LIZ(popupHybridParamVo);
            BaseHybridParamVo baseHybridParamVo = popupHybridParamVo.LJJJJI;
            if (baseHybridParamVo != null) {
                baseHybridParamVo.LJIJJLI = false;
                baseHybridParamVo.LJIJI = true;
                baseHybridParamVo.LJIIZILJ = true;
                baseHybridParamVo.LIZIZ = isFullScreen;
            }
            if (popupHybridParamVo.LJJIII && baseHybridParamVo != null) {
                if (popupHybridParamVo.LJJJIL != -1) {
                    z = true;
                } else {
                    z = false;
                }
                baseHybridParamVo.LJIIJ = z;
                if (popupHybridParamVo.LJJJIL == 1) {
                    z2 = true;
                }
                baseHybridParamVo.LJJIJL = z2;
                baseHybridParamVo.LJJJJJ = true;
            }
            fragmentParamVo = new FragmentParamVo(popupHybridParamVo.LJJJJ, WebHybridParamVo.LJIIJJI.LIZ(popupHybridParamVo.LJJJJI), baseHybridParamVo);
        }
        bundle.putParcelable("hybrid_common_vo", fragmentParamVo);
        LIZ.setArguments(bundle);
        LIZ.setJSBridgeListener(this);
        AbstractC2582a abstractC2582a = this.mCommonLifecycle;
        if (abstractC2582a != null) {
            LIZ.mCommonLifecycle = createCommonLifecycleProxy(abstractC2582a);
        }
        LIZ.mLatchProcess = this.mLatchProcess;
        return LIZ;
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent.AbstractC2581a
    public final void onJSBridgeCreated(IJSBridgeManager iJSBridgeManager) {
        Map mapOf;
        Map mapOf2;
        if (PatchProxy.proxy(new Object[]{iJSBridgeManager}, this, changeQuickRedirect, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(iJSBridgeManager);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{this}, null, C99758PQq.LIZ, true, 5);
        if (proxy.isSupported) {
            mapOf = (Map) proxy.result;
        } else {
            C106862S5w.LIZ(this);
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m137to("closeAndOpen", new PQM(this)), TuplesKt.m137to("halfFullSwitch", new C99857PUl(this)), TuplesKt.m137to("setLive", new C101172Pss(this)), TuplesKt.m137to("dialogPullDownClose", new C101174Psu(this)), TuplesKt.m137to("pull_down_height", new C99847PUb(this)));
        }
        for (Map.Entry entry : mapOf.entrySet()) {
            iJSBridgeManager.registerMethod((String) entry.getKey(), (PK0) entry.getValue());
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this}, null, C99758PQq.LIZ, true, 4);
        if (proxy2.isSupported) {
            mapOf2 = (Map) proxy2.result;
        } else {
            C106862S5w.LIZ(this);
            mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("close", new C99760PQs(this)));
        }
        for (Map.Entry entry2 : mapOf2.entrySet()) {
            iJSBridgeManager.registerMethod((String) entry2.getKey(), (AbstractC13049f.AbstractC13051b) entry2.getValue());
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            for (BaseJSBridgeMethodFactory baseJSBridgeMethodFactory : PQR.LIZ()) {
                Iterator<T> it = baseJSBridgeMethodFactory.provideDialogFragmentLegacyMethods(activity, this).entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it.next();
                    iJSBridgeManager.registerMethod((String) entry3.getKey(), (IJavaMethod) entry3.getValue());
                }
                Iterator<T> it2 = baseJSBridgeMethodFactory.provideDialogFragmentStatusLessMethods(activity, this).entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it2.next();
                    iJSBridgeManager.registerMethod((String) entry4.getKey(), (PK0) entry4.getValue());
                }
            }
        }
        IHybridComponent.AbstractC2581a abstractC2581a = this.mJSBridgeListener;
        if (abstractC2581a != null) {
            abstractC2581a.onJSBridgeCreated(iJSBridgeManager);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x024e, code lost:
        if (r2.LJIIZILJ == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0237, code lost:
        if (r10 != false) goto L114;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void updateVoSizeParam(boolean r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.annie.container.dialog.AnnieDialog.updateVoSizeParam(boolean, int, int):void");
    }
}
