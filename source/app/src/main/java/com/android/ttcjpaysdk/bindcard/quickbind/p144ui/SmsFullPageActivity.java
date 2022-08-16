package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.DialogFragment;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.CJPayInputKeyboardHelper;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayKeyboardView;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayTextLoadingView;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPaySmsSignBean;
import com.android.ttcjpaysdk.bindcard.quickbind.C2229a;
import com.android.ttcjpaysdk.bindcard.quickbind.applog.C2234b;
import com.android.ttcjpaysdk.bindcard.quickbind.b$b;
import com.android.ttcjpaysdk.bindcard.quickbind.bean.CJPayQuickBindSmsBean;
import com.android.ttcjpaysdk.bindcard.quickbind.p143a.C2230b;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.HashMap;
import org.json.JSONObject;
import p003X.AbstractActivityC135987cJq;
import p003X.AbstractC136239cNu;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135565cD2;
import p003X.C135734cFl;
import p003X.C135737cFo;
import p003X.C135876cI3;
import p003X.C135930cIv;
import p003X.C135931cIw;
import p003X.C135934cIz;
import p003X.C135950cJF;
import p003X.C136000cK3;
import p003X.C136235cNq;
import p003X.C499135o3;
import p003X.DialogC137460chc;
import p003X.GOY;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.SmsFullPageActivity */
/* loaded from: classes17.dex */
public class SmsFullPageActivity extends AbstractActivityC135987cJq<C2230b, C2234b> implements b$b {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public TextView LIZJ;
    public ImageView LIZLLL;

    /* renamed from: LJ */
    public CJPayInputKeyboardHelper f25486LJ;
    public AppCompatEditText LJFF;
    public CJPayTextLoadingView LJI;
    public boolean LJIIJJI;
    public CJPayQuickBindSmsBean LJIILIIL;
    public DialogC137460chc LJIILJJIL;
    public long LJIILL;
    public CJPayHostInfo LJIILLIIL;
    public TextView LJIIZILJ;
    public TextView LJIJ;
    public RelativeLayout LJIJI;
    public ImageView LJIJJ;
    public CJPayKeyboardView LJIJJLI;
    public boolean LJJI;
    public String LJJIFFI;
    public HashMap<String, CJPayVoucherInfo> LJJIII;
    public long LJJIIJ;
    public int LJJIIJZLJL;
    public String LJII = "";
    public String LJIL = "";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public String LJJ = "";
    public String LJIIL = "";
    public String LJJII = "";

    static {
        Covode.recordClassIndex(7267);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public int getLayoutId() {
        return 2131690570;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractActivityC136021cKO
    public Class<? extends BaseEvent>[] observerableEvents() {
        return new Class[]{C135565cD2.class};
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2229a();
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void next() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        LIZIZ();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        LIZ();
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        C136235cNq.LIZ().LIZ("full_sms_check_count_down");
    }

    public final void LIZIZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        C136235cNq.LIZ().LIZ("full_sms_check_count_down", 60000L, 1000L, new AbstractC136239cNu() { // from class: com.android.ttcjpaysdk.bindcard.quickbind.ui.SmsFullPageActivity.9
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7276);
            }

            @Override // p003X.AbstractC136239cNu
            public final void LIZ() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                    return;
                }
                SmsFullPageActivity.this.LIZIZ.setEnabled(true);
                SmsFullPageActivity.this.LIZIZ.setText(SmsFullPageActivity.this.getResources().getString(2131561956));
                SmsFullPageActivity.this.LIZIZ.setTextColor(C116971W2r.LIZ(SmsFullPageActivity.this.getResources(), 2131624828));
            }

