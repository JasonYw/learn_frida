package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.bk */
/* loaded from: classes19.dex */
public class C1532bk extends View {

    /* renamed from: b */
    public int f23016b;

    /* renamed from: c */
    public GestureDetector$OnDoubleTapListenerC1507b f23017c;

    /* renamed from: a */
    public String f23015a = "";

    /* renamed from: d */
    public Paint f23018d = new Paint();

    /* renamed from: f */
    public Rect f23020f = new Rect();

    /* renamed from: e */
    public Paint f23019e = new Paint();

    static {
        Covode.recordClassIndex(5080);
    }

    /* renamed from: a */
    public void m18281a() {
        this.f23018d = null;
        this.f23019e = null;
        this.f23020f = null;
        this.f23015a = null;
    }

    /* renamed from: a */
    public void m18280a(int i) {
        this.f23016b = i;
    }

    /* renamed from: a */
    public void m18279a(String str) {
        this.f23015a = str;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int width;
        try {
            if (!this.f23017c.m18390c().isScaleControlsEnabled()) {
                return;
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        if (!this.f23015a.equals("") && (i = this.f23016b) != 0) {
            try {
                if (i > this.f23017c.getWidth() / 5) {
                    i = this.f23017c.getWidth() / 5;
                }
            } catch (Exception e2) {
                C1569cm.m18147a(e2, "ScaleView", "onDraw");
            }
            Point m18383f = this.f23017c.m18383f();
            Paint paint = this.f23019e;
            String str = this.f23015a;
            paint.getTextBounds(str, 0, str.length(), this.f23020f);
            if (m18383f.x + i > this.f23017c.getWidth() - 10) {
                width = (this.f23017c.getWidth() - 10) - ((this.f23020f.width() + i) / 2);
            } else {
                width = m18383f.x + ((i - this.f23020f.width()) / 2);
            }
            int height = (m18383f.y - this.f23020f.height()) + 5;
            canvas.drawText(this.f23015a, width, height, this.f23019e);
            int width2 = width - ((i - this.f23020f.width()) / 2);
            int height2 = height + (this.f23020f.height() - 5);
            float f = width2;
            float f2 = height2 - 2;
            float f3 = height2 + 2;
            canvas.drawLine(f, f2, f, f3, this.f23018d);
            float f4 = height2;
            float f5 = width2 + i;
            canvas.drawLine(f, f4, f5, f4, this.f23018d);
            canvas.drawLine(f5, f2, f5, f3, this.f23018d);
        }
    }

    public C1532bk(Context context, GestureDetector$OnDoubleTapListenerC1507b gestureDetector$OnDoubleTapListenerC1507b) {
        super(context);
        this.f23017c = gestureDetector$OnDoubleTapListenerC1507b;
        this.f23018d.setAntiAlias(true);
        this.f23018d.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f23018d.setStrokeWidth(C1771q.f24012a * 2.0f);
        this.f23018d.setStyle(Paint.Style.STROKE);
        this.f23019e.setAntiAlias(true);
        this.f23019e.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f23019e.setTextSize(C1771q.f24012a * 20.0f);
    }
}
