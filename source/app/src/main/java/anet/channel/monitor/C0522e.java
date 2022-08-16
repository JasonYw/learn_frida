package anet.channel.monitor;

import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.monitor.e */
/* loaded from: classes19.dex */
public class C0522e {

    /* renamed from: a */
    public long f20563a;

    /* renamed from: b */
    public double f20564b;

    /* renamed from: c */
    public double f20565c;

    /* renamed from: d */
    public double f20566d;

    /* renamed from: e */
    public double f20567e;

    /* renamed from: f */
    public double f20568f;

    /* renamed from: g */
    public double f20569g;

    /* renamed from: h */
    public double f20570h;

    /* renamed from: i */
    public double f20571i;

    /* renamed from: j */
    public double f20572j;

    /* renamed from: k */
    public double f20573k;

    static {
        Covode.recordClassIndex(2230);
    }

    /* renamed from: a */
    public void m20967a() {
        this.f20563a = 0L;
        this.f20573k = 0.0d;
    }

    /* renamed from: a */
    public double m20966a(double d, double d2) {
        double d3 = d / d2;
        if (d3 < 8.0d) {
            if (this.f20563a != 0) {
                return this.f20573k;
            }
            this.f20573k = d3;
            return this.f20573k;
        }
        long j = this.f20563a;
        if (j == 0) {
            this.f20571i = d3;
            this.f20570h = this.f20571i;
            double d4 = this.f20570h;
            this.f20566d = d4 * 0.1d;
            this.f20565c = 0.02d * d4;
            this.f20567e = 0.1d * d4 * d4;
        } else if (j == 1) {
            this.f20572j = d3;
            this.f20570h = this.f20572j;
        } else {
            double d5 = this.f20572j;
            double d6 = d3 - d5;
            this.f20571i = d5;
            this.f20572j = d3;
            this.f20564b = d3 / 0.95d;
            this.f20569g = this.f20564b - (this.f20570h * 0.95d);
            char c = 0;
            double sqrt = Math.sqrt(this.f20566d);
            double d7 = this.f20569g;
            if (d7 >= 4.0d * sqrt) {
                this.f20569g = (d7 * 0.75d) + (sqrt * 2.0d);
                c = 1;
            } else if (d7 <= (-4.0d) * sqrt) {
                this.f20569g = (sqrt * (-1.0d)) + (d7 * 0.75d);
                c = 2;
            }
            double d8 = this.f20569g;
            this.f20566d = Math.min(Math.max(Math.abs((this.f20566d * 1.05d) - ((0.0025d * d8) * d8)), this.f20566d * 0.8d), this.f20566d * 1.25d);
            double d9 = this.f20567e;
            this.f20568f = d9 / ((0.9025d * d9) + this.f20566d);
            this.f20570h = this.f20570h + (d6 * 1.0526315789473684d) + (this.f20568f * this.f20569g);
            if (c == 1) {
                this.f20570h = Math.min(this.f20570h, this.f20564b);
            } else if (c == 2) {
                this.f20570h = Math.max(this.f20570h, this.f20564b);
            }
            this.f20567e = (1.0d - (this.f20568f * 0.95d)) * (this.f20567e + this.f20565c);
        }
        double d10 = this.f20570h;
        if (d10 < 0.0d) {
            this.f20573k = this.f20572j * 0.7d;
            this.f20570h = this.f20573k;
        } else {
            this.f20573k = d10;
        }
        return this.f20573k;
    }
}
