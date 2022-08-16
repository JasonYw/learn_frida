package com.bytedance.android.live.browser.jsbridge.p310g;

import android.app.ProgressDialog;
import android.content.ContentUris;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.browser.api.UploadApi;
import com.bytedance.android.live.browser.jsbridge.p310g.C3984p;
import com.bytedance.android.live.core.utils.TTLiveFileProvider;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.C13052h;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.AbstractC34965e;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p002O.C0002O;
import p003X.C100839PnV;
import p003X.C116971W2r;
import p003X.C2IN;
import p003X.C7KQ;
import p003X.C7KR;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C88498Ktw;
import p003X.C88582KvI;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.browser.jsbridge.g.p */
/* loaded from: classes5.dex */
public final class C3984p extends AbstractC13049f<C3985a, C3986b> {
    public static ChangeQuickRedirect LIZ;
    public Fragment LIZIZ;
    public Disposable LIZJ;
    public int LIZLLL;
    public String LJI;
    public ProgressDialog LJII;
    public C3985a LJIIIIZZ;
    public String LJFF = "upload_photo";
    public TokenCert LJIIIZ = TokenCert.with("bpea-live_uploadPicture_jsb_upload_photo_v2Method_camera");
    public TokenCert LJIIJ = TokenCert.with("bpea-uploadPicture_jsb_upload_photo_v2Method_gallery");

    /* renamed from: LJ */
    public String f26146LJ = C0002O.m25086C(C116971W2r.LIZIZ().getPath(), "/DCIM/Camera");

    /* renamed from: com.bytedance.android.live.browser.jsbridge.g.p$a */
    /* loaded from: classes5.dex */
    public static final class C3985a {
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
        public int f26147LJ;
        @SerializedName("action_type")
        public int LJFF;
        @SerializedName("token")
        public String LJI;

        static {
            Covode.recordClassIndex(22392);
        }
    }

    static {
        Covode.recordClassIndex(22390);
    }

