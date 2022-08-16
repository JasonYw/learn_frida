package com.bytedance.android.live.browser.jsbridge.p310g;

import android.content.Intent;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.Fragment;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.browser.api.UploadApi;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.room.c$b;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.live.audio.AbstractC9495c;
import com.bytedance.android.livesdkapi.depend.model.live.audio.ThemeShowArea;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.C13052h;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.disposables.Disposable;
import java.io.File;
import p003X.AbstractC81969ISl;
import p003X.C100839PnV;
import p003X.C88306Kqq;
import p003X.C88359Krh;
import p003X.C88440Kt0;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.browser.jsbridge.g.o */
/* loaded from: classes5.dex */
public final class C3981o extends AbstractC13049f<C3982a, C3983b> implements c$b {
    public static ChangeQuickRedirect LIZ;
    public AbstractC81969ISl LIZIZ;
    public Fragment LIZJ;
    public Disposable LIZLLL;

    /* renamed from: LJ */
    public int f26144LJ;

    /* renamed from: com.bytedance.android.live.browser.jsbridge.g.o$a */
    /* loaded from: classes5.dex */
    public static final class C3982a {
        @SerializedName("aspect_x")
        public int LIZ;
        @SerializedName("aspect_y")
        public int LIZIZ;
        @SerializedName("min_width")
        public int LIZJ;
        @SerializedName("min_height")
        public int LIZLLL;
        @SerializedName("max_size")

        /* renamed from: LJ */
        public int f26145LJ;

        static {
            Covode.recordClassIndex(22388);
        }
    }

    static {
        Covode.recordClassIndex(22386);
    }

    @Override // com.bytedance.android.live.room.c$b
    public final void LIZ(String str, int i) {
        boolean z = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, LIZ, false, 8).isSupported;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        AbstractC81969ISl abstractC81969ISl = this.LIZIZ;
        if (abstractC81969ISl != null) {
            abstractC81969ISl.LIZIZ();
            this.LIZIZ = null;
        }
        finishWithFailure();
    }

    @Override // com.bytedance.android.live.room.c$b
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        LIZ();
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final void onTerminate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        Disposable disposable = this.LIZLLL;
        if (disposable != null) {
            disposable.dispose();
        }
        this.LIZJ = null;
        this.LIZIZ.LIZIZ();
    }

    public C3981o(Fragment fragment) {
        this.LIZJ = fragment;
    }

    /* renamed from: com.bytedance.android.live.browser.jsbridge.g.o$b */
    /* loaded from: classes5.dex */
    public static final class C3983b {
        @SerializedName("uri")
        public String LIZ;
        @SerializedName(PushConstants.WEB_URL)
        public String LIZIZ;

        static {
            Covode.recordClassIndex(22389);
        }

        public C3983b(String str, String str2) {
            this.LIZ = str;
            this.LIZIZ = str2;
        }

        public /* synthetic */ C3983b(String str, String str2, byte b) {
            this(str, str2);
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final /* synthetic */ void invoke(C3982a c3982a, C13052h c13052h) {
        int i;
        C3982a c3982a2 = c3982a;
        if (!PatchProxy.proxy(new Object[]{c3982a2, c13052h}, this, LIZ, false, 1).isSupported) {
            if (c3982a2.f26145LJ > 0) {
                i = c3982a2.f26145LJ;
            } else {
                i = Integer.MAX_VALUE;
            }
            this.f26144LJ = i;
            this.LIZIZ = ((ILiveSDKService) ServiceManager.getService(ILiveSDKService.class)).createImagePicker(null, this.LIZJ, "upload_photo_method", c3982a2.LIZ, c3982a2.LIZIZ, c3982a2.LIZJ, c3982a2.LIZLLL, this, null, null);
            AbstractC81969ISl abstractC81969ISl = this.LIZIZ;
            if (abstractC81969ISl != null) {
                abstractC81969ISl.LIZ(false, false, -1);
            }
        }
    }

    public final void LIZ(int i, int i2, Intent intent) {
        AbstractC81969ISl abstractC81969ISl;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 5).isSupported && (abstractC81969ISl = this.LIZIZ) != null) {
            abstractC81969ISl.LIZ(i, i2, intent);
        }
    }

    @Override // com.bytedance.android.live.room.c$b
    public final void LIZ(String str, String str2, ThemeShowArea themeShowArea, AbstractC9495c abstractC9495c, int i) {
        if (PatchProxy.proxy(new Object[]{str, str2, themeShowArea, abstractC9495c, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LIZIZ.LIZ();
        File file = new File(str);
        if (!file.exists()) {
            LIZ();
            return;
        }
        long length = file.length();
        int i2 = this.f26144LJ;
        if (length >= i2) {
            C88440Kt0.LIZ(LK5.LIZ(2131585766, Integer.valueOf((i2 / AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END) / AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END)));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart(C2521l.LJIIL, new TypedFile("multipart/form-data", file));
        ((UploadApi) C88306Kqq.LIZ().LIZ(UploadApi.class)).upload(multipartTypedOutput).compose(C100839PnV.LIZJ()).subscribe(new C88359Krh(this, str));
    }
}
