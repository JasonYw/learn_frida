package com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.p390ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.M0Q;
import p003X.M0W;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.ui.SelfDisciplineEndView */
/* loaded from: classes12.dex */
public final class SelfDisciplineEndView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public HashMap LIZIZ;

    static {
        Covode.recordClassIndex(30425);
    }

    public SelfDisciplineEndView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SelfDisciplineEndView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7);
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

    public final void LIZ() {
        ConstraintLayout constraintLayout;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && (constraintLayout = (ConstraintLayout) LIZ(2131166277)) != null) {
            constraintLayout.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        LIZ();
    }

    private final String LIZIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (j == 0) {
            return "00";
        }
        if (1 <= j && 9 >= j) {
            return "0" + j;
        }
        return String.valueOf(j);
    }

    private final String LIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        long hours = TimeUnit.SECONDS.toHours(j);
        return LIZIZ(hours) + LoggerUtil.TWO_POINT_TAG + LIZIZ(TimeUnit.SECONDS.toMinutes(j) % 60) + LoggerUtil.TWO_POINT_TAG + LIZIZ(j % 60);
    }

    public final void LIZ(LinkPlayerInfo linkPlayerInfo, long j) {
        ImageModel imageModel;
        if (PatchProxy.proxy(new Object[]{linkPlayerInfo, new Long(j)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkPlayerInfo);
        ConstraintLayout constraintLayout = (ConstraintLayout) LIZ(2131166277);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        TextView textView = (TextView) LIZ(2131195136);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setText(LIZ(j));
        HSImageView hSImageView = (HSImageView) LIZ(2131178617);
        User LIZ2 = linkPlayerInfo.LIZ();
        if (LIZ2 != null) {
            imageModel = LIZ2.getAvatarMedium();
        } else {
            imageModel = null;
        }
        M0Q.LIZ(hSImageView, imageModel, new M0W(5));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfDisciplineEndView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2026);
        LayoutInflater.from(context).inflate(2131700217, this);
        ConstraintLayout constraintLayout = (ConstraintLayout) LIZ(2131166277);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
            MethodCollector.m14707o(2026);
            return;
        }
        MethodCollector.m14707o(2026);
    }

    public /* synthetic */ SelfDisciplineEndView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
