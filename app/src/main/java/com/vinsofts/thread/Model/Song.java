package com.vinsofts.thread.Model;

public class Song {
    private String avatar;
    private String score;

    public Song(String avatar, String score) {
        this.avatar = avatar;
        this.score = score;
    }

    public String getScore() {
        return score;
    }

    public String getAvatar() {
        return avatar;
    }
}
