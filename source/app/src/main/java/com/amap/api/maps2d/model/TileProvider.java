package com.amap.api.maps2d.model;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface TileProvider {
    public static final Tile NO_TILE = new Tile(-1, -1, null);

    Tile getTile(int i, int i2, int i3);

    int getTileHeight();

    int getTileWidth();

    static {
        Covode.recordClassIndex(5395);
    }
}
