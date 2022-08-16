package cn.everphoto.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class MusicFeatInfo implements Serializable {
    public final long duration;
    public final double speed;
    public final long start_time;
    public final long template_id;

    static {
        Covode.recordClassIndex(3622);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final double getSpeed() {
        return this.speed;
    }

    public final long getStart_time() {
        return this.start_time;
    }

    public final long getTemplate_id() {
        return this.template_id;
    }

    public MusicFeatInfo(long j, long j2, long j3, double d) {
        this.template_id = j;
        this.start_time = j2;
        this.duration = j3;
        this.speed = d;
    }
}
