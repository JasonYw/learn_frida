package com.amap.api.mapcore2d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.TextOptions;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.bp */
/* loaded from: classes19.dex */
public class C1538bp implements AbstractC1471aj {

    /* renamed from: a */
    public GestureDetector$OnDoubleTapListenerC1507b f23036a;

    /* renamed from: b */
    public C1486at f23037b;

    /* renamed from: c */
    public String f23038c;

    /* renamed from: d */
    public int f23039d;

    /* renamed from: e */
    public int f23040e;

    /* renamed from: f */
    public LatLng f23041f;

    /* renamed from: g */
    public float f23042g;

    /* renamed from: h */
    public int f23043h;

    /* renamed from: i */
    public Typeface f23044i;

    /* renamed from: j */
    public boolean f23045j;

    /* renamed from: k */
    public float f23046k;

    /* renamed from: l */
    public int f23047l;

    /* renamed from: m */
    public int f23048m;

    /* renamed from: n */
    public Object f23049n;

    /* renamed from: o */
    public int f23050o;

    static {
        Covode.recordClassIndex(5086);
    }

    @Override // com.amap.api.interfaces.IText, com.amap.api.mapcore2d.AbstractC1463ac
    public int getAddIndex() {
        return this.f23050o;
    }

    @Override // com.amap.api.interfaces.IText
    public int getAlignX() {
        return this.f23047l;
    }

    @Override // com.amap.api.interfaces.IText
    public int getAlignY() {
        return this.f23048m;
    }

    @Override // com.amap.api.interfaces.IText
    public int getBackgroundColor() {
        return this.f23043h;
    }

    @Override // com.amap.api.interfaces.IText
    public int getFonrColor() {
        return this.f23040e;
    }

    @Override // com.amap.api.interfaces.IText
    public int getFontSize() {
        return this.f23039d;
    }

    @Override // com.amap.api.interfaces.IText
    public Object getObject() {
        return this.f23049n;
    }

    @Override // com.amap.api.interfaces.IText
    public LatLng getPosition() {
        return this.f23041f;
    }

    @Override // com.amap.api.interfaces.IText
    public float getRotate() {
        return this.f23042g;
    }

    @Override // com.amap.api.interfaces.IText
    public String getText() {
        return this.f23038c;
    }

    @Override // com.amap.api.interfaces.IText
    public Typeface getTypeface() {
        return this.f23044i;
    }

    @Override // com.amap.api.interfaces.IText, com.amap.api.mapcore2d.AbstractC1463ac
    public float getZIndex() {
        return this.f23046k;
    }

    @Override // com.amap.api.interfaces.IText
    public boolean isVisible() {
        return this.f23045j;
    }

    @Override // com.amap.api.interfaces.IText
    public void remove() {
        C1486at c1486at = this.f23037b;
        if (c1486at != null) {
            c1486at.m18542b(this);
        }
    }

    @Override // com.amap.api.interfaces.IText, com.amap.api.mapcore2d.AbstractC1463ac
    public void setAddIndex(int i) {
        this.f23050o = i;
    }

    @Override // com.amap.api.interfaces.IText
    public void setObject(Object obj) {
        this.f23049n = obj;
    }

    @Override // com.amap.api.interfaces.IText
    public void setBackgroundColor(int i) {
        this.f23043h = i;
        this.f23036a.postInvalidate();
    }

    @Override // com.amap.api.interfaces.IText
    public void setFontColor(int i) {
        this.f23040e = i;
        this.f23036a.postInvalidate();
    }

    @Override // com.amap.api.interfaces.IText
    public void setFontSize(int i) {
        this.f23039d = i;
        this.f23036a.postInvalidate();
    }

    @Override // com.amap.api.interfaces.IText
    public void setPosition(LatLng latLng) {
        this.f23041f = latLng;
        this.f23036a.postInvalidate();
    }

    @Override // com.amap.api.interfaces.IText
    public void setRotate(float f) {
        this.f23042g = f;
        this.f23036a.postInvalidate();
    }