    private Uri LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (Uri) proxy.result;
        }
        return LIZIZ(m15826LJ());
    }

    public void LIZ() {
        ProgressDialog progressDialog;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && (progressDialog = this.LJII) != null && progressDialog.isShowing()) {
            C116971W2r.LIZ(this.LJII);
        }
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        LIZ();
        finishWithFailure();
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final void onTerminate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        Disposable disposable = this.LIZJ;
        if (disposable != null) {
            disposable.dispose();
        }
        this.LIZIZ = null;
        LIZ();
    }

    /* renamed from: LJ */
    private String m15826LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        new StringBuilder();
        return C0002O.m25084C(this.LJFF, "_", this.LJI, "crop");
    }

    private String LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        new StringBuilder();
        return C0002O.m25086C(LJI(), ".temp");
    }

    private String LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        new StringBuilder();
        return C0002O.m25085C(this.LJFF, "_", this.LJI);
    }

    private Uri LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (Uri) proxy.result;
        }
        String LJFF = LJFF();
        new StringBuilder();
        File file = new File(C0002O.m25085C(this.f26146LJ, "/", LJFF));
        if (!file.exists()) {
            try {
                File file2 = new File(this.f26146LJ);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                C2IN.LIZIZ().LIZ(6, e.getStackTrace());
            }
        }
        FragmentActivity activity = this.LIZIZ.getActivity();
        new StringBuilder();
        return TTLiveFileProvider.getUri(activity, C0002O.m25086C(this.LIZIZ.getActivity().getPackageName(), ".ttlive_provider"), file);
    }

    public C3984p(Fragment fragment) {
        this.LIZIZ = fragment;
        new StringBuilder();
    }

    private Uri LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (Uri) proxy.result;
        }
        if (str == null) {
            str = "";
        }
        new StringBuilder();
        File file = new File(C0002O.m25085C(this.f26146LJ, "/", str));
        if (!file.exists()) {
            try {
                File file2 = new File(this.f26146LJ);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        return Uri.fromFile(file);
    }

    private void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 6).isSupported) {
            return;
        }
        final File file = new File(str);
        if (!file.exists()) {
            LIZIZ();
        } else if (file.length() >= this.LJIIIIZZ.f26147LJ) {
            C88440Kt0.LIZ(LK5.LIZ(2131585766, Integer.valueOf((this.LJIIIIZZ.f26147LJ / AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END) / AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END)));
        } else {
            if (this.LJII == null) {
                this.LJII = new ProgressDialog(this.LIZIZ.getActivity());
                this.LJII.setMessage(LK5.LIZ(2131586126));
                this.LJII.setCancelable(false);
            }
            if (!this.LJII.isShowing()) {
                C116971W2r.LIZJ(this.LJII);
            }
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            multipartTypedOutput.addPart(C2521l.LJIIL, new TypedFile("multipart/form-data", file));
            ((C7KQ) ((UploadApi) C88306Kqq.LIZ().LIZ(UploadApi.class)).upload(multipartTypedOutput).compose(C100839PnV.LIZJ()).m149as(C7KR.LIZ())).LIZ(new Function(this, file) { // from class: X.Ktz
                public static ChangeQuickRedirect LIZ;
                public final C3984p LIZIZ;
                public final File LIZJ;

                static {
                    Covode.recordClassIndex(22394);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = file;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1);
                    if (proxy.isSupported) {
                        return proxy.result;
                    }
                    final C3984p c3984p = this.LIZIZ;
                    final File file2 = this.LIZJ;
                    AbstractC34965e abstractC34965e = (AbstractC34965e) obj;
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{file2, abstractC34965e}, c3984p, C3984p.LIZ, false, 16);
                    return proxy2.isSupported ? proxy2.result : abstractC34965e.LIZJ(new Function(c3984p, file2) { // from class: X.Ku0
                        public static ChangeQuickRedirect LIZ;
                        public final C3984p LIZIZ;
                        public final File LIZJ;

                        static {
                            Covode.recordClassIndex(22395);
                        }

                        {
                            this.LIZIZ = c3984p;
                            this.LIZJ = file2;
                        }

                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj2) {
                            PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{obj2}, this, LIZ, false, 1);
                            if (proxy3.isSupported) {
                                return proxy3.result;
                            }
                            C3984p c3984p2 = this.LIZIZ;
                            File file3 = this.LIZJ;
                            Throwable th = (Throwable) obj2;
                            PatchProxyResult proxy4 = PatchProxy.proxy(new Object[]{file3, th}, c3984p2, C3984p.LIZ, false, 17);
                            if (proxy4.isSupported) {
                                return proxy4.result;
                            }
                            if (file3.length() <= 0 && c3984p2.LIZLLL <= 10) {
                                AbstractC34965e.LIZIZ(500L, TimeUnit.MILLISECONDS);
                            }
                            return AbstractC34965e.LIZ(th);
                        }
                    });
                }
            }).subscribe(new C88498Ktw(this, str, file));
        }
    }

    /* renamed from: com.bytedance.android.live.browser.jsbridge.g.p$b */
    /* loaded from: classes5.dex */
    public static final class C3986b {
        @SerializedName("uri")
        public String LIZ;
        @SerializedName(PushConstants.WEB_URL)
        public String LIZIZ;
        @SerializedName("image_data")
        public String LIZJ;

        static {
            Covode.recordClassIndex(22393);
        }

        public C3986b(String str, String str2) {
            this.LIZ = str;
            this.LIZIZ = str2;
        }

        public /* synthetic */ C3986b(String str, String str2, byte b) {
            this(str, str2);
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final /* synthetic */ void invoke(C3985a c3985a, C13052h c13052h) {
        C3985a c3985a2 = c3985a;
        if (!PatchProxy.proxy(new Object[]{c3985a2, c13052h}, this, LIZ, false, 1).isSupported) {
            this.LJIIIIZZ = c3985a2;
            this.LJI = String.valueOf(System.currentTimeMillis());
            FragmentActivity activity = this.LIZIZ.getActivity();
            if (c3985a2.LJFF == 0) {
                if (c3985a2.LJI != null && !c3985a2.LJI.isEmpty()) {
                    this.LJIIIZ = TokenCert.with(c3985a2.LJI);
                }
                C88582KvI.LIZ(activity, this.LIZIZ, 40004, this.f26146LJ, LJFF(), this.LJIIIZ);
            } else if (c3985a2.LJFF == 1) {
                if (c3985a2.LJI != null && !c3985a2.LJI.isEmpty()) {
                    this.LJIIJ = TokenCert.with(c3985a2.LJI);
                }
                C88582KvI.LIZ(activity, this.LIZIZ, 40003, this.LJIIJ);
            }
        }
    }

    private void LIZ(Uri uri, boolean z) {
        if (PatchProxy.proxy(new Object[]{uri, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported || uri == null) {
            return;
        }
        Intent intent = new Intent("com.android.camera.action.CROP");
        if (!z) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                int i = Build.VERSION.SDK_INT;
                if (!StringUtils.isEmpty(lastPathSegment) && lastPathSegment.contains(Constants.COLON_SEPARATOR)) {
                    lastPathSegment = lastPathSegment.split(Constants.COLON_SEPARATOR)[1];
                }
                try {
                    uri = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Long.parseLong(lastPathSegment));
                } catch (NumberFormatException unused) {
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("scale", true);
        intent.putExtra("aspectX", this.LJIIIIZZ.LIZ);
        intent.putExtra("aspectY", this.LJIIIIZZ.LIZIZ);
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        intent.putExtra("scaleUpIfNeeded", true);
        Uri LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            intent.putExtra("output", LIZLLL);
        }
        try {
            if (this.LIZIZ != null) {
                this.LIZIZ.startActivityForResult(intent, 40002);
            }
        } catch (Exception unused2) {
            UIUtils.displayToast(this.LIZIZ.getContext(), 2131586880);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x007b, code lost:
        if (r3 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean LIZ(java.lang.String r8, int r9, int r10) {
        /*
            r7 = this;
            r6 = 1532(0x5fc, float:2.147E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m14708i(r6)
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r5 = 0
            r2[r5] = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4 = 1
            r2[r4] = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0 = 2
            r2[r0] = r1
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.browser.jsbridge.p310g.C3984p.LIZ
            r0 = 7
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r5, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L30
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r6)
            return r0
        L30:
            r1 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L74 java.lang.Throwable -> L79
            r3.<init>(r8)     // Catch: java.io.FileNotFoundException -> L74 java.lang.Throwable -> L79
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L6f java.io.FileNotFoundException -> L71
            r2.<init>()     // Catch: java.lang.Throwable -> L6f java.io.FileNotFoundException -> L71
            r2.inJustDecodeBounds = r4     // Catch: java.lang.Throwable -> L6f java.io.FileNotFoundException -> L71
            p003X.C116971W2r.LIZ(r3, r1, r2)     // Catch: java.lang.Throwable -> L6f java.io.FileNotFoundException -> L71
            int r0 = r2.outWidth     // Catch: java.lang.Throwable -> L6f java.io.FileNotFoundException -> L71
            if (r9 > r0) goto L62
            int r0 = r2.outHeight     // Catch: java.lang.Throwable -> L6f java.io.FileNotFoundException -> L71
            if (r10 > r0) goto L62
            int r1 = r2.outWidth     // Catch: java.lang.Throwable -> L6f java.io.FileNotFoundException -> L71
            int r0 = r2.outHeight     // Catch: java.lang.Throwable -> L6f java.io.FileNotFoundException -> L71
            int r1 = r1 * r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 <= r0) goto L5e
            r0 = 2131586882(0x7f0d6f42, float:1.8799883E38)
            p003X.C88440Kt0.LIZ(r0)     // Catch: java.lang.Throwable -> L6f java.io.FileNotFoundException -> L71
            r3.close()     // Catch: java.io.IOException -> L5a
        L5a:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r6)
            return r5
        L5e:
            r3.close()     // Catch: java.io.IOException -> L89
            goto L89
        L62:
            r0 = 2131586883(0x7f0d6f43, float:1.8799885E38)
            p003X.C88440Kt0.LIZ(r0)     // Catch: java.lang.Throwable -> L6f java.io.FileNotFoundException -> L71
            r3.close()     // Catch: java.io.IOException -> L6b
        L6b:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r6)
            return r5
        L6f:
            r0 = move-exception
            goto L7d
        L71:
            r0 = move-exception
            r1 = r3
            goto L75
        L74:
            r0 = move-exception
        L75:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L79
            goto L84
        L79:
            r0 = move-exception
            r3 = r1
            if (r3 == 0) goto L80
        L7d:
            r3.close()     // Catch: java.io.IOException -> L80
        L80:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r6)
            throw r0
        L84:
            if (r1 == 0) goto L89
            r1.close()     // Catch: java.io.IOException -> L89
        L89:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.browser.jsbridge.p310g.C3984p.LIZ(java.lang.String, int, int):boolean");
    }

    public final void LIZ(int i, int i2, Intent intent) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 4).isSupported) {
            return;
        }
        if (i == 40003) {
            if (i2 == -1 && intent != null && intent.getData() != null) {
                FragmentActivity activity = this.LIZIZ.getActivity();
                if (activity == null) {
                    LIZIZ();
                    return;
                }
                Uri data = intent.getData();
                String LIZ2 = C88582KvI.LIZ(activity, data);
                if (StringUtils.isEmpty(LIZ2)) {
                    UIUtils.displayToastWithIcon(activity, 2130855561, 2131586875);
                    LIZIZ();
                    return;
                } else if (!new File(LIZ2).exists()) {
                    UIUtils.displayToastWithIcon(activity, 2130855561, 2131586875);
                    LIZIZ();
                    return;
                } else {
                    if ("file".equals(data.getScheme())) {
                        data = C88582KvI.LIZ(activity, LIZ2);
                    }
                    LIZ(data, false);
                    return;
                }
            }
            LIZIZ();
        } else if (i == 40004) {
            if (i2 != -1) {
                return;
            }
            try {
                LIZ(LIZJ(), true);
            } catch (Exception e) {
                C2IN.LIZIZ().LIZ(6, e.getStackTrace());
            }
        } else if (i == 40002) {
            if (i2 != -1) {
                LIZIZ();
                return;
            }
            FragmentActivity activity2 = this.LIZIZ.getActivity();
            if (activity2 == null) {
                LIZIZ();
                return;
            }
            new StringBuilder();
            File file = new File(C0002O.m25085C(this.f26146LJ, "/", m15826LJ()));
            if (file.exists()) {
                if (!LIZ(file.getAbsolutePath(), this.LJIIIIZZ.LIZJ, this.LJIIIIZZ.LIZLLL)) {
                    C88582KvI.LIZ(activity2, this.LIZIZ, 40003, this.LJIIJ);
                    return;
                } else {
                    LIZ(file.getAbsolutePath());
                    return;
                }
            }
            UIUtils.displayToastWithIcon(activity2, 2130855561, 2131586875);
            LIZIZ();
        }
    }
}
