package cn.ever.cloud.android.services;

import cn.ever.cloud.android.entity.ToDelAsset;
import cn.ever.cloud.android.p039a.AbstractC0682d;
import cn.ever.cloud.network.api.AbstractC0729a;
import cn.ever.cloud.utils.LogHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C522196k9;

/* loaded from: classes23.dex */
public final class CheckStateService {
    public static final C522196k9 Companion = new C522196k9((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC0729a apiClient;
    public final AssetService assetService;
    public final AbstractC0682d toDelAssetRepository;

    static {
        Covode.recordClassIndex(2987);
    }

    /* loaded from: classes23.dex */
    public static final class TranscodeState {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final List<ToDelAsset> done;
        public final List<ToDelAsset> failed;
        public final List<ToDelAsset> otherTypeAssets;
        public final List<ToDelAsset> transcoding;

        static {
            Covode.recordClassIndex(2988);
        }

        public static /* synthetic */ TranscodeState copy$default(TranscodeState transcodeState, List list, List list2, List list3, List list4, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{transcodeState, list, list2, list3, list4, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (TranscodeState) proxy.result;
            }
            if ((i & 1) != 0) {
                list = transcodeState.done;
            }
            if ((i & 2) != 0) {
                list2 = transcodeState.transcoding;
            }
            if ((i & 4) != 0) {
                list3 = transcodeState.failed;
            }
            if ((i & 8) != 0) {
                list4 = transcodeState.otherTypeAssets;
            }
            return transcodeState.copy(list, list2, list3, list4);
        }

        private Object[] getObjects() {
            return new Object[]{this.done, this.transcoding, this.failed, this.otherTypeAssets};
        }

        public final List<ToDelAsset> component1() {
            return this.done;
        }

        public final List<ToDelAsset> component2() {
            return this.transcoding;
        }

        public final List<ToDelAsset> component3() {
            return this.failed;
        }

        public final List<ToDelAsset> component4() {
            return this.otherTypeAssets;
        }

        public final TranscodeState copy(List<ToDelAsset> list, List<ToDelAsset> list2, List<ToDelAsset> list3, List<ToDelAsset> list4) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, list2, list3, list4}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (TranscodeState) proxy.result;
            }
            C106862S5w.LIZ(list, list2, list3, list4);
            return new TranscodeState(list, list2, list3, list4);
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof TranscodeState) {
                return C106862S5w.LIZ(((TranscodeState) obj).getObjects(), getObjects());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("CheckStateService$TranscodeState:%s,%s,%s,%s", getObjects());
        }

        public final List<ToDelAsset> getDone() {
            return this.done;
        }

        public final List<ToDelAsset> getFailed() {
            return this.failed;
        }

        public final List<ToDelAsset> getOtherTypeAssets() {
            return this.otherTypeAssets;
        }

        public final List<ToDelAsset> getTranscoding() {
            return this.transcoding;
        }

        public TranscodeState(List<ToDelAsset> list, List<ToDelAsset> list2, List<ToDelAsset> list3, List<ToDelAsset> list4) {
            C106862S5w.LIZ(list, list2, list3, list4);
            this.done = list;
            this.transcoding = list2;
            this.failed = list3;
            this.otherTypeAssets = list4;
        }
    }

    private final void handleResult(TranscodeState transcodeState) {
        if (PatchProxy.proxy(new Object[]{transcodeState}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20553i("CheckStateService", "TranscodeState: " + transcodeState);
        if (!transcodeState.getDone().isEmpty()) {
            deleteFiles(transcodeState.getDone());
            this.toDelAssetRepository.delete(transcodeState.getDone());
        }
        if (!transcodeState.getFailed().isEmpty()) {
            deleteFiles(transcodeState.getFailed());
            this.toDelAssetRepository.delete(transcodeState.getFailed());
        }
        if (true ^ transcodeState.getOtherTypeAssets().isEmpty()) {
            deleteFiles(transcodeState.getOtherTypeAssets());
            this.toDelAssetRepository.delete(transcodeState.getOtherTypeAssets());
        }
        transcodeState.getTranscoding().isEmpty();
    }

    private final void deleteFiles(List<ToDelAsset> list) {
        boolean z;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        for (ToDelAsset toDelAsset : list) {
            String path = toDelAsset.getPath();
            if (path != null && path.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                try {
                    boolean LIZ = C116971W2r.LIZ(new File(toDelAsset.getPath()));
                    LogHelper logHelper = LogHelper.INSTANCE;
                    logHelper.m20553i("CheckStateService", "delete file:" + toDelAsset.getPath() + " success: " + LIZ);
                } catch (Exception e) {
                    LogHelper logHelper2 = LogHelper.INSTANCE;
                    logHelper2.m20554e("CheckStateService", "delete occur error: " + e.getMessage());
                }
            } else {
                String uri = toDelAsset.getUri();
                if (uri != null && uri.length() != 0) {
                    try {
                        boolean LIZ2 = C116971W2r.LIZ(new File(toDelAsset.getUri()));
                        LogHelper logHelper3 = LogHelper.INSTANCE;
                        logHelper3.m20553i("CheckStateService", "delete file:" + toDelAsset.getUri() + " success: " + LIZ2);
                    } catch (Exception e2) {
                        LogHelper logHelper4 = LogHelper.INSTANCE;
                        logHelper4.m20554e("CheckStateService", "delete occur error: " + e2.getMessage());
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b3  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object checkTranscodeState(kotlin.coroutines.Continuation<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.CheckStateService.checkTranscodeState(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public CheckStateService(AbstractC0729a abstractC0729a, AssetService assetService, AbstractC0682d abstractC0682d) {
        C106862S5w.LIZ(abstractC0729a, assetService, abstractC0682d);
        this.apiClient = abstractC0729a;
        this.assetService = assetService;
        this.toDelAssetRepository = abstractC0682d;
    }
}
