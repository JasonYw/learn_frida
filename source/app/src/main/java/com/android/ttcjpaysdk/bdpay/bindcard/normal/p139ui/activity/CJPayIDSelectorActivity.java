package com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.ttcjpaysdk.base.framework.mvp.nothing.PresentorNothing;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.bean.CJPayCardInfoBean;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p137a.C2187c;
import com.android.ttcjpaysdk.thirdparty.data.CJPayIdType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractActivityC135714cFR;
import p003X.AbstractC137454chW;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135100c5X;
import p003X.C135734cFl;
import p003X.C135876cI3;
import p003X.C136024cKR;
import p003X.C136031cKY;
import p003X.C136125cM4;
import p003X.C136158cMb;
import p003X.GOY;
import p003X.HandlerC125652Zck;
import p003X.View$OnClickListenerC136187cN4;
import p003X.View$OnClickListenerC136188cN5;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.ui.activity.CJPayIDSelectorActivity */
/* loaded from: classes17.dex */
public final class CJPayIDSelectorActivity extends AbstractActivityC135714cFR<PresentorNothing, C2187c> {
    public static ChangeQuickRedirect LIZ;
    public View LIZLLL;

    /* renamed from: LJ */
    public RecyclerView f25464LJ;
    public ImageView LJFF;
    public TextView LJI;
    public HashMap LJIIIIZZ;
    public String LIZIZ = "";
    public CJPayCardInfoBean LIZJ = new CJPayCardInfoBean();
    public final HandlerC125652Zck LJII = new HandlerC125652Zck(this);

    static {
        Covode.recordClassIndex(6873);
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported && (hashMap = this.LJIIIIZZ) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = new HashMap();
        }
        View view = (View) this.LJIIIIZZ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIIIIZZ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final int getLayoutId() {
        return 2131690613;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final C2124b getModel() {
        return null;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initData() {
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void next() {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initActions() {
        ImageView imageView;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && (imageView = this.LJFF) != null) {
            imageView.setOnClickListener(new View$OnClickListenerC136187cN4(this));
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        this.LJII.removeCallbacksAndMessages(null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onPostResume();
        CJPayBasicUtils.upAndDownAnimation(this.LIZLLL, true, (Activity) this, (AbstractC137454chW) new C136158cMb(this));
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LIZLLL = findViewById(2131180407);
        this.f25464LJ = (RecyclerView) findViewById(2131188567);
        this.LJFF = (ImageView) findViewById(2131165337);
        this.LJI = (TextView) findViewById(2131169910);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && CJPayBasicUtils.isClickValid()) {
            C135100c5X.LIZIZ(getLayoutRootView(), 1291845632, ViewCompat.MEASURED_STATE_TOO_SMALL);
            CJPayBasicUtils.upAndDownAnimation(this.LIZLLL, false, (Activity) this, (AbstractC137454chW) new C136125cM4(this));
        }
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 17).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 16).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
                    GOY.LIZLLL(this);
                    super.onStop();
                }
                if (EnterTransitionCrashOptimizer.getContext() != null) {
                    int i = Build.VERSION.SDK_INT;
                    try {
                        getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                    } catch (Throwable unused) {
                    }
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initViews() {
        ViewGroup.LayoutParams layoutParams;
        List<Pair<CJPayIdType, Boolean>> arrayList;
        CJPayIdType[] valuesCustom;
        boolean z;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        setStatusBarColor(C116971W2r.LIZ(getResources(), 2131624874));
        RecyclerView recyclerView = this.f25464LJ;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
        RecyclerView recyclerView2 = this.f25464LJ;
        if (recyclerView2 != null) {
            C136031cKY c136031cKY = new C136031cKY(this, this.LJII);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
            if (proxy.isSupported) {
                arrayList = (List) proxy.result;
            } else {
                arrayList = new ArrayList<>();
                CJPayIdType typeFromLabel = CJPayIdType.getTypeFromLabel(this.LIZIZ);
                for (CJPayIdType cJPayIdType : CJPayIdType.valuesCustom()) {
                    if (cJPayIdType == typeFromLabel) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new Pair<>(cJPayIdType, Boolean.valueOf(z)));
                }
            }
            c136031cKY.LIZ(arrayList);
            c136031cKY.LIZJ = new C136024cKR(this);
            recyclerView2.setAdapter(c136031cKY);
        }
        ImageView imageView = this.LJFF;
        if (imageView != null) {
            imageView.setImageResource(2130840410);
        }
        TextView textView = this.LJI;
        if (textView != null) {
            textView.setText(getString(2131561451));
        }
        View view = this.LIZLLL;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.height = CJPayBasicUtils.dipToPX(this, 470.0f);
            layoutParams2.gravity = 80;
        }
        View layoutRootView = getLayoutRootView();
        if (layoutRootView != null) {
            layoutRootView.setOnClickListener(new View$OnClickListenerC136188cN5(this));
        }
    }

    public final void setRootView(View view) {
        this.LIZLLL = view;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 3).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 2).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        L l = this.mvpLogger;
        if (l != 0) {
            CJPayCardInfoBean cJPayCardInfoBean = this.LIZJ;
            if (!PatchProxy.proxy(new Object[]{this, cJPayCardInfoBean}, l, C2187c.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(this, cJPayCardInfoBean);
                try {
                    JSONObject LIZ2 = CJPayParamsUtils.LIZ(C135876cI3.LJI(), C135876cI3.LJII());
                    JSONObject LIZLLL = C135734cFl.LIZLLL();
                    Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
                    LIZLLL.put("bank_type", cJPayCardInfoBean.bank_info.getCardTypeStr(this));
                    LIZLLL.put("bank_name", cJPayCardInfoBean.bank_info.bank_name);
                    C135734cFl.LIZ("wallet_addbcard_page_cardtype_page_imp", LIZ2, LIZLLL);
                } catch (Exception unused2) {
                }
            }
        }
    }
}
