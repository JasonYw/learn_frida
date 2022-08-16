package com.android.ttcjpaysdk.thirdparty.front.mybankcard.activity;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.eventbus.AbstractC2126a;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayH5Service;
import com.android.ttcjpaysdk.base.service.bean.H5ParamBuilder;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.C135272c8J;
import p003X.C135296c8h;
import p003X.C135406cAT;
import p003X.C135576cDD;
import p003X.C135581cDI;
import p003X.C135596cDX;
import p003X.C135610cDl;
import p003X.C135876cI3;
import p003X.C135883cIA;
import p003X.C135983cJm;
import p003X.DialogC137460chc;
import p003X.GOY;
import p003X.View$OnClickListenerC135575cDC;
import p003X.View$OnClickListenerC135577cDE;
import p003X.View$OnClickListenerC135579cDG;
import p003X.View$OnClickListenerC135586cDN;

/* loaded from: classes17.dex */
public class CJPayBankCardDetailActivity extends CJPayBaseActivity implements AbstractC2126a {
    public static ChangeQuickRedirect LIZ;
    public DialogC137460chc LIZIZ;
    public CJPayCard LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public boolean f25537LJ;
    public String LJFF = "";
    public String LJI = "";
    public String LJII = "";
    public LinearLayout LJIIIIZZ;
    public ImageView LJIIIZ;
    public ImageView LJIIJ;
    public FrameLayout LJIIJJI;
    public FrameLayout LJIIL;
    public FrameLayout LJIILIIL;
    public LinearLayout LJIILJJIL;
    public RelativeLayout LJIILL;
    public TextView LJIILLIIL;
    public TextView LJIIZILJ;
    public TextView LJIJ;
    public TextView LJIJI;
    public View LJIJJ;
    public LinearLayout LJIJJLI;

