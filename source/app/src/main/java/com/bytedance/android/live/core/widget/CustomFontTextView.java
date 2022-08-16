package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.widget.CustomFontTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import p003X.C102316QRa;

/* loaded from: classes8.dex */
public class CustomFontTextView extends LiveTextView {
    public static ChangeQuickRedirect LIZ;
    public Disposable LJFF;

    static {
        Covode.recordClassIndex(24224);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        Disposable disposable = this.LJFF;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            try {
                if (LiveTextView.LIZJ != null) {
                    this.LJFF = LiveTextView.LIZJ.LIZIZ().subscribe(new Consumer(this) { // from class: X.QRb
                        public static ChangeQuickRedirect LIZ;
                        public final CustomFontTextView LIZIZ;

                        static {
                            Covode.recordClassIndex(24248);
                        }

                        {
                            this.LIZIZ = this;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            this.LIZIZ.setTypeface((Typeface) obj);
                        }
                    }, C102316QRa.LIZIZ);
                }
            } catch (Throwable th) {
                ALogger.m15798e("font_text_view", th);
            }
        }
    }

    public CustomFontTextView(Context context) {
        super(context);
    }

    public CustomFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
