package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC74804FeY;

/* loaded from: classes2.dex */
public class CoreComponentFactory extends AppComponentFactory {
    static {
        Covode.recordClassIndex(883);
    }

    public static <T> T LIZ(T t) {
        T t2;
        if ((t instanceof AbstractC74804FeY) && (t2 = (T) ((AbstractC74804FeY) t).LIZ()) != null) {
            return t2;
        }
        return t;
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) LIZ(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) LIZ(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) LIZ(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) LIZ(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) LIZ(super.instantiateService(classLoader, str, intent));
    }
}