    static {
        Covode.recordClassIndex(8718);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public int getLayout() {
        return 2131690611;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public String getSources() {
        return "绑卡";
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
    public Class<? extends BaseEvent>[] listEvents() {
        return new Class[]{C135610cDl.class, C135883cIA.class};
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        DialogC137460chc dialogC137460chc = this.LIZIZ;
        if (dialogC137460chc != null) {
            C116971W2r.LIZ(dialogC137460chc);
            this.LIZIZ = null;
        }
        super.onDestroy();
        EventManager.INSTANCE.unregister(this);
    }

    @Override // com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 19).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 18).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
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

    public final void LIZ() {
        String m25080C;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        new StringBuilder();
        String m25086C = C0002O.m25086C(CJPayParamsUtils.LIZJ(), "/usercenter/cards/unbind");
        if (!TextUtils.isEmpty(this.LJFF)) {
            m25086C = this.LJFF;
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{m25086C}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            m25080C = (String) proxy.result;
        } else {
            String str = C135876cI3.f17973LJ.LJIIIIZZ().merchantId;
            String str2 = C135876cI3.f17973LJ.LJIIIIZZ().appId;
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            Set<String> queryParameterNames = Uri.parse(m25086C).getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() > 0) {
                new StringBuilder();
                m25080C = C0002O.m25080C(m25086C, "&merchant_id=", str, "&app_id=", str2, "&service=unbind&need_private_header=0&bank_card_id=", this.LIZJ.bank_card_id, "&source=sdk");
            } else {
                new StringBuilder();
                m25080C = C0002O.m25080C(m25086C, "?merchant_id=", str, "&app_id=", str2, "&service=unbind&need_private_header=0&bank_card_id=", this.LIZJ.bank_card_id, "&source=sdk");
            }
        }
        ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
        if (iCJPayH5Service != null) {
            H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
            h5ParamBuilder.setContext(this);
            h5ParamBuilder.setUrl(m25080C);
            h5ParamBuilder.setStatusBarColor("#ffffff");
            h5ParamBuilder.setHostInfo(C135876cI3.f17973LJ.LJIIIZ());
            iCJPayH5Service.startH5(h5ParamBuilder);
        }
    }

    @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
    public void onEvent(BaseEvent baseEvent) {
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (baseEvent instanceof C135610cDl) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && !isFinishing()) {
                finish();
                overridePendingTransition(0, 0);
            }
        } else if (!(baseEvent instanceof C135883cIA) || isFinishing()) {
        } else {
            finish();
            overridePendingTransition(0, 0);
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        MethodCollector.m14708i(535);
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(535);
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            int i = Build.VERSION.SDK_INT;
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(CastProtectorUtils.parseColor("#00000000"));
            window.getDecorView().setSystemUiVisibility(AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END);
            supportMultipleTheme();
        }
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 4).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 3).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        EventManager.INSTANCE.register(this);
        this.LJIIIIZZ = (LinearLayout) findViewById(2131169704);
        setStatusBar(this.LJIIIIZZ);
        LinearLayout linearLayout = this.LJIIIIZZ;
        if (!PatchProxy.proxy(new Object[]{linearLayout}, this, LIZ, false, 8).isSupported) {
            this.LJIIIZ = (ImageView) linearLayout.findViewById(2131165337);
            this.LJIIJ = (ImageView) linearLayout.findViewById(2131170047);
            this.LJIILL = (RelativeLayout) linearLayout.findViewById(2131170145);
            this.LJIJI = (TextView) linearLayout.findViewById(2131169761);
            this.LJIJ = (TextView) linearLayout.findViewById(2131170144);
            this.LJIIJ.setImageDrawable(C135272c8J.LIZ(this, 2130772623));
            if (this.f25537LJ) {
                this.LJIILL.setVisibility(0);
                this.LJIIJ.setVisibility(8);
            } else {
                this.LJIILL.setVisibility(8);
                this.LJIIJ.setVisibility(0);
            }
            ((TextView) linearLayout.findViewById(2131170118)).setText(getStringRes(CJPayHostInfo.applicationContext, 2131561778));
            this.LJIIJJI = (FrameLayout) linearLayout.findViewById(2131169690);
            this.LJIIL = (FrameLayout) linearLayout.findViewById(2131169688);
            this.LJIIL.setVisibility(8);
            this.LJIILIIL = (FrameLayout) linearLayout.findViewById(2131169706);
            this.LJIILIIL.setVisibility(8);
            this.LJIILJJIL = (LinearLayout) linearLayout.findViewById(2131169703);
            this.LJIILJJIL.setVisibility(8);
            TextView textView = (TextView) linearLayout.findViewById(2131170048);
            try {
                SpannableString spannableString = new SpannableString(getStringRes(CJPayHostInfo.applicationContext, 2131562013));
                String stringRes = getStringRes(CJPayHostInfo.applicationContext, 2131562011);
                if (spannableString.length() > stringRes.length()) {
                    int indexOf = spannableString.toString().indexOf(stringRes);
                    C116971W2r.LIZ(spannableString, new C135406cAT(this, spannableString.subSequence(indexOf, stringRes.length() + indexOf).toString()), indexOf, stringRes.length() + indexOf, 17);
                    final BitmapDrawable LIZ2 = C135296c8h.LIZ(this, C135272c8J.LIZIZ(this, 2130772713), 2130840340);
                    LIZ2.setBounds(0, 0, LIZ2.getIntrinsicWidth(), LIZ2.getIntrinsicHeight());
                    ImageSpan imageSpan = new ImageSpan(LIZ2) { // from class: X.4gy
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(8729);
                        }

                        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                        public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                            if (PatchProxy.proxy(new Object[]{canvas, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            Drawable drawable = getDrawable();
                            canvas.save();
                            canvas.translate(f, (((paint.getFontMetricsInt().descent + i5) + i5) / 2) - (drawable.getBounds().bottom / 2));
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    };
                    if (spannableString.length() > 6) {
                        C116971W2r.LIZ(spannableString, imageSpan, spannableString.length() - 6, spannableString.length(), 17);
                        C116971W2r.LIZ(spannableString, imageSpan, spannableString.length() - 6, spannableString.length(), 1);
                    }
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    textView.setText(spannableString);
                    textView.setHighlightColor(C116971W2r.LIZ(this, 2131623991));
                    textView.setIncludeFontPadding(false);
                    textView.setLineSpacing(12.0f, 0.5f);
                }
            } catch (Exception unused2) {
            }
            this.LJIILLIIL = (TextView) linearLayout.findViewById(2131169687);
            this.LJIIZILJ = (TextView) linearLayout.findViewById(2131169709);
            this.LJIJJ = linearLayout.findViewById(2131169691);
            this.LJIJJLI = (LinearLayout) linearLayout.findViewById(2131169689);
            this.LIZLLL = (TextView) linearLayout.findViewById(2131169870);
            this.LIZLLL.setText(2131561492);
            if (C135983cJm.LIZIZ.LIZ()) {
                this.LJIJJLI.setVisibility(0);
                C135596cDX.LIZLLL.LIZ("wallet_bcard_manager_detail_page", this.LIZLLL.getText().toString(), false);
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            if (!TextUtils.isEmpty(this.LJII)) {
                try {
                    this.LIZJ = (CJPayCard) CJPayJsonParser.fromJson(new JSONObject(this.LJII), CJPayCard.class);
                    if (this.LIZJ != null) {
                        CJPayCard cJPayCard = this.LIZJ;
                        if (!PatchProxy.proxy(new Object[]{cJPayCard}, this, LIZ, false, 10).isSupported && cJPayCard != null && !isFinishing()) {
                            C135576cDD c135576cDD = new C135576cDD(LayoutInflater.from(this).inflate(2131690661, (ViewGroup) null));
                            c135576cDD.LIZ = (RelativeLayout) this.LJIIJJI.findViewById(2131169699);
                            c135576cDD.LIZIZ = (ImageView) this.LJIIJJI.findViewById(2131169694);
                            c135576cDD.LIZJ = (TextView) this.LJIIJJI.findViewById(2131169707);
                            c135576cDD.LIZLLL = (TextView) this.LJIIJJI.findViewById(2131169708);
                            c135576cDD.f17934LJ = (TextView) this.LJIIJJI.findViewById(2131169700);
                            c135576cDD.LJFF = (ImageView) this.LJIIJJI.findViewById(2131170126);
                            c135576cDD.LJI = (ImageView) this.LJIIJJI.findViewById(2131169743);
                            new C135581cDI(this).LIZ(c135576cDD, cJPayCard, this, false);
                            if (!cJPayCard.isFreezeCard()) {
                                if (!TextUtils.isEmpty(cJPayCard.perday_limit) && Integer.parseInt(cJPayCard.perday_limit) > 0) {
                                    if (CJPayHostInfo.applicationContext != null) {
                                        this.LJIILLIIL.setText(CJPayHostInfo.applicationContext.getResources().getString(2131561582, cJPayCard.perday_limit));
                                    }
                                    this.LJIIL.setVisibility(0);
                                } else {
                                    this.LJIIL.setVisibility(8);
                                }
                                if (!TextUtils.isEmpty(cJPayCard.perpay_limit) && Integer.parseInt(cJPayCard.perpay_limit) > 0) {
                                    if (CJPayHostInfo.applicationContext != null) {
                                        this.LJIIZILJ.setText(CJPayHostInfo.applicationContext.getResources().getString(2131561582, cJPayCard.perpay_limit));
                                    }
                                    this.LJIILIIL.setVisibility(0);
                                } else {
                                    this.LJIILIIL.setVisibility(8);
                                }
                                this.LJIILJJIL.setVisibility(8);
                            } else {
                                this.LJIIL.setVisibility(8);
                                this.LJIILIIL.setVisibility(8);
                                this.LJIILJJIL.setVisibility(0);
                            }
                            if (this.LJIIL.getVisibility() != 0 && this.LJIILIIL.getVisibility() != 0 && this.LJIILJJIL.getVisibility() != 0) {
                                this.LJIJJ.setVisibility(8);
                            } else {
                                this.LJIJJ.setVisibility(0);
                            }
                        }
                    }
                } catch (JSONException unused3) {
                }
            }
            C135596cDX.LIZLLL.LIZ(this.LIZJ, "wallet_bcard_manage_detail_imp", this.LJI);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            this.LJIIIZ.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.thirdparty.front.mybankcard.activity.CJPayBankCardDetailActivity.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(8719);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    CJPayBankCardDetailActivity.this.onBackPressed();
                }
            });
            this.LJIIJ.setOnClickListener(new View$OnClickListenerC135586cDN(this));
            this.LJIJI.setOnClickListener(new View$OnClickListenerC135579cDG(this));
            this.LJIJ.setOnClickListener(new View$OnClickListenerC135577cDE(this));
            this.LJIJJLI.setOnClickListener(new View$OnClickListenerC135575cDC(this));
        }
        MethodCollector.m14707o(535);
    }
}
