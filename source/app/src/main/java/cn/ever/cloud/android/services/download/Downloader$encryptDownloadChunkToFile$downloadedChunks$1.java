package cn.ever.cloud.android.services.download;

import cn.ever.cloud.network.entity.NEncChunk;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Comparator;

/* loaded from: classes23.dex */
public final class Downloader$encryptDownloadChunkToFile$downloadedChunks$1<T> implements Comparator<NEncChunk> {
    public static final Downloader$encryptDownloadChunkToFile$downloadedChunks$1 INSTANCE = new Downloader$encryptDownloadChunkToFile$downloadedChunks$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3037);
    }

    @Override // java.util.Comparator
    public final int compare(NEncChunk nEncChunk, NEncChunk nEncChunk2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nEncChunk, nEncChunk2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return (nEncChunk.getOffset() > nEncChunk2.getOffset() ? 1 : (nEncChunk.getOffset() == nEncChunk2.getOffset() ? 0 : -1));
    }
}
