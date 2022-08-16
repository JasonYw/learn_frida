package com.bytedance.android.live.broadcast.gallery.view.indicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.AbstractC149421fp5;
import p003X.C106862S5w;
import p003X.C149408fos;

/* loaded from: classes20.dex */
public final class TitleIndicator extends AppCompatTextView {
    public static ChangeQuickRedirect LIZ;
    public AbstractC149421fp5 LIZIZ;
    public final C149408fos LIZJ;

    static {
        Covode.recordClassIndex(15967);
    }

    public TitleIndicator(Context context) {
        this(context, null, 0, 6, null);
    }

    public TitleIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        this.LIZJ = new C149408fos(this);
    }

    public /* synthetic */ TitleIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
