package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import p003X.AbstractC109833TMd;
import p003X.AbstractC142821e6R;
import p003X.AbstractC142822e6S;
import p003X.C115406Vbs;
import p003X.C142823e6T;
import p003X.G4H;
import p003X.SharedElementCallbackC109832TMc;

/* loaded from: classes18.dex */
public class ActivityCompat extends ContextCompat {
    public static AbstractC142821e6R sDelegate;

    static {
        Covode.recordClassIndex(874);
    }

    /* renamed from: androidx_core_app_ActivityCompat_android_app_Activity_requestPermissions */
    public static void m21187xd5ccb811(Activity activity, String[] strArr, int i) {
        ActionInvokeEntrance.setEventUuid(102600);
        if (((Boolean) ActionInvokeEntrance.actionIntercept(activity, new Object[]{strArr, Integer.valueOf(i)}, 102600, "void", false, null, false).first).booleanValue()) {
            return;
        }
        ActionInvokeEntrance.actionInvoke(null, activity, new Object[]{strArr, Integer.valueOf(i)}, 102600, "androidx_core_app_ActivityCompat_android_app_Activity_requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V");
        activity.requestPermissions(strArr, i);
    }

    public static AbstractC142821e6R getPermissionCompatDelegate() {
        return sDelegate;
    }

    public static void setPermissionCompatDelegate(AbstractC142821e6R abstractC142821e6R) {
        sDelegate = abstractC142821e6R;
    }

    public static void finishAffinity(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        activity.finishAffinity();
    }

    public static void finishAfterTransition(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        activity.finishAfterTransition();
    }

    public static boolean invalidateOptionsMenu(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static void postponeEnterTransition(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        activity.postponeEnterTransition();
    }

    public static void startPostponedEnterTransition(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        activity.startPostponedEnterTransition();
    }

    public static void recreate(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!C115406Vbs.LIZ(activity)) {
            activity.recreate();
        }
    }

    public static Uri getReferrer(Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static C142823e6T requestDragAndDropPermissions(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions requestDragAndDropPermissions;
        if (Build.VERSION.SDK_INT >= 24 && (requestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent)) != null) {
            return new C142823e6T(requestDragAndDropPermissions);
        }
        return null;
    }

    public static <T extends View> T requireViewById(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) activity.requireViewById(i);
        }
        T t = (T) activity.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void setEnterSharedElementCallback(Activity activity, AbstractC109833TMd abstractC109833TMd) {
        SharedElementCallbackC109832TMc sharedElementCallbackC109832TMc;
        int i = Build.VERSION.SDK_INT;
        if (abstractC109833TMd != null) {
            sharedElementCallbackC109832TMc = new SharedElementCallbackC109832TMc(abstractC109833TMd);
        } else {
            sharedElementCallbackC109832TMc = null;
        }
        activity.setEnterSharedElementCallback(sharedElementCallbackC109832TMc);
    }

    public static void setExitSharedElementCallback(Activity activity, AbstractC109833TMd abstractC109833TMd) {
        SharedElementCallbackC109832TMc sharedElementCallbackC109832TMc;
        int i = Build.VERSION.SDK_INT;
        if (abstractC109833TMd != null) {
            sharedElementCallbackC109832TMc = new SharedElementCallbackC109832TMc(abstractC109833TMd);
        } else {
            sharedElementCallbackC109832TMc = null;
        }
        activity.setExitSharedElementCallback(sharedElementCallbackC109832TMc);
    }

    public static void requestPermissions(final Activity activity, final String[] strArr, final int i) {
        AbstractC142821e6R abstractC142821e6R = sDelegate;
        if (abstractC142821e6R != null && abstractC142821e6R.LIZ()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof AbstractC142822e6S) {
                ((AbstractC142822e6S) activity).validateRequestPermissionsRequestCode(i);
            }
            m21187xd5ccb811(activity, strArr, i);
        } else if (activity instanceof G4H) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.ActivityCompat.1
                static {
                    Covode.recordClassIndex(875);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr[i2] = packageManager.checkPermission(strArr[i2], packageName);
                    }
                    ((G4H) activity).onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        }
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle) {
        int i2 = Build.VERSION.SDK_INT;
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void startIntentSenderForResult(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        int i5 = Build.VERSION.SDK_INT;
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
