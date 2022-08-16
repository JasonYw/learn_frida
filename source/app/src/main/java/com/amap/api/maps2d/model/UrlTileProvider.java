package com.amap.api.maps2d.model;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.amap.api.mapcore2d.C1567ck;
import com.amap.api.mapcore2d.C1569cm;
import com.bytedance.covode.number.Covode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import p002O.C0002O;

/* loaded from: classes19.dex */
public abstract class UrlTileProvider implements TileProvider {

    /* renamed from: a */
    public final int f24218a;

    /* renamed from: b */
    public final int f24219b;

    static {
        Covode.recordClassIndex(5396);
    }

    public abstract URL getTileUrl(int i, int i2, int i3);

    @Override // com.amap.api.maps2d.model.TileProvider
    public int getTileHeight() {
        return this.f24219b;
    }

    @Override // com.amap.api.maps2d.model.TileProvider
    public int getTileWidth() {
        return this.f24218a;
    }

    /* renamed from: a */
    public static byte[] m17121a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m17120a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public UrlTileProvider(int i, int i2) {
        this.f24218a = i;
        this.f24219b = i2;
    }

    /* renamed from: a */
    public static long m17120a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[AccessibilityEventCompat.TYPE_VIEW_SCROLLED];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j += read;
            } else {
                return j;
            }
        }
    }

    @Override // com.amap.api.maps2d.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        URL tileUrl = getTileUrl(i, i2, i3);
        if (tileUrl == null) {
            return TileProvider.NO_TILE;
        }
        C1567ck.m18164a("UrlTileProvider", C0002O.m25086C("url: ", tileUrl.toString()), 111);
        try {
            return new Tile(this.f24218a, this.f24219b, m17121a(tileUrl.openStream()));
        } catch (IOException e) {
            C1569cm.m18147a(e, "UrlTileProvider", "getTile");
            return TileProvider.NO_TILE;
        }
    }
}
