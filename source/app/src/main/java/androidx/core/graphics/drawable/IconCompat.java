package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import p003X.C109592TCw;
import p003X.C116971W2r;

/* loaded from: classes10.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    public byte[] mData;
    public int mInt1;
    public int mInt2;
    public Object mObj1;
    public Parcelable mParcelable;
    public ColorStateList mTintList;
    public PorterDuff.Mode mTintMode;
    public String mTintModeStr;
    public int mType;

    public static String typeToString(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Icon toIcon() {
        return toIcon(null);
    }

    static {
        Covode.recordClassIndex(984);
    }

    public IconCompat() {
        this.mType = -1;
        this.mTintMode = DEFAULT_TINT_MODE;
    }

    public int getType() {
        if (this.mType == -1 && Build.VERSION.SDK_INT >= 23) {
            return getType((Icon) this.mObj1);
        }
        return this.mType;
    }

    public Bitmap getBitmap() {
        if (this.mType == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.mObj1;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        int i = this.mType;
        if (i == 1) {
            return (Bitmap) this.mObj1;
        }
        if (i == 5) {
            return createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int getResId() {
        if (this.mType == -1 && Build.VERSION.SDK_INT >= 23) {
            return getResId((Icon) this.mObj1);
        }
        if (this.mType == 2) {
            return this.mInt1;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String getResPackage() {
        if (this.mType == -1 && Build.VERSION.SDK_INT >= 23) {
            return getResPackage((Icon) this.mObj1);
        }
        if (this.mType == 2) {
            return ((String) this.mObj1).split(Constants.COLON_SEPARATOR, -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public Uri getUri() {
        if (this.mType == -1 && Build.VERSION.SDK_INT >= 23) {
            return getUri((Icon) this.mObj1);
        }
        int i = this.mType;
        if (i != 4 && i != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.mObj1);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        this.mTintMode = PorterDuff.Mode.valueOf(this.mTintModeStr);
        switch (this.mType) {
            case -1:
                Parcelable parcelable = this.mParcelable;
                if (parcelable != null) {
                    this.mObj1 = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.mParcelable;
                if (parcelable2 != null) {
                    this.mObj1 = parcelable2;
                    return;
                }
                byte[] bArr = this.mData;
                this.mObj1 = bArr;
                this.mType = 3;
                this.mInt1 = 0;
                this.mInt2 = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                this.mObj1 = new String(this.mData, Charset.forName("UTF-16"));
                return;
            case 3:
                this.mObj1 = this.mData;
                return;
        }
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        switch (this.mType) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.mObj1);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.mObj1);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.mObj1);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.mObj1);
                break;
        }
        bundle.putInt("type", this.mType);
        bundle.putInt("int1", this.mInt1);
        bundle.putInt("int2", this.mInt2);
        ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.mTintMode;
        if (mode != DEFAULT_TINT_MODE) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public String toString() {
        if (this.mType == -1) {
            return String.valueOf(this.mObj1);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(typeToString(this.mType));
        switch (this.mType) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.mObj1).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.mObj1).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(getResPackage());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(getResId())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.mInt1);
                if (this.mInt2 != 0) {
                    sb.append(" off=");
                    sb.append(this.mInt2);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.mObj1);
                break;
        }
        if (this.mTintList != null) {
            sb.append(" tint=");
            sb.append(this.mTintList);
        }
        if (this.mTintMode != DEFAULT_TINT_MODE) {
            sb.append(" mode=");
            sb.append(this.mTintMode);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat setTintList(ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        return this;
    }

    public IconCompat setTintMode(PorterDuff.Mode mode) {
        this.mTintMode = mode;
        return this;
    }

    public IconCompat setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
        return this;
    }

    public IconCompat(int i) {
        this.mType = -1;
        this.mTintMode = DEFAULT_TINT_MODE;
        this.mType = i;
    }

    public static IconCompat createFromIconOrNullIfZeroResId(Icon icon) {
        if (getType(icon) == 2 && getResId(icon) == 0) {
            return null;
        }
        return createFromIcon(icon);
    }

    public static IconCompat createWithAdaptiveBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(5);
            iconCompat.mObj1 = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat createWithAdaptiveBitmapContentUri(Uri uri) {
        if (uri != null) {
            return createWithAdaptiveBitmapContentUri(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat createWithBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.mObj1 = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat createWithContentUri(Uri uri) {
        if (uri != null) {
            return createWithContentUri(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat createFromIcon(Icon icon) {
        C109592TCw.LIZ(icon);
        int type = getType(icon);
        if (type != 2) {
            if (type != 4) {
                if (type != 6) {
                    IconCompat iconCompat = new IconCompat(-1);
                    iconCompat.mObj1 = icon;
                    return iconCompat;
                }
                return createWithAdaptiveBitmapContentUri(getUri(icon));
            }
            return createWithContentUri(getUri(icon));
        }
        return createWithResource(null, getResPackage(icon), getResId(icon));
    }

    public static IconCompat createWithAdaptiveBitmapContentUri(String str) {
        if (str != null) {
            IconCompat iconCompat = new IconCompat(6);
            iconCompat.mObj1 = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat createWithContentUri(String str) {
        if (str != null) {
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.mObj1 = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static int getResId(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public static String getResPackage(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static int getType(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return -1;
        }
    }

    public static Uri getUri(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private InputStream getUriInputStream(Context context) {
        Uri uri = getUri();
        String scheme = uri.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.mObj1));
            } catch (FileNotFoundException | Exception unused) {
                return null;
            }
        }
        return context.getContentResolver().openInputStream(uri);
    }

    public void checkResource(Context context) {
        if (this.mType == 2) {
            String str = (String) this.mObj1;
            if (!str.contains(Constants.COLON_SEPARATOR)) {
                return;
            }
            String str2 = str.split(Constants.COLON_SEPARATOR, -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(Constants.COLON_SEPARATOR, -1)[0];
            int identifier = getResources(context, str5).getIdentifier(str4, str3, str5);
            if (this.mInt1 != identifier) {
                this.mInt1 = identifier;
            }
        }
    }

    public Drawable loadDrawable(Context context) {
        checkResource(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return toIcon(context).loadDrawable(context);
        }
        Drawable loadDrawableInner = loadDrawableInner(context);
        if (loadDrawableInner != null && (this.mTintList != null || this.mTintMode != DEFAULT_TINT_MODE)) {
            loadDrawableInner.mutate();
            DrawableCompat.setTintList(loadDrawableInner, this.mTintList);
            DrawableCompat.setTintMode(loadDrawableInner, this.mTintMode);
        }
        return loadDrawableInner;
    }

    public static IconCompat createFromBundle(Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.mInt1 = bundle.getInt("int1");
        iconCompat.mInt2 = bundle.getInt("int2");
        if (bundle.containsKey("tint_list")) {
            iconCompat.mTintList = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.mTintMode = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.mObj1 = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.mObj1 = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.mObj1 = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean z) {
        this.mTintModeStr = this.mTintMode.name();
        switch (this.mType) {
            case -1:
                if (!z) {
                    this.mParcelable = (Parcelable) this.mObj1;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.mObj1).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.mData = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.mParcelable = (Parcelable) this.mObj1;
                return;
            case 2:
                this.mData = ((String) this.mObj1).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.mData = (byte[]) this.mObj1;
                return;
            case 4:
            case 6:
                this.mData = this.mObj1.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    private Drawable loadDrawableInner(Context context) {
        switch (this.mType) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.mObj1);
            case 2:
                String resPackage = getResPackage();
                if (TextUtils.isEmpty(resPackage)) {
                    resPackage = context.getPackageName();
                }
                try {
                    return ResourcesCompat.getDrawable(getResources(context, resPackage), this.mInt1, context.getTheme());
                } catch (RuntimeException unused) {
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), C116971W2r.LIZ((byte[]) this.mObj1, this.mInt1, this.mInt2));
            case 4:
                InputStream uriInputStream = getUriInputStream(context);
                if (uriInputStream != null) {
                    return new BitmapDrawable(context.getResources(), C116971W2r.LIZ(uriInputStream));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, false));
            case 6:
                InputStream uriInputStream2 = getUriInputStream(context);
                if (uriInputStream2 != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return new AdaptiveIconDrawable(null, new BitmapDrawable(context.getResources(), C116971W2r.LIZ(uriInputStream2)));
                    }
                    return new BitmapDrawable(context.getResources(), createLegacyIconFromAdaptiveIcon(C116971W2r.LIZ(uriInputStream2), false));
                }
                break;
        }
        return null;
    }

    public Icon toIcon(Context context) {
        Icon createWithBitmap;
        switch (this.mType) {
            case -1:
                return (Icon) this.mObj1;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.mObj1);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(getResPackage(), this.mInt1);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.mObj1, this.mInt1, this.mInt2);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.mObj1);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.mObj1);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, false));
                    break;
                }
            case 6:
                if (context != null) {
                    InputStream uriInputStream = getUriInputStream(context);
                    if (uriInputStream != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            createWithBitmap = Icon.createWithAdaptiveBitmap(C116971W2r.LIZ(uriInputStream));
                            break;
                        } else {
                            createWithBitmap = Icon.createWithBitmap(createLegacyIconFromAdaptiveIcon(C116971W2r.LIZ(uriInputStream), false));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + getUri());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + getUri());
                }
        }
        ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.mTintMode;
        if (mode != DEFAULT_TINT_MODE) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public static IconCompat createWithResource(Context context, int i) {
        if (context != null) {
            return createWithResource(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public static Resources getResources(Context context, String str) {
        if ("android".equals(str)) {
            return C116971W2r.LIZJ();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static IconCompat createFromIcon(Context context, Icon icon) {
        C109592TCw.LIZ(icon);
        int type = getType(icon);
        if (type != 2) {
            if (type != 4) {
                if (type != 6) {
                    IconCompat iconCompat = new IconCompat(-1);
                    iconCompat.mObj1 = icon;
                    return iconCompat;
                }
                return createWithAdaptiveBitmapContentUri(getUri(icon));
            }
            return createWithContentUri(getUri(icon));
        }
        String resPackage = getResPackage(icon);
        try {
            return createWithResource(getResources(context, resPackage), resPackage, getResId(icon));
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException("Icon resource cannot be found");
        }
    }

    public static Bitmap createLegacyIconFromAdaptiveIcon(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap LIZ = C116971W2r.LIZ(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(LIZ);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return LIZ;
    }

    public static IconCompat createWithData(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            IconCompat iconCompat = new IconCompat(3);
            iconCompat.mObj1 = bArr;
            iconCompat.mInt1 = i;
            iconCompat.mInt2 = i2;
            return iconCompat;
        }
        throw new IllegalArgumentException("Data must not be null.");
    }

    public static IconCompat createWithResource(Resources resources, String str, int i) {
        if (str != null) {
            if (i != 0) {
                IconCompat iconCompat = new IconCompat(2);
                iconCompat.mInt1 = i;
                if (resources != null) {
                    try {
                        iconCompat.mObj1 = resources.getResourceName(i);
                        return iconCompat;
                    } catch (Resources.NotFoundException unused) {
                        throw new IllegalArgumentException("Icon resource cannot be found");
                    }
                }
                iconCompat.mObj1 = str;
                return iconCompat;
            }
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        throw new IllegalArgumentException("Package must not be null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r7 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addToShortcutIntent(android.content.Intent r6, android.graphics.drawable.Drawable r7, android.content.Context r8) {
        /*
            r5 = this;
            r5.checkResource(r8)
            int r1 = r5.mType
            r2 = 1
            if (r1 == r2) goto L93
            r0 = 2
            if (r1 == r0) goto L35
            r0 = 5
            if (r1 != r0) goto La3
            java.lang.Object r0 = r5.mObj1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap r1 = createLegacyIconFromAdaptiveIcon(r0, r2)
            if (r7 == 0) goto L2f
        L18:
            int r4 = r1.getWidth()
            int r3 = r1.getHeight()
            int r2 = r4 / 2
            int r0 = r3 / 2
            r7.setBounds(r2, r0, r4, r3)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            r7.draw(r0)
        L2f:
            java.lang.String r0 = "android.intent.extra.shortcut.ICON"
            r6.putExtra(r0, r1)
            return
        L35:
            java.lang.String r0 = r5.getResPackage()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            r4 = 0
            android.content.Context r2 = r8.createPackageContext(r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            if (r7 != 0) goto L4c
            java.lang.String r1 = "android.intent.extra.shortcut.ICON_RESOURCE"
            int r0 = r5.mInt1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            android.content.Intent$ShortcutIconResource r0 = android.content.Intent.ShortcutIconResource.fromContext(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            r6.putExtra(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            goto Lab
        L4c:
            int r0 = r5.mInt1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            android.graphics.drawable.Drawable r3 = androidx.core.content.ContextCompat.getDrawable(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            int r0 = r3.getIntrinsicWidth()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            if (r0 <= 0) goto L80
            int r0 = r3.getIntrinsicHeight()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            if (r0 <= 0) goto L80
            int r2 = r3.getIntrinsicWidth()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            int r1 = r3.getIntrinsicHeight()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            android.graphics.Bitmap r1 = p003X.C116971W2r.LIZ(r2, r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
        L6c:
            int r2 = r1.getWidth()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            int r0 = r1.getHeight()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            r3.setBounds(r4, r4, r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            android.graphics.Canvas r0 = new android.graphics.Canvas     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            r0.<init>(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            r3.draw(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            goto L18
        L80:
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            int r1 = r0.getLauncherLargeIconSize()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            android.graphics.Bitmap r1 = p003X.C116971W2r.LIZ(r1, r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lac
            goto L6c
        L93:
            java.lang.Object r1 = r5.mObj1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r7 == 0) goto L2f
            android.graphics.Bitmap$Config r0 = r1.getConfig()
            android.graphics.Bitmap r1 = r1.copy(r0, r2)
            goto L18
        La3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Icon type not supported for intent shortcuts"
            r1.<init>(r0)
            throw r1
        Lab:
            return
        Lac:
            r3 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Can't find package "
            r1.<init>(r0)
            java.lang.Object r0 = r5.mObj1
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.addToShortcutIntent(android.content.Intent, android.graphics.drawable.Drawable, android.content.Context):void");
    }
}
