package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.network.entity.NChunk;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.clientreport.data.Config;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import p003X.C522246kE;

/* loaded from: classes23.dex */
public final class ChunkSplitter implements Iterator<NChunk>, KMappedMarker {
    public static final C522246kE Companion = new C522246kE((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public long currentOffset;
    public final long offset;
    public final long partSize;
    public final long size;

    static {
        Covode.recordClassIndex(3125);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.currentOffset < this.offset + this.size) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    /* renamed from: next */
    public final NChunk mo25253next() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (NChunk) proxy.result;
        }
        long j = this.size - (this.currentOffset - this.offset);
        long j2 = this.partSize;
        if (j <= j2 || j - j2 >= Config.DEFAULT_MAX_FILE_LENGTH) {
            j = Math.min(this.partSize, j);
        }
        NChunk nChunk = new NChunk(this.currentOffset, j);
        this.currentOffset += j;
        return nChunk;
    }

    public ChunkSplitter(long j, long j2, long j3) {
        this.offset = j;
        this.size = j2;
        this.partSize = j3;
        this.currentOffset = this.offset;
    }
}
