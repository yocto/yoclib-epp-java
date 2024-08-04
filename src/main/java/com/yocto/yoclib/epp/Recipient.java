package com.yocto.yoclib.epp;

import java.util.ArrayList;
import java.util.List;

public class Recipient {

    private Other other;
    private final List<Ours> ours = new ArrayList<>();
    private Public _public;
    private Same same;
    private Unrelated unrelated;

    public Other getOther() {
        return this.other;
    }

    public List<Ours> getOurs() {
        return this.ours;
    }

    public Public getPublic() {
        return this._public;
    }

    public Same getSame() {
        return this.same;
    }

    public Unrelated getUnrelated() {
        return this.unrelated;
    }

    public Recipient setOther(Other other) {
        this.other = other;
        return this;
    }

    public Recipient setPublic(Public _public) {
        this._public = _public;
        return this;
    }

    public Recipient setSame(Same same) {
        this.same = same;
        return this;
    }

    public Recipient setUnrelated(Unrelated unrelated) {
        this.unrelated = unrelated;
        return this;
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "other=" + other +
                ", ours=" + ours +
                ", _public=" + _public +
                ", same=" + same +
                ", unrelated=" + unrelated +
                '}';
    }

}
