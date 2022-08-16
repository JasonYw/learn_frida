package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC88439Ksz;
import p003X.C116971W2r;

/* loaded from: classes5.dex */
public class ControlButton extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f25969LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public AbstractC88439Ksz LJIIIIZZ;
    public View LJIIIZ;
    public ImageView LJIIJ;
    public TextView LJIIJJI;

    static {
        Covode.recordClassIndex(18309);
    }

    private int getLayoutId() {
        return 2131700372;
    }

    private void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        inflate(getContext(), getLayoutId(), this);
        this.LJIIIZ = findViewById(2131171457);
        this.LJIIJ = (ImageView) findViewById(2131168088);
        this.LJIIJJI = (TextView) findViewById(2131171823);
        this.LJIIIZ.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.broadcast.widget.ControlButton.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18310);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                ControlButton controlButton = ControlButton.this;
                controlButton.LJII = true ^ controlButton.LJII;
                ControlButton.this.LIZ();
                if (ControlButton.this.LJIIIIZZ != null) {
                    ControlButton.this.LJIIIIZZ.LIZ();
                }
            }
        });
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        if (this.LJII) {
            this.LJIIJ.setImageResource(this.LIZJ);
            if (this.f25969LJ != -1) {
                this.LJIIJJI.setTextColor(C116971W2r.LIZ(getResources(), this.f25969LJ));
            }
            int i = this.LJI;
            if (i != -1) {
                this.LJIIJJI.setText(i);
                return;
            }
            return;
        }
        this.LJIIJ.setImageResource(this.LIZIZ);
        if (this.LIZLLL != -1) {
            this.LJIIJJI.setTextColor(C116971W2r.LIZ(getResources(), this.LIZLLL));
        }
        int i2 = this.LJFF;
        if (i2 != -1) {
            this.LJIIJJI.setText(i2);
        }
    }

    public void setOnViewClickListener(AbstractC88439Ksz abstractC88439Ksz) {
        this.LJIIIIZZ = abstractC88439Ksz;
    }

    public ControlButton(Context context) {
        super(context);
        MethodCollector.m14708i(1367);
        LIZIZ();
        MethodCollector.m14707o(1367);
    }

    public void setChecked(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LJII = z;
        LIZ();
    }

    public void setDescVisibility(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LJIIJJI.setVisibility(i);
    }

    public ControlButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1368);
        LIZIZ();
        MethodCollector.m14707o(1368);
    }

    public ControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1369);
        LIZIZ();
        MethodCollector.m14707o(1369);
    }

    public ControlButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        MethodCollector.m14708i(1370);
        LIZIZ();
        MethodCollector.m14707o(1370);
    }
}
