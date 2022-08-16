package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.C64835Bi9;
import p003X.GO4;

/* loaded from: classes2.dex */
public class FileProvider extends ContentProvider {
    public static final String[] COLUMNS = {"_display_name", "_size"};
    public static final File DEVICE_ROOT = new File("/");
    public static HashMap<String, AbstractC0242a> sCache = new HashMap<>();
    public Object mLazyProviderInfo;
    public AbstractC0242a mStrategy;

    /* renamed from: androidx.core.content.FileProvider$a */
    /* loaded from: classes26.dex */
    public interface AbstractC0242a {
        static {
            Covode.recordClassIndex(946);
        }

        Uri LIZ(File file);

        File LIZ(Uri uri);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        m21181x48217556(this, context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return m21180x1ad9b7ee(this, uri, str, strArr);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return m21179xdf790dcd(this, uri);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return m21178x7c550869(this, uri, str);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return m21177x7d7b1225(this, uri, strArr, str, strArr2, str2);
    }

    static {
        Covode.recordClassIndex(945);
    }

    public String androidx_core_content_FileProvider__getType$___twin___(Uri uri) {
        File LIZ = this.mStrategy.LIZ(uri);
        int lastIndexOf = LIZ.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(LIZ.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    public static int modeToMode(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                return 704643072;
            }
            if ("rw".equals(str)) {
                return 939524096;
            }
            if ("rwt".equals(str)) {
                return 1006632960;
            }
            throw new IllegalArgumentException(C0002O.m25086C("Invalid mode: ", str));
        }
        return 738197504;
    }

    public static Object[] copyOf(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    public ParcelFileDescriptor androidx_core_content_FileProvider__openFile$___twin___(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.mStrategy.LIZ(uri), modeToMode(str));
    }

    public static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_launch_LazyFileProvider_getType */
    public static String m21179xdf790dcd(FileProvider fileProvider, Uri uri) {
        if (fileProvider != null && (fileProvider instanceof FileProvider)) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                }
            }
        }
        return fileProvider.androidx_core_content_FileProvider__getType$___twin___(uri);
    }

    public static AbstractC0242a getPathStrategy(Context context, String str) {
        AbstractC0242a abstractC0242a;
        synchronized (sCache) {
            abstractC0242a = sCache.get(str);
            if (abstractC0242a == null) {
                try {
                    abstractC0242a = parsePathStrategy(context, str);
                    sCache.put(str, abstractC0242a);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return abstractC0242a;
    }

    public void androidx_core_content_FileProvider__attachInfo$___twin___(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                this.mStrategy = getPathStrategy(context, providerInfo.authority);
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    public static AbstractC0242a parsePathStrategy(Context context, String str) {
        File file;
        C64835Bi9 c64835Bi9 = new C64835Bi9(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData == null) {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
            while (true) {
                int next = loadXmlMetaData.next();
                if (next != 1) {
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            file = DEVICE_ROOT;
                        } else if ("files-path".equals(name)) {
                            file = C116971W2r.LIZJ(context);
                        } else if ("cache-path".equals(name)) {
                            file = C116971W2r.LIZIZ(context);
                        } else if ("external-path".equals(name)) {
                            file = C116971W2r.LIZIZ();
                        } else if ("external-files-path".equals(name)) {
                            File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(context, null);
                            if (externalFilesDirs.length > 0) {
                                file = externalFilesDirs[0];
                            } else {
                                continue;
                            }
                        } else if ("external-cache-path".equals(name)) {
                            File[] externalCacheDirs = ContextCompat.getExternalCacheDirs(context);
                            if (externalCacheDirs.length > 0) {
                                file = externalCacheDirs[0];
                            } else {
                                continue;
                            }
                        } else {
                            int i = Build.VERSION.SDK_INT;
                            if ("external-media-path".equals(name)) {
                                File[] externalMediaDirs = context.getExternalMediaDirs();
                                if (externalMediaDirs.length > 0) {
                                    file = externalMediaDirs[0];
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        if (file != null) {
                            File buildPath = buildPath(file, attributeValue2);
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    c64835Bi9.LIZ.put(attributeValue, buildPath.getCanonicalFile());
                                } catch (IOException e) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + buildPath, e);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    return c64835Bi9;
                }
            }
        } else {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        return getPathStrategy(context, str).LIZ(file);
    }

    public int androidx_core_content_FileProvider__delete$___twin___(Uri uri, String str, String[] strArr) {
        if (C116971W2r.LIZ(this.mStrategy.LIZ(uri))) {
            return 1;
        }
        return 0;
    }

    /* renamed from: androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_launch_LazyFileProvider_openFile */
    public static ParcelFileDescriptor m21178x7c550869(FileProvider fileProvider, Uri uri, String str) {
        if (fileProvider != null && (fileProvider instanceof FileProvider)) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                }
            }
        }
        return fileProvider.androidx_core_content_FileProvider__openFile$___twin___(uri, str);
    }

    /* renamed from: androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_launch_LazyFileProvider_attachInfo */
    public static void m21181x48217556(FileProvider fileProvider, Context context, ProviderInfo providerInfo) {
        if (fileProvider != null && (fileProvider instanceof FileProvider)) {
            if (fileProvider.getContext() == null) {
                if (!PatchProxy.proxy(new Object[]{providerInfo}, null, GO4.LIZ, true, 6).isSupported) {
                    if (!providerInfo.exported) {
                        if (!providerInfo.grantUriPermissions) {
                            throw new SecurityException("Provider must grant uri permissions");
                        }
                    } else {
                        throw new SecurityException("Provider must not be exported");
                    }
                }
                fileProvider.mLazyProviderInfo = providerInfo;
                providerInfo.grantUriPermissions = false;
                try {
                    fileProvider.androidx_core_content_FileProvider__attachInfo$___twin___(context, providerInfo);
                } catch (SecurityException unused) {
                }
                providerInfo.grantUriPermissions = true;
                return;
            }
            fileProvider.androidx_core_content_FileProvider__attachInfo$___twin___(context, providerInfo);
            return;
        }
        fileProvider.androidx_core_content_FileProvider__attachInfo$___twin___(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    /* renamed from: androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_launch_LazyFileProvider_delete */
    public static int m21180x1ad9b7ee(FileProvider fileProvider, Uri uri, String str, String[] strArr) {
        if (fileProvider != null && (fileProvider instanceof FileProvider)) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                }
            }
        }
        return fileProvider.androidx_core_content_FileProvider__delete$___twin___(uri, str, strArr);
    }

    public Cursor androidx_core_content_FileProvider__query$___twin___(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File LIZ = this.mStrategy.LIZ(uri);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = LIZ.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(LIZ.length());
            }
            i2 = i;
        }
        String[] copyOf = copyOf(strArr3, i2);
        Object[] copyOf2 = copyOf(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
    }

    /* renamed from: androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_launch_LazyFileProvider_query */
    public static Cursor m21177x7d7b1225(FileProvider fileProvider, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (fileProvider != null && (fileProvider instanceof FileProvider)) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                }
            }
        }
        return fileProvider.androidx_core_content_FileProvider__query$___twin___(uri, strArr, str, strArr2, str2);
    }
}
