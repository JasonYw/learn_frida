package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.bd */
/* loaded from: classes5.dex */
public class C1525bd {
    static {
        Covode.recordClassIndex(5073);
    }

    /* renamed from: a */
    public static byte[] m18311a(Bitmap bitmap) {
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i = 0; i < 32; i++) {
                byteArrayOutputStream.write(0);
            }
            int i2 = width - 2;
            int[] iArr = new int[i2];
            bitmap.getPixels(iArr, 0, width, 1, 0, i2, 1);
            boolean z = iArr[0] == -16777216;
            boolean z2 = iArr[iArr.length - 1] == -16777216;
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (i3 != iArr[i5]) {
                    i4++;
                    m18308a(byteArrayOutputStream, i5);
                    i3 = iArr[i5];
                }
            }
            if (z2) {
                i4++;
                m18308a(byteArrayOutputStream, length);
            }
            int i6 = i4 + 1;
            if (z) {
                i6--;
            }
            if (z2) {
                i6--;
            }
            int i7 = height - 2;
            int[] iArr2 = new int[i7];
            bitmap.getPixels(iArr2, 0, 1, 0, 1, 1, i7);
            boolean z3 = iArr2[0] == -16777216;
            boolean z4 = iArr2[iArr2.length - 1] == -16777216;
            int length2 = iArr2.length;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < length2; i10++) {
                if (i8 != iArr2[i10]) {
                    i9++;
                    m18308a(byteArrayOutputStream, i10);
                    i8 = iArr2[i10];
                }
            }
            if (z4) {
                i9++;
                m18308a(byteArrayOutputStream, length2);
            }
            int i11 = i9 + 1;
            if (z3) {
                i11--;
            }
            if (z4) {
                i11--;
            }
            int i12 = 0;
            while (true) {
                int i13 = i6 * i11;
                if (i12 < i13) {
                    m18308a(byteArrayOutputStream, 1);
                    i12++;
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray[0] = 1;
                    byteArray[1] = (byte) i4;
                    byteArray[2] = (byte) i9;
                    byteArray[3] = (byte) i13;
                    m18310a(bitmap, byteArray);
                    return byteArray;
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m18309a(InputStream inputStream) {
        try {
            Bitmap LIZ = C116971W2r.LIZ(inputStream);
            byte[] m18311a = m18311a(LIZ);
            if (m18311a == null) {
                return LIZ;
            }
            if (NinePatch.isNinePatchChunk(m18311a)) {
                Bitmap LIZ2 = C116971W2r.LIZ(LIZ, 1, 1, LIZ.getWidth() - 2, LIZ.getHeight() - 2);
                LIZ.recycle();
                if (Build.VERSION.SDK_INT >= 28) {
                    Method declaredMethod = LIZ2.getClass().getDeclaredMethod("setNinePatchChunk", byte[].class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(LIZ2, m18311a);
                    return LIZ2;
                }
                Field declaredField = LIZ2.getClass().getDeclaredField("mNinePatchChunk");
                declaredField.setAccessible(true);
                declaredField.set(LIZ2, m18311a);
                return LIZ2;
            }
            return LIZ;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Bitmap m18304b(Context context, String str) {
        InputStream open = context.getAssets().open(str);
        Bitmap m18309a = m18309a(open);
        open.close();
        return m18309a;
    }

    /* renamed from: a */
    public static void m18308a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & MotionEventCompat.ACTION_MASK);
        outputStream.write((i >> 8) & MotionEventCompat.ACTION_MASK);
        outputStream.write((i >> 16) & MotionEventCompat.ACTION_MASK);
        outputStream.write((i >> 24) & MotionEventCompat.ACTION_MASK);
    }

    /* renamed from: a */
    public static int m18307a(byte[] bArr, int i) {
        int i2 = bArr[i + 0] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* renamed from: a */
    public static Drawable m18312a(Context context, String str) {
        Bitmap m18304b = m18304b(context, str);
        if (m18304b.getNinePatchChunk() == null) {
            return new BitmapDrawable(m18304b);
        }
        Rect rect = new Rect();
        m18305a(m18304b.getNinePatchChunk(), rect);
        return new NinePatchDrawable(context.getResources(), m18304b, m18304b.getNinePatchChunk(), rect, null);
    }

    /* renamed from: a */
    public static void m18310a(Bitmap bitmap, byte[] bArr) {
        int[] iArr = new int[bitmap.getWidth() - 2];
        bitmap.getPixels(iArr, 0, iArr.length, 1, bitmap.getHeight() - 1, iArr.length, 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= iArr.length) {
                break;
            } else if (-16777216 == iArr[i2]) {
                m18306a(bArr, 12, i2);
                break;
            } else {
                i2++;
            }
        }
        int length = iArr.length - 1;
        while (true) {
            if (length < 0) {
                break;
            } else if (-16777216 == iArr[length]) {
                m18306a(bArr, 16, (iArr.length - length) - 2);
                break;
            } else {
                length--;
            }
        }
        int[] iArr2 = new int[bitmap.getHeight() - 2];
        bitmap.getPixels(iArr2, 0, 1, bitmap.getWidth() - 1, 0, 1, iArr2.length);
        while (true) {
            if (i >= iArr2.length) {
                break;
            } else if (-16777216 == iArr2[i]) {
                m18306a(bArr, 20, i);
                break;
            } else {
                i++;
            }
        }
        for (int length2 = iArr2.length - 1; length2 >= 0; length2--) {
            if (-16777216 == iArr2[length2]) {
                m18306a(bArr, 24, (iArr2.length - length2) - 2);
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m18305a(byte[] bArr, Rect rect) {
        rect.left = m18307a(bArr, 12);
        rect.right = m18307a(bArr, 16);
        rect.top = m18307a(bArr, 20);
        rect.bottom = m18307a(bArr, 24);
    }

    /* renamed from: a */
    public static void m18306a(byte[] bArr, int i, int i2) {
        bArr[i + 0] = (byte) (i2 >> 0);
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }
}
