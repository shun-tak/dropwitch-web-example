package com.github.shuntak.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    private String userId;
    private Long userNo;
    private Integer userPublicScore;
    private String userFriends;
    private String userImage;

    @Id
    @Column(name = "userId")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "userNo")
    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    @Basic
    @Column(name = "userPublicScore")
    public Integer getUserPublicScore() {
        return userPublicScore;
    }

    public void setUserPublicScore(Integer userPublicScore) {
        this.userPublicScore = userPublicScore;
    }

    @Basic
    @Column(name = "userFriends")
    public String getUserFriends() {
        return userFriends;
    }

    public void setUserFriends(String userFriends) {
        this.userFriends = userFriends;
    }

    @Basic
    @Column(name = "userImage")
    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != null ? !userId.equals(user.userId) : user.userId != null) return false;
        if (userNo != null ? !userNo.equals(user.userNo) : user.userNo != null) return false;
        if (userPublicScore != null ? !userPublicScore.equals(user.userPublicScore) : user.userPublicScore != null)
            return false;
        if (userFriends != null ? !userFriends.equals(user.userFriends) : user.userFriends != null) return false;
        if (userImage != null ? !userImage.equals(user.userImage) : user.userImage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (userNo != null ? userNo.hashCode() : 0);
        result = 31 * result + (userPublicScore != null ? userPublicScore.hashCode() : 0);
        result = 31 * result + (userFriends != null ? userFriends.hashCode() : 0);
        result = 31 * result + (userImage != null ? userImage.hashCode() : 0);
        return result;
    }
}
