package com.android.ttcjpaysdk.thirdparty.counter.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.counter.data.FastPayGuideInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import java.util.List;
import p002O.C0002O;

/* loaded from: classes22.dex */
public class FastPayMoreDescView extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public Context LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f25522LJ;
    public int LJFF;
    public List<FastPayGuideInfo.MoreBean.DescriptionBean.ContentBean> LJI;

    static {
        Covode.recordClassIndex(8321);
    }

    public FastPayMoreDescView(Context context) {
        this(context, null);
    }

    public void setData(List<FastPayGuideInfo.MoreBean.DescriptionBean.ContentBean> list) {
        MethodCollector.m14708i(516);
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(516);
        } else if (list != null && list.size() != 0) {
            this.LJI = list;
            for (int i = 0; i < this.LJI.size(); i++) {
                TextView textView = new TextView(this.LIZIZ);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = CJPayBasicUtils.dipToPX(this.LIZIZ, 8.0f);
                textView.setLayoutParams(layoutParams);
                FastPayGuideInfo.MoreBean.DescriptionBean.ContentBean contentBean = this.LJI.get(i);
                String str = contentBean.summary;
                String str2 = contentBean.description;
                new StringBuilder();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C0002O.m25086C(str, str2));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.LIZJ), 0, str.length(), 34);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.f25522LJ, true), 0, str.length(), 17);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.LIZLLL), str.length(), spannableStringBuilder.length(), 34);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.LJFF, true), str.length(), spannableStringBuilder.length(), 17);
                textView.setText(spannableStringBuilder);
                addView(textView);
            }
            MethodCollector.m14707o(516);
        } else {
            MethodCollector.m14707o(516);
        }
    }

    public FastPayMoreDescView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FastPayMoreDescView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(515);
        this.LIZIZ = context;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            this.LIZJ = CastProtectorUtils.parseColor("#161823");
            this.LIZLLL = CastProtectorUtils.parseColor("#BF161823");
            this.f25522LJ = 13;
            this.LJFF = 13;
        }
        MethodCollector.m14707o(515);
    }
}
