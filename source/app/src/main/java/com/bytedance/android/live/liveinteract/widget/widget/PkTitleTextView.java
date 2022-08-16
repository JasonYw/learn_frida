package com.bytedance.android.live.liveinteract.widget.widget;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.widget.GradientTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC79521HWh;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* loaded from: classes3.dex */
public final class PkTitleTextView extends GradientTextView {
    public static ChangeQuickRedirect LIZ;
    public final Pattern LIZJ;

    /* renamed from: LJ */
    public final Pattern f26511LJ;
    public AbstractC79521HWh LJFF;
    public AbstractC79521HWh LJI;

    static {
        Covode.recordClassIndex(31953);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkTitleTextView(Context context) {
        super(context);
        C106862S5w.LIZ(context);
        Pattern LIZJ = C116971W2r.LIZJ("[^\\d]+");
        Intrinsics.checkNotNullExpressionValue(LIZJ, "");
        this.LIZJ = LIZJ;
        Pattern LIZJ2 = C116971W2r.LIZJ("[\\d]+");
        Intrinsics.checkNotNullExpressionValue(LIZJ2, "");
        this.f26511LJ = LIZJ2;
    }

    public final void setPkTitle(String str) {
        Matcher matcher;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (!TextUtils.isEmpty(str) && this.LJFF != null && this.LJI != null) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3);
            if (!proxy.isSupported ? !(str == null || TextUtils.isEmpty(str) || !this.LIZJ.matcher(str).find() || !this.f26511LJ.matcher(str).find()) : ((Boolean) proxy.result).booleanValue()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                Matcher matcher2 = this.LIZJ.matcher(str);
                if (matcher2 == null || (matcher = this.f26511LJ.matcher(str)) == null) {
                    return;
                }
                while (matcher2.find()) {
                    AbstractC79521HWh abstractC79521HWh = this.LJFF;
                    Intrinsics.checkNotNull(abstractC79521HWh);
                    spannableStringBuilder.setSpan(abstractC79521HWh.LIZ(), matcher2.start(0), matcher2.end(0), 17);
                }
                while (matcher.find()) {
                    AbstractC79521HWh abstractC79521HWh2 = this.LJI;
                    Intrinsics.checkNotNull(abstractC79521HWh2);
                    spannableStringBuilder.setSpan(abstractC79521HWh2.LIZ(), matcher.start(0), matcher.end(0), 17);
                }
                setText(spannableStringBuilder);
                return;
            }
        }
        setText(str);
    }

    public final void LIZ(AbstractC79521HWh abstractC79521HWh, AbstractC79521HWh abstractC79521HWh2) {
        if (PatchProxy.proxy(new Object[]{abstractC79521HWh, abstractC79521HWh2}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC79521HWh, abstractC79521HWh2);
        this.LJFF = abstractC79521HWh;
        this.LJI = abstractC79521HWh2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkTitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context, attributeSet);
        Pattern LIZJ = C116971W2r.LIZJ("[^\\d]+");
        Intrinsics.checkNotNullExpressionValue(LIZJ, "");
        this.LIZJ = LIZJ;
        Pattern LIZJ2 = C116971W2r.LIZJ("[\\d]+");
        Intrinsics.checkNotNullExpressionValue(LIZJ2, "");
        this.f26511LJ = LIZJ2;
    }
}
