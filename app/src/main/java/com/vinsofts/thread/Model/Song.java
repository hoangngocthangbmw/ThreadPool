package com.vinsofts.thread.Model;

public class Song {
    private String avatar;
    private String score;

    public Song(String score) {
        this.score = score;
    }

    public Song(String avatar, String score) {
        this.avatar = avatar;
        this.score = score;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
