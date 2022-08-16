package com.android.ttcjpaysdk.thirdparty.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.eventbus.AbstractC2126a;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.framework.BaseActivity;
import com.android.ttcjpaysdk.base.framework.event.ErrorNetworkRefresh;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC135660cEZ;
import p003X.AbstractC135665cEe;
import p003X.AbstractView$OnClickListenerC137362cg2;
import p003X.C135342c9R;
import p003X.C135343c9S;

/* loaded from: classes17.dex */
public class CJPayNetworkErrorView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public AbstractC135660cEZ LIZIZ;
    public TextView LIZJ;
    public AbstractC135665cEe LIZLLL;

    /* renamed from: LJ */
    public AbstractC2126a f25543LJ;

    static {
        Covode.recordClassIndex(9208);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        EventManager.INSTANCE.unregister(this.f25543LJ);
    }

    public void setOnRefreshBenClickListener(AbstractC135660cEZ abstractC135660cEZ) {
        this.LIZIZ = abstractC135660cEZ;
    }

    public CJPayNetworkErrorView(Context context) {
        this(context, null);
    }

    private void LIZ(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 2).isSupported) {
            return;
        }
        View LIZ2 = this.LIZLLL.LIZ();
        if (LIZ2 != null) {
            addView(LIZ2);
        } else {
            LIZJ(context);
        }
    }

    private void LIZIZ(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 3).isSupported) {
            return;
        }
        View LIZIZ = this.LIZLLL.LIZIZ();
        if (LIZIZ != null) {
            addView(LIZIZ);
        } else {
            LIZJ(context);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            EventManager.INSTANCE.register(this.f25543LJ);
        } else {
            EventManager.INSTANCE.unregister(this.f25543LJ);
        }
    }

    private void LIZJ(Context context) {
        MethodCollector.m14708i(557);
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 4).isSupported) {
            MethodCollector.m14707o(557);
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(2131690759, (ViewGroup) null);
        addView(inflate);
        this.LIZJ = (TextView) inflate.findViewById(2131169919);
        this.LIZJ.setOnClickListener(new AbstractView$OnClickListenerC137362cg2() { // from class: com.android.ttcjpaysdk.thirdparty.view.CJPayNetworkErrorView.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9209);
            }

            @Override // p003X.AbstractView$OnClickListenerC137362cg2
            public final void doClick(View view) {
                if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported && CJPayNetworkErrorView.this.LIZIZ != null) {
                    CJPayNetworkErrorView.this.LIZIZ.LIZ();
                }
            }
        });
        MethodCollector.m14707o(557);
    }

    public CJPayNetworkErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CJPayNetworkErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(556);
        this.f25543LJ = new AbstractC2126a() { // from class: com.android.ttcjpaysdk.thirdparty.view.CJPayNetworkErrorView.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9210);
            }

            @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
            public final Class<BaseEvent>[] listEvents() {
                return new Class[]{ErrorNetworkRefresh.class};
            }

            @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
            public final void onEvent(BaseEvent baseEvent) {
                if (!PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 1).isSupported && CJPayNetworkErrorView.this.LIZIZ != null) {
                    CJPayNetworkErrorView.this.LIZIZ.LIZ();
                }
            }
        };
        if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 1).isSupported) {
            this.LIZLLL = C2118a.LIZ().LJII;
            if (this.LIZLLL == null) {
                LIZJ(context);
                MethodCollector.m14707o(556);
                return;
            } else if (!(context instanceof CJPayBaseActivity)) {
                LIZJ(context);
                MethodCollector.m14707o(556);
                return;
            } else if (((BaseActivity) context).isSupportMultipleTheme) {
                String str = CJPayHostInfo.inheritTheme;
                if (!TextUtils.isEmpty(str)) {
                    if (!"light".equals(str)) {
                        if ("dark".equals(str)) {
                            LIZIZ(context);
                        } else {
                            LIZ(context);
                        }
                    }
                    LIZ(context);
                } else if (CJPayHostInfo.isFollowSystemTheme) {
                    if (AppCompatDelegate.getDefaultNightMode() == 2) {
                        LIZIZ(context);
                    } else {
                        if (AppCompatDelegate.getDefaultNightMode() != 1) {
                            LIZ(context);
                        }
                        LIZ(context);
                    }
                } else {
                    C135342c9R LIZJ = C135343c9S.LIZ().LIZJ();
                    if (LIZJ != null) {
                        if ("dark".equals(LIZJ.LIZ)) {
                            LIZIZ(context);
                        } else {
                            LIZ(context);
                        }
                    }
                    LIZ(context);
                }
                MethodCollector.m14707o(556);
                return;
            } else {
                LIZ(context);
            }
        }
        MethodCollector.m14707o(556);
    }
}
