package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p003X.C116971W2r;
import p003X.GN0;
import p003X.GN2;
import p003X.GN5;

/* loaded from: classes2.dex */
public final class NotificationManagerCompat {
    public static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    public static String sEnabledNotificationListeners;
    public static GN5 sSideChannelManager;
    public final Context mContext;
    public final NotificationManager mNotificationManager;
    public static final Object sEnabledNotificationListenersLock = new Object();
    public static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    public static final Object sLock = new Object();

    /* renamed from: androidx.core.app.NotificationManagerCompat$e */
    /* loaded from: classes2.dex */
    public interface AbstractC0240e {
        static {
            Covode.recordClassIndex(914);
        }

        void LIZ(GN2 gn2);
    }

    /* renamed from: androidx_core_app_NotificationManagerCompat_android_provider_Settings$Secure_getString */
    public static String m21182x684cb0a5(ContentResolver contentResolver, String str) {
        ActionInvokeEntrance.setEventUuid(102004);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(Settings.Secure.class, new Object[]{contentResolver, str}, 102004, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String LIZ = C116971W2r.LIZ(contentResolver, str);
        ActionInvokeEntrance.actionInvoke(LIZ, Settings.Secure.class, new Object[]{contentResolver, str}, 102004, "androidx_core_app_NotificationManagerCompat_android_provider_Settings$Secure_getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        return LIZ;
    }

    public final void cancelAll() {
        this.mNotificationManager.cancelAll();
        int i = Build.VERSION.SDK_INT;
    }

    public final int getImportance() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.mNotificationManager.getImportance();
        }
        return -1000;
    }

    static {
        Covode.recordClassIndex(908);
    }

    public final List<NotificationChannelGroup> getNotificationChannelGroups() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannelGroups();
        }
        return Collections.emptyList();
    }

    public final List<NotificationChannel> getNotificationChannels() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannels();
        }
        return Collections.emptyList();
    }

    public final boolean areNotificationsEnabled() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.mNotificationManager.areNotificationsEnabled();
        }
        int i = Build.VERSION.SDK_INT;
        Object systemService = this.mContext.getSystemService("appops");
        ApplicationInfo applicationInfo = this.mContext.getApplicationInfo();
        String packageName = this.mContext.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class LIZ = C116971W2r.LIZ(AppOpsManager.class.getName());
            if (((Integer) LIZ.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(systemService, Integer.valueOf(((Integer) LIZ.getDeclaredField(OP_POST_NOTIFICATION).get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public final void cancel(int i) {
        cancel(null, i);
    }

    public final void createNotificationChannel(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public final void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public final void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannelGroups(list);
        }
    }

    public final void createNotificationChannels(List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannels(list);
        }
    }

    public final void deleteNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.deleteNotificationChannel(str);
        }
    }

    public final void deleteNotificationChannelGroup(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.deleteNotificationChannelGroup(str);
        }
    }

    public final NotificationChannel getNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannel(str);
        }
        return null;
    }

    public NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) this.mContext.getSystemService("notification");
    }

    public static boolean useSideChannelForNotification(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        if (extras != null && extras.getBoolean("android.support.useSideChannel")) {
            return true;
        }
        return false;
    }

    private void pushSideChannelQueue(AbstractC0240e abstractC0240e) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                sSideChannelManager = new GN5(this.mContext.getApplicationContext());
            }
            sSideChannelManager.LIZ.obtainMessage(0, abstractC0240e).sendToTarget();
        }
    }

    public final NotificationChannelGroup getNotificationChannelGroup(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.mNotificationManager.getNotificationChannelGroup(str);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            for (NotificationChannelGroup notificationChannelGroup : getNotificationChannelGroups()) {
                if (notificationChannelGroup.getId().equals(str)) {
                    return notificationChannelGroup;
                }
            }
        }
        return null;
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String m21182x684cb0a5 = m21182x684cb0a5(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (sEnabledNotificationListenersLock) {
            if (m21182x684cb0a5 != null) {
                if (!m21182x684cb0a5.equals(sEnabledNotificationListeners)) {
                    String[] split = m21182x684cb0a5.split(Constants.COLON_SEPARATOR, -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    sEnabledNotificationListenerPackages = hashSet;
                    sEnabledNotificationListeners = m21182x684cb0a5;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    public final void notify(int i, Notification notification) {
        notify(null, i, notification);
    }

    public final void cancel(String str, int i) {
        this.mNotificationManager.cancel(str, i);
        int i2 = Build.VERSION.SDK_INT;
    }

    public final void notify(String str, int i, Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new GN0(this.mContext.getPackageName(), i, str, notification));
            this.mNotificationManager.cancel(str, i);
            return;
        }
        this.mNotificationManager.notify(str, i, notification);
    }
}
