package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p003X.C116971W2r;
import p003X.C76774GOq;

/* loaded from: classes2.dex */
public class ContextCompat {
    public static final Object sLock = new Object();
    public static TypedValue sTempValue;

    static {
        Covode.recordClassIndex(942);
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getCodeCacheDir();
    }

    public static File[] getExternalCacheDirs(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getExternalCacheDirs();
    }

    public static File getNoBackupFilesDir(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getNoBackupFilesDir();
    }

    public static File[] getObbDirs(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getObbDirs();
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    public static synchronized File createFilesDir(File file) {
        synchronized (ContextCompat.class) {
            if (!file.exists() && !file.mkdirs()) {
                if (file.exists()) {
                    return file;
                }
                return null;
            }
            return file;
        }
    }

    public static File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.getDataDir();
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static Executor getMainExecutor(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return context.getMainExecutor();
        }
        final Handler handler = new Handler(context.getMainLooper());
        return new Executor(handler) { // from class: X.6mJ
            public final Handler LIZ;

            static {
                Covode.recordClassIndex(944);
            }

            {
                this.LIZ = handler;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                if (this.LIZ.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(this.LIZ + " is shutting down");
            }
        };
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static Drawable getDrawable(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return context.getDrawable(i);
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        int i = Build.VERSION.SDK_INT;
        return context.getExternalFilesDirs(str);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            C116971W2r.LIZJ(context, intent);
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static int getColor(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C116971W2r.LIZIZ(context, i);
        }
        return C116971W2r.LIZ(context.getResources(), i);
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return (T) context.getSystemService(cls);
        }
        String systemServiceName = getSystemServiceName(context, cls);
        if (systemServiceName != null) {
            return (T) context.getSystemService(systemServiceName);
        }
        return null;
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getSystemServiceName(cls);
        }
        return C76774GOq.LIZ.get(cls);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        C116971W2r.LIZ(context, intent, bundle);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        context.startActivities(intentArr, bundle);
        return true;
    }
}
