package com.bytedance.android.live.lynx.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.webview.fragment.AbstractC4054j;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import p003X.AbstractC4569445g;
import p003X.C116971W2r;
import p003X.C427822wK;
import p003X.C435013Ix;
import p003X.LXS;
import p003X.LXT;
import p003X.LXU;
import p003X.LXV;
import p003X.LXW;
import p003X.LXY;

/* loaded from: classes5.dex */
public final class LynxTestWidget extends LiveRecyclableWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public TextView LIZJ;
    public LXY LIZLLL;

    /* renamed from: LJ */
    public DialogFragment f26517LJ;

    static {
        Covode.recordClassIndex(32411);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699994;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        LXY lxy = this.LIZLLL;
        if (lxy != null) {
            C116971W2r.LIZ(lxy);
        }
        DialogFragment dialogFragment = this.f26517LJ;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZIZ++;
        this.contentView.setBackgroundColor(CastProtectorUtils.parseColor("#00000000"));
    }

    public final void LIZ(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, LIZ, false, 10).isSupported && str2 != null) {
            if (StringsKt__StringsJVMKt.startsWith$default(str2, "http", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(str2, "https", false, 2, null) || !((IRoomService) ServiceManager.getService(IRoomService.class)).actionHandler().handle(this.context, str2)) {
                if (StringsKt__StringsJVMKt.startsWith$default(str2, "sslocal://lynxview?", false, 2, null)) {
                    str2 = Uri.parse(str2).getQueryParameter("compile_path");
                }
                if (str2 != null) {
                    AbstractC4054j LIZ2 = C435013Ix.LIZ((IBrowserService) ServiceManager.getService(IBrowserService.class), str2, (String) null, (JSONObject) null, 4, (Object) null).LIZ();
                    C427822wK c427822wK = C9078n.LJJIJLIJ;
                    Context context = this.context;
                    if (context != null) {
                        c427822wK.LIZ((FragmentActivity) context, LIZ2);
                        this.f26517LJ = LIZ2;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 1).isSupported) {
            return;
        }
        View findViewById = findViewById(2131168724);
        findViewById.setOnClickListener(new LXU(this));
        findViewById.setOnLongClickListener(new LXS(this));
        findViewById(2131168555).setOnClickListener(new LXV(this));
        findViewById(2131168782).setOnClickListener(new LXW(this));
        findViewById(2131168621).setOnClickListener(new LXT(this));
        this.LIZJ = (TextView) findViewById(2131195632);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 4).isSupported && i == this.LIZIZ && intent != null && (stringExtra = intent.getStringExtra(PushConstants.WEB_URL)) != null) {
            LIZ(stringExtra);
        }
    }
}
