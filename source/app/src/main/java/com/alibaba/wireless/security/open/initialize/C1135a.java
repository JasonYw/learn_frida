package com.alibaba.wireless.security.open.initialize;

import android.content.Context;
import com.alibaba.wireless.security.framework.ISGPluginManager;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.IInitializeComponent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alibaba.wireless.security.open.initialize.a */
/* loaded from: classes2.dex */
public class C1135a implements IInitializeComponent {

    /* renamed from: a */
    public C1136b f21836a;

    static {
        Covode.recordClassIndex(4575);
    }

    public C1135a() {
        this.f21836a = new C1136b();
    }

    public C1135a(String str) {
        this.f21836a = new C1136b(str);
    }

    /* renamed from: a */
    public ISGPluginManager m19683a() {
        return this.f21836a.m19682a();
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public int initialize(Context context) {
        return loadLibrarySync(context);
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public void initializeAsync(Context context) {
        try {
            loadLibraryAsync(context);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public boolean isSoValid(Context context) {
        return this.f21836a.m19681a(context);
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public void loadLibraryAsync(Context context) {
        this.f21836a.m19676b(context, null, true, false);
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public int loadLibrarySync(Context context) {
        return this.f21836a.m19680a(context, null, true, false);
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public int loadLibrarySync(Context context, String str) {
        return this.f21836a.m19680a(context, str, true, false);
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public void registerInitFinishListener(IInitializeComponent.IInitFinishListener iInitFinishListener) {
        this.f21836a.m19679a(iInitFinishListener);
    }

    @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent
    public void unregisterInitFinishListener(IInitializeComponent.IInitFinishListener iInitFinishListener) {
        this.f21836a.m19675b(iInitFinishListener);
    }
}
