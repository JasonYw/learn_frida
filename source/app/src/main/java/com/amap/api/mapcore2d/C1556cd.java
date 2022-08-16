package com.amap.api.mapcore2d;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import java.io.InputStream;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.cd */
/* loaded from: classes19.dex */
public class C1556cd extends View {

    /* renamed from: a */
    public Bitmap f23110a;

    /* renamed from: b */
    public Bitmap f23111b;

    /* renamed from: c */
    public Bitmap f23112c;

    /* renamed from: d */
    public Bitmap f23113d;

    /* renamed from: g */
    public int f23116g;

    /* renamed from: h */
    public int f23117h;

    /* renamed from: e */
    public Paint f23114e = new Paint();

    /* renamed from: f */
    public boolean f23115f = false;

    /* renamed from: i */
    public int f23118i = 0;

    /* renamed from: j */
    public int f23119j = 10;

    /* renamed from: k */
    public int f23120k = 0;

    /* renamed from: l */
    public int f23121l = 0;

    /* renamed from: m */
    public int f23122m = 10;

    /* renamed from: n */
    public int f23123n = 8;

    /* renamed from: o */
    public int f23124o = 0;

    /* renamed from: p */
    public boolean f23125p = false;

    /* renamed from: q */
    public float f23126q = 0.0f;

    /* renamed from: r */
    public float f23127r = 0.0f;

    /* renamed from: s */
    public boolean f23128s = true;

    static {
        Covode.recordClassIndex(5104);
    }

    /* renamed from: a */
    public int m18206a() {
        return this.f23118i;
    }

    /* renamed from: c */
    public Bitmap m18200c() {
        if (this.f23115f) {
            return this.f23111b;
        }
        return this.f23110a;
    }

    /* renamed from: d */
    public Point m18198d() {
        return new Point(this.f23119j, this.f23120k - 2);
    }

    /* renamed from: e */
    public void m18197e() {
        if (getWidth() != 0 && getHeight() != 0) {
            m18196f();
            postInvalidate();
        }
    }

    /* renamed from: f */
    private void m18196f() {
        int i = this.f23121l;
        if (i != 0) {
            if (i != 1 && i == 2) {
                m18195g();
            }
        } else {
            m18194h();
        }
        this.f23119j = this.f23122m;
        this.f23120k = (getHeight() - this.f23123n) - this.f23116g;
        if (this.f23119j < 0) {
            this.f23119j = 0;
        }
        if (this.f23120k < 0) {
            this.f23120k = 0;
        }
    }

    /* renamed from: g */
    private void m18195g() {
        if (this.f23128s) {
            this.f23122m = (int) (getWidth() * this.f23126q);
        } else {
            this.f23122m = (int) ((getWidth() * this.f23126q) - this.f23117h);
        }
        this.f23123n = (int) (getHeight() * this.f23127r);
    }

    /* renamed from: h */
    private void m18194h() {
        int i = this.f23118i;
        if (i == 1) {
            this.f23122m = (getWidth() - this.f23117h) / 2;
        } else if (i == 2) {
            this.f23122m = (getWidth() - this.f23117h) - 10;
        } else {
            this.f23122m = 10;
        }
        this.f23123n = 8;
    }

    /* renamed from: b */
    public void m18202b() {
        try {
            if (this.f23110a != null) {
                this.f23110a.recycle();
            }
            if (this.f23111b != null) {
                this.f23111b.recycle();
            }
            this.f23110a = null;
            this.f23111b = null;
            if (this.f23112c != null) {
                this.f23112c.recycle();
                this.f23112c = null;
            }
            if (this.f23113d != null) {
                this.f23113d.recycle();
                this.f23113d = null;
            }
            this.f23114e = null;
        } catch (Throwable th) {
            C1616do.m17866c(th, "WaterMarkerView", "destory");
        }
    }

    /* renamed from: a */
    public void m18205a(int i) {
        this.f23121l = 0;
        this.f23118i = i;
        m18197e();
    }

    /* renamed from: b */
    public void m18201b(int i) {
        this.f23121l = 1;
        this.f23123n = i;
        m18197e();
    }

    /* renamed from: a */
    public void m18203a(boolean z) {
        try {
            this.f23115f = z;
            if (!z) {
                this.f23114e.setColor(ViewCompat.MEASURED_STATE_MASK);
            } else {
                this.f23114e.setColor(-1);
            }
            invalidate();
        } catch (Throwable th) {
            C1616do.m17866c(th, "WaterMarkerView", "changeBitmap");
        }
    }

    /* renamed from: c */
    public void m18199c(int i) {
        this.f23121l = 1;
        this.f23122m = i;
        m18197e();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        try {
            if (getWidth() == 0 || getHeight() == 0 || this.f23111b == null) {
                return;
            }
            if (!this.f23125p) {
                m18196f();
                this.f23125p = true;
            }
            canvas.drawBitmap(m18200c(), this.f23119j, this.f23120k, this.f23114e);
        } catch (Throwable th) {
            C1616do.m17866c(th, "WaterMarkerView", "onDraw");
        }
    }

    public C1556cd(Context context, AbstractC1783y abstractC1783y) {
        super(context);
        InputStream inputStream;
        this.f23116g = 0;
        this.f23117h = 0;
        AssetManager assets = context.getResources().getAssets();
        InputStream inputStream2 = null;
        try {
            inputStream = assets.open("ap2d.data");
            try {
                this.f23112c = C116971W2r.LIZ(inputStream);
                this.f23110a = C1569cm.m18154a(this.f23112c, C1771q.f24012a);
                inputStream.close();
                inputStream2 = assets.open("ap12d.data");
                this.f23113d = C116971W2r.LIZ(inputStream2);
                this.f23111b = C1569cm.m18154a(this.f23113d, C1771q.f24012a);
                inputStream2.close();
                this.f23117h = this.f23111b.getWidth();
                this.f23116g = this.f23111b.getHeight();
                this.f23114e.setAntiAlias(true);
                this.f23114e.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f23114e.setStyle(Paint.Style.STROKE);
                try {
                    inputStream.close();
                } catch (Throwable unused) {
                }
                try {
                    inputStream2.close();
                } catch (Throwable unused2) {
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C1616do.m17866c(th, "WaterMarkerView", "create");
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Throwable unused3) {
                        }
                    }
                } finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Throwable unused5) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* renamed from: a */
    public void m18204a(int i, int i2, int i3, int i4) {
        int i5 = this.f23117h / 2;
        int i6 = this.f23116g / 2;
        int i7 = i3 - i5;
        if (i > i7) {
            i = i7;
        }
        if (i < i5) {
            i = i5;
        }
        if (i2 < i6) {
            i2 = i6;
        }
        int i8 = i4 - i6;
        if (i2 > i8) {
            i2 = i8;
        }
        m18199c(i - i5);
        m18201b((i4 - i2) - i6);
    }
}
