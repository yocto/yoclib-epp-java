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

    public void setOther(Other other) {
        this.other = other;
    }

    public void setPublic(Public _public) {
        this._public = _public;
    }

    public void setSame(Same same) {
        this.same = same;
    }

    public void setUnrelated(Unrelated unrelated) {
        this.unrelated = unrelated;
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
