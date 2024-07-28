package com.yocto.yoclib.epp;

public class MessageQueue{

    private QueueDate qDate;
    private Message msg;
    private long count;
    private String id;

    public QueueDate getQueueDate() {
        return this.qDate;
    }

    public Message getMessage() {
        return this.msg;
    }

    public long getCount() {
        return this.count;
    }

    public String getId() {
        return this.id;
    }

    public void setQueueDate(QueueDate qDate) {
        this.qDate = qDate;
    }

    public void setMessage(Message msg) {
        this.msg = msg;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MessageQueue{" +
                "qDate=" + qDate +
                ", msg=" + msg +
                ", count=" + count +
                ", id='" + id + '\'' +
                '}';
    }

}