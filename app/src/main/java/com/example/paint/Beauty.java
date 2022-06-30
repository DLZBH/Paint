package com.example.paint;

public class Beauty {
    private String name; //名称
 //  private int height; //高度
    private int imageid;//图片id
    public Beauty(String name, int imageid){
        this.imageid=imageid;
        this.name=name;
   //     this.height=height;
    }
/*public int getHeight(){
        return height;
}*/
    public String getName() {
        return name;
    }

  public int getImageId(){
        return imageid;
  }}
