package com.amap.api.maps2d.model;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore2d.C1569cm;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class TextOptionsCreator implements Parcelable.Creator<TextOptions> {
    static {
        Covode.recordClassIndex(5391);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    /* renamed from: newArray */
    public TextOptions[] mo25281newArray(int i) {
        return new TextOptions[i];
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    /* renamed from: createFromParcel */
    public TextOptions mo25280createFromParcel(Parcel parcel) {
        TextOptions textOptions = new TextOptions();
        Bundle readBundle = parcel.readBundle();
        textOptions.position(new LatLng(readBundle.getDouble("lat"), readBundle.getDouble("lng")));
        textOptions.text(parcel.readString());
        textOptions.typeface(Typeface.defaultFromStyle(parcel.readInt()));
        textOptions.rotate(parcel.readFloat());
        textOptions.align(parcel.readInt(), parcel.readInt());
        textOptions.backgroundColor(parcel.readInt());
        textOptions.fontColor(parcel.readInt());
        textOptions.fontSize(parcel.readInt());
        textOptions.zIndex(parcel.readInt());
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        textOptions.visible(z);
        try {
            Parcelable parcelable = parcel.readBundle().getParcelable("obj");
            if (parcelable != null) {
                textOptions.setObject(parcelable);
                return textOptions;
            }
        } catch (Throwable th) {
            C1569cm.m18147a(th, "TextOptionsCreator", "createFromParcel");
        }
        return textOptions;
    }
}
