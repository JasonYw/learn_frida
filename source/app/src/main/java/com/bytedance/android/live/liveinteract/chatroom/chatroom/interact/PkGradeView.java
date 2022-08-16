package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdkapi.depend.model.live.BattleRivalTag;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.HYG;
import p003X.LK5;
import p003X.M0Q;

/* loaded from: classes3.dex */
public final class PkGradeView extends ConstraintLayout {
    public static ChangeQuickRedirect LIZ;
    public HashMap LIZIZ;

    static {
        Covode.recordClassIndex(25621);
    }

    public PkGradeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PkGradeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3);
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

    public final void LIZ(BattleRivalTag battleRivalTag, int i) {
        if (PatchProxy.proxy(new Object[]{battleRivalTag, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(battleRivalTag);
        ImageModel imageModel = battleRivalTag.LIZJ;
        if (imageModel != null) {
            M0Q.LIZ((ImageView) LIZ(2131179034), imageModel);
        }
        TextView textView = (TextView) LIZ(2131194259);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setText(battleRivalTag.LIZLLL);
        if (i == 2) {
            HSImageView hSImageView = (HSImageView) LIZ(2131179034);
            Intrinsics.checkNotNullExpressionValue(hSImageView, "");
            hSImageView.getLayoutParams().width = LK5.LIZ(16.0f);
            HSImageView hSImageView2 = (HSImageView) LIZ(2131179034);
            Intrinsics.checkNotNullExpressionValue(hSImageView2, "");
            hSImageView2.getLayoutParams().height = LK5.LIZ(16.0f);
            TextView textView2 = (TextView) LIZ(2131194259);
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setTextSize(8.0f);
            ConstraintLayout constraintLayout = (ConstraintLayout) LIZ(2131181655);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams != null) {
                ((ConstraintLayout.LayoutParams) layoutParams).leftMargin = LK5.LIZ(8.0f);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) LIZ(2131181655);
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                constraintLayout2.getLayoutParams().height = LK5.LIZ(16.0f);
                TextView textView3 = (TextView) LIZ(2131194259);
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                ViewGroup.LayoutParams layoutParams2 = textView3.getLayoutParams();
                if (layoutParams2 != null) {
                    ((ConstraintLayout.LayoutParams) layoutParams2).leftMargin = LK5.LIZ(10.0f);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
        }
        ImageModel imageModel2 = battleRivalTag.LIZIZ;
        if (imageModel2 != null) {
            ConstraintLayout constraintLayout3 = (ConstraintLayout) LIZ(2131181655);
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            if (!PatchProxy.proxy(new Object[]{constraintLayout3, imageModel2}, this, LIZ, false, 2).isSupported) {
                constraintLayout3.post(new HYG(imageModel2, constraintLayout3));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkGradeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1732);
        LayoutInflater.from(context).inflate(2131699543, this);
        MethodCollector.m14707o(1732);
    }

    public /* synthetic */ PkGradeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
