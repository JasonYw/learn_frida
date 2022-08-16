package com.bef.effectsdk.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bef.effectsdk.text.data.BitmapType;
import com.bef.effectsdk.text.data.CharLayout;
import com.bef.effectsdk.text.data.TextBitmapResult;
import com.bef.effectsdk.text.data.TextLayoutParam;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import p003X.C116971W2r;

/* loaded from: classes10.dex */
public class TextLayoutUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9580);
    }

    /* loaded from: classes10.dex */
    public enum COLOR_TYPE {
        COLOR_TYPE_RGBA,
        COLOR_TYPE_ALPHA;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static COLOR_TYPE[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (COLOR_TYPE[]) proxy.result;
            }
            return (COLOR_TYPE[]) values().clone();
        }

        static {
            Covode.recordClassIndex(9582);
        }

        public static COLOR_TYPE valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (COLOR_TYPE) proxy.result;
            }
            return (COLOR_TYPE) Enum.valueOf(COLOR_TYPE.class, str);
        }
    }

    /* renamed from: com.bef.effectsdk.text.TextLayoutUtils$1 */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class C24831 {
        public static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE = new int[COLOR_TYPE.valuesCustom().length];
        public static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$text$data$BitmapType;

        static {
            Covode.recordClassIndex(9581);
            try {
                $SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE[COLOR_TYPE.COLOR_TYPE_ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE[COLOR_TYPE.COLOR_TYPE_RGBA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $SwitchMap$com$bef$effectsdk$text$data$BitmapType = new int[BitmapType.valuesCustom().length];
            try {
                $SwitchMap$com$bef$effectsdk$text$data$BitmapType[BitmapType.TEXT_BITMAP_SHAKE_ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bef$effectsdk$text$data$BitmapType[BitmapType.TEXT_BITMAP_NEON_ALPHA.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static String[] splitLyric(String str) {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (String[]) proxy.result;
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] split = str.replace("\n", " ").replace("\r", " ").split(" ");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            StringBuilder sb = new StringBuilder();
            if ((i3 % 5) % 3 == 0) {
                i = 6;
            } else {
                i = 10;
            }
            int i4 = 0;
            while (i2 < split.length && (split[i2].length() + i4 + 1 <= i || i4 <= 3)) {
                i4 += split[i2].length() + 1;
                int i5 = i2 + 1;
                sb.append(split[i2]);
                sb.append(" ");
                if (i5 == split.length - 1 && split[i5].length() < 3) {
                    sb.append(split[i5]);
                }
                i2 = i5;
            }
            i3++;
            arrayList.add(sb.substring(0, sb.length() - 1));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] lyricShakeSplit(String str) {
        boolean z;
        int length;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return (String[]) proxy.result;
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] split = str.replace("\n", " ").replace(Constants.ACCEPT_TIME_SEPARATOR_SP, "").replace("\r", " ").split(" ");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < split.length) {
            if (!split[i].isEmpty()) {
                int length2 = sb.toString().length();
                if (length2 == 0) {
                    if (split[i].length() < 10) {
                        sb.append(split[i]);
                    } else if (split[i].length() == 10) {
                        arrayList.add(split[i]);
                    } else {
                        arrayList.add(split[i].substring(0, 10));
                        if ((split[i].length() - 10) % 9 == 0) {
                            z = true;
                            length = (split[i].length() - 10) / 9;
                        } else {
                            z = false;
                            length = ((split[i].length() - 10) / 9) + 1;
                        }
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            if (i2 == 0) {
                                if (z) {
                                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                                    sb.append(split[i].substring(10, 19));
                                    String sb2 = sb.toString();
                                    arrayList.add(sb2);
                                    sb.delete(0, sb2.length());
                                } else if (length == 1) {
                                    int length3 = split[i].length();
                                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                                    sb.append(split[i].substring(10, length3));
                                    break;
                                } else {
                                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                                    sb.append(split[i].substring(10, 19));
                                    String sb3 = sb.toString();
                                    arrayList.add(sb3);
                                    sb.delete(0, sb3.length());
                                }
                            } else {
                                int i3 = ((i2 - 1) * 9) + 19;
                                if (i2 < length - 1) {
                                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                                    sb.append(split[i].substring(i3, (i2 * 9) + 19));
                                    String sb4 = sb.toString();
                                    arrayList.add(sb4);
                                    sb.delete(0, sb4.length());
                                } else if (z) {
                                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                                    sb.append(split[i].substring(i3, (i2 * 9) + 19));
                                    String sb5 = sb.toString();
                                    arrayList.add(sb5);
                                    sb.delete(0, sb5.length());
                                } else {
                                    int length4 = split[i].length();
                                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                                    sb.append(split[i].substring(i3, length4));
                                }
                            }
                            i2++;
                        }
                    }
                } else if (sb.toString().length() + split[i].length() + 1 <= 10) {
                    sb.append(" ");
                    sb.append(split[i]);
                } else {
                    arrayList.add(sb.toString());
                    sb.delete(0, length2);
                    i--;
                }
            }
            i++;
        }
        if (sb.toString().length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static TextBitmapResult generateBitmapAtlasAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iArr, textLayoutParam}, null, changeQuickRedirect, true, 14);
        if (proxy.isSupported) {
            return (TextBitmapResult) proxy.result;
        }
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapAtlasUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapAtlasAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, textLayoutParam}, null, changeQuickRedirect, true, 15);
        if (proxy.isSupported) {
            return (TextBitmapResult) proxy.result;
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapAtlasUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapAtlasRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iArr, textLayoutParam}, null, changeQuickRedirect, true, 12);
        if (proxy.isSupported) {
            return (TextBitmapResult) proxy.result;
        }
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapAtlasUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapAtlasRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, textLayoutParam}, null, changeQuickRedirect, true, 13);
        if (proxy.isSupported) {
            return (TextBitmapResult) proxy.result;
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapAtlasUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapNeonAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iArr, textLayoutParam}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (TextBitmapResult) proxy.result;
        }
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapNeonAlphaUTF8(new String(iArr, 0, iArr.length), textLayoutParam);
    }

    public static TextBitmapResult generateBitmapNeonAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, textLayoutParam}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (TextBitmapResult) proxy.result;
        }
        int i = C24831.$SwitchMap$com$bef$effectsdk$text$data$BitmapType[BitmapType.valueOf(textLayoutParam.bitmapType).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return generateTextAutoSizedNeonBitmap(str, textLayoutParam);
        }
        return generateTextAutoSizedShakeBitmap(str, textLayoutParam);
    }

    public static TextBitmapResult generateBitmapNormalAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iArr, textLayoutParam}, null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            return (TextBitmapResult) proxy.result;
        }
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapNormalUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapNormalAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, textLayoutParam}, null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            return (TextBitmapResult) proxy.result;
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapNormalUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapNormalRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iArr, textLayoutParam}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return (TextBitmapResult) proxy.result;
        }
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapNormalUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapNormalRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, textLayoutParam}, null, changeQuickRedirect, true, 8);
        if (proxy.isSupported) {
            return (TextBitmapResult) proxy.result;
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapNormalUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateTextAutoSizedNeonBitmap(String str, TextLayoutParam textLayoutParam) {
        boolean z;
        StaticLayout staticLayout;
        float f;
        float f2;
        float f3;
        boolean z2 = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, textLayoutParam}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (TextBitmapResult) proxy.result;
        }
        String[] splitLyric = splitLyric(str);
        if (TextUtils.isEmpty(str) || textLayoutParam == null) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam.familyName) && !TextUtils.isEmpty(textLayoutParam.fontPath)) {
            textPaint.setTypeface(FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        if (textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = splitLyric.length;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[splitLyric.length];
        int[] iArr = new int[splitLyric.length];
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (int i = 0; i < splitLyric.length; i++) {
            int i2 = 10;
            String str2 = splitLyric[i];
            textPaint.setTextSize(10.0f);
            for (float measureText = textPaint.measureText(str2, 0, str2.length()); measureText <= textLayoutParam.lineWidth; measureText = textPaint.measureText(str2, 0, str2.length())) {
                i2 += 2;
                textPaint.setTextSize(i2);
            }
            iArr[i] = i2 - 2;
            textPaint.setTextSize(iArr[i]);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            if (z) {
                f2 = fontMetrics.bottom;
                f3 = fontMetrics.top;
            } else {
                f2 = fontMetrics.descent;
                f3 = fontMetrics.ascent;
            }
            f5 += f2 - f3;
        }
        Bitmap LIZ = C116971W2r.LIZ(textLayoutParam.lineWidth, (int) f5, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(LIZ);
        textBitmapResult.bitmap = LIZ;
        int i3 = 0;
        float f6 = 0.0f;
        while (i3 < splitLyric.length) {
            String str3 = splitLyric[i3];
            textPaint.setTextSize(iArr[i3]);
            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            if (Build.VERSION.SDK_INT >= 23) {
                int length = str3.length();
                int width = canvas.getWidth();
                int i4 = z2 ? 1 : 0;
                int i5 = z2 ? 1 : 0;
                staticLayout = StaticLayout.Builder.obtain(str3, i4, length, textPaint, width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(f4, 1.0f).setIncludePad(z2).build();
            } else {
                staticLayout = new StaticLayout(str3, 0, str3.length(), textPaint, canvas.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            staticLayout.draw(canvas);
            CharLayout charLayout = new CharLayout();
            if (z) {
                f = fontMetrics2.bottom - fontMetrics2.top;
                charLayout.baseline = (f6 - fontMetrics2.top) / f5;
            } else {
                f = fontMetrics2.descent - fontMetrics2.ascent;
                charLayout.baseline = (f6 - fontMetrics2.ascent) / f5;
            }
            charLayout.top = f6 / f5;
            f6 += f;
            charLayout.bottom = f6 / f5;
            charLayout.left = 0.0f;
            charLayout.right = 1.0f;
            textBitmapResult.charLayouts[i3] = charLayout;
            canvas.translate(0.0f, f);
            i3++;
            z2 = false;
            f4 = 0.0f;
        }
        return textBitmapResult;
    }

    public static TextBitmapResult generateTextAutoSizedShakeBitmap(String str, TextLayoutParam textLayoutParam) {
        boolean z;
        StaticLayout staticLayout;
        boolean z2 = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, textLayoutParam}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (TextBitmapResult) proxy.result;
        }
        String[] lyricShakeSplit = lyricShakeSplit(str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam.familyName) && !TextUtils.isEmpty(textLayoutParam.fontPath)) {
            textPaint.setTypeface(FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        textPaint.setTextSize(textLayoutParam.fontSize);
        if (textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        ArrayList arrayList = new ArrayList();
        float f = textLayoutParam.lineWidth;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (i2 < lyricShakeSplit.length) {
            String str2 = lyricShakeSplit[i2];
            if (Build.VERSION.SDK_INT >= 23) {
                int i3 = z2 ? 1 : 0;
                int i4 = z2 ? 1 : 0;
                staticLayout = StaticLayout.Builder.obtain(str2, i3, str2.length(), textPaint, (int) f).setAlignment(Layout.Alignment.ALIGN_OPPOSITE).setLineSpacing(f2, 1.0f).setIncludePad(z2).build();
            } else {
                staticLayout = r19;
                StaticLayout staticLayout2 = new StaticLayout(str2, 0, str2.length(), textPaint, (int) f, Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
            }
            i += staticLayout.getLineCount();
            arrayList.add(staticLayout);
            f3 += staticLayout.getHeight();
            i2++;
            f2 = 0.0f;
            z2 = false;
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = i;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[i];
        Bitmap LIZ = C116971W2r.LIZ(textLayoutParam.lineWidth, (int) f3, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(LIZ);
        textBitmapResult.bitmap = LIZ;
        float f4 = 0.0f;
        int i5 = 0;
        for (int i6 = 0; i6 < lyricShakeSplit.length; i6++) {
            float height = ((StaticLayout) arrayList.get(i6)).getHeight();
            float lineCount = height / ((StaticLayout) arrayList.get(i6)).getLineCount();
            for (int i7 = 0; i7 < ((StaticLayout) arrayList.get(i6)).getLineCount(); i7++) {
                CharLayout charLayout = new CharLayout();
                float lineWidth = ((StaticLayout) arrayList.get(i6)).getLineWidth(i7);
                if (z) {
                    charLayout.baseline = (f4 - fontMetrics.top) / f3;
                } else {
                    charLayout.baseline = (f4 - fontMetrics.ascent) / f3;
                }
                charLayout.top = f4 / f3;
                f4 += lineCount;
                charLayout.bottom = (f4 - (Math.abs(fontMetrics.bottom - fontMetrics.descent) / 2.0f)) / f3;
                if (textLayoutParam.textAlign == 0) {
                    charLayout.left = 0.0f;
                    charLayout.right = (f - lineWidth) / f;
                } else {
                    charLayout.left = (f - lineWidth) / f;
                    charLayout.right = 1.0f;
                }
                textBitmapResult.charLayouts[i5] = charLayout;
                i5++;
            }
            ((StaticLayout) arrayList.get(i6)).draw(canvas);
            canvas.translate(0.0f, height * ((StaticLayout) arrayList.get(i6)).getLineCount());
        }
        return textBitmapResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x034b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x034d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bef.effectsdk.text.data.TextBitmapResult generateBitmapAtlasUTF8(java.lang.String r27, com.bef.effectsdk.text.data.TextLayoutParam r28, com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE r29) {
        /*
            Method dump skipped, instructions count: 965
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.generateBitmapAtlasUTF8(java.lang.String, com.bef.effectsdk.text.data.TextLayoutParam, com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE):com.bef.effectsdk.text.data.TextBitmapResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bef.effectsdk.text.data.TextBitmapResult generateBitmapNormalUTF8(java.lang.String r28, com.bef.effectsdk.text.data.TextLayoutParam r29, com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE r30) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.generateBitmapNormalUTF8(java.lang.String, com.bef.effectsdk.text.data.TextLayoutParam, com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE):com.bef.effectsdk.text.data.TextBitmapResult");
    }
}