            @Override // p003X.AbstractC136239cNu
            public final void LIZ(long j) {
                if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                SmsFullPageActivity.this.LIZIZ.setEnabled(false);
                SmsFullPageActivity.this.LIZIZ.setText(SmsFullPageActivity.this.getResources().getString(2131561957, Long.valueOf(j / 1000)));
                SmsFullPageActivity.this.LIZIZ.setTextColor(C116971W2r.LIZ(SmsFullPageActivity.this.getResources(), 2131623988));
            }
        });
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("sign_order_no", this.LJIIIZ);
        hashMap.put("smch_id", this.LJIIJ);
        hashMap2.put("bank_enc_info", this.LJIL);
        hashMap.put("enc_params", hashMap2);
        if (!TextUtils.isEmpty(this.LJJIFFI)) {
            hashMap.put("gw_channel_order_no", this.LJJIFFI);
        }
        C2230b c2230b = (C2230b) this.mBasePresenter;
        CJPayHostInfo cJPayHostInfo = this.LJIILLIIL;
        String str2 = "";
        if (cJPayHostInfo != null) {
            str = cJPayHostInfo.merchantId;
        } else {
            str = str2;
        }
        CJPayHostInfo cJPayHostInfo2 = this.LJIILLIIL;
        if (cJPayHostInfo2 != null) {
            str2 = cJPayHostInfo2.appId;
        }
        c2230b.LIZ(hashMap, str, str2);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initActions() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJIIZILJ.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.bindcard.quickbind.ui.SmsFullPageActivity.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7269);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogFragment c499135o3;
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                String str = SmsFullPageActivity.this.LJII;
                String str2 = SmsFullPageActivity.this.LJIIL;
                String str3 = SmsFullPageActivity.this.LJIIIIZZ;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3}, null, C499135o3.LIZ, true, 1);
                if (proxy.isSupported) {
                    c499135o3 = (DialogFragment) proxy.result;
                } else {
                    Bundle bundle = new Bundle();
                    c499135o3 = new C499135o3();
                    bundle.putString("mobileMask", str);
                    bundle.putString("frontBankCodeName", str2);
                    bundle.putString("cardNoMask", str3);
                    c499135o3.setArguments(bundle);
                }
                c499135o3.show(SmsFullPageActivity.this.getSupportFragmentManager(), "smsTipsDialogFragment");
                SmsFullPageActivity.this.mvpLogger.LIZ();
                SmsFullPageActivity.this.mvpLogger.LIZ("收不到验证码");
            }
        });
        RelativeLayout relativeLayout = this.LJIJI;
        getContext();
        relativeLayout.setBackgroundColor(C116971W2r.LIZ(getResources(), 2131623987));
        this.LJIJJ.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.bindcard.quickbind.ui.SmsFullPageActivity.3
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7270);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                SmsFullPageActivity.this.LIZ();
                SmsFullPageActivity.this.mvpLogger.LIZ("关闭");
            }
        });
        this.LIZIZ.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.bindcard.quickbind.ui.SmsFullPageActivity.4
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7271);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                if (!CJPayBasicUtils.isNetworkAvailable(SmsFullPageActivity.this)) {
                    CJPayBasicUtils.displayToast(SmsFullPageActivity.this, 2131558456);
                    return;
                }
                SmsFullPageActivity.this.LIZIZ();
                SmsFullPageActivity.this.mvpLogger.LIZ("获取验证码");
            }
        });
        this.LIZLLL.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.bindcard.quickbind.ui.SmsFullPageActivity.5
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7272);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                SmsFullPageActivity.this.LJFF.setText("");
            }
        });
        this.LJFF.addTextChangedListener(new TextWatcher() { // from class: com.android.ttcjpaysdk.bindcard.quickbind.ui.SmsFullPageActivity.6
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7273);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String str;
                String str2;
                if (PatchProxy.proxy(new Object[]{editable}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                SmsFullPageActivity smsFullPageActivity = SmsFullPageActivity.this;
                String str3 = "";
                if (!PatchProxy.proxy(new Object[0], smsFullPageActivity, SmsFullPageActivity.LIZ, false, 9).isSupported) {
                    if (smsFullPageActivity.LJFF.mo25203getText() != null && smsFullPageActivity.LJFF.mo25203getText().length() != 0) {
                        smsFullPageActivity.LIZJ.setText(str3);
                        if (smsFullPageActivity.LJFF.hasFocus()) {
                            smsFullPageActivity.LIZLLL.setVisibility(0);
                        } else {
                            smsFullPageActivity.LIZLLL.setVisibility(8);
                        }
                    } else {
                        smsFullPageActivity.LIZLLL.setVisibility(8);
                    }
                }
                if (editable.toString().length() == 6) {
                    SmsFullPageActivity smsFullPageActivity2 = SmsFullPageActivity.this;
                    String obj = editable.toString();
                    if (!PatchProxy.proxy(new Object[]{obj}, smsFullPageActivity2, SmsFullPageActivity.LIZ, false, 11).isSupported) {
                        smsFullPageActivity2.LJI.show();
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap.put("sign_order_no", smsFullPageActivity2.LJIIIZ);
                        hashMap.put("smch_id", smsFullPageActivity2.LJIIJ);
                        hashMap.put("is_need_card_info", Boolean.valueOf(smsFullPageActivity2.LJIIJJI));
                        hashMap2.put("sms", obj);
                        hashMap.put("enc_params", hashMap2);
                        if (smsFullPageActivity2.LJIILIIL != null) {
                            str = smsFullPageActivity2.LJIILIIL.sms_token;
                        } else {
                            str = str3;
                        }
                        hashMap.put("sms_token", str);
                        smsFullPageActivity2.LJIILL = System.currentTimeMillis();
                        C2230b c2230b = (C2230b) smsFullPageActivity2.mBasePresenter;
                        if (smsFullPageActivity2.LJIILLIIL != null) {
                            str2 = smsFullPageActivity2.LJIILLIIL.merchantId;
                        } else {
                            str2 = str3;
                        }
                        if (smsFullPageActivity2.LJIILLIIL != null) {
                            str3 = smsFullPageActivity2.LJIILLIIL.appId;
                        }
                        if (!PatchProxy.proxy(new Object[]{hashMap, str2, str3}, c2230b, C2230b.LIZ, false, 2).isSupported) {
                            C2208b c2208b = (C2208b) c2230b.mModel;
                            C135950cJF c135950cJF = new C135950cJF(c2230b);
                            if (!PatchProxy.proxy(new Object[]{hashMap, str2, str3, c135950cJF}, c2208b, C2229a.LIZIZ, false, 7).isSupported) {
                                C106862S5w.LIZ(c135950cJF);
                                c2208b.LIZ(new JSONObject(hashMap), "bytepay.member_product.sign_card", str2, str3, false, (AbstractC137673cl3) c135950cJF);
                            }
                        }
                        smsFullPageActivity2.mvpLogger.LIZIZ();
                    }
                }
            }
        });
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        C2234b c2234b = this.mvpLogger;
        if (!PatchProxy.proxy(new Object[0], c2234b, C2234b.LIZ, false, 2).isSupported) {
            try {
                String str2 = "";
                if (c2234b.LJFF == null) {
                    str = str2;
                } else {
                    str = c2234b.LJFF.merchantId;
                }
                if (c2234b.LJFF != null) {
                    str2 = c2234b.LJFF.appId;
                }
                C135734cFl.LIZ("wallet_addbcard_captcha_imp", CJPayParamsUtils.LIZ(str, str2), c2234b.LIZJ());
            } catch (Exception unused) {
            }
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 27).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 26).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
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
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(this);
        defaultBuilder.setTitle(getResources().getString(2131561958, this.LJIIIIZZ));
        defaultBuilder.setLeftBtnStr(getResources().getString(2131561959));
        defaultBuilder.setRightBtnStr(getResources().getString(2131561960));
        String str2 = "";
        defaultBuilder.setSingleBtnStr(str2);
        defaultBuilder.setLeftBtnListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.bindcard.quickbind.ui.SmsFullPageActivity.8
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7275);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                EventManager.INSTANCE.notifyNow(new C135930cIv(C135931cIw.LIZIZ(), ""));
                SmsFullPageActivity.this.finish();
                SmsFullPageActivity.this.mvpLogger.LIZIZ(SmsFullPageActivity.this.getResources().getString(2131561959));
            }
        });
        defaultBuilder.setRightBtnListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.bindcard.quickbind.ui.SmsFullPageActivity.7
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7274);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C116971W2r.LIZ(SmsFullPageActivity.this.LJIILJJIL);
                SmsFullPageActivity.this.mvpLogger.LIZIZ(SmsFullPageActivity.this.getResources().getString(2131561960));
            }
        });
        defaultBuilder.setSingleBtnListener(null);
        defaultBuilder.setWidth(270);
        defaultBuilder.setHeight(107);
        getContext();
        defaultBuilder.setLeftBtnColor(C116971W2r.LIZ(getResources(), 2131624875));
        defaultBuilder.setLeftBtnBold(false);
        getContext();
        defaultBuilder.setRightBtnColor(C116971W2r.LIZ(getResources(), 2131624875));
        defaultBuilder.setRightBtnBold(false);
        defaultBuilder.setThemeResId(2131493160);
        this.LJIILJJIL = CJPayDialogUtils.initDialog(defaultBuilder);
        if (!isFinishing() && !this.LJIILJJIL.isShowing()) {
            C116971W2r.LIZJ(this.LJIILJJIL);
            C2234b c2234b = this.mvpLogger;
            if (!PatchProxy.proxy(new Object[0], c2234b, C2234b.LIZ, false, 4).isSupported) {
                try {
                    if (c2234b.LJFF != null) {
                        str = c2234b.LJFF.merchantId;
                    } else {
                        str = str2;
                    }
                    if (c2234b.LJFF != null) {
                        str2 = c2234b.LJFF.appId;
                    }
                    JSONObject LIZ2 = CJPayParamsUtils.LIZ(str, str2);
                    JSONObject LIZJ = c2234b.LIZJ();
                    C136000cK3.LIZIZ.LIZ(c2234b.LJI, c2234b.LJII);
                    C135734cFl.LIZ("wallet_addbcard_captcha_keep_pop_imp", LIZ2, LIZJ);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // p003X.AbstractActivityC136021cKO
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LJIIZILJ = (TextView) findViewById(2131165331);
        this.LJIJI = (RelativeLayout) findViewById(2131165243);
        this.LJIJJ = (ImageView) findViewById(2131165337);
        this.LJIJ = (TextView) findViewById(2131172394);
        this.LIZIZ = (TextView) findViewById(2131165336);
        this.LIZJ = (TextView) findViewById(2131165247);
        this.LIZLLL = (ImageView) findViewById(2131167988);
        this.LJIJJLI = (CJPayKeyboardView) findViewById(2131165334);
        this.LJI = (CJPayTextLoadingView) findViewById(2131165239);
        this.LJFF = (AppCompatEditText) findViewById(2131165339);
        this.f25486LJ = new CJPayInputKeyboardHelper(true, this.LJIJJLI);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        Intent intent = getIntent();
        this.LJII = intent.getStringExtra("sign_phone_mask_num");
        this.LJIL = intent.getStringExtra("bank_enc_info");
        this.LJIIIIZZ = intent.getStringExtra("mask_cardno");
        this.LJIIIZ = intent.getStringExtra("sign_order_no");
        this.LJJIFFI = intent.getStringExtra("gw_channel_order_no");
        this.LJIIJ = intent.getStringExtra("smch_id");
        this.LJIIJJI = intent.getBooleanExtra("is_need_card_info", false);
        this.LJJ = intent.getStringExtra("bank_type");
        this.LJIIL = intent.getStringExtra("bank_name");
        this.LJJI = intent.getBooleanExtra("is_alivecheck", false);
        intent.getStringExtra("bdpay_merchant_id");
        intent.getStringExtra("bdpay_app_id");
        this.LJJIIJZLJL = intent.getIntExtra("is_onestep", 0);
        this.LJJII = intent.getStringExtra("card_type");
        this.LJJIII = (HashMap) intent.getSerializableExtra("voucher_info_map");
        this.LJIILLIIL = C135876cI3.f17973LJ.LJIIIIZZ();
        C2234b c2234b = this.mvpLogger;
        String str = this.LJJ;
        String str2 = this.LJIIL;
        boolean z = this.LJJI;
        int i = this.LJJIIJZLJL;
        HashMap<String, CJPayVoucherInfo> hashMap = this.LJJIII;
        String str3 = this.LJJII;
        if (!PatchProxy.proxy(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), hashMap, str3}, c2234b, C2234b.LIZ, false, 1).isSupported) {
            c2234b.LIZIZ = str;
            c2234b.LIZJ = str2;
            c2234b.LIZLLL = z;
            c2234b.f25481LJ = i;
            c2234b.LJFF = C135876cI3.f17973LJ.LJIIIIZZ();
            c2234b.LJI = hashMap;
            c2234b.LJII = str3;
        }
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIIZILJ.setVisibility(0);
        this.LJIIZILJ.setText(getResources().getString(2131561530));
        this.LJFF.post(new Runnable() { // from class: com.android.ttcjpaysdk.bindcard.quickbind.ui.SmsFullPageActivity.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7268);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                SmsFullPageActivity.this.LJFF.requestFocus();
                CJPayInputKeyboardHelper cJPayInputKeyboardHelper = SmsFullPageActivity.this.f25486LJ;
                SmsFullPageActivity smsFullPageActivity = SmsFullPageActivity.this;
                cJPayInputKeyboardHelper.showKeyboard(smsFullPageActivity, smsFullPageActivity.LJFF);
            }
        });
        View layoutRootView = getLayoutRootView();
        getContext();
        layoutRootView.setBackgroundColor(C116971W2r.LIZ(getResources(), 2131623987));
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            getContext();
            SpannableString spannableString = new SpannableString(getResources().getString(2131558455, this.LJII));
            int indexOf = spannableString.toString().indexOf(this.LJII);
            if (indexOf >= 0) {
                getContext();
                C116971W2r.LIZ(spannableString, new ForegroundColorSpan(C116971W2r.LIZ(getResources(), 2131623985)), indexOf, this.LJII.length() + indexOf, 33);
                this.LJIJ.setText(spannableString);
            }
        }
    }

    @Override // p003X.AbstractActivityC136021cKO
    public void onEvent(BaseEvent baseEvent) {
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onEvent(baseEvent);
        if (baseEvent instanceof C135565cD2) {
            finishWithoutAnimation();
        }
    }

    private void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LIZJ.setText(str);
        this.LJFF.setText("");
        this.LIZJ.setVisibility(0);
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$b
    public final void LIZ(CJPaySmsSignBean cJPaySmsSignBean) {
        if (PatchProxy.proxy(new Object[]{cJPaySmsSignBean}, this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LJJIIJ = System.currentTimeMillis();
        this.LJI.hide();
        if (cJPaySmsSignBean == null) {
            return;
        }
        if (cJPaySmsSignBean.isResponseOK()) {
            C136235cNq.LIZ().LIZ("full_sms_check_count_down");
            EventManager.INSTANCE.notify(new C135934cIz(cJPaySmsSignBean.sign_no, cJPaySmsSignBean.pwd_token));
            this.mvpLogger.LIZ(this.LJJIIJ - this.LJIILL, cJPaySmsSignBean.code, "", "");
            finish();
            return;
        }
        LIZ(cJPaySmsSignBean.msg);
        this.mvpLogger.LIZ(this.LJJIIJ - this.LJIILL, cJPaySmsSignBean.code, cJPaySmsSignBean.code, cJPaySmsSignBean.msg);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 21).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 23).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 22).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$b
    public final void LIZ(CJPayQuickBindSmsBean cJPayQuickBindSmsBean) {
        if (PatchProxy.proxy(new Object[]{cJPayQuickBindSmsBean}, this, LIZ, false, 13).isSupported || cJPayQuickBindSmsBean == null) {
            return;
        }
        this.LJIILIIL = cJPayQuickBindSmsBean;
        if (cJPayQuickBindSmsBean.button_info.isGoCustomerServiceDialog()) {
            C135737cFo.LIZ().LIZ(cJPayQuickBindSmsBean.button_info).LIZ(cJPayQuickBindSmsBean.code, cJPayQuickBindSmsBean.msg).LIZ(this.LJIILLIIL).LIZ(this).LIZ().LIZIZ();
        } else if (!this.LJIILIIL.isResponseOK()) {
            LIZ(this.LJIILIIL.msg);
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$b
    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 14).isSupported) {
            return;
        }
        LIZ(str2);
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$b
    public final void LIZIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 16).isSupported) {
            return;
        }
        this.LJJIIJ = System.currentTimeMillis();
        this.LJI.hide();
        LIZ(str2);
        this.mvpLogger.LIZ(this.LJJIIJ - this.LJIILL, str, str, str2);
    }
}