    @Override // com.amap.api.interfaces.IText
    public void setText(String str) {
        this.f23038c = str;
        this.f23036a.postInvalidate();
    }

    @Override // com.amap.api.interfaces.IText
    public void setTypeface(Typeface typeface) {
        this.f23044i = typeface;
        this.f23036a.postInvalidate();
    }

    @Override // com.amap.api.interfaces.IText
    public void setVisible(boolean z) {
        this.f23045j = z;
        this.f23036a.postInvalidate();
    }

    @Override // com.amap.api.interfaces.IText
    public void setZIndex(float f) {
        this.f23046k = f;
        this.f23037b.m18537d();
    }

    @Override // com.amap.api.interfaces.IText
    public void draw(Canvas canvas) {
        int i;
        float f;
        float f2;
        if (!TextUtils.isEmpty(this.f23038c) && this.f23041f != null) {
            TextPaint textPaint = new TextPaint();
            if (this.f23044i == null) {
                this.f23044i = Typeface.DEFAULT;
            }
            textPaint.setTypeface(this.f23044i);
            textPaint.setAntiAlias(true);
            textPaint.setTextSize(this.f23039d);
            float measureText = textPaint.measureText(this.f23038c);
            float f3 = this.f23039d;
            textPaint.setColor(this.f23043h);
            C1781w c1781w = new C1781w((int) (this.f23041f.latitude * 1000000.0d), (int) (this.f23041f.longitude * 1000000.0d));
            Point point = new Point();
            this.f23036a.mo17142d().mo18286a(c1781w, point);
            canvas.save();
            canvas.rotate(-(this.f23042g % 360.0f), point.x, point.y);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            int i2 = this.f23047l;
            if (i2 <= 0 || i2 > 3) {
                this.f23047l = 3;
            }
            int i3 = this.f23048m;
            if (i3 < 4 || i3 > 6) {
                this.f23048m = 6;
            }
            int i4 = this.f23047l;
            int i5 = 0;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        i = 0;
                    } else {
                        f2 = point.x - (measureText / 2.0f);
                    }
                } else {
                    f2 = point.x - measureText;
                }
                i = (int) f2;
            } else {
                i = point.x;
            }
            int i6 = this.f23048m;
            if (i6 != 4) {
                if (i6 != 5) {
                    if (i6 == 6) {
                        f = point.y - (f3 / 2.0f);
                    }
                } else {
                    f = point.y - f3;
                }
                i5 = (int) f;
            } else {
                i5 = point.y;
            }
            float f4 = i;
            float f5 = i5 + f3 + 2.0f;
            canvas.drawRect(i - 1, i5 - 1, f4 + measureText + 2.0f, f5, textPaint);
            textPaint.setColor(this.f23040e);
            canvas.drawText(this.f23038c, f4, f5 - fontMetrics.bottom, textPaint);
            canvas.restore();
        }
    }

    @Override // com.amap.api.interfaces.IText
    public void setAlign(int i, int i2) {
        this.f23047l = i;
        this.f23048m = i2;
        this.f23036a.postInvalidate();
    }

    public C1538bp(AbstractC1783y abstractC1783y, TextOptions textOptions, C1486at c1486at) {
        this.f23037b = c1486at;
        this.f23038c = textOptions.getText();
        this.f23039d = textOptions.getFontSize();
        this.f23040e = textOptions.getFontColor();
        this.f23041f = textOptions.getPosition();
        this.f23042g = textOptions.getRotate();
        this.f23043h = textOptions.getBackgroundColor();
        this.f23044i = textOptions.getTypeface();
        this.f23045j = textOptions.isVisible();
        this.f23046k = textOptions.getZIndex();
        this.f23047l = textOptions.getAlignX();
        this.f23048m = textOptions.getAlignY();
        this.f23049n = textOptions.getObject();
        this.f23036a = (GestureDetector$OnDoubleTapListenerC1507b) abstractC1783y;
    }
}
