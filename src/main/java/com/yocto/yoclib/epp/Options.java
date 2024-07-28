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

    public void setVersion(Version version) {
        this.version = version;
    }

    public void setLanguage(Language lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "Options{" +
                "version=" + version +
                ", lang=" + lang +
                '}';
    }

}