package com.example.jungle.weixin.Bean.BaseBean;

import java.io.Serializable;

/**
 * Created by derrickJ on 2017/11/21.
 */

public class PicURL implements Serializable {

    private String thumbnail_pic;

    public PicURL(String url) {
        this.thumbnail_pic = url;
    }

    public String getThumbnail_pic() {
        return thumbnail_pic;
    }

    public void setThumbnail_pic(String thumbnail_pic) {
        this.thumbnail_pic = thumbnail_pic;
    }
}
