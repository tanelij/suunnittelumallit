/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit.proxy;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tanel
 */
public class Main {

    public static void main(String[] args){
        PhotoAlbum photoAlbum = new PhotoAlbum();
        photoAlbum.addPhoto(new ProxyImage("HiRes_10MB_Photo1"));
        photoAlbum.addPhoto(new ProxyImage("HiRes_10MB_Photo2"));
        photoAlbum.addPhoto(new ProxyImage("HiRes_10MB_Photo3"));
        photoAlbum.addPhoto(new ProxyImage("HiRes_10MB_Photo4"));
        
        photoAlbum.showAlbumContents();
        
        System.out.println();
        
        photoAlbum.nextImage();
        photoAlbum.nextImage();
        photoAlbum.nextImage();
        photoAlbum.nextImage();
        
        System.out.println();
        
        photoAlbum.nextImage();
        photoAlbum.nextImage();
        photoAlbum.nextImage();
        photoAlbum.nextImage();
    }
    
}

class PhotoAlbum{
    private List<ProxyImage> images = new ArrayList<>();
    private int index = 0;

    public void addPhoto(ProxyImage image){
        images.add(image);
    }

    public void nextImage(){
        images.get(index).displayImage();
        
        index++;
        if(index > images.size()-1){
            index = 0;
        }
    }

    public void previousImage(){
        index--;
        if(index < 0){
            index = images.size()-1;
        }
        images.get(index).showData();
        images.get(index).displayImage();
    }
    
    public void showAlbumContents(){
        System.out.println("Photo album contents:");
        images.forEach(image -> {image.showData();});
    }

}


