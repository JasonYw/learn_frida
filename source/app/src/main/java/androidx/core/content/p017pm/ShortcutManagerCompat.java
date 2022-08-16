package androidx.core.content.p017pm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import androidx.core.content.p017pm.ShortcutInfoCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC65221BoN;
import p003X.C116971W2r;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.C65220BoM;

/* renamed from: androidx.core.content.pm.ShortcutManagerCompat */
/* loaded from: classes26.dex */
public class ShortcutManagerCompat {
    public static volatile AbstractC65221BoN<?> sShortcutInfoCompatSaver;

    static {
        Covode.recordClassIndex(952);
    }

    public static int getMaxShortcutCountPerActivity(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 0;
    }

    public static void removeAllDynamicShortcuts(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        getShortcutInfoSaverInstance(context);
    }

    public static AbstractC65221BoN<?> getShortcutInfoSaverInstance(Context context) {
        if (sShortcutInfoCompatSaver == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    sShortcutInfoCompatSaver = (AbstractC65221BoN) C116971W2r.LIZ("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (sShortcutInfoCompatSaver == null) {
                sShortcutInfoCompatSaver = new C65220BoM();
            }
        }
        return sShortcutInfoCompatSaver;
    }

    public static List<ShortcutInfoCompat> getDynamicShortcuts(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                arrayList.add(new ShortcutInfoCompat.Builder(context, shortcutInfo).build());
            }
            return arrayList;
        }
        try {
            getShortcutInfoSaverInstance(context);
            return new ArrayList();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isRequestPinShortcutSupported(android.content.Context r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L13
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r5.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r0 = r0.isRequestPinShortcutSupported()
            return r0
        L13:
            java.lang.String r4 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r5, r4)
            r3 = 0
            if (r0 == 0) goto L1d
            return r3
        L1d:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r1.<init>(r0)
            java.util.List r0 = r2.queryBroadcastReceivers(r1, r3)
            java.util.Iterator r2 = r0.iterator()
        L30:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r2.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r1 = r0.permission
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L4c
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L30
        L4c:
            r0 = 1
            return r0
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p017pm.ShortcutManagerCompat.isRequestPinShortcutSupported(android.content.Context):boolean");
    }

    public static void removeDynamicShortcuts(Context context, List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        getShortcutInfoSaverInstance(context);
    }

    public static boolean addDynamicShortcuts(Context context, List<ShortcutInfoCompat> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList();
            for (ShortcutInfoCompat shortcutInfoCompat : list) {
                arrayList.add(shortcutInfoCompat.toShortcutInfo());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context);
        return true;
    }

    public static Intent createShortcutResultIntent(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        Intent intent;
        if (Build.VERSION.SDK_INT < 26 || (intent = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(shortcutInfoCompat.toShortcutInfo())) == null) {
            intent = new Intent();
        }
        shortcutInfoCompat.addToIntent(intent);
        return intent;
    }

    public static boolean updateShortcuts(Context context, List<ShortcutInfoCompat> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList();
            for (ShortcutInfoCompat shortcutInfoCompat : list) {
                arrayList.add(shortcutInfoCompat.toShortcutInfo());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context);
        return true;
    }

    public static boolean requestPinShortcut(Context context, ShortcutInfoCompat shortcutInfoCompat, final IntentSender intentSender) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(shortcutInfoCompat.toShortcutInfo(), intentSender);
        }
        if (!isRequestPinShortcutSupported(context)) {
            return false;
        }
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        shortcutInfoCompat.addToIntent(intent);
        if (intentSender == null) {
            context.sendBroadcast(intent);
            return true;
        }
        context.sendOrderedBroadcast(intent, null, new BroadcastReceiver() { // from class: androidx.core.content.pm.ShortcutManagerCompat.1
            static {
                Covode.recordClassIndex(953);
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent2) {
                if (!AppMonitor.INSTANCE.isAppBackground() && intent2 != null && !C140192dPo.LIZIZ.contains(intent2.getAction()) && C140192dPo.LIZ("onBroadcastReceiverReceive")) {
                    C140181dPd.m21607LJ();
                }
                try {
                    intentSender.sendIntent(context2, 0, null, null, null);
                } catch (IntentSender.SendIntentException unused) {
                }
            }
        }, null, -1, null, null);
        return true;
    }
}
