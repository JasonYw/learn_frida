package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p003X.G4D;
import p003X.G4E;

/* renamed from: androidx.appcompat.widget.ai */
/* loaded from: classes2.dex */
public final class C0219ai extends ContextWrapper {
    public static final Object LIZ = new Object();
    public static ArrayList<WeakReference<C0219ai>> LIZIZ;
    public final Resources LIZJ;
    public final Resources.Theme LIZLLL;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.LIZJ;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return this.LIZJ.getAssets();
    }

    static {
        Covode.recordClassIndex(694);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.LIZLLL;
        if (theme == null) {
            return super.getTheme();
        }
        return theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        Resources.Theme theme = this.LIZLLL;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }

    public C0219ai(Context context) {
        super(context);
        if (G4E.LIZ()) {
            this.LIZJ = new G4E(this, context.getResources());
            this.LIZLLL = this.LIZJ.newTheme();
            this.LIZLLL.setTo(context.getTheme());
            return;
        }
        this.LIZJ = new G4D(this, context.getResources());
        this.LIZLLL = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        if ((r1.getResources() instanceof p003X.G4E) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Context LIZ(android.content.Context r5) {
        /*
            android.content.res.Resources r0 = r5.getResources()
            boolean r1 = r0 instanceof com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper
            r4 = 1
            r0 = 0
            if (r1 == 0) goto L25
            boolean r0 = r5 instanceof androidx.appcompat.widget.C0219ai
            if (r0 != 0) goto L24
            android.content.res.Resources r1 = r5.getResources()
            com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper r1 = (com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper) r1
            android.content.res.Resources r0 = r1.getResources()
            boolean r0 = r0 instanceof p003X.G4D
            if (r0 != 0) goto L24
            android.content.res.Resources r0 = r1.getResources()
            boolean r0 = r0 instanceof p003X.G4E
            if (r0 == 0) goto L25
        L24:
            return r5
        L25:
            boolean r0 = r5 instanceof androidx.appcompat.widget.C0219ai
            if (r0 != 0) goto L24
            android.content.res.Resources r0 = r5.getResources()
            boolean r0 = r0 instanceof p003X.G4D
            if (r0 != 0) goto L24
            android.content.res.Resources r0 = r5.getResources()
            boolean r0 = r0 instanceof p003X.G4E
            if (r0 != 0) goto L24
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            boolean r0 = p003X.G4E.LIZ()
            if (r0 == 0) goto L24
            java.lang.Object r3 = androidx.appcompat.widget.C0219ai.LIZ
            monitor-enter(r3)
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.ai>> r0 = androidx.appcompat.widget.C0219ai.LIZIZ     // Catch: java.lang.Throwable -> Lab
            if (r0 != 0) goto L62
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lab
            r0.<init>()     // Catch: java.lang.Throwable -> Lab
            androidx.appcompat.widget.C0219ai.LIZIZ = r0     // Catch: java.lang.Throwable -> Lab
        L51:
            androidx.appcompat.widget.ai r2 = new androidx.appcompat.widget.ai     // Catch: java.lang.Throwable -> Lab
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Lab
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.ai>> r1 = androidx.appcompat.widget.C0219ai.LIZIZ     // Catch: java.lang.Throwable -> Lab
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lab
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lab
            r1.add(r0)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lab
            goto La9
        L62:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.ai>> r0 = androidx.appcompat.widget.C0219ai.LIZIZ     // Catch: java.lang.Throwable -> Lab
            int r1 = r0.size()     // Catch: java.lang.Throwable -> Lab
            int r1 = r1 - r4
        L69:
            if (r1 < 0) goto L83
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.ai>> r0 = androidx.appcompat.widget.C0219ai.LIZIZ     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lab
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lab
            if (r0 != 0) goto L80
        L7b:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.ai>> r0 = androidx.appcompat.widget.C0219ai.LIZIZ     // Catch: java.lang.Throwable -> Lab
            r0.remove(r1)     // Catch: java.lang.Throwable -> Lab
        L80:
            int r1 = r1 + (-1)
            goto L69
        L83:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.ai>> r0 = androidx.appcompat.widget.C0219ai.LIZIZ     // Catch: java.lang.Throwable -> Lab
            int r2 = r0.size()     // Catch: java.lang.Throwable -> Lab
            int r2 = r2 - r4
        L8a:
            if (r2 < 0) goto L51
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.ai>> r0 = androidx.appcompat.widget.C0219ai.LIZIZ     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Lab
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto La6
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> Lab
            androidx.appcompat.widget.ai r1 = (androidx.appcompat.widget.C0219ai) r1     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto La6
            android.content.Context r0 = r1.getBaseContext()     // Catch: java.lang.Throwable -> Lab
            if (r0 != r5) goto La6
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lab
            goto Laa
        La6:
            int r2 = r2 + (-1)
            goto L8a
        La9:
            return r2
        Laa:
            return r1
        Lab:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lab
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0219ai.LIZ(android.content.Context):android.content.Context");
    }
}
