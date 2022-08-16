package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.setting.TiktokSkinHelper;
import java.lang.reflect.Field;
import java.util.Map;
import p003X.C116971W2r;

/* loaded from: classes2.dex */
public class ResourcesFlusher {
    public static Field sDrawableCacheField;
    public static boolean sDrawableCacheFieldFetched;
    public static Field sResourcesImplField;
    public static boolean sResourcesImplFieldFetched;
    public static Class<?> sThemedResourceCacheClazz;
    public static boolean sThemedResourceCacheClazzFetched;
    public static Field sThemedResourceCache_mUnthemedEntriesField;
    public static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched;

    static {
        Covode.recordClassIndex(484);
    }

    public static void flush(Resources resources) {
        m21200xead3ca1f(resources);
    }

    /* renamed from: androidx_appcompat_app_ResourcesFlusher_com_ss_android_ugc_aweme_lancet_ActivityLancet_flush */
    public static void m21200xead3ca1f(Resources resources) {
        TiktokSkinHelper.flush(resources);
    }

    public static void androidx_appcompat_app_ResourcesFlusher__flush$___twin___(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            flushNougats(resources);
        } else if (Build.VERSION.SDK_INT >= 23) {
            flushMarshmallows(resources);
        } else {
            int i = Build.VERSION.SDK_INT;
            flushLollipops(resources);
        }
    }

    public static void flushLollipops(Resources resources) {
        if (!sDrawableCacheFieldFetched) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                sDrawableCacheField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            sDrawableCacheFieldFetched = true;
        }
        Field field = sDrawableCacheField;
        if (field != null) {
            try {
                Map map = (Map) field.get(resources);
                if (map != null) {
                    map.clear();
                }
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public static void flushMarshmallows(Resources resources) {
        if (!sDrawableCacheFieldFetched) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                sDrawableCacheField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            sDrawableCacheFieldFetched = true;
        }
        Object obj = null;
        Field field = sDrawableCacheField;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
            if (obj != null) {
                flushThemedResourcesCache(obj);
            }
        }
    }

    public static void flushThemedResourcesCache(Object obj) {
        if (!sThemedResourceCacheClazzFetched) {
            try {
                sThemedResourceCacheClazz = C116971W2r.LIZ("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            sThemedResourceCacheClazzFetched = true;
        }
        Class<?> cls = sThemedResourceCacheClazz;
        if (cls == null) {
            return;
        }
        if (!sThemedResourceCache_mUnthemedEntriesFieldFetched) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                sThemedResourceCache_mUnthemedEntriesField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            sThemedResourceCache_mUnthemedEntriesFieldFetched = true;
        }
        Field field = sThemedResourceCache_mUnthemedEntriesField;
        if (field == null) {
            return;
        }
        try {
            LongSparseArray longSparseArray = (LongSparseArray) field.get(obj);
            if (longSparseArray != null) {
                longSparseArray.clear();
            }
        } catch (IllegalAccessException unused3) {
        }
    }

    public static void flushNougats(Resources resources) {
        if (!sResourcesImplFieldFetched) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                sResourcesImplField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            sResourcesImplFieldFetched = true;
        }
        Field field = sResourcesImplField;
        if (field == null) {
            return;
        }
        Object obj = null;
        try {
            Object obj2 = field.get(resources);
            if (obj2 != null) {
                if (!sDrawableCacheFieldFetched) {
                    try {
                        Field declaredField2 = obj2.getClass().getDeclaredField("mDrawableCache");
                        sDrawableCacheField = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException unused2) {
                    }
                    sDrawableCacheFieldFetched = true;
                }
                Field field2 = sDrawableCacheField;
                if (field2 != null) {
                    try {
                        obj = field2.get(obj2);
                    } catch (IllegalAccessException unused3) {
                    }
                    if (obj != null) {
                        flushThemedResourcesCache(obj);
                    }
                }
            }
        } catch (IllegalAccessException unused4) {
        }
    }
}
