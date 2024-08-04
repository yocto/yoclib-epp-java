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

    public MessageQueue setQueueDate(QueueDate qDate) {
        this.qDate = qDate;
        return this;
    }

    public MessageQueue setMessage(Message msg) {
        this.msg = msg;
        return this;
    }

    public MessageQueue setCount(long count) {
        this.count = count;
        return this;
    }

    public MessageQueue setId(String id) {
        this.id = id;
        return this;
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