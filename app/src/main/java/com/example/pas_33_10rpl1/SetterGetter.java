package com.example.pas_33_10rpl1;

public class SetterGetter {

    String title;
    String img;

    public SetterGetter(String title,String img){
        this.title      =   title;
        this.img        =   img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
