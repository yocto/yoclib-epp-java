package com.yocto.yoclib.epp;

public class Options{

    private Version version;
    private Language lang;

    public Version getVersion() {
        return this.version;
    }

    public Language getLanguage() {
        return this.lang;
    }

    public Options setVersion(Version version) {
        this.version = version;
        return this;
    }

    public Options setLanguage(Language lang) {
        this.lang = lang;
        return this;
    }

    @Override
    public String toString() {
        return "Options{" +
                "version=" + version +
                ", lang=" + lang +
                '}';
    }

}