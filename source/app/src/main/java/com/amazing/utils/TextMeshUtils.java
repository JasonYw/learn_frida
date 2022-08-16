package com.amazing.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextPaint;
import android.util.Xml;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p003X.C116971W2r;

/* loaded from: classes10.dex */
public class TextMeshUtils {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(5891);
    }

    public static float getDeviceDpi() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 5);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        return C116971W2r.LIZJ().getDisplayMetrics().densityDpi;
    }

    public static String[] getAndroidSystemFontPaths() {
        FileInputStream fileInputStream;
        XmlPullParser newPullParser;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 8);
        if (proxy.isSupported) {
            return (String[]) proxy.result;
        }
        try {
            newPullParser = Xml.newPullParser();
            fileInputStream = new FileInputStream(new File("/system/etc/fonts.xml"));
        } catch (Exception unused) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            newPullParser.setInput(fileInputStream, "utf-8");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String str = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType != 2) {
                    if (eventType != 3) {
                        if (eventType == 4) {
                            str = newPullParser.getText();
                        }
                    } else if ("family".equals(newPullParser.getName())) {
                        int i = -1;
                        int i2 = 0;
                        while (true) {
                            if (i2 < arrayList2.size()) {
                                if (!((String) arrayList2.get(i2)).contains("Regular")) {
                                    i2++;
                                } else {
                                    i = i2;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        String str2 = new String("/system/fonts/");
                        if (i < 0) {
                            arrayList.add(str2.concat((String) arrayList2.get(0)));
                        } else {
                            arrayList.add(str2.concat((String) arrayList2.get(i)));
                        }
                    } else if ("font".equals(newPullParser.getName())) {
                        arrayList2.add(str);
                    } else if ("familyset".equals(newPullParser.getName())) {
                        str = "ending";
                    }
                } else if ("family".equals(newPullParser.getName())) {
                    arrayList2.clear();
                }
            }
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            try {
                fileInputStream.close();
            } catch (Exception unused2) {
            }
            return strArr;
        } catch (Exception unused3) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception unused4) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
    }

    public static Bitmap callIStaticGenerateBitmapForEmoji(byte[] bArr, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bArr, Integer.valueOf(i)}, null, LIZ, true, 4);
        if (proxy.isSupported) {
            return (Bitmap) proxy.result;
        }
        String str = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(i);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        Bitmap LIZ2 = C116971W2r.LIZ(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(LIZ2);
        canvas.drawText(str, -rect.left, -rect.top, textPaint);
        canvas.save();
        canvas.restore();
        return LIZ2;
    }

    public static int LIZ(Canvas canvas, String str, float f, float f2, Paint paint, int i) {
        int width;
        boolean matches;
        float f3 = f;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{canvas, str, Float.valueOf(f3), Float.valueOf(f2), paint, Integer.valueOf(i)}, null, LIZ, true, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        Rect rect = new Rect();
        System.out.printf("the text space is: %d\n", Integer.valueOf(i));
        System.out.printf("the text length is: %d\n", Integer.valueOf(str.length()));
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            String valueOf = String.valueOf(charAt);
            Math.round(paint.measureText(String.valueOf(charAt)));
            if (charAt > 55296) {
                i2++;
                String str2 = String.valueOf(charAt) + str.charAt(i2);
                if (i2 != 1) {
                    paint.getTextBounds(str, i2, i2 + 1, rect);
                    rect.width();
                }
                int width2 = rect.width() + (i / 2);
                f3 += width2;
                i3 += width2;
                canvas.drawText(str2, f3, f2, paint);
            } else {
                if (charAt == ' ') {
                    width = Math.round(paint.measureText(String.valueOf(str.charAt(i2)))) + i;
                } else {
                    paint.getTextBounds(str, i2, i2 + 1, rect);
                    if (charAt < 128) {
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{valueOf}, null, LIZ, true, 1);
                        if (proxy2.isSupported) {
                            matches = ((Boolean) proxy2.result).booleanValue();
                        } else {
                            matches = C116971W2r.LIZJ("^[A-Za-z0-9_]+$").matcher(valueOf).matches();
                        }
                        if (matches) {
                            width = rect.width() + i;
                            System.out.printf("%s is NumOrLetters\n", Character.valueOf(charAt));
                        } else {
                            width = rect.width() + (i * 2);
                        }
                    } else {
                        width = rect.width() + (i / 2);
                        System.out.printf("%s is not NumOrLetters\n", Character.valueOf(charAt));
                    }
                    System.out.printf("%s is: %d, space is: %d, text is %d\n", Character.valueOf(str.charAt(i2)), Integer.valueOf(width), Integer.valueOf(i), Integer.valueOf(rect.width()));
                }
                f3 += width;
                i3 += width;
                canvas.drawText(String.valueOf(str.charAt(i2)), f3, f2, paint);
            }
            i2++;
        }
        return i3;
    }

    public static float[] generateImageSize(String str, float f, byte[] bArr, int i, boolean z, float f2, int i2, boolean z2, float f3, float f4, int i3, float f5) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Float.valueOf(f), bArr, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f2), Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i3), Float.valueOf(f5)}, null, LIZ, true, 6);
        if (proxy.isSupported) {
            return (float[]) proxy.result;
        }
        String str2 = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(i);
        Rect rect = new Rect();
        float[] fArr = new float[str2.length()];
        textPaint.getTextWidths(str2, fArr);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        float f6 = 0.0f;
        if (!z) {
            f2 = 0.0f;
        }
        if (!z2) {
            f4 = 0.0f;
        } else {
            f6 = f3;
        }
        return new float[]{rect.left, rect.right, -rect.bottom, -rect.top, fArr[0], (f2 + Math.max(Math.abs(f6), Math.abs(f4))) * f, textPaint.ascent(), textPaint.descent()};
    }

    public static Bitmap generateImage(String str, float f, byte[] bArr, int i, boolean z, float f2, int i2, boolean z2, float f3, float f4, int i3, float f5) {
        float f6 = f2;
        float f7 = f4;
        float f8 = f5;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Float.valueOf(f), bArr, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f6), Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Float.valueOf(f3), Float.valueOf(f7), Integer.valueOf(i3), Float.valueOf(f8)}, null, LIZ, true, 7);
        if (proxy.isSupported) {
            return (Bitmap) proxy.result;
        }
        String str2 = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(i);
        Rect rect = new Rect();
        textPaint.getTextWidths(str2, new float[str2.length()]);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        float f9 = 0.0f;
        if (!z) {
            f6 = 0.0f;
        }
        if (!z2) {
            f7 = 0.0f;
            f8 = 0.0f;
        } else {
            f9 = f3;
        }
        float max = Math.max(Math.abs(f9), Math.abs(f7)) + f6;
        TextPaint textPaint2 = new TextPaint();
        if (z || z2) {
            textPaint2.setTextSize(f);
            textPaint2.setAntiAlias(true);
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setTextAlign(Paint.Align.LEFT);
            textPaint2.setStrokeWidth(f6 * 2.0f * f);
            textPaint2.setColor(i2);
            if (z2) {
                textPaint2.setShadowLayer(f8 * f, f9 * f, f7 * f, i3);
            }
        }
        float f10 = 2.0f * max * f;
        Bitmap LIZ2 = C116971W2r.LIZ((int) (rect.width() + f10), (int) (rect.height() + f10), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(LIZ2);
        if (z || z2) {
            float f11 = max * f;
            canvas.drawText(str2, (-rect.left) + f11, (-rect.top) + f11, textPaint2);
        }
        float f12 = max * f;
        canvas.drawText(str2, (-rect.left) + f12, (-rect.top) + f12, textPaint);
        canvas.save();
        canvas.restore();
        return LIZ2;
    }

    public static Bitmap callIStaticGenerateBitmapFromTextMesh(byte[] bArr, String str, int i, int i2, int i3, float f, int i4, float f2, int i5, float f3, float f4, float f5, int i6, int i7, int i8, int i9) {
        float f6;
        float f7;
        int i10 = i3;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bArr, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), Integer.valueOf(i4), Float.valueOf(f2), Integer.valueOf(i5), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)}, null, LIZ, true, 3);
        if (proxy.isSupported) {
            return (Bitmap) proxy.result;
        }
        String str2 = new String(bArr);
        Rect rect = new Rect(0, 0, i8, i9);
        Bitmap LIZ2 = C116971W2r.LIZ(i8, i9, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        Canvas canvas = new Canvas(LIZ2);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(i2);
        float f8 = i;
        textPaint.setTextSize(f8);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        if (i7 == 0) {
            textPaint.setTextAlign(Paint.Align.LEFT);
        } else if (i7 == 1) {
            textPaint.setTextAlign(Paint.Align.CENTER);
        } else {
            textPaint.setTextAlign(Paint.Align.RIGHT);
        }
        if ((i4 & 16) == 16) {
            textPaint.setUnderlineText(true);
        }
        if ((i4 & 32) == 32) {
            textPaint.setStrikeThruText(true);
        }
        if ((i4 & 4) == 4) {
            textPaint.setTextSkewX((-f) / 90.0f);
        }
        if ((i4 & 8) == 8) {
            textPaint.setFakeBoldText(true);
        }
        if ((i4 & 2) == 2) {
            textPaint.setShadowLayer(f3, f4, f5, i6);
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f9 = fontMetrics.top;
        float f10 = fontMetrics.bottom;
        String[] split = str2.split("\n");
        int length = split.length;
        if ((i4 & 1) == 1) {
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setColor(i5);
            textPaint2.setTextSize(textPaint.getTextSize());
            textPaint2.setAntiAlias(textPaint.isAntiAlias());
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setStrokeWidth((5.0f * f2) / f8);
            textPaint2.setTextAlign(textPaint.getTextAlign());
            textPaint2.setTextSkewX(textPaint.getTextSkewX());
            textPaint.setFakeBoldText(false);
            textPaint2.setFakeBoldText(true);
            float f11 = i10 / f8;
            float f12 = ((-fontMetrics.ascent) + fontMetrics.descent) * 0.1f;
            int i11 = 0;
            while (i11 < length) {
                int centerY = (int) (((int) ((rect.centerY() - (f9 / 2.0f)) - (f10 / 2.0f))) - ((((length - 1) * 0.5d) - i11) * (f12 + f7)));
                int i12 = Build.VERSION.SDK_INT;
                textPaint2.setLetterSpacing(f11);
                if (i7 == 0) {
                    canvas.drawText(split[i11], rect.left, centerY, textPaint2);
                } else if (i7 == 1) {
                    canvas.drawText(split[i11], rect.centerX(), centerY, textPaint2);
                } else {
                    canvas.drawText(split[i11], rect.right, centerY, textPaint2);
                }
                i11++;
                i10 = i3;
            }
        }
        float f13 = i10 / f8;
        float f14 = 0.1f * ((-fontMetrics.ascent) + fontMetrics.descent);
        for (int i13 = 0; i13 < length; i13++) {
            int centerY2 = (int) (((int) ((rect.centerY() - (f9 / 2.0f)) - (f10 / 2.0f))) - ((((length - 1) * 0.5d) - i13) * (f14 + f6)));
            int i14 = Build.VERSION.SDK_INT;
            textPaint.setLetterSpacing(f13);
            if (i7 == 0) {
                canvas.drawText(split[i13], rect.left, centerY2, textPaint);
            } else if (i7 == 1) {
                canvas.drawText(split[i13], rect.centerX(), centerY2, textPaint);
            } else {
                canvas.drawText(split[i13], rect.right, centerY2, textPaint);
            }
        }
        canvas.save();
        canvas.restore();
        return LIZ2;
    }
}
