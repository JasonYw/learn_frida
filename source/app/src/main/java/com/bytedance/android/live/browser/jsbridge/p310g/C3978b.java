package com.bytedance.android.live.browser.jsbridge.p310g;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentUris;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.base.model.user.C2854h;
import com.bytedance.android.live.browser.jsbridge.p310g.C3978b;
import com.bytedance.android.live.browser.p302f.C3880c;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.utils.TTLiveFileProvider;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostNetwork;
import com.bytedance.android.livesdkapi.model.C9646n;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.C13052h;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C108814Ssq;
import p003X.C116971W2r;
import p003X.C134529bwK;
import p003X.C2IN;
import p003X.C88461KtL;
import p003X.C88470KtU;
import p003X.C88471KtV;
import p003X.C88472KtW;
import p003X.C88474KtY;
import p003X.C88481Ktf;
import p003X.C88485Ktj;
import p003X.C88486Ktk;
import p003X.C88487Ktl;
import p003X.C88493Ktr;
import p003X.C88582KvI;
import p003X.KM9;
import p003X.LK5;
import p003X.S5C;

/* renamed from: com.bytedance.android.live.browser.jsbridge.g.b */
/* loaded from: classes5.dex */
public final class C3978b extends AbstractC13049f<JSONObject, C3979b> {
    public static ChangeQuickRedirect LIZ;
    public Disposable LIZIZ;
    public Disposable LIZJ;
    public Fragment LIZLLL;

    /* renamed from: LJ */
    public C13052h f26143LJ;
    public C108814Ssq LJFF;
    public int LJI;
    public String LJII;
    public long LJIIIIZZ;
    public JSONObject LJIIIZ;
    public boolean LJIIJ;
    public ProgressDialog LJIIZILJ;
    public String LJIJ;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public boolean LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public boolean LJJIIZ;
    public String LJJIIZI;
    public String LJJIJ;
    public String LJIJI = "upload_photo";
    public TokenCert LJJIJIIJI = TokenCert.with("bpea-live_upload_jsb_encrypted_upload_method");
    public TokenCert LJJIJIIJIL = TokenCert.with("bpea-live_upload_jsb_encrypted_upload_method_camera");
    public TokenCert LJJIJIL = TokenCert.with("bpea-live_upload_jsb_encrypted_upload_method_gallery");
    public boolean LJIIJJI = false;
    public int LJIIL = 0;
    public boolean LJIILIIL = true;
    public boolean LJIILJJIL = false;
    public ByteArrayOutputStream LJJIJL = null;
    public Bitmap LJJIJLIJ = null;
    public int LJIILL = 0;
    public final String LJIILLIIL = C0002O.m25086C(C116971W2r.LIZIZ().getPath(), "/DCIM/Camera");

    static {
        Covode.recordClassIndex(22354);
    }

