package com.bytedance.android.live.liveinteract.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.message.model.C9030z;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.M0Q;

/* loaded from: classes3.dex */
public final class LiveBiddingEndView extends ConstraintLayout {
    public static ChangeQuickRedirect LIZ;
    public HashMap LIZIZ;

    static {
        Covode.recordClassIndex(30740);
    }

    private View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        View view = (View) this.LIZIZ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LIZIZ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setBidPaidLinkmicDealInfo(C9030z c9030z) {
        if (PatchProxy.proxy(new Object[]{c9030z}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c9030z);
        ImageModel imageModel = c9030z.LIZLLL;
        if (imageModel != null) {
            M0Q.LIZIZ((ImageView) LIZ(2131180941), imageModel);
        }
        TextView textView = (TextView) LIZ(2131180943);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setText(c9030z.LIZIZ + "出价" + c9030z.LIZ + "抖币");
    }

    public LiveBiddingEndView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(2066);
        View.inflate(context, 2131698583, this);
        MethodCollector.m14707o(2066);
    }
}
