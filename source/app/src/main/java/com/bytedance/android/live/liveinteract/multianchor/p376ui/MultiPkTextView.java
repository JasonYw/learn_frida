package com.bytedance.android.live.liveinteract.multianchor.p376ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.android.live.liveinteract.widget.widget.NoPaddingTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC79520HWg;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.ui.MultiPkTextView */
/* loaded from: classes3.dex */
public final class MultiPkTextView extends NoPaddingTextView {
    public static ChangeQuickRedirect LIZ;
    public AbstractC79520HWg LIZIZ;
    public AbstractC79520HWg LIZJ;

    /* renamed from: LJ */
    public final Pattern f26367LJ;
    public final Pattern LJFF;

    static {
        Covode.recordClassIndex(28351);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiPkTextView(Context context) {
        super(context);
        C106862S5w.LIZ(context);
        Pattern LIZJ = C116971W2r.LIZJ("[^\\d]+");
        Intrinsics.checkNotNullExpressionValue(LIZJ, "");
        this.f26367LJ = LIZJ;
        Pattern LIZJ2 = C116971W2r.LIZJ("[\\d]+");
        Intrinsics.checkNotNullExpressionValue(LIZJ2, "");
        this.LJFF = LIZJ2;
    }

    public final void setPkTitle(String str) {
        Matcher matcher;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (!TextUtils.isEmpty(str) && this.LIZIZ != null && this.LIZJ != null) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3);
            if (!proxy.isSupported ? !(str == null || TextUtils.isEmpty(str) || !this.f26367LJ.matcher(str).find() || !this.LJFF.matcher(str).find()) : ((Boolean) proxy.result).booleanValue()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                Matcher matcher2 = this.f26367LJ.matcher(str);
                if (matcher2 == null || (matcher = this.LJFF.matcher(str)) == null) {
                    return;
                }
                while (matcher2.find()) {
                    AbstractC79520HWg abstractC79520HWg = this.LIZIZ;
                    Intrinsics.checkNotNull(abstractC79520HWg);
                    spannableStringBuilder.setSpan(abstractC79520HWg.LIZ(), matcher2.start(0), matcher2.end(0), 17);
                }
                while (matcher.find()) {
                    AbstractC79520HWg abstractC79520HWg2 = this.LIZJ;
                    Intrinsics.checkNotNull(abstractC79520HWg2);
                    spannableStringBuilder.setSpan(abstractC79520HWg2.LIZ(), matcher.start(0), matcher.end(0), 17);
                }
                setText(spannableStringBuilder);
                return;
            }
        }
        setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiPkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context, attributeSet);
        Pattern LIZJ = C116971W2r.LIZJ("[^\\d]+");
        Intrinsics.checkNotNullExpressionValue(LIZJ, "");
        this.f26367LJ = LIZJ;
        Pattern LIZJ2 = C116971W2r.LIZJ("[\\d]+");
        Intrinsics.checkNotNullExpressionValue(LIZJ2, "");
        this.LJFF = LIZJ2;
    }
}
