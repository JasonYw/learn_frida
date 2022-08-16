package com.amap.api.maps2d.model;

import android.graphics.Typeface;
import com.amap.api.interfaces.IText;
import com.amap.api.mapcore2d.AbstractC1471aj;
import com.bytedance.covode.number.Covode;

/* loaded from: classes21.dex */
public final class Text {

    /* renamed from: a */
    public IText f24192a;

    static {
        Covode.recordClassIndex(5389);
    }

    public Text(AbstractC1471aj abstractC1471aj) {
        this.f24192a = abstractC1471aj;
    }

    public final void setPosition(LatLng latLng) {
        this.f24192a.setPosition(latLng);
    }

    public final LatLng getPosition() {
        return this.f24192a.getPosition();
    }

    public final float getZIndex() {
        return this.f24192a.getZIndex();
    }

    public final void setZIndex(float f) {
        this.f24192a.setZIndex(f);
    }

    public final void remove() {
        this.f24192a.remove();
    }

    public final void setObject(Object obj) {
        this.f24192a.setObject(obj);
    }

    public final Object getObject() {
        return this.f24192a.getObject();
    }

    public final void setText(String str) {
        this.f24192a.setText(str);
    }

    public final String getText() {
        return this.f24192a.getText();
    }

    public final void setFontSize(int i) {
        this.f24192a.setFontSize(i);
    }

    public final int getFontSize() {
        return this.f24192a.getFontSize();
    }

    public final void setFontColor(int i) {
        this.f24192a.setFontColor(i);
    }

    public final int getFontColor() {
        return this.f24192a.getFonrColor();
    }

    public final void setRotate(float f) {
        this.f24192a.setRotate(f);
    }

    public final float getRotate() {
        return this.f24192a.getRotate();
    }

    public final void setBackgroundColor(int i) {
        this.f24192a.setBackgroundColor(i);
    }

    public final int getBackgroundColor() {
        return this.f24192a.getBackgroundColor();
    }

    public final void setTypeface(Typeface typeface) {
        this.f24192a.setTypeface(typeface);
    }

    public final Typeface getTypeface() {
        return this.f24192a.getTypeface();
    }

    public final int getAlignX() {
        return this.f24192a.getAlignX();
    }

    public final int getAlignY() {
        return this.f24192a.getAlignY();
    }

    public final void setAlign(int i, int i2) {
        this.f24192a.setAlign(i, i2);
    }

    public final void setVisible(boolean z) {
        this.f24192a.setVisible(z);
    }

    public final boolean isVisible() {
        return this.f24192a.isVisible();
    }
}
