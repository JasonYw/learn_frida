package androidx.media.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.support.p007v4.media.MediaBrowserCompat;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.support.p007v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import java.util.List;
import p003X.C116971W2r;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.C143713eKp;

/* loaded from: classes18.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(1522);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        m21131x468e2a2a(this, context, intent);
    }

    public static ComponentName getMediaButtonReceiverComponent(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ResolveInfo resolveInfo = queryBroadcastReceivers.get(0);
            return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        queryBroadcastReceivers.size();
        return null;
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, long j) {
        ComponentName mediaButtonReceiverComponent = getMediaButtonReceiverComponent(context);
        if (mediaButtonReceiverComponent == null) {
            return null;
        }
        return buildMediaButtonPendingIntent(context, mediaButtonReceiverComponent, j);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            C116971W2r.LIZJ(context, intent);
        }
    }

    public static KeyEvent handleIntent(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat != null && intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            mediaSessionCompat.getController().LIZ(keyEvent);
            return keyEvent;
        }
        return null;
    }

    public static ComponentName getServiceComponentByAction(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = queryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    public void androidx_media_session_MediaButtonReceiver__onReceive$___twin___(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName serviceComponentByAction = getServiceComponentByAction(context, "android.intent.action.MEDIA_BUTTON");
            if (serviceComponentByAction != null) {
                intent.setComponent(serviceComponentByAction);
                startForegroundService(context, intent);
                return;
            }
            ComponentName serviceComponentByAction2 = getServiceComponentByAction(context, "android.media.browse.MediaBrowserService");
            if (serviceComponentByAction2 != null) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                C143713eKp c143713eKp = new C143713eKp(applicationContext, intent, goAsync);
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, serviceComponentByAction2, c143713eKp, null);
                c143713eKp.LIZJ = mediaBrowserCompat;
                mediaBrowserCompat.LIZIZ.LIZJ();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
    }

    /* renamed from: androidx_media_session_MediaButtonReceiver_com_ss_android_ugc_aweme_lancet_JatoBoostLancet_onBroadcastReceiverReceive */
    public static void m21131x468e2a2a(MediaButtonReceiver mediaButtonReceiver, Context context, Intent intent) {
        if (!AppMonitor.INSTANCE.isAppBackground() && intent != null && !C140192dPo.LIZIZ.contains(intent.getAction()) && C140192dPo.LIZ("onBroadcastReceiverReceive")) {
            C140181dPd.m21607LJ();
        }
        mediaButtonReceiver.androidx_media_session_MediaButtonReceiver__onReceive$___twin___(context, intent);
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, ComponentName componentName, long j) {
        int keyCode;
        if (componentName == null || (keyCode = PlaybackStateCompat.toKeyCode(j)) == 0) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, keyCode));
        return PendingIntent.getBroadcast(context, keyCode, intent, 0);
    }
}
