package models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dagorik on 23/11/16.
 */

public class Ejemplo {

    @SerializedName("picture")
    private String picture;
    @SerializedName("publishedAt")
    private String publishedAt;
    @SerializedName("comment")
    private String comment;
    @SerializedName("title")
    private String title;
    @SerializedName("_id")
    private String id;

    /**
     *
     * @return
     * The picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     *
     * @param picture
     * The picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     *
     * @return
     * The publishedAt
     */
    public String getPublishedAt() {
        return publishedAt;
    }

    /**
     *
     * @param publishedAt
     * The publishedAt
     */
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    /**
     *
     * @return
     * The comment
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     * The comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The _id
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ejemplo{" +
                "picture='" + picture + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", comment='" + comment + '\'' +
                ", title='" + title + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}