    public static String LIZ(MediaMetadataRetriever mediaMetadataRetriever, int i) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{mediaMetadataRetriever, Integer.valueOf(i)}, null, LIZ, true, 43);
        if (proxy.isSupported) {
            obj = proxy.result;
        } else {
            ActionInvokeEntrance.setEventUuid(100023);
            Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(mediaMetadataRetriever, new Object[]{Integer.valueOf(i)}, 100023, "java.lang.String", false, null, false);
            if (!((Boolean) actionIntercept.first).booleanValue()) {
                String LIZ2 = C116971W2r.LIZ(mediaMetadataRetriever, i);
                ActionInvokeEntrance.actionInvoke(LIZ2, mediaMetadataRetriever, new Object[]{Integer.valueOf(i)}, 100023, "com_bytedance_android_live_browser_jsbridge_upload_EncryptedUploadMethod_android_media_MediaMetadataRetriever_extractMetadata(Landroid/media/MediaMetadataRetriever;I)Ljava/lang/String;");
                return LIZ2;
            }
            obj = actionIntercept.second;
        }
        return (String) obj;
    }

    public final void LIZ(int i, int i2, Intent intent) {
        String path;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (9001 != i && 9002 != i) {
            if (i == 40003) {
                if (-1 != i2) {
                    finishWithResult(new C3979b(1, 2, "取消操作", new C88472KtW(), (byte) 0));
                } else if (intent == null || intent.getData() == null) {
                    LIZJ();
                } else {
                    FragmentActivity activity = this.LIZLLL.getActivity();
                    if (activity == null) {
                        LIZJ();
                        return;
                    }
                    Uri data = intent.getData();
                    String LIZ2 = C88582KvI.LIZ(activity, data);
                    if (StringUtils.isEmpty(LIZ2)) {
                        UIUtils.displayToastWithIcon(activity, 2130855561, 2131586875);
                        LIZJ();
                        return;
                    }
                    File file = new File(LIZ2);
                    if (!file.exists()) {
                        UIUtils.displayToastWithIcon(activity, 2130855561, 2131586875);
                        LIZJ();
                    } else if (this.LJJI) {
                        LIZ(data, false);
                    } else {
                        LIZIZ(file.getAbsolutePath());
                    }
                }
            } else if (i == 40004) {
                if (-1 != i2) {
                    finishWithResult(new C3979b(1, 2, "取消操作", new C88472KtW(), (byte) 0));
                } else if (this.LJJI) {
                    try {
                        LIZ(LIZLLL(), true);
                    } catch (Exception e) {
                        C2IN.LIZIZ().LIZ(6, e.getStackTrace());
                    }
                } else {
                    LIZIZ(m15827LJ());
                }
            } else if (i != 40002) {
            } else {
                if (-1 != i2) {
                    finishWithResult(new C3979b(1, 2, "取消操作", new C88472KtW(), (byte) 0));
                    return;
                }
                FragmentActivity activity2 = this.LIZLLL.getActivity();
                if (activity2 == null) {
                    LIZJ();
                    return;
                }
                new StringBuilder();
                File file2 = new File(C0002O.m25085C(this.LJIILLIIL, "/", LJI()));
                if (file2.exists()) {
                    if (!LIZ(file2.getAbsolutePath(), this.LJIJJLI, this.LJIJJ)) {
                        C88582KvI.LIZ(activity2, this.LIZLLL, 40003, this.LJJIJIL);
                        return;
                    } else {
                        LIZJ(file2.getAbsolutePath());
                        return;
                    }
                }
                UIUtils.displayToastWithIcon(activity2, 2130855561, 2131586875);
                LIZJ();
            }
        } else if (-1 != i2) {
            finishWithResult(new C3979b(1, 2, "取消操作", new C88472KtW(), (byte) 0));
        } else if (intent == null || intent.getData() == null) {
            LIZIZ();
        } else {
            FragmentActivity activity3 = this.LIZLLL.getActivity();
            if (activity3 == null) {
                LIZIZ();
                return;
            }
            Uri data2 = intent.getData();
            if (TextUtils.equals("content", data2.getScheme())) {
                path = S5C.LIZ(this.LIZLLL.getActivity(), data2);
            } else {
                path = intent.getData().getPath();
            }
            if (TextUtils.isEmpty(path)) {
                LIZIZ();
                return;
            }
            File file3 = new File(path);
            if (!file3.exists()) {
                LIZIZ();
            } else if (!file3.exists()) {
                LIZIZ();
            } else {
                if (!this.LJJIIZ) {
                    this.LJIIZILJ = ProgressDialog.show(activity3, LK5.LIZ(2131588470), LK5.LIZ(2131588469), true, false);
                }
                if (this.LJIIJ && this.LJJIIJ > 0) {
                    int LIZIZ = LIZIZ(file3);
                    String LIZ3 = LK5.LIZ(2131588194);
                    String LIZ4 = LK5.LIZ(2131588193);
                    if (!TextUtils.isEmpty(this.LJJIIZI)) {
                        LIZ3 = this.LJJIIZI;
                    }
                    if (!TextUtils.isEmpty(this.LJJIJ)) {
                        LIZ4 = this.LJJIJ;
                    }
                    if (LIZIZ > 0) {
                        int i3 = this.LJJIIJZLJL;
                        if (i3 > 0 && LIZIZ > i3) {
                            UIUtils.displayToastWithIcon(activity3, 2130855561, LIZ4);
                            LIZIZ();
                            C88474KtY.LIZ();
                            return;
                        } else if (LIZIZ < this.LJJIIJ) {
                            UIUtils.displayToastWithIcon(activity3, 2130855561, LIZ3);
                            LIZIZ();
                            C88474KtY.LIZ();
                            return;
                        }
                    }
                }
                C134529bwK.LIZ(this.LIZLLL.getActivity()).LIZ(new C88481Ktf(this, file3, i), this.LJJIJIIJI, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
            }
        }
    }

    public final void LIZ(C2854h c2854h, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{c2854h, str, str2}, this, LIZ, false, 10).isSupported) {
            return;
        }
        LIZ();
        try {
            C88472KtW c88472KtW = new C88472KtW();
            c88472KtW.LIZ = c2854h.LIZ;
            c88472KtW.LIZIZ = C3880c.LIZIZ.LIZIZ(str);
            c88472KtW.LIZJ = C3880c.LIZIZ.LIZIZ(str2);
            C3979b c3979b = new C3979b(1, 0, "成功", c88472KtW, (byte) 0);
            LIZ(100);
            this.f26143LJ.LIZ("H5_uploadVideoStatus", c3979b);
            finishWithResult(c3979b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x012d, code lost:
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.android.live.network.response.C5176i<com.bytedance.android.live.base.model.user.C2854h> LIZ(java.lang.String r9, java.io.File r10, org.json.JSONObject r11) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.browser.jsbridge.p310g.C3978b.LIZ(java.lang.String, java.io.File, org.json.JSONObject):com.bytedance.android.live.network.response.i");
    }

    public final C5176i<C2854h> LIZ(String str, File file, JSONObject jSONObject, int i) {
        String str2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, file, jSONObject, Integer.valueOf(i)}, this, LIZ, false, 28);
        if (proxy.isSupported) {
            return (C5176i) proxy.result;
        }
        this.LJIILL = 0;
        IHostNetwork iHostNetwork = (IHostNetwork) ServiceManager.getService(INetworkService.class);
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                buildUpon.appendQueryParameter(next, String.valueOf(jSONObject.opt(next)));
            }
        }
        String uri = buildUpon.build().toString();
        String LIZ2 = LIZ(file);
        String valueOf = String.valueOf(LIZIZ(file));
        String LIZJ = LIZJ(file);
        String str3 = "1";
        if (9001 == i) {
            str2 = "0";
        } else {
            str2 = 9002 == i ? str3 : null;
        }
        if (!PatchProxy.proxy(new Object[]{LIZJ, str2, valueOf, LIZ2}, null, C88474KtY.LIZ, true, 1).isSupported) {
            JSONObject jSONObject2 = new JSONObject();
            if (LIZJ != null) {
                jSONObject2.put("format", LIZJ);
            }
            if (str2 != null) {
                jSONObject2.put("action_type", str2);
            }
            JSONObject jSONObject3 = new JSONObject();
            if (LIZ2 != null) {
                jSONObject3.put("size", LIZ2);
            }
            if (valueOf != null) {
                jSONObject3.put("duration", valueOf);
            }
            C88474KtY.LIZ("ttlive_upload_video_original_info", jSONObject2, jSONObject3, null);
        }
        if (!this.LJIIJJI) {
            str3 = "0";
        }
        long j = this.LJIIIIZZ;
        if (j > 0) {
            String valueOf2 = String.valueOf(j);
            if (!PatchProxy.proxy(new Object[]{str3, LIZJ, str2, valueOf2, LIZ2}, null, C88474KtY.LIZ, true, 2).isSupported) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("status_code", str3);
                if (LIZJ != null) {
                    jSONObject4.put("format", LIZJ);
                }
                if (str2 != null) {
                    jSONObject4.put("action_type", str2);
                }
                JSONObject jSONObject5 = new JSONObject();
                if (LIZ2 != null) {
                    jSONObject5.put("size", LIZ2);
                }
                if (valueOf2 != null) {
                    jSONObject5.put("duration", valueOf2);
                }
                C88474KtY.LIZ("ttlive_convert_format_result", jSONObject4, jSONObject5, null);
            }
        }
        Long valueOf3 = Long.valueOf(System.currentTimeMillis());
        try {
            C9646n LIZIZ = iHostNetwork.uploadLargeFile(-1, uri, new ArrayList(1), file, new C88487Ktl(this)).LIZIZ();
            if (LIZIZ != null) {
                String str4 = new String(LIZIZ.LJFF);
                C5176i<C2854h> c5176i = (C5176i) GsonProtectorUtils.fromJson(KM9.LIZ(), str4, new C88486Ktk(this).getType());
                if (c5176i == null) {
                    return new C5176i<>();
                }
                try {
                    if (c5176i.LIZIZ != 0) {
                        c5176i.LJI = (RequestError) GsonProtectorUtils.fromJson(KM9.LIZ(), new JSONObject(str4).getJSONObject(C2521l.LJIIL).toString(), (Class<Object>) RequestError.class);
                    }
                } catch (JSONException unused) {
                }
                String LIZ3 = LIZ(Long.valueOf(System.currentTimeMillis()), valueOf3);
                String valueOf4 = String.valueOf(c5176i.LIZIZ);
                if (!PatchProxy.proxy(new Object[]{valueOf4, str2, LIZ3, LIZ2}, null, C88474KtY.LIZ, true, 3).isSupported) {
                    JSONObject jSONObject6 = new JSONObject();
                    if (valueOf4 != null) {
                        jSONObject6.put("status_code", valueOf4);
                    }
                    if (str2 != null) {
                        jSONObject6.put("action_type", str2);
                    }
                    JSONObject jSONObject7 = new JSONObject();
                    if (LIZ2 != null) {
                        jSONObject7.put("size", LIZ2);
                    }
                    if (LIZ3 != null) {
                        jSONObject7.put("duration", LIZ3);
                    }
                    C88474KtY.LIZ("ttlive_upload_video_upload_result", jSONObject6, jSONObject7, null);
                }
                return c5176i;
            }
        } catch (Exception unused2) {
        }
        return new C5176i<>();
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 29).isSupported) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", i);
            jSONObject.put("phases", "zip/uplaod");
            if (this.f26143LJ == null) {
                return;
            }
            this.f26143LJ.LIZ("H5_uploadProgress", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public String LIZ(File file) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{file}, this, LIZ, false, 32);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (file == null) {
            return "";
        }
        try {
            return file.exists() ? String.valueOf((int) (file.length() / Config.DEFAULT_MAX_FILE_LENGTH)) : "";
        } catch (Exception unused) {
            return "";
        }
    }

    private Uri LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (Uri) proxy.result;
        }
        return LIZLLL(LJI());
    }

    public void LIZ() {
        ProgressDialog progressDialog;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported && (progressDialog = this.LJIIZILJ) != null && progressDialog.isShowing()) {
            C116971W2r.LIZ(this.LJIIZILJ);
        }
    }

    /* renamed from: LJ */
    private String m15827LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        new StringBuilder();
        return C0002O.m25085C(this.LJIILLIIL, "/", LJII());
    }

    private String LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        new StringBuilder();
        return C0002O.m25084C(this.LJIJI, "_", this.LJIJ, "crop");
    }

    private String LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        new StringBuilder();
        return C0002O.m25086C(LJIIIIZZ(), ".jpeg");
    }

    private String LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        new StringBuilder();
        return C0002O.m25085C(this.LJIJI, "_", this.LJIJ);
    }

    private Uri LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (Uri) proxy.result;
        }
        File file = new File(m15827LJ());
        if (!file.exists()) {
            try {
                File file2 = new File(this.LJIILLIIL);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                C2IN.LIZIZ().LIZ(6, e.getStackTrace());
            }
        }
        FragmentActivity activity = this.LIZLLL.getActivity();
        new StringBuilder();
        return TTLiveFileProvider.getUri(activity, C0002O.m25086C(this.LIZLLL.getActivity().getPackageName(), ".ttlive_provider"), file);
    }

    private boolean LJIIIZ() {
        Bitmap bitmap;
        MethodCollector.m14708i(1530);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 26);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(1530);
            return booleanValue;
        } else if (this.LJJIII > 0 && this.LJJIJL.size() / AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END > this.LJJIII && (bitmap = this.LJJIJLIJ) != null) {
            int i = 80;
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, this.LJJIJL);
            while (this.LJJIJL.size() / AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END > this.LJJIII) {
                this.LJJIJL.reset();
                i -= 10;
                this.LJJIJLIJ.compress(Bitmap.CompressFormat.JPEG, i, this.LJJIJL);
                if (i <= 10) {
                    break;
                }
            }
            MethodCollector.m14707o(1530);
            return true;
        } else {
            MethodCollector.m14707o(1530);
            return false;
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        LIZ();
        finishWithResult(new C3979b(1, 1, "失败", new C88472KtW(), (byte) 0));
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final void onTerminate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        Disposable disposable = this.LIZIZ;
        if (disposable != null) {
            disposable.dispose();
        }
        C108814Ssq c108814Ssq = this.LJFF;
        if (c108814Ssq != null && !PatchProxy.proxy(new Object[0], c108814Ssq, C108814Ssq.LIZ, false, 3).isSupported) {
            c108814Ssq.LJJ = false;
            c108814Ssq.LIZ();
        }
        Disposable disposable2 = this.LIZJ;
        if (disposable2 != null && !disposable2.isDisposed()) {
            this.LIZJ.dispose();
        }
        this.LIZLLL = null;
        this.f26143LJ = null;
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        LIZ();
        finishWithResult(new C3979b(1, 1, "失败", new C88472KtW(), (byte) 0));
    }

    private int LIZIZ(File file) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{file}, this, LIZ, false, 31);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (file == null) {
            return 0;
        }
        try {
            if (!file.exists()) {
                return 0;
            }
            String absolutePath = file.getAbsolutePath();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(absolutePath);
            return Integer.parseInt(LIZ(mediaMetadataRetriever, 9)) / 1000;
        } catch (Exception unused) {
            return 0;
        }
    }

    private String LIZJ(File file) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{file}, this, LIZ, false, 33);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (file == null) {
            return "";
        }
        try {
            if (!file.exists()) {
                return "";
            }
            String absolutePath = file.getAbsolutePath();
            if (TextUtils.isEmpty(absolutePath) || !absolutePath.contains("/")) {
                return "";
            }
            String[] split = absolutePath.split("/");
            if (split.length <= 0) {
                return "";
            }
            return split[split.length - 1];
        } catch (Exception unused) {
            return "";
        }
    }

    public C3978b(Fragment fragment) {
        this.LIZLLL = fragment;
        new StringBuilder();
        try {
            C3880c.LIZIZ.LIZ(C116971W2r.LIZIZ(fragment.getContext()).getCanonicalPath());
        } catch (IOException unused) {
        }
    }

    private void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4).isSupported) {
            return;
        }
        FragmentActivity activity = this.LIZLLL.getActivity();
        if (activity == null) {
            LIZJ();
        } else if (!LIZ(str, this.LJIJJLI, this.LJIJJ)) {
            C88582KvI.LIZ(activity, this.LIZLLL, 40003, this.LJJIJIL);
        } else {
            LIZJ(str);
        }
    }

    private void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 14).isSupported) {
            return;
        }
        final File file = new File(str);
        if (!file.exists()) {
            LIZJ();
            return;
        }
        if (this.LJIIZILJ == null) {
            this.LJIIZILJ = new ProgressDialog(this.LIZLLL.getActivity());
            this.LJIIZILJ.setMessage(LK5.LIZ(2131586125));
            this.LJIIZILJ.setCancelable(false);
        }
        if (!this.LJIIZILJ.isShowing()) {
            C116971W2r.LIZJ(this.LJIIZILJ);
        }
        Single.just(this.LJII).subscribeOn(Schedulers.m138io()).map(new Function(this, file) { // from class: X.KtZ
            public static ChangeQuickRedirect LIZ;
            public final C3978b LIZIZ;
            public final File LIZJ;

            static {
                Covode.recordClassIndex(22379);
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
                C3978b c3978b = this.LIZIZ;
                File file2 = this.LIZJ;
                String str2 = (String) obj;
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{file2, str2}, c3978b, C3978b.LIZ, false, 37);
                return proxy2.isSupported ? proxy2.result : c3978b.LIZ(str2, file2, c3978b.LJIIIZ);
            }
        }).zipWith(Single.just(str).subscribeOn(Schedulers.m138io()).map(new Function(this) { // from class: X.Ktp
            public static ChangeQuickRedirect LIZ;
            public final C3978b LIZIZ;

            static {
                Covode.recordClassIndex(22380);
            }

            {
                this.LIZIZ = this;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                C3978b c3978b = this.LIZIZ;
                String str2 = (String) obj;
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str2}, c3978b, C3978b.LIZ, false, 36);
                return proxy2.isSupported ? proxy2.result : C88506Ku4.LIZ(c3978b.LIZLLL.getContext(), str2);
            }
        }), C88493Ktr.LIZIZ).observeOn(AndroidSchedulers.mainThread()).subscribe(new C88471KtV(this, file));
    }

    private Uri LIZLLL(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 21);
        if (proxy.isSupported) {
            return (Uri) proxy.result;
        }
        if (str == null) {
            str = "";
        }
        new StringBuilder();
        File file = new File(C0002O.m25085C(this.LJIILLIIL, "/", str));
        if (!file.exists()) {
            try {
                File file2 = new File(this.LJIILLIIL);
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

    public Bitmap LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 30);
        if (proxy.isSupported) {
            return (Bitmap) proxy.result;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        return mediaMetadataRetriever.getFrameAtTime();
    }

    public final /* synthetic */ Pair LIZ(Pair pair) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pair}, this, LIZ, false, 38);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        String absolutePath = ((File) pair.second).getAbsolutePath();
        String str = "";
        try {
            String str2 = C116971W2r.LIZIZ(this.f26143LJ.LIZIZ).getAbsolutePath() + File.separator + System.currentTimeMillis();
            if (BitmapUtils.saveBitmapToSD(LIZ(absolutePath), str2, "firstFrame.temp")) {
                str = str2 + File.separator + "firstFrame.temp";
            }
        } catch (Exception unused) {
        }
        return new Pair(new C3980c(str, (C5176i) pair.first), absolutePath);
    }

    /* renamed from: com.bytedance.android.live.browser.jsbridge.g.b$c */
    /* loaded from: classes5.dex */
    public static class C3980c {
        public C5176i<C2854h> LIZ;
        public String LIZIZ;

        static {
            Covode.recordClassIndex(22373);
        }

        public C3980c(String str, C5176i<C2854h> c5176i) {
            this.LIZ = c5176i;
            this.LIZIZ = str;
        }
    }

    private String LIZ(Long l, Long l2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l, l2}, this, LIZ, false, 34);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            return String.valueOf((int) (l.longValue() - l2.longValue()));
        } catch (Exception unused) {
            return null;
        }
    }

    private void LIZ(Uri uri, boolean z) {
        if (PatchProxy.proxy(new Object[]{uri, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 5).isSupported || uri == null) {
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
        intent.putExtra("aspectX", this.LJJIFFI);
        intent.putExtra("aspectY", this.LJJII);
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        intent.putExtra("scaleUpIfNeeded", true);
        Uri LJFF = LJFF();
        if (LJFF != null) {
            intent.putExtra("output", LJFF);
        }
        try {
            if (this.LIZLLL != null) {
                this.LIZLLL.startActivityForResult(intent, 40002);
            }
        } catch (Exception unused2) {
            UIUtils.displayToast(this.LIZLLL.getContext(), 2131586880);
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final /* synthetic */ void invoke(JSONObject jSONObject, C13052h c13052h) {
        JSONObject jSONObject2 = jSONObject;
        boolean z = false;
        if (!PatchProxy.proxy(new Object[]{jSONObject2, c13052h}, this, LIZ, false, 1).isSupported) {
            this.f26143LJ = c13052h;
            String optString = jSONObject2.optString("type");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
            if (jSONObject3 == null) {
                finishWithResult(new C3979b(1, 4, "参数为空", new C88472KtW(), (byte) 0));
                return;
            }
            int optInt = jSONObject3.optInt("action_type", 0);
            if (jSONObject3.optInt("disable_edit", 0) != 1) {
                z = true;
            }
            this.LJJI = z;
            this.LJII = jSONObject3.optString(PushConstants.WEB_URL);
            this.LJJIIJ = jSONObject3.optInt("min_upload_duration_limit");
            this.LJJIIJZLJL = jSONObject3.optInt("max_upload_duration_limit");
            this.LJJIIZI = jSONObject3.optString("min_upload_limit_error_msg");
            this.LJJIJ = jSONObject3.optString("max_upload_limit_error_msg");
            this.LJJIIZ = jSONObject3.optBoolean("hide_loading");
            this.LJIIJ = jSONObject3.optBoolean("show_progress");
            this.LJIIIZ = new JSONObject();
            int i = -1;
            if (jSONObject3.getJSONObject("params") != null) {
                this.LJIIIZ = jSONObject3.getJSONObject("params");
                i = this.LJIIIZ.optInt("encrypt", -1);
            }
            if (TextUtils.isEmpty(this.LJII) || (!this.LJII.startsWith("https") && i == 1)) {
                finishWithResult(new C3979b(1, 5, "加密情况下必须是https请求", new C88472KtW(), (byte) 0));
                return;
            }
            String optString2 = jSONObject2.optString("token", "");
            if (optString2 != null && !optString2.isEmpty()) {
                this.LJJIJIIJI = TokenCert.with(optString2);
            }
            if (TextUtils.equals("video", optString) && (c13052h.LIZIZ instanceof Activity)) {
                if (optInt == 0) {
                    C134529bwK.LIZ((Activity) c13052h.LIZIZ).LIZ(new C88461KtL(this, jSONObject3, c13052h), this.LJJIJIIJI, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
                } else if (optInt != 1) {
                } else {
                    C134529bwK.LIZ((Activity) c13052h.LIZIZ).LIZ(new C88470KtU(this, jSONObject3, c13052h), this.LJJIJIIJI, "android.permission.READ_EXTERNAL_STORAGE");
                }
            } else if (!TextUtils.equals("picture", optString)) {
            } else {
                this.LJIJ = String.valueOf(System.currentTimeMillis());
                this.LJIJJLI = jSONObject3.optInt("min_width");
                this.LJIJJ = jSONObject3.optInt("min_height");
                this.LJIL = jSONObject3.optInt("max_width");
                this.LJJ = jSONObject3.optInt("max_height");
                this.LJJIFFI = jSONObject3.optInt("aspect_x", 1);
                this.LJJII = jSONObject3.optInt("aspect_y", 1);
                this.LJJIII = jSONObject3.optInt("max_length");
                FragmentActivity activity = this.LIZLLL.getActivity();
                String optString3 = jSONObject2.optString("token", "");
                if (optInt == 0) {
                    if (optString3 != null && !optString3.isEmpty()) {
                        this.LJJIJIIJIL = TokenCert.with(optString3);
                    }
                    C88582KvI.LIZ(activity, this.LIZLLL, 40004, this.LJIILLIIL, LJII(), this.LJJIJIIJIL);
                } else if (optInt != 1) {
                } else {
                    ((IRoomService) ServiceManager.getService(IRoomService.class)).setIsOnNeedMuteAudioFullPage(true);
                    if (optString3 != null && !optString3.isEmpty()) {
                        this.LJJIJIL = TokenCert.with(optString3);
                    }
                    C88582KvI.LIZ(activity, this.LIZLLL, 40003, this.LJJIJIL);
                }
            }
        }
    }

    public final C5176i<C2854h> LIZIZ(String str, File file, JSONObject jSONObject) {
        MethodCollector.m14708i(1531);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, file, jSONObject}, this, LIZ, false, 27);
        if (proxy.isSupported) {
            C5176i<C2854h> c5176i = (C5176i) proxy.result;
            MethodCollector.m14707o(1531);
            return c5176i;
        }
        IHostNetwork iHostNetwork = (IHostNetwork) ServiceManager.getService(INetworkService.class);
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart(C2521l.LJIIL, new TypedFile("multipart/form-data", file));
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                buildUpon.appendQueryParameter(next, String.valueOf(jSONObject.opt(next)));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            multipartTypedOutput.writeTo(byteArrayOutputStream);
        } catch (IOException unused) {
        }
        String uri = buildUpon.build().toString();
        ALogger.m15801d("EncryptedUploadMethod", uri);
        String str2 = new String(iHostNetwork.uploadFile(-1, uri, new ArrayList(1), multipartTypedOutput.mimeType(), byteArrayOutputStream.toByteArray(), multipartTypedOutput.length(), multipartTypedOutput.md5Stub()).LIZIZ().LJFF);
        C5176i<C2854h> c5176i2 = (C5176i) GsonProtectorUtils.fromJson(KM9.LIZ(), str2, new C88485Ktj(this).getType());
        if (c5176i2 == null) {
            C5176i<C2854h> c5176i3 = new C5176i<>();
            MethodCollector.m14707o(1531);
            return c5176i3;
        }
        try {
            if (c5176i2.LIZIZ != 0) {
                c5176i2.LJI = (RequestError) GsonProtectorUtils.fromJson(KM9.LIZ(), new JSONObject(str2).getJSONObject(C2521l.LJIIL).toString(), (Class<Object>) RequestError.class);
            }
        } catch (JSONException unused2) {
        }
        MethodCollector.m14707o(1531);
        return c5176i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x007c, code lost:
        if (r3 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean LIZ(java.lang.String r8, int r9, int r10) {
        /*
            r7 = this;
            r6 = 1528(0x5f8, float:2.141E-42)
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
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.browser.jsbridge.p310g.C3978b.LIZ
            r0 = 15
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r5, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L31
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r6)
            return r0
        L31:
            r1 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L75 java.lang.Throwable -> L7a
            r3.<init>(r8)     // Catch: java.io.FileNotFoundException -> L75 java.lang.Throwable -> L7a
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L70 java.io.FileNotFoundException -> L72
            r2.<init>()     // Catch: java.lang.Throwable -> L70 java.io.FileNotFoundException -> L72
            r2.inJustDecodeBounds = r4     // Catch: java.lang.Throwable -> L70 java.io.FileNotFoundException -> L72
            p003X.C116971W2r.LIZ(r3, r1, r2)     // Catch: java.lang.Throwable -> L70 java.io.FileNotFoundException -> L72
            int r0 = r2.outWidth     // Catch: java.lang.Throwable -> L70 java.io.FileNotFoundException -> L72
            if (r9 > r0) goto L63
            int r0 = r2.outHeight     // Catch: java.lang.Throwable -> L70 java.io.FileNotFoundException -> L72
            if (r10 > r0) goto L63
            int r1 = r2.outWidth     // Catch: java.lang.Throwable -> L70 java.io.FileNotFoundException -> L72
            int r0 = r2.outHeight     // Catch: java.lang.Throwable -> L70 java.io.FileNotFoundException -> L72
            int r1 = r1 * r0
            r0 = 20971520(0x1400000, float:3.526483E-38)
            if (r1 <= r0) goto L5f
            r0 = 2131586882(0x7f0d6f42, float:1.8799883E38)
            p003X.C88440Kt0.LIZ(r0)     // Catch: java.lang.Throwable -> L70 java.io.FileNotFoundException -> L72
            r3.close()     // Catch: java.io.IOException -> L5b
        L5b:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r6)
            return r5
        L5f:
            r3.close()     // Catch: java.io.IOException -> L8a
            goto L8a
        L63:
            r0 = 2131586883(0x7f0d6f43, float:1.8799885E38)
            p003X.C88440Kt0.LIZ(r0)     // Catch: java.lang.Throwable -> L70 java.io.FileNotFoundException -> L72
            r3.close()     // Catch: java.io.IOException -> L6c
        L6c:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r6)
            return r5
        L70:
            r0 = move-exception
            goto L7e
        L72:
            r0 = move-exception
            r1 = r3
            goto L76
        L75:
            r0 = move-exception
        L76:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L7a
            goto L85
        L7a:
            r0 = move-exception
            r3 = r1
            if (r3 == 0) goto L81
        L7e:
            r3.close()     // Catch: java.io.IOException -> L81
        L81:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r6)
            throw r0
        L85:
            if (r1 == 0) goto L8a
            r1.close()     // Catch: java.io.IOException -> L8a
        L8a:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.browser.jsbridge.p310g.C3978b.LIZ(java.lang.String, int, int):boolean");
    }

    /* renamed from: com.bytedance.android.live.browser.jsbridge.g.b$b */
    /* loaded from: classes5.dex */
    public static final class C3979b {
        @SerializedName(C2521l.LJIIJ)
        public int LIZ;
        @SerializedName("status")
        public int LIZIZ;
        @SerializedName("status_msg")
        public String LIZJ;
        @SerializedName(C2521l.LJIIL)
        public C88472KtW LIZLLL;

        static {
            Covode.recordClassIndex(22372);
        }

        public C3979b(int i, int i2, String str, C88472KtW c88472KtW) {
            this.LIZ = i;
            this.LIZIZ = i2;
            this.LIZJ = str;
            this.LIZLLL = c88472KtW;
        }

        public /* synthetic */ C3979b(int i, int i2, String str, C88472KtW c88472KtW, byte b) {
            this(1, i2, str, c88472KtW);
        }
    }
}
