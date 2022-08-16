package com.bytedance.android.live.broadcast.gallery.view.indicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Locale;

/* loaded from: classes20.dex */
public class NumberIndicator extends AppCompatTextView {
    public static ChangeQuickRedirect LIZ;
    public ViewPager LIZIZ;
    public int LIZJ;

    /* renamed from: LJ */
    public final ViewPager.OnPageChangeListener f25836LJ;

    static {
        Covode.recordClassIndex(15965);
    }

    public int getCurrentItem() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        ViewPager viewPager = this.LIZIZ;
        if (viewPager != null) {
            return viewPager.getCurrentItem() % this.LIZJ;
        }
        return -1;
    }

    public NumberIndicator(Context context) {
        this(context, null);
    }

    public void setRealSize(int i) {
        if (i > 0) {
            this.LIZJ = i;
        }
    }

    public void setViewPager(ViewPager viewPager) {
        if (!PatchProxy.proxy(new Object[]{viewPager}, this, LIZ, false, 2).isSupported && viewPager != null && viewPager.getAdapter() != null) {
            this.LIZIZ = viewPager;
            this.LIZIZ.removeOnPageChangeListener(this.f25836LJ);
            this.LIZIZ.addOnPageChangeListener(this.f25836LJ);
            this.f25836LJ.onPageSelected(this.LIZIZ.getCurrentItem());
        }
    }

    public NumberIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NumberIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25836LJ = new ViewPager.OnPageChangeListener() { // from class: com.bytedance.android.live.broadcast.gallery.view.indicator.NumberIndicator.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(15966);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrollStateChanged(int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i2) {
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported && NumberIndicator.this.LIZIZ.getAdapter() != null && NumberIndicator.this.LIZJ > 0) {
                    NumberIndicator.this.setText(String.format(Locale.getDefault(), "%s/%s", Integer.valueOf((i2 % NumberIndicator.this.LIZJ) + 1), Integer.valueOf(NumberIndicator.this.LIZJ)));
                }
            }
        };
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            setTextSize(14.0f);
        }
    }
}
